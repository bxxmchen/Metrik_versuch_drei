package de.medieninformatik.softwaretechnik;

import java.awt.*;

/**
 * @author Carolin Baum, m29137
 * @author Noah Darwin Hakkenbrock, m29276
 * date: 19.10.2021
 *
 * The class CustomCanvas sets the size and the background color.
 * https://github.com/bxxmchen/Metrik_versuch_drei
 */

public class CustomCanvas extends Canvas {

    /**
     * The constructor of the class CustomCanvas sets the size and the background color.
     */
    public CustomCanvas(){
        setSize(850, 550);
        setBackground(Color.WHITE);
    }

    /**
     * The method changeBackground changes the background color.
     * @param c color
     */
    public void changeBackground(Color c){
        setBackground(c);
    }
}
