/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.views.console;

import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Cercle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Color;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Rectangle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Sphere;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Square;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Application {
    
      public static void main(String[] args) {
        // TODO code application logic here
    
//<editor-fold defaultstate="collapsed" desc="menu">
     
       int opc;
        Scanner input = new Scanner(System.in); 
        
        do{
        System.out.println("Elige una opcion:\n1-Square\n2-Rectangle\n3-Cercle\n4-Sphere\n5-Rectangle con la altura por defecto\n6-Color Normal\n7-Color Hexadedimal\n8-Color Aleatorio\n9-Salir");
        opc=input.nextInt();                   
                   
        if (opc==1){
            funcSquare();
        }else if(opc==2){
            funcRectangle();
        }else if(opc==3){
            funcCercle();
        }else if (opc==4){
            funcSphere();
        }else if (opc==5){
            funcRectangleB();
        }else if (opc ==6){
            funcColor();
        }else if (opc ==7){
            funcColorHexadecimal();
        }else if (opc==8){
            funcColorAleatori();
        }else if(opc==9){
            System.exit(0);
        }   
        }while(opc<=0 || opc>8);
    }
//</editor-fold>   
 
    
    
//<editor-fold defaultstate="collapsed" desc="funciones">
      
    //<editor-fold defaultstate="collapsed" desc="Square">
    
        
    public static void funcSquare(){
        
        double lado=0;
      
        do{
            Scanner input = new Scanner(System.in);
            System.out.printf("Introduce el lado del cuadrado, el numero devera ser mayor que 0: ");
            lado=input.nextDouble();       
        }while (lado<=0);

          
        Square cuadrado= new Square(lado);
        System.out.printf("\n---Cuadrado ---\n");
        System.out.printf("\nEl area del cuadrado es: %s",cuadrado.getArea());         
        System.out.printf("\nEl perdimetrodel cuadrado es: %s\n",cuadrado.getPerimeter());
        
         
           
    }
        
//</editor-fold>  
    //<editor-fold defaultstate="collapsed" desc="Rectangle">
         
    public static void funcRectangle(){
    
        double altura=0;
        double base=0;
        int opc=0;

            do{
                Scanner input = new Scanner(System.in);
                System.out.printf("Introduce la altura del rectangulo, el numero devera ser mayor que 0: ");
                altura=input.nextDouble();

                System.out.printf("Introduce la base del rectangulo, el numero devera ser mayor que 0: ");
                base=input.nextDouble();   
            }while(base<=0 && altura<=0);
              
            Rectangle rectangulo= new Rectangle(altura,base);
            System.out.printf("---Rectangle--- %n");
            System.out.printf("\nEl area del rectangulo es: %s",rectangulo.getArea());         
            System.out.printf("\nEl perímetro del rectangulo es: %s\n",rectangulo.getPerimeter());
        }
    

        
    
        
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Cercle">
    public static void funcCercle(){   
        
        double radio=0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.printf("Introduce el radio de la circunsferencia, el numero devera ser mayor que 0: ");
            radio=input.nextDouble();                
        }while(radio<=0); 
      
        
        Cercle circulo= new Cercle(radio);
        System.out.printf("---Circulo--- %n");
         System.out.printf("\nEl area del circulo es: %s",circulo.getArea());         
        System.out.printf("\nEl perímetro del circulo es: %s\n",circulo.getPerimeter());
     
            
               
    }    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Sphere">
        public static void funcSphere(){   
        
         double radio;
        Scanner input = new Scanner(System.in); 
        do{
            System.out.printf("Introduce el radio de la esfera, el numero devera ser mayor que 0: ");
            radio=input.nextDouble();
        }while(radio<=0); 
        
     
        
        Sphere esfera= new Sphere(radio);
        System.out.printf("---Shpere---");
         System.out.printf("\nEl area de la sphera es: %s",esfera.getArea());         
        System.out.printf("\nEl perímetro de la sphera es: %s\n",esfera.getPerimeter());
        
    
     }     
        
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Rectangle con la base">
        public static void funcRectangleB(){   
            double base;
            do{
                Scanner input = new Scanner(System.in);
                System.out.printf("Introduce la base del rectangulo, el numero devera ser mayor que 0: ");
                base=input.nextDouble();   
            }while(base<=0);
              
            Rectangle rectangulo= new Rectangle(base);
            System.out.printf("---Rectangle--- %n");
            System.out.printf("\nEl area del rectangulo es: %s",rectangulo.getArea());         
            System.out.printf("\nEl perímetro del rectangulo es: %s\n",rectangulo.getPerimeter());
        }    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Color">
public static void funcColor(){ 
        int red=0;
        int blue=0;
        int green=0;
    Scanner input = new Scanner(System.in);

            do{
                System.out.printf("Introduce el red (el numero devera contener estar entre el 0 y el 255 ");
                red=input.nextInt();

                System.out.printf("Introduce el green (el numero devera contener estar entre el 0 y el 255 ");
                red=input.nextInt();
                
                System.out.printf("Introduce el blue (el numero devera contener estar entre el 0 y el 255 ");
                blue=input.nextInt();
               
            }while(red<=0 && green<=0 && blue<=0);
    
    Color co1= new Color(red, green, blue);
    System.out.printf("---Colores---"); 
    System.out.printf("\nco1-> reed: %d green: %d blue: %d %n", co1.getRed(), co1.getGreen(), co1.getBlue() );
    
       
}  
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="color Hexadecimal">
public static void funcColorHexadecimal(){
    String hexadecimal;
    Scanner input = new Scanner(System.in);
 
    System.out.printf("Introduce el numero en hexadecimal");
    hexadecimal=input.nextLine(); 
        
        
    Color co2= Color.fromHexString(hexadecimal); 
    
    System.out.printf("\nco2-> Color hexadecimal: %s %n", hexadecimal ); 
    System.out.printf("\nColores creados: %d %n", Color.getCounter());  
}
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Color aleaotori">
public static void funcColorAleatori(){ 
    Color co1=Color.getRandow();
    
    System.out.printf("color aleatorio -> r: %d g: %d b: %d %n", co1.getRed(), co1.getGreen(), co1.getBlue()); 
    System.out.printf("color hexadecimal en mayuscula-> %s %n", co1.toHexString(true));
    System.out.printf("color hexadecimal en minuscula-> %s %n", co1.toHexString(false));
    System.out.printf("color hexadecimal en por defecto-> %s %n", co1.toHexString());
    
} 
//</editor-fold>
        
//</editor-fold>

}

      
