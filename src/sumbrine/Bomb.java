package sumbrine;

import javax.swing.*;

//炸弹
public class Bomb extends SeaObject{

    public Bomb(int x,int y) {
        super(9,12,x,y,3);
    }

    @Override
    public ImageIcon getImage() {
        return Images.bomb;
    }

    @Override
    public void move() {
        y += speed;
    }
    public boolean isOutOfBounds(){
        return this.y >= World.HEIGHT;
    }
}
