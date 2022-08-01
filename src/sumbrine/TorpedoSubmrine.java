package sumbrine;

import javax.swing.*;

//鱼雷潜艇
public class TorpedoSubmrine extends SeaObject implements EnemyScore{


    public TorpedoSubmrine() {
        super(64,20);
    }

    @Override
    public ImageIcon getImage() {
        return Images.torpesubm;
    }

    @Override
    public void move() {
        x += speed;
    }

    @Override
    public int getScore() {
        return 40;
    }
}
