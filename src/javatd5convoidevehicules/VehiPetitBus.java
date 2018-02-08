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
public class VehiPetitBus extends Vehicule{
    
    private static final int POIDSAVIDE = 4;
    private static final int VITESSEMAX = 150;
    
    public VehiPetitBus(String i){
        super(i);
    }
    
    public String toString()
    {
        String str = "";
        
        str = str + super.toString() + " poids a vide " + POIDSAVIDE + 
              " vitesse Maximum " + VITESSEMAX;
        
        return str;
    }
    
    public int vMax(){
        return this.VITESSEMAX;
    }
    
    public int calculDuPoisTotal(){
        return this.POIDSAVIDE;
    }
    
    
}
