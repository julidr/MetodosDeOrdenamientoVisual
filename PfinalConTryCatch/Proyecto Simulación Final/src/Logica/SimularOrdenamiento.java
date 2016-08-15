
package Logica;

import Datos.Ficha;
import Presentación.Principal;
import java.util.ArrayList;
import java.util.Random;

public class SimularOrdenamiento {
    
    ArrayList figuras;
    ArrayList lista_figuras;

    public SimularOrdenamiento() 
    {
        figuras= new ArrayList();
    }
    
    //permite agregar a la lista de Figuras las Fichas obtenidas
    public void agregarFichas(int valorF, String imagenF)
    {
        Ficha nuevaFicha= new Ficha(valorF, imagenF);
        figuras.add(nuevaFicha);
    }
    
    //Selecciona Aleatoriamente 8 fichas para mostrarlas
    public void darAleatorio()
    {
        Ficha copia;
        int x;
        Random rnd;
        int j=0;
        
        lista_figuras= new ArrayList();
        while(j<8)
        {
            rnd= new Random();
            x= rnd.nextInt(101);
            copia= (Ficha) figuras.get(x);
            lista_figuras.add(copia);
            j++;
        }
        
        j=0;
        
        //Prueba de Escritorio
        while(j<lista_figuras.size())
        {
            Ficha nueva= (Ficha) lista_figuras.get(j);
            System.out.println( nueva.darValor());
            System.out.println( nueva.darImagen());
            j++;
        }
    }
    
    //Agrega a la Lista los numeros seleccionados pero de forma ordenada
    public void darSeleccion()
    {
        Ficha copia;
        int x;
        int j=0;
        lista_figuras= new ArrayList();
        
            for(int i=0; i<figuras.size(); i++)
            {
                copia= (Ficha) figuras.get(i);
                for(int k=0; k<Principal.listaNumeros.size(); k++)
                {
                    if(Principal.listaNumeros.get(k)==copia.darValor())
                    {
                        System.out.println("Encontrado: " +  copia.darValor());
                        lista_figuras.add(copia);
                        break;
                    }
                }
            }

    }
  
    // retorna la lista aleatoria
    public ArrayList darListaAleatoria()
    {
        ArrayList copiaFiguras = new ArrayList(lista_figuras);
        return copiaFiguras;
    }
    
    //Retorna la lista con numero seleccionados pero en el mismo orden en que el usuario los ingreso
    public ArrayList desordenarListaSeleccionada()
    {
        Ficha save;
        ArrayList copiaFiguras= new ArrayList();
        for(int y=0; y<Principal.listaNumeros.size(); y++)
            {
                for(int h=0; h<lista_figuras.size(); h++)
                {
                    save= (Ficha) lista_figuras.get(h);
                    if(Principal.listaNumeros.get(y)==save.darValor())
                    {
                        copiaFiguras.add(lista_figuras.get(h));
                        break;
                    }
                    
                }
            }
        
        return copiaFiguras;
        
    }
     
    
}
