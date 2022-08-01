package sumbrine;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//窗口
public class World extends JPanel{
    public static final int WIDTH = 641;
    public static final int HEIGHT = 479;
    private Battleship ship = new Battleship();
    private SeaObject[] submarines = {};
    private Mine[] mines = {};
    private Bomb[] bombs = {};
    private int score;
    public static final int RUNNING = 0;//运行状态
    public static final int PAUSE = 1;//暂停状态
    public static final int GAME_OVER = 2;//游戏结束状态
    private int state = RUNNING;
    //生成潜艇
    private SeaObject nextSubmarine() {
        Random random = new Random();
        int type =random.nextInt(20);
        if (type < 7){
            return new ObserveSubmarine();
        }else if (type < 14){
            return new TorpedoSubmrine();
        }else {
            return new MineSubmarine();
        }
    }

    //潜艇入场
    private int subEnterIndex = 0;//潜艇入场计数
    private void submarineEnterAction() {
        subEnterIndex++;
        if (subEnterIndex %40 == 0){
            SeaObject obj = nextSubmarine();
            submarines = Arrays.copyOf(submarines,submarines.length+1);
            submarines[submarines.length-1]=obj;
        }
    }

    //水雷入场
    private int mineEnterIndex = 0;
    private void mineEnterAction() {
        mineEnterIndex++;
        if (mineEnterIndex % 100 == 0){
            for (int i = 0; i < submarines.length; i++) {
                if (submarines[i] instanceof MineSubmarine){
                    MineSubmarine ms = (MineSubmarine) submarines[i];
                    Mine obj = ms.shootMine();
                    mines = Arrays.copyOf(mines,mines.length+1);
                    mines[mines.length-1] = obj;
                }
            }
        }
    }

    //海洋对象移动
    private void moveAction() {
        for (int i = 0; i < submarines.length; i++) {
            submarines[i].move();
        }
        for (int i = 0; i < mines.length; i++) {
            mines[i].move();
        }
        for (int i = 0; i < bombs.length; i++) {
            bombs[i].move();
        }
    }

    //删除越界海洋对象
    private void outOfBoundsAction() {
        for (int i = 0; i < submarines.length; i++) {
            if (submarines[i].isOutOfBounds() || submarines[i].isDead()){
                submarines[i] = submarines[submarines.length-1];
                submarines = Arrays.copyOf(submarines,submarines.length-1);
            }
        }
        for (int i = 0; i < mines.length; i++) {
            if (mines[i].isOutOfBounds() || mines[i].isDead()){
                 mines[i] = mines[mines.length-1];
                 mines = Arrays.copyOf(mines,mines.length-1);
            }
        }
        for (int i = 0; i < bombs.length; i++) {
            if (bombs[i].isOutOfBounds() || bombs[i].isDead()){
                bombs[i] = bombs[bombs.length-1];
                bombs = Arrays.copyOf(bombs,bombs.length-1);
            }
        }
    }

    //炸弹与潜艇的碰撞
    private void bombBangAction() {
        for (int i = 0; i < bombs.length; i++) {
            Bomb b = bombs[i];
            for (int j = 0; j < submarines.length; j++){
                SeaObject s = submarines[j];
                if (s.isLife() && b.isLife() && s.isHit(b)){
                    s.goDead();
                    b.goDead();
                    if (s instanceof EnemyScore){
                        EnemyScore e = (EnemyScore) s;
                        score += e.getScore();
                    }
                    if (s instanceof EnemyLife){
                        EnemyLife e = (EnemyLife) s;
                        int num = e.getLife();
                        ship.addLife(num);
                    }
                }
            }
        }
    }
    //水雷与潜艇的碰撞
    private void mineBangAction() {
        for (int i = 0; i < mines.length; i++) {
            Mine m = mines[i];
            if (m.isLife() && ship.isLife() && m.isHit(ship)){
                m.goDead();
                ship.subtractLife();
            }
        }
    }
    //实现检测游戏结束
    private void checkGameOverAction() {
        if (ship.getLife() <= 0){
            state = GAME_OVER;
        }
    }
    private void action(){
        KeyAdapter k = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_Q){
                    ship.addLife(5);
                    for (int i = 0; i < submarines.length; i++) {
                        submarines[i].goDead();
                    }
                    for (int i = 0; i < bombs.length; i++) {
                        bombs[i].goDead();
                    }
                    for (int i = 0; i < mines.length; i++) {
                        mines[i].goDead();
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_Z){
                    if (state == GAME_OVER){
                        state = RUNNING;
                        ship.addLife(5);
                        for (int i = 0; i < submarines.length; i++) {
                            submarines[i].goDead();
                        }
                        for (int i = 0; i < bombs.length; i++) {
                            bombs[i].goDead();
                        }
                        for (int i = 0; i < mines.length; i++) {
                            mines[i].goDead();
                        }
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_P){
                    if (state == RUNNING){
                        state = PAUSE;
                    } else if (state == PAUSE){
                        state = RUNNING;
                    }
                }
                if (state == RUNNING){
                    if (e.getKeyCode() == KeyEvent.VK_SPACE){
                        Bomb obj = ship.shootBomb();
                        bombs = Arrays.copyOf(bombs,bombs.length+1);
                        bombs[bombs.length-1] = obj;
                    }
                    if (e.getKeyCode() == KeyEvent.VK_LEFT){
                        ship.moveLeft();
                    }
                    if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                        ship.moveRight();
                    }
                }
            }
        };
        this.addKeyListener(k);//添加侦听
        Timer timer = new Timer();
        int interval = 10;
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (state == RUNNING){
                    submarineEnterAction();//潜艇入场
                    mineEnterAction();//水雷入场
                    moveAction();//海洋对象移动
                    outOfBoundsAction();//删除越界海洋对象
                    bombBangAction();//炸弹与潜艇的碰撞
                    mineBangAction();//水雷与潜艇的碰撞
                    checkGameOverAction();//实现检测游戏结束
                    repaint();//重画
                }
            }
        },interval,interval);
    }
    public void paint(Graphics g){//画海洋图
        Images.sea.paintIcon(null,g,0,0);
        ship.paintImage(g);
        for (int i = 0; i < submarines.length; i++) {
            submarines[i].paintImage(g);
        }
        for (int i = 0; i < mines.length; i++) {
            mines[i].paintImage(g);
        }
        for (int i = 0; i < bombs.length; i++) {
            bombs[i].paintImage(g);
        }
        g.drawString("SCORE"+score,200,50);
        g.drawString("LIFE"+ship.getLife(),400,50);
        g.drawString("暂停：‘P’",30,20);
        g.drawString("重玩：‘Z’",30,35);
        if(state==GAME_OVER){ //若当前状态为游戏结束状态
            Images.gameover.paintIcon(null,g,0,0); //画游戏结束图---不要求掌握
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        World world = new World();
        world.setFocusable(true);
        frame.add(world);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(641+16, 479+39);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);//系统自动调用paint()方法
        world.action();

    }
}
