package sumbrine;

import javax.swing.*;

//侦察潜艇
public class ObserveSubmarine extends SeaObject implements EnemyScore{

    public ObserveSubmarine() {
        super(63,19);
    }

    @Override
    public ImageIcon getImage() {
        return Images.obsersubm;
    }

    @Override
    public void move() {
        x += speed;
    }

    @Override
    public int getScore() {
        return 10;
    }
}
