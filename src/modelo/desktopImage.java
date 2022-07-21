/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

/**
 *
 * @author Dachapi
 */
public class desktopImage implements Border{
    public BufferedImage background;

    public desktopImage() {
        try {
            URL imagePath = new URL(getClass().getResource("/complementos/fondoMain.jpg").toString());
            background = ImageIO.read(imagePath);
        }
        catch (Exception ex)
        {

        }
    }

    public void paintBorder(Component c, Graphics g, int x , int y , int width, int height)
    {
        g.drawImage(background,(x +(width - background.getWidth())/2 ), (y + (height - background.getHeight())/2), null);
    }

    public Insets getBorderInsets(Component c)
    {
        return new Insets(0, 0, 0, 0);
    }

    public boolean isBorderOpaque()
    {
        return false;
    }
}
