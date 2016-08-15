
package Datos;

public class Ficha {
    
    private int valor;
    private String imagen;

    public Ficha(int valor, String imagen) {
        this.valor = valor;
        this.imagen = imagen;
    }
    
    public int darValor()
    {
        return valor;
    }
    
    public String darImagen()
    {
        return imagen;
    }

    @Override
    public String toString() {
        return "Valor" + valor; 
    }
    
    
    
    
}
