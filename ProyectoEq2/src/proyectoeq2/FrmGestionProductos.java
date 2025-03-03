/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoeq2;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyectoeq2.Producto;
import proyectoeq2.Productos;

/**
 *
 * @author Samuel
 */
public class FrmGestionProductos extends javax.swing.JDialog {

    private Productos productos = new Productos();
    private boolean esNuevo = true;

    /**
     * Creates new form frmProductos
     */
    public FrmGestionProductos() {
        setModal(true);
        initComponents();
        ArrayList<Producto> prods = productos.getLista();
        llenarTabla();

    }

    private void llenarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
        ArrayList<Producto> prods = productos.getLista();
        modelo.setRowCount(0);
        tblProductos.setModel(modelo);
        for (Producto prod : prods) {
            modelo.addRow(new Object[]{prod.getModulo(), prod.getCatalogo(), prod.getIDProducto(), prod.getNombre(), prod.getPrecio(), prod.getExistencias()});
        }
        tblProductos.setModel(modelo);
    }

    private void cambiarModoEdicion(boolean modo_edicion) {
        cmbModulo.setEnabled(esNuevo && modo_edicion);
        cmbCatalogo.setEnabled(esNuevo && modo_edicion);
        txtIDProducto.setEnabled(esNuevo && modo_edicion);
        txtNombreProducto.setEnabled(modo_edicion);
        txtExistencia.setEnabled(modo_edicion);
        txtPrecio.setEnabled(modo_edicion);

        btnNuevo.setEnabled(!modo_edicion);
        btnEliminar.setEnabled(!modo_edicion);
        btnModificar.setEnabled(!modo_edicion);

        tblProductos.setEnabled(!modo_edicion);
        treCatalogo.setEnabled(!modo_edicion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEdicion = new javax.swing.JPanel();
        pnlComandos = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        pnlProducto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbModulo = new javax.swing.JComboBox<>();
        cmbCatalogo = new javax.swing.JComboBox<>();
        txtIDProducto = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        txtExistencia = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pnlBarraInferior = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        treCatalogo = new javax.swing.JTree();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión de productos");

        pnlEdicion.setBackground(new java.awt.Color(204, 204, 255));
        pnlEdicion.setPreferredSize(new java.awt.Dimension(250, 329));
        pnlEdicion.setLayout(new java.awt.BorderLayout());

        pnlComandos.setMaximumSize(new java.awt.Dimension(250, 124));
        pnlComandos.setMinimumSize(new java.awt.Dimension(250, 124));

        btnNuevo.setText("Nuevo Producto");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlComandosLayout = new javax.swing.GroupLayout(pnlComandos);
        pnlComandos.setLayout(pnlComandosLayout);
        pnlComandosLayout.setHorizontalGroup(
            pnlComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComandosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlComandosLayout.createSequentialGroup()
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlComandosLayout.setVerticalGroup(
            pnlComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComandosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlEdicion.add(pnlComandos, java.awt.BorderLayout.PAGE_START);

        pnlProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Módulo");

        jLabel2.setText("Catálogo");

        jLabel3.setText("ID del producto");

        jLabel4.setText("Nombre");

        jLabel5.setText("Existencia");

        jLabel6.setText("Precio");

        cmbModulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dulcería", "Papelería", "Salud y belleza" }));
        cmbModulo.setEnabled(false);
        cmbModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbModuloActionPerformed(evt);
            }
        });

        cmbCatalogo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chocolates", "Dulces", "Bebidas" }));
        cmbCatalogo.setEnabled(false);

        txtIDProducto.setEnabled(false);
        txtIDProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDProductoMouseClicked(evt);
            }
        });
        txtIDProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDProductoActionPerformed(evt);
            }
        });
        txtIDProducto.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                txtIDProductoVetoableChange(evt);
            }
        });

        txtNombreProducto.setEnabled(false);
        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });

        txtExistencia.setEnabled(false);
        txtExistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExistenciaActionPerformed(evt);
            }
        });
        txtExistencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExistenciaKeyTyped(evt);
            }
        });

        txtPrecio.setEnabled(false);
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlProductoLayout = new javax.swing.GroupLayout(pnlProducto);
        pnlProducto.setLayout(pnlProductoLayout);
        pnlProductoLayout.setHorizontalGroup(
            pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProductoLayout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlProductoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreProducto))
                    .addGroup(pnlProductoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDProducto))
                    .addGroup(pnlProductoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCatalogo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlProductoLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmbModulo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnlProductoLayout.createSequentialGroup()
                            .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlProductoLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(31, 31, 31)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlProductoLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlProductoLayout.setVerticalGroup(
            pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cmbCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pnlEdicion.add(pnlProducto, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlEdicion, java.awt.BorderLayout.EAST);

        pnlBarraInferior.setPreferredSize(new java.awt.Dimension(723, 50));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBarraInferiorLayout = new javax.swing.GroupLayout(pnlBarraInferior);
        pnlBarraInferior.setLayout(pnlBarraInferiorLayout);
        pnlBarraInferiorLayout.setHorizontalGroup(
            pnlBarraInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarraInferiorLayout.createSequentialGroup()
                .addContainerGap(615, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBarraInferiorLayout.setVerticalGroup(
            pnlBarraInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarraInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnlBarraInferior, java.awt.BorderLayout.SOUTH);

        jSplitPane1.setDividerLocation(150);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Catalogo");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Todos");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Papeleria");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Todos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Escritura");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Artes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Papeles");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Regalos");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Belleza y salud");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Todos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Shampoo y jabones");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Desodorantes y perfumes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cremas y faciales");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Tintes y cabello");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Dulceria");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Todos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Chocolates");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Dulces");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Bebidas");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treCatalogo.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treCatalogo.setPreferredSize(new java.awt.Dimension(150, 38));
        jScrollPane2.setViewportView(treCatalogo);

        jSplitPane1.setLeftComponent(jScrollPane2);

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mod", "Cat", "ID Prod", "Nombre", "Precio", "Existencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.setMinimumSize(new java.awt.Dimension(20, 80));
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        jSplitPane1.setRightComponent(jScrollPane1);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        esNuevo = true;
        cambiarModoEdicion(true);

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        esNuevo = false;
        cambiarModoEdicion(true);
        DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
        int fila = tblProductos.getSelectedRow();
        String id = ((String) modelo.getValueAt(fila, 2));
        String nom = ((String) modelo.getValueAt(fila, 3));
        String pre = (String.valueOf(modelo.getValueAt(fila, 4)));
        String exis = (String.valueOf(modelo.getValueAt(fila, 5)));

        txtIDProducto.setText(id);
        txtNombreProducto.setText(nom);
        txtExistencia.setText(exis);
        txtPrecio.setText(pre);

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // Validacion de los campos
        String ID = txtIDProducto.getText();
        String nombre = txtNombreProducto.getText();
        String existencia = txtExistencia.getText();
        String precio = txtPrecio.getText();
        if (ID.isEmpty() || nombre.isEmpty() || existencia.isEmpty() || precio.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Error, No se han llenado todos los campos solicitados", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            try {
                if (esNuevo) {
                    productos.NuevoProducto((String) cmbModulo.getSelectedItem(), (String) cmbCatalogo.getSelectedItem(), txtIDProducto.getText(), txtNombreProducto.getText(), Double.parseDouble(txtPrecio.getText()), Integer.parseInt(txtExistencia.getText()));
                } else {
                    productos.ModificarProducto(txtIDProducto.getText(), txtNombreProducto.getText(), Double.parseDouble(txtPrecio.getText()), Integer.parseInt(txtExistencia.getText()));
                }
            } catch (Exception e) {
            }
            llenarTabla();

            cambiarModoEdicion(false);

            txtIDProducto.setText("");
            txtNombreProducto.setText("");
            txtExistencia.setText("");
            txtPrecio.setText("");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtIDProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDProductoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtIDProductoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        txtIDProducto.setText("");
        txtNombreProducto.setText("");
        txtExistencia.setText("");
        txtPrecio.setText("");
        cmbModulo.setEnabled(false);
        cmbCatalogo.setEnabled(false);
        txtIDProducto.setEnabled(false);
        txtNombreProducto.setEnabled(false);
        txtExistencia.setEnabled(false);
        txtPrecio.setEnabled(false);
        tblProductos.setEnabled(true);
        treCatalogo.setEnabled(true);
        btnNuevo.setEnabled(true);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNombreProductoActionPerformed

    private void txtExistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExistenciaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtExistenciaActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtIDProductoVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_txtIDProductoVetoableChange
        // TODO add your handling code here:

    }//GEN-LAST:event_txtIDProductoVetoableChange

    private void txtIDProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDProductoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txtIDProductoMouseClicked

    private void txtExistenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExistenciaKeyTyped
        // evento de tecla, se validara que se ingresen solo digitos
        char digito = evt.getKeyChar();
        if (!Character.isDigit(digito)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtExistenciaKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // evento de tecla, se validara que se ingresen solo digitos y puntos
        char caract = evt.getKeyChar();
        if (!Character.isDigit(caract)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
        int fila = tblProductos.getSelectedRow();

        try {
            productos.EliminarProducto((String) modelo.getValueAt(fila, 2));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        llenarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        btnEliminar.setEnabled(true);
        btnModificar.setEnabled(true);
    }//GEN-LAST:event_tblProductosMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
        FrmMenu menu = new FrmMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmbModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbModuloActionPerformed
        switch (cmbModulo.getSelectedItem().toString()) {
            case "Papelería":
                cmbCatalogo.removeAllItems();
                cmbCatalogo.insertItemAt("Lapices", 0);
                cmbCatalogo.insertItemAt("Cartulinas", 1);
                cmbCatalogo.insertItemAt("Accesorios", 2);
                cmbCatalogo.setSelectedItem("Lapices");
                break;
            case "Dulcería":
                cmbCatalogo.removeAllItems();
                cmbCatalogo.insertItemAt("Chocolates", 0);
                cmbCatalogo.insertItemAt("Dulces", 1);
                cmbCatalogo.insertItemAt("Bebidas", 2);
                cmbCatalogo.setSelectedItem("Chocolates");
                break;
            case "Salud y belleza":
                cmbCatalogo.removeAllItems();
                cmbCatalogo.insertItemAt("Higiene", 0);
                cmbCatalogo.insertItemAt("Belleza", 1);
                cmbCatalogo.insertItemAt("Facial", 2);
                cmbCatalogo.insertItemAt("Maquillaje", 3);
                cmbCatalogo.setSelectedItem("Higiene");
                break;
        }
    }//GEN-LAST:event_cmbModuloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCatalogo;
    private javax.swing.JComboBox<String> cmbModulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel pnlBarraInferior;
    private javax.swing.JPanel pnlComandos;
    private javax.swing.JPanel pnlEdicion;
    private javax.swing.JPanel pnlProducto;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTree treCatalogo;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtIDProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
