/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import com.mycompany.gra4.main.GamePanel;
import java.awt.Graphics2D;
import java.util.Random;

/**
 *
 * @author mishi
 */
public class obiekt4 extends Entity{
    GamePanel GP;
    ship S;
    double kat;
    double kat1;
    double kat2;
    int ile;
    double ile2;
    int n = 16;
    int i;
    int j;
    int i2;
    int u;
    int obrazek;
    double rs;
    Random r;
    pocisk4 [] P = new pocisk4[n];
    public obiekt4(GamePanel GP, ship S, int x, int y, int ile, double s, double rs, double kat1, double kat2, int obrazek){
        this.GP = GP;
        this.S = S;
        this.x = x;
        this.y = y;
        this.s = s;
        this.rs = rs;
        this.kat1=kat1;
        this.kat2=kat2;
        this.i = 0;
        this.i2 = 0;
        this.j = 0;
        this.ile = ile;
        this.ile2 = 1/(double)ile;
        this.obrazek = obrazek;
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
        int k = 0;        
        while(j<=ile){
            double d = (double)(k*2)/(double)ile;
            P[i] = new pocisk4(GP,S,kat1+(kat2-kat1)*d,x,y,s+rs*d,0,this.obrazek);
            i=i+1;
            
            j=j+1;
            if(i>=n){
                i=0;
                i2=1;
            }
            P[i] = new pocisk4(GP,S,kat1+(kat2-kat1)*d,x,y,s-rs*d,0,this.obrazek);
            i=i+1;
            
            j=j+1;
            if(i>=n){
                i=0;
                i2=1;
            }
            P[i] = new pocisk4(GP,S,kat2-(kat2-kat1)*d,x,y,s+rs*d,0,this.obrazek);
            i=i+1;
            
            j=j+1;
            if(i>=n){
                i=0;
                i2=1;
            }
            P[i] = new pocisk4(GP,S,kat2-(kat2-kat1)*d,x,y,s-rs*d,0,this.obrazek);
            i=i+1;
            
            j=j+1;
            if(i>=n){
                i=0;
                i2=1;
            }
            k=k+1;
        }
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

