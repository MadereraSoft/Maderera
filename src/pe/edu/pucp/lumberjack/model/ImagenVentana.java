/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.lumberjack.model;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

/**
 *
 * @author Angel
 */
public class ImagenVentana implements Border{
    public BufferedImage back;
    
    public ImagenVentana(){
        try {
            URL imagePath = new URL(getClass().getResource("/Images/fondoVentana.png").toString());
            back = ImageIO.read(imagePath);        
        }
        catch (Exception ex){        
        }
    }
    
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(back, (x + (width - back.getWidth())/2),(y + (height - back.getHeight())/2), null);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }       
}
