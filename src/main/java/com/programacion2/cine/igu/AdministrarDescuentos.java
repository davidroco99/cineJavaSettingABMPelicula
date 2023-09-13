package com.programacion2.cine.igu;

import com.programacion2.cine.logica.ControladoraLogica;
import com.programacion2.cine.logica.DTODescuento;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DavidRoco
 */

public class AdministrarDescuentos extends javax.swing.JFrame {
    ControladoraLogica controla = new ControladoraLogica();
    private static AdministrarDescuentos instance = null;
    /**
     * Creates new form MenuInicial
     */
    public AdministrarDescuentos() {
        initComponents();
    }
    
    public static AdministrarDescuentos getInstance() {
        if (instance == null) {
            instance = new AdministrarDescuentos();
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jLabelAdministrarDescuentos = new javax.swing.JLabel();
        jLabelSistemaCineProgramacion2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDescuentos = new javax.swing.JTable();
        jLabelDescuentos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnSalir.setText("Volver al Menú Inicial");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabelAdministrarDescuentos.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        jLabelAdministrarDescuentos.setText("Administrar Descuentos");

        jLabelSistemaCineProgramacion2.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        jLabelSistemaCineProgramacion2.setText("Sistema Cine Progamación 2");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        tablaDescuentos.setBorder(new javax.swing.border.MatteBorder(null));
        tablaDescuentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaDescuentos);

        jLabelDescuentos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelDescuentos.setText("Descuentos");

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(418, 418, 418))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(432, 432, 432))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabelAdministrarDescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelDescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelSistemaCineProgramacion2, javax.swing.GroupLayout.DEFAULT_SIZE, 1147, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabelAdministrarDescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelDescuentos)
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(15, 15, 15))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabelSistemaCineProgramacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(420, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 891, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();       
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        AgregarDescuento pantallaAgregarDescuento = AgregarDescuento.getInstance();
        pantallaAgregarDescuento.setVisible(true);
        pantallaAgregarDescuento.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       cargarTabla();
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
       cargarTabla();
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //hay mas de una fila en la tabla
        if (tablaDescuentos.getRowCount() > 0) {
            //hay por lo menos una selección
            if (tablaDescuentos.getSelectedRow() != -1) {
                //optengo la id a borrar
                int nroDescuento = Integer.parseInt(String.valueOf(tablaDescuentos.getValueAt(tablaDescuentos.getSelectedRow(), 0)));
                
                controla.borrarDescuento(nroDescuento);
                
                mostrarMensajes("Se Eliminó correctamente La Sala","Info", "Eliminación Exitoso");
            }
            else{
                mostrarMensajes("No Seleccionó ningún alumno","Error", "No se elimnó el registro");
            }
        }
        else{
            mostrarMensajes("No hay registros para eliminar","Error", "No se elimnó el registro");
        }
        cargarTabla();                                          
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
      //hay mas de una fila en la tabla
        if (tablaDescuentos.getRowCount() > 0) {
            //hay por lo menos una selección
            if (tablaDescuentos.getSelectedRow() != -1) {
                //optengo la id a borrar
                int nroDescuento = Integer.parseInt(String.valueOf(tablaDescuentos.getValueAt(tablaDescuentos.getSelectedRow(), 0)));
                
                EditarDescuento pantallaEditDescuento = new EditarDescuento(nroDescuento);
                pantallaEditDescuento.setVisible(true);
                pantallaEditDescuento.setLocationRelativeTo(null);
              
            
            }
            else{
                mostrarMensajes("No Seleccionó ningún alumno","Error", "No se elimnó el registro");
            }
        }
        else{
            mostrarMensajes("No hay registros para eliminar","Error", "No se elimnó el registro");
        }
        cargarTabla();
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabelAdministrarDescuentos;
    private javax.swing.JLabel jLabelDescuentos;
    private javax.swing.JLabel jLabelSistemaCineProgramacion2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDescuentos;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {
          
        DefaultTableModel tabla = new DefaultTableModel(){
            
            //filas y columnas no editables
            @Override
            public boolean isCellEditable (int row, int column){
                return false;
            }
        };
        //establecer nombre y columnas
        
        String titulos[] = {"NRO-Descuento", "Nombre Descuento", "Porcentaje", "Fecha Alta", "Fecha Baja"};
        tabla.setColumnIdentifiers(titulos);
        
        
        //carga de los datos desde la base de datos
        List <DTODescuento> listaDescuentos = controla.traerDescuentos();
        
        
        //recorrer la lista y mostrar cada uno de llos elementos en la tabla
     
        if (listaDescuentos !=null){
            for (DTODescuento dtoDescuento : listaDescuentos){
                Object[] objeto = {dtoDescuento.getIdDescuento(),dtoDescuento.getNombreDescuento(), dtoDescuento.getPorcentajeDescuento(), new SimpleDateFormat("dd-MM-yyyy").format(dtoDescuento.getFechaAlta()), new SimpleDateFormat("dd-MM-yyyy").format(dtoDescuento.getFechaBaja())};
                
                tabla.addRow(objeto);
            }
        }
        tablaDescuentos.setModel(tabla);

    }
    
    
    public void mostrarMensajes(String mensaje, String tipo,String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if (tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);  
    }
}
