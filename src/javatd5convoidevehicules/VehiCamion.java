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
public abstract class VehiCamion extends Vehicule{
    
    private int chargeActuelle; 
    
    public VehiCamion(String i){
        super(i);
    }
    
    public String toString()
    {
        String str = "";
        
        str = str + super.toString() + " charge actuelle " + chargeActuelle;
        
        return str;
    }
    
    public void nouvelleCharge(int n)
    {
         this.chargeActuelle = n;
         this.enregistreVitesse();
    }
    
    public int vMax(int[] vitesse, int[] charges,int poidsavide){
        
        int i = 0;
        int vitesseMax = 0;
        boolean trouve = false;
        int poidsTotal = calculDuPoisTotal(poidsavide);
        
        while(i<charges.length && !trouve)
        {
            if(poidsTotal<=charges[i])
            {
                vitesseMax = vitesse[i];
                trouve = true;
            }

            i++;
        }
        
        // retourner une entier qui la vitesse max du vehicule
        return vitesseMax;
        
    }
    
    public int calculDuPoisTotal(int poidsAvide){
        return poidsAvide + this.chargeActuelle;
    }
    
    
}
