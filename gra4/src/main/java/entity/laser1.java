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

public class laser1 extends Entity{
    private Image image;
    GamePanel GP;
    double kat, kat2;
    ship S;
    int n = 15;
    int s2;
    int i;
    int i1;
    int i2, i3;
    pocisk2 [] P = new pocisk2[n];
    int t;
    public laser1(GamePanel GP, ship S, double kat, double kat2, double x, double y, int t, int s){
        this.GP = GP;
        this.S = S;
        this.x = x;
        this.y = y;
        this.s2 = s;
        this.t = t;
        this.i = 0;
        this.i3 = 0;
        this.i1 = 0;
        this.i2 = 0;
        this.kat = kat;
        this.kat2 = kat2;
        this.Default();
    }
    public void Default(){

        boxSrX = 8;
        boxSrY = 8;
        boxH = 1;
        boxW = 1;

        //kat = 0.5*3.1415;
    }
    
    public void update(){
        this.i3 = this.i3%9;
        int k=this.i3;
        while(this.i3<=this.s2+k){
            //System.out.println(this.i3);
            if(this.i3%9 == 0){
                //System.out.println(this.i1);
                P[this.i1] = new pocisk2(GP,S,kat,x,y,t);
                this.i3=this.i3+1;
                this.i1=this.i1+1;
                if(this.i1>=n){
                    this.i1=0;
                    this.i2=1;
                }
            }
            x=x+(Math.cos(kat));
            y=y+(Math.sin(kat));
            this.i3=this.i3+1;
            
            kat=kat+kat2;
        }

                
        
    }
    public void draw(Graphics2D g2){
        i=0;
        int n2 = this.i1;
        if(this.i2 == 1){
            n2 = this.n;
        }
        while(i<n2){
            P[i].update();
            P[i].draw(g2);
            i=i+1;
        }
    }
}
