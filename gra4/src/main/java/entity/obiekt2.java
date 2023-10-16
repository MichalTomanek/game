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
import java.util.Random;
/**
 *
 * @author mishi
 */
public class obiekt2 extends Entity{
    GamePanel GP;
    ship S;
    double kat;
    double kat1;
    double kat2;
    int ile;
    double ile2;
    int n = 14;
    int i;
    int j;
    int i2;
    Random r;
    int u;
    int t;
    double lkat, lkat2;
    laser1 [] P = new laser1[n];
    public obiekt2(GamePanel GP, ship S, int x, int y, int ile, double s, double kat1, double kat2, double lkat, double lkat2,int t){
        this.GP = GP;
        this.S = S;
        this.x = x;
        this.y = y;
        this.s = s;
        this.kat1=kat1;
        this.kat2=kat2;
        this.i = 0;
        this.i2 = 0;
        this.t = t;
        this.lkat = lkat;
        this.lkat2 = lkat2;
        this.j = 0;
        this.ile = ile;
        
        this.ile2 = 1/(double)ile;
        //this.Default();
    }
    public void Default(){
        x = 800;
        y = 200;
        s = 0;
        kat = 0.5*3.1415;
        kat1 = 0.001;
        kat2 = 0.0003;
    }
    public void shoot(){
        j = 0;
        while(j<ile){
            this.r = new Random();
            double lkat3 = 2*this.lkat2*(this.r.nextDouble() - 0.5);
            
            if(i2 == 0){
                
                P[i] = new laser1(GP,S,kat,lkat3,x,y,t,(int)s);
            }
            else{
                P[i].kat = kat;
                P[i].kat2 = lkat3;
                P[i].x = x;
                P[i].y = y;
            }
            kat = kat+2*3.14159*(ile2);

            i=i+1;
            
            j=j+1;
            if(i>=n){
                i=0;
                i2=1;
            }
        }
        kat=kat+kat1;
        kat1=kat1+kat2;
        //i=i-1;
    }
    public void go(Graphics2D g2){
        j = 0;
        if(i2 == 0){
            u = i;
        }
        else{
            u=n;
        }
        while(j<u){
            P[j].update();
            P[j].draw(g2);
            j=j+1;
        }
    }
    public void update(Graphics2D g2){
        shoot();
        go(g2);
    }
}
