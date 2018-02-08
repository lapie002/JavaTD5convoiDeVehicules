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
public class JavaTD5convoiDeVehicules {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        VehiCamionCiterne vcc = new VehiCamionCiterne("1234 AQZ 34");
        
        int v;
        
        for(int i = 0; i< 15; i++)
        {
            vcc.nouvelleCharge(i);
            v = vcc.vMax();
            System.out.println(vcc.toString());
        }
        
        
        
        
        
    }
    
}
