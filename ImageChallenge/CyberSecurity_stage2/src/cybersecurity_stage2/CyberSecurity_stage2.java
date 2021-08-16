/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cybersecurity_stage2;

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
public class CyberSecurity_stage2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int width = 960,hieght=640;
                BufferedImage m,c,E;
                m = new  BufferedImage(width,hieght,BufferedImage.TYPE_INT_ARGB);
                c = new  BufferedImage(width,hieght,BufferedImage.TYPE_INT_ARGB);
                E = new  BufferedImage(width,hieght,BufferedImage.TYPE_INT_ARGB);
        try {
            m= ImageIO.read(new File("C:\\Users\\Lenovo\\Documents\\PROJECTS\\2021CyberSecurityChallenge\\ImageChallenge\\Mass.png"));
            c= ImageIO.read(new File("C:\\Users\\Lenovo\\Documents\\PROJECTS\\2021CyberSecurityChallenge\\ImageChallenge\\Speed_of_Light.png"));
            

        } catch (IOException ex) {
            Logger.getLogger(CyberSecurity_stage2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         for(int i=0;i<width;i++){
            for(int j=0;j<hieght;j++){
                
//E = m*c*c 
                int rgb =  m.getRGB(i, j) * c.getRGB(i, j) * c.getRGB(i, j);
                Color color =new Color(rgb);
            E.setRGB(i, j, color.getRGB());
            }
        }
         
         try {    
            ImageIO.write(E, "png", new File("C:\\Users\\Lenovo\\Documents\\PROJECTS\\2021CyberSecurityChallenge\\ImageChallenge\\Energy.png"));
        } catch (IOException ex) {
            Logger.getLogger(CyberSecurity_stage2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("It is working ");

    }
    
}
