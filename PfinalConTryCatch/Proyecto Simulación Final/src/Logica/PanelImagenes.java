
package Logica;

import Datos.Ficha;
import Presentación.Principal;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class PanelImagenes {
    
    //Permite visualizar las imagenes en el Panel   
    public void mostrarImagenes(ArrayList lista_figuras)
    {
        System.out.println("Prueba");
        Ficha actual;
        String imagen;
        BufferedImage bImagen;
        
        try {
            
            actual= (Ficha) lista_figuras.get(0);
            imagen= actual.darImagen();
            bImagen = ImageIO.read( new File(imagen) );
            Principal.etiquetaImagen1.setIcon(new ImageIcon( bImagen ));
            
            actual= (Ficha) lista_figuras.get(1);
            imagen= actual.darImagen();
            bImagen = ImageIO.read( new File( imagen ) );
            Principal.etiquetaImagen2.setIcon(new ImageIcon( bImagen ));
            
            actual= (Ficha) lista_figuras.get(2);
            imagen= actual.darImagen();
            bImagen = ImageIO.read( new File( imagen ) );
            Principal.etiquetaImagen3.setIcon(new ImageIcon( bImagen ));
            
            actual= (Ficha) lista_figuras.get(3);
            imagen= actual.darImagen();
            bImagen = ImageIO.read( new File( imagen ) );
            Principal.etiquetaImagen4.setIcon(new ImageIcon( bImagen ));
            
            actual= (Ficha) lista_figuras.get(4);
            imagen= actual.darImagen();
            bImagen = ImageIO.read( new File( imagen ) );
            Principal.etiquetaImagen5.setIcon(new ImageIcon( bImagen ));
            
            actual= (Ficha) lista_figuras.get(5);
            imagen= actual.darImagen();
            bImagen = ImageIO.read( new File( imagen ) );
            Principal.etiquetaImagen6.setIcon(new ImageIcon( bImagen ));
            
            actual= (Ficha) lista_figuras.get(6);
            imagen= actual.darImagen();
            bImagen = ImageIO.read( new File( imagen ) );
            Principal.etiquetaImagen7.setIcon(new ImageIcon( bImagen ));
            
            actual= (Ficha) lista_figuras.get(7);
            imagen= actual.darImagen();
            bImagen = ImageIO.read( new File( imagen ) );
            Principal.etiquetaImagen8.setIcon(new ImageIcon( bImagen ));
            
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
    
}
