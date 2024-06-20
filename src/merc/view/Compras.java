/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package merc.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import merc.Classes.CompraClasse;
import merc.Classes.FornecedorClasse;
import merc.Classes.ProdutoClasse;
import merc.controller.CompraController;
import merc.controller.ProdutoController;



/**
 *
 * @author bsbru
 */
public class Compras extends javax.swing.JFrame {

    public  ArrayList<CompraClasse> compras;
    /**
     * Creates new form Fornecedores
     */
    public Compras(ArrayList<CompraClasse> compras) {
        
        
        this.dispose();
        
    
        initComponents();
       
        
        this.compras = compras;
        
        this.preencheTabela();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelFornecedores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCompras = new javax.swing.JTable();
        comprasButtonAdd = new javax.swing.JButton();
        comprasButtonEdit = new javax.swing.JButton();
        comprasButtonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fornecedores");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/financeiro.png"))); // NOI18N
        jLabel1.setText("Compras");

        jTableCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Data", "Fornecedor", "Cod Fornecedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCompras.setToolTipText("");
        jTableCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableComprasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCompras);

        javax.swing.GroupLayout jPanelFornecedoresLayout = new javax.swing.GroupLayout(jPanelFornecedores);
        jPanelFornecedores.setLayout(jPanelFornecedoresLayout);
        jPanelFornecedoresLayout.setHorizontalGroup(
            jPanelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFornecedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 901, Short.MAX_VALUE))
        );
        jPanelFornecedoresLayout.setVerticalGroup(
            jPanelFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFornecedoresLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        comprasButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add.png"))); // NOI18N
        comprasButtonAdd.setText("Novo");
        comprasButtonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprasButtonAddMouseClicked(evt);
            }
        });
        comprasButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasButtonAddActionPerformed(evt);
            }
        });

        comprasButtonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/editar.png"))); // NOI18N
        comprasButtonEdit.setText("Editar");
        comprasButtonEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprasButtonEditMouseClicked(evt);
            }
        });
        comprasButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasButtonEditActionPerformed(evt);
            }
        });
        comprasButtonEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                comprasButtonEditKeyTyped(evt);
            }
        });

        comprasButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/remover.png"))); // NOI18N
        comprasButtonDelete.setText("Excluir");
        comprasButtonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprasButtonDeleteMouseClicked(evt);
            }
        });
        comprasButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comprasButtonAdd)
                                .addGap(18, 18, 18)
                                .addComponent(comprasButtonEdit)
                                .addGap(18, 18, 18)
                                .addComponent(comprasButtonDelete))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanelFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comprasButtonEdit)
                            .addComponent(comprasButtonDelete)
                            .addComponent(comprasButtonAdd))))
                .addGap(18, 18, 18)
                .addComponent(jPanelFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comprasButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasButtonAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comprasButtonAddActionPerformed

    private void comprasButtonAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprasButtonAddMouseClicked
        // TODO add your handling code here:
        this.dispose();
        FornecedorClasse fornecedorClasse = new FornecedorClasse();
        fornecedorClasse.setId(0);
        ComprasAdd telaComprasAdd = new ComprasAdd(fornecedorClasse);
        telaComprasAdd.setVisible(true);
    }//GEN-LAST:event_comprasButtonAddMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       

    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jTableComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableComprasMouseClicked
        // TODO add your handling code here:
//        System.out.println(jTableFornecedores.getModel().getValueAt(jTableFornecedores.getSelectedRow(), 0));
    }//GEN-LAST:event_jTableComprasMouseClicked

    private void comprasButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasButtonEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comprasButtonEditActionPerformed

    private void comprasButtonEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprasButtonEditMouseClicked
        // TODO add your handling code here:
        
        
        if(jTableCompras.getSelectedRow() < 0){
            return;
            
        }
        
       
        
        Integer id = (Integer)jTableCompras.getModel().getValueAt(jTableCompras.getSelectedRow(), 0);
        String data = (String)jTableCompras.getModel().getValueAt(jTableCompras.getSelectedRow(), 1);
        String  fornecedor = (String)jTableCompras.getModel().getValueAt(jTableCompras.getSelectedRow(), 2);
        Integer cod_fornecedor = (Integer)jTableCompras.getModel().getValueAt(jTableCompras.getSelectedRow(), 3);
        
       CompraClasse compra = new CompraClasse();
       compra.setId(id);
       compra.setData(data);
       compra.setNomeFornecedor(fornecedor);
       compra.setFornecedor_id(cod_fornecedor);
    

        
        
        this.dispose();
        ComprasEdit telaCompraEdit = new ComprasEdit(compra);
        telaCompraEdit.setVisible(true);
        
    }//GEN-LAST:event_comprasButtonEditMouseClicked

    private void comprasButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasButtonDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comprasButtonDeleteActionPerformed

    private void comprasButtonDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprasButtonDeleteMouseClicked
        // TODO add your handling code here:
           if(jTableCompras.getSelectedRow() < 0){
            return;
            
        }
        
        Integer id = (Integer)jTableCompras.getModel().getValueAt(jTableCompras.getSelectedRow(), 0);

        
       CompraClasse compra = new CompraClasse();
       compra.setId(id);
       
       int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Você realmente deseja excluir o item selecionado?", "Confirmação", dialogButton);
       
       if(dialogResult == 0) {
           CompraController compraController = new CompraController();
           boolean remove = compraController.remove(compra);
           
           if(remove == true){
                JOptionPane.showMessageDialog(null, "Item removido com sucesso!");
                  this.dispose();
                  this.carregaTela();
           }else{
               JOptionPane.showMessageDialog(null, "Erro ao remover o item!");
           }
           
             } else {
               
                         } 
       
    }//GEN-LAST:event_comprasButtonDeleteMouseClicked

    private void comprasButtonEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comprasButtonEditKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_comprasButtonEditKeyTyped

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
        
        
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
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            
  
            public void run() {
     
            
                
                new Compras(compras).setVisible(true);

            }
        });
        
     
    }
    

    
    public boolean preencheTabela(){
            DefaultTableModel tableModel = (DefaultTableModel) jTableCompras.getModel();
                tableModel.setRowCount(0);
                compras.forEach((compra)->{
                    tableModel.addRow(new Object[] {
                        compra.getId(),
                        compra.getData(),
                        compra.getNomeFornecedor(),
                        compra.getFornecedor_id(),
                        
                    });
                
            });
                jTableCompras.setModel(tableModel);
                
                return true;
    }
    
    public void carregaTela(){
         CompraController  compraController = new CompraController();
        ArrayList<CompraClasse> carregaCompras = compraController.select();
        

        
        
        Compras telaCompras = new Compras(carregaCompras);
        telaCompras.setVisible(true);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comprasButtonAdd;
    private javax.swing.JButton comprasButtonDelete;
    private javax.swing.JButton comprasButtonEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFornecedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCompras;
    // End of variables declaration//GEN-END:variables

    void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static class setVisible {

        public setVisible(boolean b) {
        }
    }
}
