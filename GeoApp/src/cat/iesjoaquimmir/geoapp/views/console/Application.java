/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.views.console;

import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Cercle;
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
        System.out.println("Elige una opcion:\n1-Square\n2-Rectangle\n3-Cercle\n4-Sphere\n5-Rectangle con la altura por defecto\n6-Salir");
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
        }else if(opc==6){
            System.exit(0);
        }
        }while(opc<=0 || opc>6);
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
//</editor-fold>

}

      
