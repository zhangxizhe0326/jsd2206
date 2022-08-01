package sumbrine;

import javax.swing.*;

//水雷
public class Mine extends SeaObject{
    public Mine(int x,int y) {
        super(11,11,x,y,1);
    }
    @Override
    public ImageIcon getImage() {
        return Images.mine;
    }

    @Override
    public void move() {
        y -= speed;
    }
    public boolean isOutOfBounds(){
        return this.y <= 150 - this.height;
    }
}
