/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package merc.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import merc.Classes.FornecedorClasse;
import merc.controller.FornecedorController;



/**
 *
 * @author bsbru
 */
public class Produtos extends javax.swing.JFrame {

    public  ArrayList<FornecedorClasse> fornecedores;
    /**
     * Creates new form Fornecedores
     */
    public Produtos(ArrayList<FornecedorClasse> fornecedores) {
        
        
        this.dispose();
        
    
        initComponents();
       
        
        this.fornecedores = fornecedores;
        
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
        jTableProdutos = new javax.swing.JTable();
        produtosButtonAdd = new javax.swing.JButton();
        ProdutosButtonEdit = new javax.swing.JButton();
        produtosButtonDelete = new javax.swing.JButton();

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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/produtos.png"))); // NOI18N
        jLabel1.setText("Produtos");

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Descricao", "Valor un", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
        jTableProdutos.setToolTipText("");
        jTableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);

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

        produtosButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add.png"))); // NOI18N
        produtosButtonAdd.setText("Novo");
        produtosButtonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produtosButtonAddMouseClicked(evt);
            }
        });
        produtosButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtosButtonAddActionPerformed(evt);
            }
        });

        ProdutosButtonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/editar.png"))); // NOI18N
        ProdutosButtonEdit.setText("Editar");
        ProdutosButtonEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProdutosButtonEditMouseClicked(evt);
            }
        });
        ProdutosButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutosButtonEditActionPerformed(evt);
            }
        });

        produtosButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/remover.png"))); // NOI18N
        produtosButtonDelete.setText("Excluir");
        produtosButtonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produtosButtonDeleteMouseClicked(evt);
            }
        });
        produtosButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtosButtonDeleteActionPerformed(evt);
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
                                .addComponent(produtosButtonAdd)
                                .addGap(18, 18, 18)
                                .addComponent(ProdutosButtonEdit)
                                .addGap(18, 18, 18)
                                .addComponent(produtosButtonDelete))))
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
                            .addComponent(ProdutosButtonEdit)
                            .addComponent(produtosButtonDelete)
                            .addComponent(produtosButtonAdd))))
                .addGap(18, 18, 18)
                .addComponent(jPanelFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void produtosButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtosButtonAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produtosButtonAddActionPerformed

    private void produtosButtonAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtosButtonAddMouseClicked
        // TODO add your handling code here:
        this.dispose();
        FornecedoresAdd telaFornecedorAdd = new FornecedoresAdd();
        telaFornecedorAdd.setVisible(true);
    }//GEN-LAST:event_produtosButtonAddMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       

    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosMouseClicked
        // TODO add your handling code here:
//        System.out.println(jTableFornecedores.getModel().getValueAt(jTableFornecedores.getSelectedRow(), 0));
    }//GEN-LAST:event_jTableProdutosMouseClicked

    private void ProdutosButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosButtonEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdutosButtonEditActionPerformed

    private void ProdutosButtonEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdutosButtonEditMouseClicked
        // TODO add your handling code here:
        
        
        if(jTableProdutos.getSelectedRow() < 0){
            return;
            
        }
        
        Integer id = (Integer)jTableProdutos.getModel().getValueAt(jTableProdutos.getSelectedRow(), 0);
        String nome = (String)jTableProdutos.getModel().getValueAt(jTableProdutos.getSelectedRow(), 1);
        String email = (String)jTableProdutos.getModel().getValueAt(jTableProdutos.getSelectedRow(), 2);
        String cnpj = (String)jTableProdutos.getModel().getValueAt(jTableProdutos.getSelectedRow(), 3);
        String telefone = (String)jTableProdutos.getModel().getValueAt(jTableProdutos.getSelectedRow(), 3);
        
       FornecedorClasse fornecedor = new FornecedorClasse();
       fornecedor.setId(id);
       fornecedor.setNome(nome);
       fornecedor.setEmail(email);
       fornecedor.setCnpj(cnpj);
       fornecedor.setTelefone(telefone);
       
        
        
        this.dispose();
        FornecedoresEdit telaFornecedorEdit = new FornecedoresEdit(fornecedor);
        telaFornecedorEdit.setVisible(true);
        
    }//GEN-LAST:event_ProdutosButtonEditMouseClicked

    private void produtosButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtosButtonDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produtosButtonDeleteActionPerformed

    private void produtosButtonDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtosButtonDeleteMouseClicked
        // TODO add your handling code here:
           if(jTableProdutos.getSelectedRow() < 0){
            return;
            
        }
        
        Integer id = (Integer)jTableProdutos.getModel().getValueAt(jTableProdutos.getSelectedRow(), 0);

        
       FornecedorClasse fornecedor = new FornecedorClasse();
       fornecedor.setId(id);
       
       int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Você realmente deseja excluir o item selecionado?", "Confirmação", dialogButton);
       
       if(dialogResult == 0) {
           FornecedorController fornecedorController = new FornecedorController();
           boolean remove = fornecedorController.remove(fornecedor);
           
           if(remove == true){
                JOptionPane.showMessageDialog(null, "Item removido com sucesso!");
                  this.dispose();
                  this.carregaTela();
           }else{
               JOptionPane.showMessageDialog(null, "Erro ao remover o item!");
           }
           
             } else {
               
                         } 
       
    }//GEN-LAST:event_produtosButtonDeleteMouseClicked

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
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            
  
            public void run() {
     
            
                
                new Produtos(fornecedores).setVisible(true);

            }
        });
        
     
    }
    
    public boolean preencheTabela(){
            DefaultTableModel tableModel = (DefaultTableModel) jTableProdutos.getModel();
                tableModel.setRowCount(0);
                fornecedores.forEach((fornecedor)->{
                    tableModel.addRow(new Object[] {
                        fornecedor.getId(),
                        fornecedor.getNome(),
                        fornecedor.getEmail(),
                        fornecedor.getTelefone(),
                        fornecedor.getCnpj()
                        
                    });
                
            });
                jTableProdutos.setModel(tableModel);
                
                return true;
    }
    
    public void carregaTela(){
         FornecedorController  fornecedoresController = new FornecedorController();
        ArrayList<FornecedorClasse> carregaFornecedores = fornecedoresController.select();
        

        
        
        Produtos telaFornecedores = new Produtos(carregaFornecedores);
        telaFornecedores.setVisible(true);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ProdutosButtonEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFornecedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JButton produtosButtonAdd;
    private javax.swing.JButton produtosButtonDelete;
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
