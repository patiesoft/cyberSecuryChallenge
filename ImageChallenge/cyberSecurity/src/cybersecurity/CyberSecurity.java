/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cybersecurity;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Lenovo
 */
public class CyberSecurity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int width = 900,hieght=600;
                BufferedImage a,b,c,d ,y;
                d = new  BufferedImage(width,hieght,BufferedImage.TYPE_INT_ARGB);
                a = new  BufferedImage(width,hieght,BufferedImage.TYPE_INT_ARGB);
                c= new  BufferedImage(width,hieght,BufferedImage.TYPE_INT_ARGB);
                b= new  BufferedImage(width,hieght,BufferedImage.TYPE_INT_ARGB);
                y = new  BufferedImage(width,hieght,BufferedImage.TYPE_INT_ARGB);

        try {
            a= ImageIO.read(new File("C:\\Users\\Lenovo\\Documents\\PROJECTS\\2021CyberSecurityChallenge\\ImageChallenge\\a.png"));
            b= ImageIO.read(new File("C:\\Users\\Lenovo\\Documents\\PROJECTS\\2021CyberSecurityChallenge\\ImageChallenge\\b.png"));
            c= ImageIO.read(new File("C:\\Users\\Lenovo\\Documents\\PROJECTS\\2021CyberSecurityChallenge\\ImageChallenge\\c.png"));
            y= ImageIO.read(new File("C:\\Users\\Lenovo\\Documents\\PROJECTS\\2021CyberSecurityChallenge\\ImageChallenge\\y.png"));

        } catch (IOException ex) {
            Logger.getLogger(CyberSecurity.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<width;i++){
            for(int j=0;j<hieght;j++){
                
//d = y - 21a -3b + 41c
                int rgb = y.getRGB(i, j) - 21*a.getRGB(i, j) -3*b.getRGB(i, j) + 41*c.getRGB(i, j);
                Color color =new Color(rgb);
            d.setRGB(i, j, color.getRGB());
            }
        }
        
        try {    
            ImageIO.write(d, "png", new File("C:\\Users\\Lenovo\\Documents\\PROJECTS\\2021CyberSecurityChallenge\\ImageChallenge\\d.png"));
        } catch (IOException ex) {
            Logger.getLogger(CyberSecurity.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("It is working ");

    }
    
}
