/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.alumne.model.businesslaye.entities;

/**
 *
 * @author alumne
 */
public class Alumne {
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
   
//<editor-fold defaultstate="collapsed" desc="Atributos">
    
private int edat;
private String dni;
private String nom;
private static final int edatDefault=99;
private static final String dniDefault="00000000A";
private static final String nomDefault="Anonymous";

//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Constructores">

    public Alumne(int edat, String dni, String nom) {
        this.setEdat(edat);
        this.setDni(dni);
        this.setNom(nom);
    }

    public Alumne(String dni, String nom) {
        this(edatDefault, dni, nom);
    }
    
    public Alumne(int edat, String nom) {
        this(edat, dniDefault, nom);
    }
     
    public Alumne(String dni, int edat) {
        this(edat, dni, nomDefault);
    }
    public Alumne (String nom) {
        this(edatDefault, dniDefault, nom);
    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    public int getEdat() {
        return edat;
    }


    public void setEdat(int edat) {
        if (edat<=0 && edat>100){
            throw new IllegalArgumentException(String.format("Valor %d no valido para la edad.", edat));
        }        
        this.edat = edat;
    }


    public String getDni() {
        return dni;
    }


    public void setDni(String dni) {
        if (dni.length()!=9){
            throw new IllegalArgumentException(String.format("El dni no tiene los caracteres adecuados.", dni));
        }        
        this.dni = dni;
    }


    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        if (nom==null){
            throw new IllegalArgumentException(String.format("Valor %s no valido para el nombre.", nom));
        }
        this.nom = nom;
    }
 
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodos objeto">
    public String getSalutacion() {
        return String.format("%nHola soc en %s amb identificacio %s y tinc %d anys", getNom(), getDni(), getEdat());
    }
    
  
      
      
      
//</editor-fold>

    
//</editor-fold>


}   

