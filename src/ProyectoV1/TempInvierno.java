/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoV1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Richard
 */
public class TempInvierno extends TipoPrenda  {
    
        
    public TempInvierno( List <Prenda> lista) {
        
        this.nombre = "Temporada Invierno";
        this.listaDePrendas = lista;
    }

   
    @Override
    public double calcularSubPago() {
       for (int i = 0; i <= listaDePrendas.size()-1; ++i) {
            subTotal = subTotal+ this.listaDePrendas.get(i).getPago();
        }
       
       if(subTotal >= 200) {
            subTotal = subTotal-20;
        }
       return subTotal;
       
    }
    
    
   
    
    
 
}
