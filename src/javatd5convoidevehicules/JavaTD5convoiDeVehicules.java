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
          //test vehicules 1 VehiCamionCiterne, 1 VehiCamionBache, VehiPetitBus 
        
//        VehiCamionCiterne vcc = new VehiCamionCiterne("1234 VCC 34");
//        
//        int vc;
//        
//        for(int i = 0; i< 15; i++)
//        {
//            vcc.nouvelleCharge(i);
//            vc = vcc.vMax();
//            System.out.println(vcc.toString());
//        }
        
//        VehiCamionBache vcb = new VehiCamionBache("4231 VCB 13");
//        int vb;
//        
//        for(int j = 0; j<20;j++){
//            vcb.nouvelleCharge(j);
//            vb = vcb.vMax();
//            System.out.println(vcb.toString());
//            
//        }
        
//        VehiPetitBus vpb = new VehiPetitBus("4711 VPB 93");
//
//        vpb.enregistreVitesse();
//                
//        System.out.println(vpb.toString());
        
        //question 2
        // 1er convoi	
        
	// declaration Convoi 
         // construction Convoi 
        VehiConvoi mon_convoi = new VehiConvoi(); 
        
         // ajout un vehivule 
         VehiCamionCiterne vcc = new VehiCamionCiterne("1234 VCC 34");
         vcc.nouvelleCharge(5);
         mon_convoi.ajouterVehicule(vcc);
         
	 // puis un autre
         VehiCamionBache vcb = new VehiCamionBache("4231 VCB 13");
         vcb.nouvelleCharge(5);
         mon_convoi.ajouterVehicule(vcb);
         
	System.out.println("description du convoi 1: ");
	//description du convoi
        System.out.print(mon_convoi.toString());
	// vitesse du convoi 
        System.out.println("Vitesse du convoi : ");
        System.out.println(mon_convoi.maxVitesseConvoi() + " km/h");
        
        
        
        
        
        
        //question 3
        // 2eme convoi	
        
        // declaration Convoi 
        // construction Convoi 
        VehiConvoi mon_deuxime_convoi = new VehiConvoi(); 
        
         // ajout un vehivule 
         VehiCamionBache vcbPlein = new VehiCamionBache("4630 VCB 31");
         vcbPlein.nouvelleCharge(2);
         mon_deuxime_convoi.ajouterVehicule(vcbPlein);
         
	 // puis un autre
         VehiCamionBache vcbVide = new VehiCamionBache("4001 VCB 11");
         vcbVide.nouvelleCharge(0);
         mon_deuxime_convoi.ajouterVehicule(vcbVide);
         
         //puis un autre
         VehiPetitBus vpb = new VehiPetitBus("0002 VPB 33");
         vpb.enregistreVitesse();
         mon_deuxime_convoi.ajouterVehicule(vpb);
        
        System.out.println(""); 
        System.out.println("description du convoi 2: ");
        //description du convoi
        System.out.print(mon_deuxime_convoi.toString());
        // vitesse du convoi 
        System.out.println("Vitesse du convoi : ");
        System.out.println(mon_deuxime_convoi.maxVitesseConvoi() + " km/h");
        
        
        //ajout du convoi 2 au convoi 1
        mon_deuxime_convoi.concatenationDeConvoi(mon_convoi);
        
        System.out.println("description du convoi concatené: ");
        //description du convoi
        System.out.println(mon_deuxime_convoi.toString()); 
        System.out.println("vitesse du convoi: " + mon_deuxime_convoi.maxVitesseConvoi() + " km/h.");
        
        double conso = mon_deuxime_convoi.Consommation();
        System.out.println("consommation du convoi : " + conso + " L pour 100 km.");
    }
    
}
