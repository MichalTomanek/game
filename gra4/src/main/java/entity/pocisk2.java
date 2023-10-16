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

public class pocisk2 extends Entity{
    private Image image;
    GamePanel GP;
    double kat;
    ship S;
    int t;
    public pocisk2(GamePanel GP, ship S, double kat, double x, double y, int t){
        this.GP = GP;
        this.S = S;
        this.x = x;
        this.y = y;
        this.s = 0;
        this.t = t;
        this.getImage();
        this.kat = kat;
        this.Default();
    }
    public void Default(){

        boxSrX = 6;
        boxSrY = 6;
        boxH = 3;
        boxW = 3;

        //kat = 0.5*3.1415;
    }
    public void getImage(){

        try {
            this.im = ImageIO.read(new File("src/obrazki/pocisk2.png"));
        } catch (IOException ex) {
            Logger.getLogger(ship.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }
    public void update(){
        
        S.check(this);
        
        
    }
    public void draw(Graphics2D g2){
        
        g2.drawImage(this.im,(int)x,(int)y,15,15,null);
        
    }
}
