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
        
        str = str + "le camion est immatricule sous le numero " + immat + ", et sa vitesse maximum est " + vitesseMaxi + " ";
        
        return str;
    }
    
    public void nouvelleCharge(int n)
    {
        String str = "";
        
        str = str + "le poids du chargement est de " + n + " tonnes";
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
