/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author mishi
 */
import com.mycompany.gra4.main.GamePanel;
import com.mycompany.gra4.main.KeyHandler;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import java.lang.Math;

public class Pocisk1A extends Entity{
    private Image image;
    GamePanel GP;
    double kat;
    ship S;
    public Pocisk1A(GamePanel GP, ship S, double kat, double x, double y,double s){
        this.GP = GP;
        this.S = S;
        this.x = x;
        this.y = y;
        this.s = s;
        this.getImage();
        this.kat = kat;
        this.Default();
    }
    public void Default(){

        boxSrX = 8;
        boxSrY = 8;
        boxH = 3;
        boxW = 3;

        //kat = 0.5*3.1415;
    }
    public void getImage(){

        try {
            this.im = ImageIO.read(new File("src/obrazki/pocisk1A.png"));
        } catch (IOException ex) {
            Logger.getLogger(ship.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }
    public void update(){
        S.check(this);
        x=x+s*(Math.cos(kat));
        y=y+s*(Math.sin(kat));
    }
    public void draw(Graphics2D g2){

        g2.drawImage(this.im,(int)x,(int)y,9,9,null);
    }
}
