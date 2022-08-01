package sumbrine;

import javax.swing.*;

//水雷潜艇
public class MineSubmarine extends SeaObject implements EnemyLife{

    public MineSubmarine() {
        super(63,19);

    }

    @Override
    public ImageIcon getImage() {
        return Images.minesubm;
    }

    @Override
    public void move() {
        x += speed;
    }
    public Mine shootMine(){
        return new Mine(this.x+this.width,this.y-11);
    }

    @Override
    public int getLife() {
        return 1;
    }
}
