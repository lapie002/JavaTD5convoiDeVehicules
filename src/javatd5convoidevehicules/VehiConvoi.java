/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatd5convoidevehicules;
import java.util.ArrayList;

/**
 *
 * @author lapie
 */

public class VehiConvoi{
    
    private ArrayList<Vehicule> convoi;
    private int vitesseConvoi = 150;
    
    public VehiConvoi()
    {
        this.convoi = new ArrayList<Vehicule>();
    }
    
    public String toString()
    {
        
        String str = "Mon convoi: \n";
        
        for(int i=0; i<convoi.size();i++){
            str = str + convoi.get(i).toString() + "\n";
        }
        
        return str;
    }
    
    public void ajouterVehicule(Vehicule vroom){
        
        this.convoi.add(vroom);
        
    }
    
    public int maxVitesseConvoi(){
        
        for(int i=0; i< this.convoi.size(); i++){
            
            if(this.vitesseConvoi >= this.convoi.get(i).vMax()){
                
                this.vitesseConvoi = this.convoi.get(i).vMax();
                
            }
        }
        
        return this.vitesseConvoi;
        
    }
    
    public void concatenationDeConvoi(VehiConvoi vc){
        
        Vehicule vroom;
        
        for(int i = 0; i<vc.convoi.size();i++){
            
            vroom = vc.convoi.get(i);
            
            this.ajouterVehicule(vroom);
            
        }
        
    }
    
    
    public double Consommation(){
        
        double conso = 0.0;
        int vmaxConv = this.vitesseConvoi;
        Vehicule vroom;
        
        for(int i = 0; i < this.convoi.size();i++){
            
            vroom = this.convoi.get(i);
            conso = conso + VehiUtil.conso(vmaxConv,vroom.calculDuPoisTotal());
            
        }
        
        return conso;
    }
    
    
    
    
    
    
}
