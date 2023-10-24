/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author mishi
 */


import main2.GamePanel;
import java.awt.Graphics2D;
import java.awt.Image;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import java.lang.Math;

public class GameOver extends Entity{
    private Image image;
    GamePanel GP;
    double kat;
    ship S;
    public GameOver(GamePanel GP){
        this.getImage();
    }

    public void getImage(){

        try {
            this.im = ImageIO.read(new File("obrazki/GO.png"));
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

        g2.drawImage(this.im,700,250,300,300,null);
    }
}
