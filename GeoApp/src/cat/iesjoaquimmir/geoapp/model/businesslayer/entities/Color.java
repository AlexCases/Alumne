/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class Color {
//<editor-fold defaultstate="collapsed" desc="atributos">
    private int red;
    private int green;
    private int blue;
    public static final int MAX_VALUE=255;
    public static final int MIN_VALUE=0;
    private static int counter=0;

//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="metodos">
//<editor-fold defaultstate="collapsed" desc="contructor">
    
    public Color(int red, int green, int blue) {
        counter++;
        this.setRed(red);
        this.setGreen(green);
        this.setBlue(blue);
        
    }

//</editor-fold>
/*
//<editor-fold defaultstate="collapsed" desc="metodos objeto">
    public String toRGBString(){
        throw new UnsupportedOperationException("Not yet implemented");
    }
    public String toHexString(boolean upper){
        return String.format(upper ? "#%02X%02X%02X" : "#%02X%02X%02X",
                        getRed(), getGreen(), getBlue());
    }
//</editor-fold>
*/
//<editor-fold defaultstate="collapsed" desc="metodos estaticos">
    public static int getCounter() {    
        return counter;
    }
    
    public static Color fromHexString(String color){
        if (color ==null){
            throw new IllegalArgumentException("Es obligatori indicar una "+"cadena de text");
        }
        if (!color.matches("^#[0-9A-Fa-f]{6}$")){
            throw new IllegalArgumentException(
                    String.format("el texto %s no es exadecimal, color"));
            
        }
        return new Color    (Integer.parseInt(color.substring(1, 3), 16),
                             Integer.parseInt(color.substring(3, 5), 16),
                             Integer.parseInt(color.substring(5, 7), 16));
    }

    public static Color getRandow(){ 
        Random rnd= new Random(); return new Color(rnd.nextInt(MAX_VALUE+1),rnd.nextInt(MAX_VALUE+1),rnd.nextInt(MAX_VALUE+1));
    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="get/set">
    public int getRed() {
        return red;
    }


    public void setRed(int red) {
        if (red<0 || red>255){
            throw new IllegalArgumentException(String.format("Valor %d no valido.", red));

        }
        this.red = red;
    }


    public int getGreen() {
        return green;
    }


    public void setGreen(int green) {
        if (green<0 || green>255){
            throw new IllegalArgumentException(String.format("Valor %d no valido.", green));

        }
        this.green = green;
    }


    public int getBlue() {
        return blue;
    }


    public void setBlue(int blue) {
        if (blue<0 || blue>255){
            throw new IllegalArgumentException(String.format("Valor %d no valido.", blue));

        }
        this.blue = blue;
    }    
//</editor-fold>
    
//</editor-fold>
  
}
