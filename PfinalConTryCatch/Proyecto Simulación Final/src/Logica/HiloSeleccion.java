
package Logica;

import Datos.Ficha;
import Presentación.Principal;
import java.util.ArrayList;

public class HiloSeleccion extends Thread{

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        
         //Principal.copiaLista = new ArrayList( Principal.SimOrde.darListaAleatoria());
		 
		for( int i = Principal.copiaLista.size( ); i > 0; i-- )
	        {
			 
	       System.out.println("cambie copialista");
        	// panelImages.mostrarImagenes(copiaLista);
	            for( int j = 0; j < i - 1; j++ )
	            {
	                Ficha p1 = ( Ficha )Principal.copiaLista.get( j );
	                Ficha p2 = ( Ficha )Principal.copiaLista.get( j + 1 );

	                // Si es necesario se deben intercambiar p1 y p2
	                if( p1.darValor()> p2.darValor() )
	                {
                            try {
                                Principal.copiaLista.set( j, p2 );
	                	Principal.copiaLista.set( j + 1, p1 );
	                	
	                	System.out.println("cambie copialista");
	                	Principal.panelDeImagenes.mostrarImagenes(Principal.copiaLista);
	                	
                                //Prueba de Escritorio
	                	int r=0;
	         	     	while(r<Principal.copiaLista.size())
	         	     	   {
	         	     		Ficha actual = (Ficha) Principal.copiaLista.get(r);
	         	     		System.out.println( actual.darValor() );
	         	     		System.out.println( actual.darImagen() );
	         	     		r++;
	         	     	}
	         	     	
	                	 //Scanner leer = new Scanner (System.in);
	                	 //int num= leer.nextInt();
	                	 r=0;
	                	 while(r<1000000000)
	                	 {
	                		 r++;
	                	 }
                                 Thread.sleep(1000);
                            } catch (Exception e) {
                                System.out.println("error" + e);
                            }
	                	
	                }
	            }
	            
	    } 
              
    }
   
    
}
