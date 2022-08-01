package sumbrine;
import javax.swing.ImageIcon;
public class Images {
    public static ImageIcon battleship;
    public static ImageIcon bomb;
    public static ImageIcon gameover;
    public static ImageIcon mine;
    public static ImageIcon minesubm;
    public static ImageIcon obsersubm;
    public static ImageIcon sea;
    public static ImageIcon torpesubm;
    static {
        battleship = new ImageIcon("img/battleship.png");
        bomb = new ImageIcon("img/bomb.png");
        gameover = new ImageIcon("img/bomb.png");
        mine = new ImageIcon("img/mine.png");
        minesubm = new ImageIcon("img/minesubm.png");
        obsersubm = new ImageIcon("img/obsersubm.png");
        sea = new ImageIcon("img/sea.png");
        torpesubm = new ImageIcon("img/torpesubm.png");
    }

    public static void main(String[] args) {
        System.out.println(battleship.getImageLoadStatus());
        System.out.println(bomb.getImageLoadStatus());
        System.out.println(gameover.getImageLoadStatus());
        System.out.println(mine.getImageLoadStatus());
        System.out.println(minesubm.getImageLoadStatus());
        System.out.println(obsersubm.getImageLoadStatus());
        System.out.println(sea.getImageLoadStatus());
        System.out.println(torpesubm.getImageLoadStatus());
    }
}
