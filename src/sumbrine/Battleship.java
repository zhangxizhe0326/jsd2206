package sumbrine;

import javax.swing.*;

//战舰
public class Battleship extends SeaObject{
    int life;
    public Battleship() {
        super(66,26,270,124,20);
        life = 5;
    }

    @Override
    public ImageIcon getImage() {
        return Images.battleship;
    }

    @Override
    public void move() {
    }

    public void moveLeft(){
        x -= speed;
    }
    public void moveRight(){
        x += speed;
    }
    public Bomb shootBomb(){
        return new Bomb(this.x,this.y);
    }
    public void addLife(int num){
        life += num;
    }
    public int getLife(){
        return life;
    }
    public void subtractLife(){
        life--;
    }
}
