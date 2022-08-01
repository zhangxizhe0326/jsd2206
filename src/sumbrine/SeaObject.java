package sumbrine;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
//海洋对象
public abstract class SeaObject {
    public static final int LIVE = 0;
    public static final int DEAD = 1;
    protected int state = LIVE;//当前状态
    protected int width;
    protected int height;
    protected int x;
    protected int y;
    protected int speed;
    public SeaObject(int width,int height){
        this.width = width;
        this.height = height;
        x = -width;
        Random random = new Random();
        y = random.nextInt(World.HEIGHT-height-150+1)+150;
        speed = random.nextInt(3)+1;
    }
    public SeaObject(int width,int height,int x,int y,int speed){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }
    public abstract ImageIcon getImage();
    public abstract void move();
    public boolean isLife(){
        return state==LIVE;
    }
    public boolean isDead(){
        return state == DEAD;
    }
    public void paintImage(Graphics g){
        if (isLife()){
            this.getImage().paintIcon(null,g,this.x,this.y);
        }
    }
    public boolean isOutOfBounds(){
        return this.x >= World.WIDTH;
    }
    public boolean isHit(SeaObject other){
        int x1 = this.x - other.width;
        int x2 = this.x + this.width;
        int y1 = this.y - other.height;
        int y2 = this.y + this.height;
        int x = other.x;
        int y = other.y;
        return x >= x1 && x <= x2 && y >= y1 && y <= y2;
    }
    public void goDead(){
       state = DEAD;
    }
}
