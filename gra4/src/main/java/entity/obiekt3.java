/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import main2.GamePanel;
import java.awt.Graphics2D;
import java.util.Random;

/**
 *
 * @author mishi
 */
public class obiekt3 extends Entity{
    GamePanel GP;
    ship S;
    double kat;
    double kat1;
    double kat2;
    double ds;
    int ile;
    double ile2;
    int n = 2000;
    int i;
    int j;
    int x1,x2,y1,y2;
    double s1,s2;
    int i2;
    int u;
    Random r;
    pocisk3 [] P = new pocisk3[n];
    public obiekt3(GamePanel GP, ship S, int x1, int y1,int x2, int y2, int ile, double s1, double s2, double kat1, double kat2,double ds){
        this.GP = GP;
        this.S = S;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.s1 = s1;
        this.s2 = s2;
        this.ds = ds;
        this.kat1=kat1;
        this.kat2=kat2;
        this.i = 0;
        this.i2 = 0;
        this.j = 0;
        this.ile = ile;
        this.r = new Random();
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
            int x = (int)(x1+(x2-x1)*r.nextDouble());
            int y = (int)(y1+(y2-y1)*r.nextDouble());
            int s = (int)(s1+(s2-s1)*r.nextDouble());
            double kat = (3.14159*0.5+kat1+(kat2-kat1)*r.nextDouble());
            P[i] = new pocisk3(GP,S,kat,x,y,s,ds);

            i=i+1;
            
            j=j+1;
            if(i>=n){
                i=0;
                i2=1;
            }
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
