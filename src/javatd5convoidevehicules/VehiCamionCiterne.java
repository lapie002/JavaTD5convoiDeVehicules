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
public class VehiCamionCiterne extends VehiCamion{
    
    private static final int POIDSAVIDE = 3;
    private static final int CHARGEMAXI = 10;
    
    private static final int[] VITESSE = {130,110,90,80};
    private static final int[] CHARGES = {3,4,7,10};
    
    public VehiCamionCiterne(String i){
        super(i);
    }
    
    public String toString()
    {
        String str = "";
        
        str = str + super.toString() + " le poids à vide " + this.POIDSAVIDE + 
                " la charge maximale " + this.CHARGEMAXI + "\n";
        
        return str;
    }
    
    public int vMax(){
        return super.vMax(this.VITESSE,this.CHARGES,this.POIDSAVIDE);
    }
    
    public int calculDuPoisTotal(){
        return super.calculDuPoisTotal(this.POIDSAVIDE);
    }
    
}
