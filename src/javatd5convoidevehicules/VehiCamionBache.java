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
public class VehiCamionBache extends VehiCamion{
    
    private static final int POIDSAVIDE = 4;
    private static final int CHARGEMAXI = 20;
            
    private static final int[] VITESSE = {130,110,90,80,70};
    private static final int[] CHARGES = {4,7,11,14,20};
    
    public VehiCamionBache(String i)
    {
        super(i);
    }
    
    public String toString()
    {
        
        String str = super.toString() + ", le poids à vide: " + POIDSAVIDE +
                " tonne(s), la charge maximale: " + CHARGEMAXI + "tonne(s) \n";
        
        return str; 
        
    }
    
    public int vMax()
    {
        return super.vMax(this.VITESSE,this.CHARGES,this.POIDSAVIDE);
    }
    
    public int calculDuPoisTotal()
    {
        return super.calculDuPoisTotal(this.POIDSAVIDE);
    }
    
    
    
}
