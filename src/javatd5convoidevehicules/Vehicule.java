/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatd5convoidevehicules;

/**
 *
 * @author lapie
 */
public abstract class Vehicule {
    
    private String immat;
    private int vitesseMaxi;
    
    public Vehicule()
    {
    
    }
    
    public Vehicule(String i)
    {
        this.immat = i;
    }
    
    public String toString()
    {
        String str = "";
        
        str = str + "le camion est immatricule sous le numero " + immat + ", et sa vitesse est " + vitesseMaxi + " km/h, ";
        
        return str;
    }
    
    public void nouvelleCharge(int n)
    {
        System.out.println("je passe"); 
    }
    
    public void enregistreVitesse()
    {
        this.vitesseMaxi = this.vMax();
    }
    
    // methode abstraite vMax()
    public abstract int vMax();
    
    // methode abstraite ()
    public abstract int calculDuPoisTotal();
    
}
