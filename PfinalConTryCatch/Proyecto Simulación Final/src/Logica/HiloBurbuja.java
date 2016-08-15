package Logica;

import Datos.Ficha;
import Datos.MetodoOrdenamiento;
import Presentación.Principal;
import java.util.ArrayList;


public class HiloBurbuja extends Thread{
    
   
    
    
    @Override
    public void run() {
        
      super.run(); //To change body of generated methods, choose Tools | Templates.
        Ficha variable;
        
        //Principal.copiaLista= new ArrayList(Principal.SimOrde.darListaAleatoria());
        for (int i=1; i<Principal.copiaLista.size(); i++)
		{
			for (int j=0; j<Principal.copiaLista.size()-1; j++)
			{
                            Ficha p1= (Ficha) Principal.copiaLista.get(j);
                            Ficha p2= (Ficha) Principal.copiaLista.get(j+1);
                            
				if (p1.darValor()>p2.darValor())
				{
                                    try {
                                        
                                        variable = p1;
					Principal.copiaLista.set(j, p2);
					Principal.copiaLista.set(j+1, variable);
                                        Principal.panelDeImagenes.mostrarImagenes(Principal.copiaLista);
                                        Thread.sleep(1000);
				
                                    } catch (Exception e) {
                                    }
                                }	
			}
		}
       
        
        
    }
   
  
    
    
            
}
