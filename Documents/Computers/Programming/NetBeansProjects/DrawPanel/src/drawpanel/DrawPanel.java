/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawpanel;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Ari
 */
public class DrawPanel extends JPanel {

    /**
     * @param args the command line arguments
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int z = 57;
        for (int i = 1; i <= z; i++) {
            g.drawLine(0, 0, width - (width / z) * i, (height / z) * i);
            g.drawLine(0, height, (width / z) * i, (height / z) * i);
            g.drawLine((width / z) * i, height - (height / z) * i, width, height);
            g.drawLine(width - (width / z) * i, height - (height / z) * i, width, 0);
        }/*        for (int i = 1; i <= 10; i++) {
         g.drawLine(0, 0, width, (height / 10) * i);
         g.drawLine(0, 0, (width / 10) * i, height);
         }*//*
         for (int i = 1; i <= 10; i++) {
         g.drawLine(0, (height / 10) * i, width, height);
         g.drawLine(0, 0, (width / 10) * i, height);
         }
         for (int i = 1; i <= z; i++) {
         g.drawLine(0, (height / z) * i, (width / z) * i, height);
         // g.drawLine(0, 0, (width / 10) * i, height);
         }
         for (int i = 1; i <= z; i++) {
         g.drawLine(0, (height / z) * i, (width / z) * i, height);
         g.drawLine((width / z) * i, 0, width, (height / z) * i);
         g.drawLine(0, height - (height / z) * i, (width / z) * i, 0);
         g.drawLine((width / z) * i, height, width, height - (height / z) * i);
         }*/


    }

}
