/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
/**
 *
 * @author user
 */
public class TransparentPanel extends JPanel{
    public Color warna;
    public TransparentPanel(){
        setOpaque(false);
        warna = new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 100);
    }
    public void setBackground(Color bg) {
        super.setBackground(bg);

        warna = new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 100);
        repaint();
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //membuat objek g2
        Graphics2D g2 = (Graphics2D) g.create();
        //memberi warna
        g2.setColor(warna);
        //mengisikan warna
        //getwidth dan get height agar warna mengikuti luas panel
        g2.fillRect(0, 0, getWidth(), getHeight());
        //menutup g2
        g2.dispose();
    }
}
