package Presentación;

import Datos.MetodoOrdenamiento;
import Logica.HiloBurbuja;
import Logica.HiloSeleccion;
import Logica.PanelImagenes;
import Logica.SimularOrdenamiento;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Principal extends javax.swing.JFrame {
    
    public static final String Archivo_Fichas = "D:\\Mis Documentos\\NetBeansProjects\\PfinalConTryCatch\\PfinalConTryCatch\\Numeros.txt";
    public static PanelImagenes panelDeImagenes;
    public static SimularOrdenamiento SimOrde;
    public static ArrayList copiaLista;
    public static ArrayList<Integer> listaNumeros;
    public static HiloBurbuja hilobur = new HiloBurbuja();
    public static HiloSeleccion hilose = new HiloSeleccion(); 
    
    public Principal() {
        
        initComponents();
        setTitle("Simulador de Ordenamiento");
        setResizable(false);
        SimOrde= new SimularOrdenamiento();
        cargarFiguras(Archivo_Fichas);
        panelDeImagenes= new PanelImagenes();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonBurbuja = new javax.swing.JButton();
        botonSeleccion = new javax.swing.JButton();
        botonInsercion = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PanelDatos = new javax.swing.JPanel();
        etiquetaImagen1 = new javax.swing.JLabel();
        etiquetaImagen2 = new javax.swing.JLabel();
        etiquetaImagen3 = new javax.swing.JLabel();
        etiquetaImagen4 = new javax.swing.JLabel();
        etiquetaImagen5 = new javax.swing.JLabel();
        etiquetaImagen6 = new javax.swing.JLabel();
        etiquetaImagen7 = new javax.swing.JLabel();
        etiquetaImagen8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAgregarNumeros = new javax.swing.JMenuItem();
        menuNumerosAleatorios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonBurbuja.setText("Burbuja");
        botonBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBurbujaActionPerformed(evt);
            }
        });

        botonSeleccion.setText("Selección");
        botonSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionActionPerformed(evt);
            }
        });

        botonInsercion.setText("Inserción");
        botonInsercion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsercionActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Metodos de Ordenamiento");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Logo");

        PanelDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiquetaImagen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etiquetaImagen2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etiquetaImagen3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etiquetaImagen4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etiquetaImagen5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etiquetaImagen6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etiquetaImagen7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etiquetaImagen8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaImagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaImagen5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaImagen6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaImagen7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaImagen8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaImagen8, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(etiquetaImagen6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaImagen1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addComponent(etiquetaImagen5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addComponent(etiquetaImagen4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addComponent(etiquetaImagen3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addComponent(etiquetaImagen2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addComponent(etiquetaImagen7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        menuAgregarNumeros.setText("Agregar Numeros");
        menuAgregarNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarNumerosActionPerformed(evt);
            }
        });
        jMenu1.add(menuAgregarNumeros);

        menuNumerosAleatorios.setText("Numeros Aleatorios");
        menuNumerosAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNumerosAleatoriosActionPerformed(evt);
            }
        });
        jMenu1.add(menuNumerosAleatorios);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(botonBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonInsercion, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonInsercion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsercionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsercionActionPerformed
        //MetodoOrdenamiento ordenMet= new MetodoOrdenamiento();
        //ordenMet.ordenarBurbuja();
        
    }//GEN-LAST:event_botonInsercionActionPerformed

    private void botonSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionActionPerformed
      hilose.start();
    }//GEN-LAST:event_botonSeleccionActionPerformed

    private void menuNumerosAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNumerosAleatoriosActionPerformed
        pintarFigurasAleatorias();
    }//GEN-LAST:event_menuNumerosAleatoriosActionPerformed

    private void botonBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBurbujaActionPerformed
        hilobur.start();
    }//GEN-LAST:event_botonBurbujaActionPerformed

    private void menuAgregarNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarNumerosActionPerformed
        IngresarNumeros ingNum= new IngresarNumeros(this, true);
        ingNum.setVisible(true);
        pintarFigurasSeleccionadas();
    }//GEN-LAST:event_menuAgregarNumerosActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel PanelDatos;
    private javax.swing.JButton botonBurbuja;
    private javax.swing.JButton botonInsercion;
    private javax.swing.JButton botonSeleccion;
    public static javax.swing.JLabel etiquetaImagen1;
    public static javax.swing.JLabel etiquetaImagen2;
    public static javax.swing.JLabel etiquetaImagen3;
    public static javax.swing.JLabel etiquetaImagen4;
    public static javax.swing.JLabel etiquetaImagen5;
    public static javax.swing.JLabel etiquetaImagen6;
    public static javax.swing.JLabel etiquetaImagen7;
    public static javax.swing.JLabel etiquetaImagen8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem menuAgregarNumeros;
    private javax.swing.JMenuItem menuNumerosAleatorios;
    // End of variables declaration//GEN-END:variables

    //Pinta las imagenes en los labels del JPanel
    public void pintarFigurasAleatorias()
    {
        SimOrde.darAleatorio();
        panelDeImagenes.mostrarImagenes(SimOrde.darListaAleatoria());
        copiaLista= new ArrayList(SimOrde.darListaAleatoria());
    }
    
    //Pinta las imagenes en los labels del Jpanel
    public void pintarFigurasSeleccionadas()
    {
        SimOrde.darSeleccion();
        panelDeImagenes.mostrarImagenes(SimOrde.desordenarListaSeleccionada());
        copiaLista= new ArrayList(SimOrde.desordenarListaSeleccionada());
        
    }
    
    //Carga las fichas en el Archivo de Texto
    public void cargarFiguras(String archivo)
    {
        int valor;
        String imagen;
        int numero;
        
        File fil= new File(archivo);
        if(fil.exists())
        {
            try {
                
                FileReader fr = new FileReader(fil);
        	BufferedReader bf = new BufferedReader(fr);
        	
        	String linea=bf.readLine();
        	numero = Integer.parseInt( linea );
        	int i=0;
                
                while(i<numero)
        	{
        		linea=bf.readLine();
        		valor=Integer.parseInt(linea);
        		linea=bf.readLine();
        		imagen=linea;
        		SimOrde.agregarFichas(valor,imagen);
        		i++;
        		}
        	
        	bf.close();
        	fr.close();
                
            }
            catch (IOException e) 
            {
                System.out.println("Error Fichas");
                e.printStackTrace();
            }
           
        }
    }
    
    public ArrayList darNuevo()
    {
        ArrayList copiasLista2= new ArrayList(copiaLista);
        return copiasLista2;
    }
}
