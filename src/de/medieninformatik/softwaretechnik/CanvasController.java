package de.medieninformatik.softwaretechnik;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;

/**
 * @author Carolin Baum, m29137
 * @author Noah Darwin Hakkenbrock, m29276
 * date: 19.10.2021
 *
 * The class CanvasController draws the circles after the mouse was clicked.
 */

public class CanvasController implements MouseListener {

    int x1, x2, y1, y2;
    int counter = 0;
    Canvas canvas;
    Font font = new Font("Arial", Font.ITALIC, 20);

    float r = 40.0F;

    public float getRadius(float kr){
        r = kr;
        return r;
    }

    /**
     * The method mouseClicked counts the amount of mouse clicks and draws the circles.
     * Furthermore it draws the string with the coordinates.
     * @param e event
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        canvas = (Canvas) e.getSource();
        Graphics g = canvas.getGraphics();
        Ellipse2D ellipse2D;
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.ORANGE);
        g2d.setFont(font);

        //in case of a double click
        if (e.getClickCount()==2){

            //counts the quantity of double clicks
            switch (counter){
                //first click, first circle
                case 0:
                    x1 = e.getX();
                    y1 = e.getY();
                    ellipse2D = new Ellipse2D.Float((float) (x1-(0.5*r)), (float) (y1-(0.5*r)), r, r);
                    g2d.fill(ellipse2D);
                    String string1 = ("X-Koordinate: " + x1 + ", Y-Koordinate: " + y1);
                    g2d.drawString(string1, 20,25);
                    counter++;
                    break;
                //second click, second circle
                case 1:
                    x2 = e.getX();
                    y2 = e.getY();
                    ellipse2D = new Ellipse2D.Float((float) (x2-(0.5*r)), (float) (y2-(0.5*r)), r, r);
                    g2d.fill(ellipse2D);
                    String string2 = ("X-Koordinate: " + x2 + ", Y-Koordinate: " + y2);
                    g2d.drawString(string2, 20,50);
                    counter++;
                    break;
                //third click, clear circle
                case 2:
                    repaint();
                    counter = 0;
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    /**
     * The method repaint is for repainting the canvas.
     */
    public void repaint(){
        canvas.repaint();
    }

}
