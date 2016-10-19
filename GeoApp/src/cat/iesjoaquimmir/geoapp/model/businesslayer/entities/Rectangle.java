/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;

/**
 *
 * @author alumne
 */
public class Rectangle {
    
//<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private double base=1.0;
    private double altura=1.0;
    
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Metodos">

//<editor-fold defaultstate="collapsed" desc="Constructores">
    
    public Rectangle(double base, double altura) {
        this.setBase(base);
        this.setAltura(altura);
    }
    public Rectangle(double base) {
        this.setBase(base);
    }
    /*public Rectangle(double altura) {
        this.setAltura(altura);
    }
    */
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    

    public double getBase() {
        return base;
    }


    public void setBase(double base) {
          if (base<=0.0){
            throw new IllegalArgumentException(String.format("Valor %f no valido.", base));
        }
        
        this.base = base;
    }

 
    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
          if (altura<=0.0){
            throw new IllegalArgumentException(String.format("Valor %f no valido.", altura));
        }
        
        
        this.altura = altura;
    }
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos objeto">
      
   public double getArea(){
        return (getBase()*getAltura())/2;
    }
    
    public double getPerimeter(){
        return (getAltura()*2)+getBase();
    }    
      
      
      
//</editor-fold>

    
//</editor-fold>

  
   
    
}