/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

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
import javax.swing.ImageIcon;

/**
 *
 * @author mishi
 */
public class ship extends Entity{
    private Image image;
    GamePanel GP;
    KeyHandler KH;
    BufferedImage HP;
    int trafienia;
    public int hp;
    long t, t2;
    
    public ship(GamePanel GP, KeyHandler KH){
        this.GP = GP;
        this.KH = KH;
        this.trafienia = 0;
        this.hp = 6;
        
        this.t = System.nanoTime();
        this.t2 = System.nanoTime();
        this.Default();
        this.getImage();
        this.getImageHP();
    } 
    public void Default(){
    x = 800;
    y = 800;
    boxSrX = 8;
    boxSrY = 8;
    boxH = 1;
    boxW = 1;
    s = 2;
}
    public void getImage(){

        try {
            this.im = ImageIO.read(new File("src/obrazki/ship1.png"));
        } catch (IOException ex) {
            Logger.getLogger(ship.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    public void getImageHP(){

        try {
            this.HP = ImageIO.read(new File("src/obrazki/HP.png"));
        } catch (IOException ex) {
            Logger.getLogger(ship.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    public int abs(int a){
        if(a<0){
            return -a;
        }
        return a;
    }
    
    public int check(Entity E){
        this.t = System.nanoTime();
        if(abs((int)x-(int)E.x)<=boxW+E.boxW){
            if(abs((int)y -(int)E.y) <= boxH +E.boxH){
                if(this.t - this.t2 >= 1*1000000000){
                    this.t2 = System.nanoTime();
                    this.trafienia = this.trafienia+1;
                    this.hp -= 1;
                    

                    return 1;
                }
            }
        }
        return 0;
    }
    public void update(){
        if(KH.up == true){
            y -= s;
        }
        if(KH.down == true){
            y += s;
        }
        if(KH.left == true){
            x -= s;
        }
        if(KH.right == true){
            x += s;
        }
        if(y<10){
            y=10;
        }
        if(y>880){
            y=880;
        }
        if(x<10){
            x=10;
        }
        if(x>1580){
            x=1580;
        }
        
       
    }
    public void draw(Graphics2D g2){

        g2.drawImage(this.im,(int)x,(int)y,17,17,null);
        int k = 0;
        int x2 = 1500;
        int y2 = 50;
        g2.drawImage(this.HP,1450,50,51,51,null);
        while(k<this.hp){
            if(x2<1570){
                g2.drawImage(this.im,x2,y2,17,17,null);
                k=k+1;
                x2=x2+20;
            }
            else{
            y2=y2+20;
            x2=1500;
            }            
            
        }
    }
}
