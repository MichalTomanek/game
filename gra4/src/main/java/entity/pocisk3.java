/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import com.mycompany.gra4.main.GamePanel;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author mishi
 */
public class pocisk3 extends Entity{
    private Image image;
    GamePanel GP;
    double kat;
    ship S;
    double ds;
    public pocisk3(GamePanel GP, ship S, double kat, double x, double y,double s, double ds){
        this.GP = GP;
        this.S = S;
        this.x = x;
        this.y = y;
        this.s = s;
        this.ds = ds;
        this.getImage();
        this.kat = kat;
        this.Default();
    }
    public void Default(){

        boxSrX = 4;
        boxSrY = 4;
        boxH = 1;
        boxW = 1;

        //kat = 0.5*3.1415;
    }
    public void getImage(){

        try {
            this.im = ImageIO.read(new File("src/obrazki/pocisk3.png"));
        } catch (IOException ex) {
            Logger.getLogger(ship.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }
    public void update(){
        S.check(this);
        s=s+ds;
        x=x+s*(Math.cos(kat));
        y=y+s*(Math.sin(kat));
    }
    public void draw(Graphics2D g2){

        g2.drawImage(this.im,(int)x,(int)y,9,9,null);
    }
}