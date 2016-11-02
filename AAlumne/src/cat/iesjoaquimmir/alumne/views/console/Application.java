/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.alumne.views.console;

import cat.iesjoaquimmir.alumne.model.businesslaye.entities.Alumne;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Application {
    public static void main(String[] args) {    
       int opc;
        Scanner input = new Scanner(System.in); 
        
        do{
        System.out.println("Elige una opcion para añadir a un alumno:"
                + "\n1-Introduce el nombre y el dni"
                + "\n2-Introduce el nombre y la edat"
                + "\n3-Introduce la edat y el dni"
                + "\n4-Introducela edat, el dni y el nombre"
                + "\n5-Salir");
        opc=input.nextInt();                   
                   
        if (opc==1){
            funcNombreDni();
        }else if(opc==2){
            funcNombreEdat();
        }else if(opc==3){
            funcEdatDni();
        }else if (opc==4){
            funcEdatDniNombre();
        }else if(opc==5){
            System.exit(0);
            System.gc();
        }   
        }while(opc<=0 || opc>6);
    }
//<editor-fold defaultstate="collapsed" desc="nombre dni">
public static void funcNombreDni(){
        
        String nom;
        String dni;
      
        
            Scanner input = new Scanner(System.in);
            System.out.printf("Introduce el nombre: ");
            nom=input.nextLine(); 
            System.out.printf("Introduce el dni: ");
            dni=input.nextLine();             
        

          
        Alumne alumne= new Alumne(dni, nom);
        System.out.printf(alumne.getSalutacion());         
        
         
           
    }    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="nombre edat">
public static void funcNombreEdat(){
        
        String nom;
        int edat;
      
        
            Scanner input = new Scanner(System.in);
            System.out.printf("Introduce el nombre: ");
            nom=input.nextLine(); 
            System.out.printf("Introduce la edar: ");
            edat=input.nextInt();             
        

          
        Alumne alumne= new Alumne(edat, nom);
        System.out.printf(alumne.getSalutacion());         
       
         
           
    }    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="edat dni">
public static void funcEdatDni(){
        
        int edat;
        String dni;
      
        
            Scanner input = new Scanner(System.in);
            System.out.printf("Introduce la edad: ");
            edat=input.nextInt(); 
            System.out.printf("Introduce el dni: ");
            dni=input.nextLine();             
        

          
        Alumne alumne= new Alumne(dni, edat);
        System.out.printf(alumne.getSalutacion());         
                
         
           
    }    
//</editor-fold>    
//<editor-fold defaultstate="collapsed" desc="nombre dni">
public static void funcEdatDniNombre(){
        
        String nom;
        String dni;
        int edat;
      
        
            Scanner input = new Scanner(System.in);
            System.out.printf("Introduce el nombre: ");
            nom=input.nextLine(); 
            System.out.printf("Introduce el dni: ");
            dni=input.nextLine();             
            System.out.printf("Introduce la edat: ");
            edat=input.nextInt();        

          
        Alumne alumne= new Alumne(edat, dni, nom);
                
        System.out.printf(alumne.getSalutacion());         
         
           
    }    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="nombre">
public static void funcNombre(){
        
        String nom;
      
        
            Scanner input = new Scanner(System.in);
            System.out.printf("Introduce el nombre: ");
            nom=input.nextLine(); 
       

          
        Alumne alumne= new Alumne(nom);
                
        System.out.printf(alumne.getSalutacion());         
         
           
    }    
//</editor-fold>
}