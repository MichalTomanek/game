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
public class obiekt7 extends Entity{
    GamePanel GP;
    ship S;
    double kat;
    double kat1;
    double kat2;
    int ile;
    double ile2;
    int n = 10;
    int i;
    int j;
    int i2;
    int u;
    int obrazek;
    double rs;
    Random r;
    obiekt4 [] P = new obiekt4[n];
    public obiekt7(GamePanel GP, ship S, int x, int y, int ile, double s, double rs,int obrazek){
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
    public void shoot(ship S){
        j = 0;    
        
            double rad = Math.atan2(S.y-y,S.x-x);
            P[i] = new obiekt4(GP,S,(int)x,(int)y,ile,s,rs,rad-0.05,rad+0.05,obrazek);
            P[i].shoot();
            i=i+1;
            
            j=j+1;
            if(i>=n){
                i=0;
                i2=1;
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
            P[j].go(g2);
            j=j+1;
        }
    }
    public void update(Graphics2D g2,ship S){
        shoot(S);
        go(g2);
    }
}

