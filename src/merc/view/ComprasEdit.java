/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package merc.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import merc.Classes.CompraClasse;
import merc.Classes.EnderecoClasse;
import merc.Classes.FornecedorClasse;
import merc.Classes.ItemCompraClasse;
import merc.Classes.ProdutoClasse;
import merc.controller.CompraController;
import merc.controller.EnderecoController;
import merc.controller.FornecedorController;
import merc.controller.ItemCompraController;
import merc.controller.ProdutoController;

/**
 *
 * @author bsbru
 */
public class ComprasEdit extends javax.swing.JFrame {
    
    
   public  CompraClasse compras;

    /**
     * Creates new form UsuariosAdd
     */
    public ComprasEdit(CompraClasse compra) {
        initComponents();
        
        
        
        dataCompraEdit.setText(compra.getData());
        compraFornecedorEdit.setText(compra.getNomeFornecedor());
        codCompraEdit.setText(Integer.toString(compra.getId()));
        
        this.preencheTabela(this.carregaItems(compra));
       
        this.compras = compra;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        descricaoAddLabel = new javax.swing.JLabel();
        dataCompraEdit = new javax.swing.JFormattedTextField();
        descricaoCepAddLabel = new javax.swing.JLabel();
        compraFornecedorEdit = new javax.swing.JFormattedTextField();
        compraEditSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jcompraItemsTable = new javax.swing.JTable();
        itemCompraButtonAdd = new javax.swing.JButton();
        itemCompraButtonEdit = new javax.swing.JButton();
        itemCompraButtonDelete = new javax.swing.JButton();
        descricaoAddLabel1 = new javax.swing.JLabel();
        codCompraEdit = new javax.swing.JTextField();
        fornecedoresSelect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/editar.png"))); // NOI18N
        jLabel1.setText("Alterar Compra");

        descricaoAddLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        descricaoAddLabel.setText("Data:");

        dataCompraEdit.setToolTipText("");
        dataCompraEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataCompraEditActionPerformed(evt);
            }
        });

        descricaoCepAddLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        descricaoCepAddLabel.setText("Fornecedor:");

        compraFornecedorEdit.setEditable(false);
        compraFornecedorEdit.setToolTipText("");
        compraFornecedorEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraFornecedorEditActionPerformed(evt);
            }
        });

        compraEditSave.setText("Salvar");
        compraEditSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compraEditSaveMouseClicked(evt);
            }
        });
        compraEditSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraEditSaveActionPerformed(evt);
            }
        });

        jcompraItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Cod Compra", "Produto", "Cod Produto", "Qtde", "Valor Total", "Valor Un"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jcompraItemsTable);

        itemCompraButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add.png"))); // NOI18N
        itemCompraButtonAdd.setText("Incluir item");
        itemCompraButtonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemCompraButtonAddMouseClicked(evt);
            }
        });
        itemCompraButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCompraButtonAddActionPerformed(evt);
            }
        });

        itemCompraButtonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/editar.png"))); // NOI18N
        itemCompraButtonEdit.setText("Editar item");
        itemCompraButtonEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemCompraButtonEditMouseClicked(evt);
            }
        });
        itemCompraButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCompraButtonEditActionPerformed(evt);
            }
        });

        itemCompraButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/remover.png"))); // NOI18N
        itemCompraButtonDelete.setText("Excluir item");
        itemCompraButtonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemCompraButtonDeleteMouseClicked(evt);
            }
        });
        itemCompraButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCompraButtonDeleteActionPerformed(evt);
            }
        });
        itemCompraButtonDelete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itemCompraButtonDeleteKeyTyped(evt);
            }
        });

        descricaoAddLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descricaoAddLabel1.setText("Cod Compra:");

        codCompraEdit.setEditable(false);

        fornecedoresSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/alterar.png"))); // NOI18N
        fornecedoresSelect.setText("Selecionar");
        fornecedoresSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fornecedoresSelectMouseClicked(evt);
            }
        });
        fornecedoresSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecedoresSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(compraEditSave)
                        .addGap(449, 449, 449))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(345, 345, 345))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(descricaoAddLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dataCompraEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(descricaoCepAddLabel)
                        .addGap(18, 18, 18)
                        .addComponent(compraFornecedorEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fornecedoresSelect)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(descricaoAddLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codCompraEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(itemCompraButtonAdd)
                                .addGap(18, 18, 18)
                                .addComponent(itemCompraButtonEdit)
                                .addGap(18, 18, 18)
                                .addComponent(itemCompraButtonDelete)))
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricaoAddLabel)
                    .addComponent(dataCompraEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoCepAddLabel)
                    .addComponent(compraFornecedorEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fornecedoresSelect))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemCompraButtonEdit)
                            .addComponent(itemCompraButtonDelete)
                            .addComponent(itemCompraButtonAdd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(compraEditSave)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descricaoAddLabel1)
                            .addComponent(codCompraEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dataCompraEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataCompraEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataCompraEditActionPerformed

    private void compraFornecedorEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraFornecedorEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compraFornecedorEditActionPerformed
 
    private void limpaTela(java.awt.event.ActionEvent evt){
        
        dataCompraEdit.setText("");
        compraFornecedorEdit.setText("");
        
    }
    
    private void atualizaTela(java.awt.event.ActionEvent evt){
        
//        dataCompraEdit.setText(this.enderecos.getDescricao());
//        compraFornecedorEdit.setText(this.enderecos.getCep());

       
        
    }
    
        
    public ArrayList<ItemCompraClasse> carregaItems(CompraClasse compra){
        
         ItemCompraController  itemCompraController = new ItemCompraController();
        ArrayList<ItemCompraClasse> carregaItems = itemCompraController.selectCompra(compra.getId());
        

        return carregaItems;
        
        
   
        
    }
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:

//
//        this.dispose();
//        
//        
//        EnderecoController enderecoController = new EnderecoController();
//        ArrayList<EnderecoClasse> carregaEnderecos = enderecoController.select();
//
//
//
//        Enderecos telaEndereco = new Enderecos(carregaEnderecos);
//        telaEndereco.setVisible(true);

        
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
//        this.dispose();
//        new Fornecedores.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void compraEditSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraEditSaveActionPerformed
        // TODO add your handling code here:

//         if(dataCompraEdit.getText().isEmpty()|| compraFornecedorEdit.getText().isEmpty()){
//           JOptionPane.showMessageDialog(null, "Dados incompletos!");
//           return;
//            
//        }
//
//        this.enderecos.setDescricao(dataCompraEdit.getText());
//        this.enderecos.setCep(compraFornecedorEdit.getText());  
//       
// 
//        try{
//            
//            EnderecoController enderecoController = new EnderecoController();
//            
//            EnderecoClasse update = enderecoController.update(this.enderecos);
//      
//            
//            
//            if(this.enderecos == update){
//             JOptionPane.showMessageDialog(null, "Endereço alterado com sucesso!");
//             this.enderecos = update;
//             this.atualizaTela(evt);
//            
//            }
//            
//            
//        }catch(Exception e){
//            
//            
//            return;
//        
//    }
    }//GEN-LAST:event_compraEditSaveActionPerformed

    private void itemCompraButtonAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemCompraButtonAddMouseClicked
        // TODO add your handling code here:
        this.dispose();
        
        ProdutoClasse produto = new ProdutoClasse();
  
        
          itemCompraAdd itemCompraAddTela =  new itemCompraAdd(produto, this.compras);
          itemCompraAddTela.setVisible(true);
    }//GEN-LAST:event_itemCompraButtonAddMouseClicked

    private void itemCompraButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCompraButtonAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCompraButtonAddActionPerformed

    private void itemCompraButtonEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemCompraButtonEditMouseClicked
        // TODO add your handling code here:

        if(jcompraItemsTable.getSelectedRow() < 0){
            return;

        }

        Integer id = (Integer)jcompraItemsTable.getModel().getValueAt(jcompraItemsTable.getSelectedRow(), 0);
        
        Integer codCompra = (Integer)jcompraItemsTable.getModel().getValueAt(jcompraItemsTable.getSelectedRow(), 1);
        String  produto = (String)jcompraItemsTable.getModel().getValueAt(jcompraItemsTable.getSelectedRow(), 2);
        Integer codProduto = (Integer)jcompraItemsTable.getModel().getValueAt(jcompraItemsTable.getSelectedRow(), 3);
        Integer qtde = (Integer)jcompraItemsTable.getModel().getValueAt(jcompraItemsTable.getSelectedRow(), 4);
        Integer valorUn = (Integer)jcompraItemsTable.getModel().getValueAt(jcompraItemsTable.getSelectedRow(), 6);
        
//
        ItemCompraClasse itemCompra = new ItemCompraClasse();
        itemCompra.setId(id);
        itemCompra.setProduto_id(codProduto);
        itemCompra.setNome_produto(produto);
        itemCompra.setQtde(qtde);
        itemCompra.setValorUn(valorUn);
        itemCompra.setCompra_id(codCompra);


        this.dispose();
        itemCompraEdit telaItemCompra = new itemCompraEdit(itemCompra,this.compras);
        telaItemCompra.setVisible(true);

    }//GEN-LAST:event_itemCompraButtonEditMouseClicked

    private void itemCompraButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCompraButtonEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCompraButtonEditActionPerformed

    private void itemCompraButtonDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemCompraButtonDeleteMouseClicked
        // TODO add your handling code here:
        if(jcompraItemsTable.getSelectedRow() < 0){
            return;

        }

        Integer id = (Integer)jcompraItemsTable.getModel().getValueAt(jcompraItemsTable.getSelectedRow(), 0);
        Integer compraId = (Integer)jcompraItemsTable.getModel().getValueAt(jcompraItemsTable.getSelectedRow(), 1);
        Integer quantidade = (Integer)jcompraItemsTable.getModel().getValueAt(jcompraItemsTable.getSelectedRow(), 4);
        Integer codProduto = (Integer)jcompraItemsTable.getModel().getValueAt(jcompraItemsTable.getSelectedRow(), 3);
        

        ItemCompraClasse produto = new ItemCompraClasse();
        produto.setId(id);

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Você realmente deseja excluir o item selecionado?", "Confirmação", dialogButton);

        if(dialogResult == 0) {
            ItemCompraController itemCompraController = new ItemCompraController();
            boolean remove = itemCompraController.remove(produto);

            if(remove == true){
                JOptionPane.showMessageDialog(null, "Item removido com sucesso!");
                
                ProdutoClasse produtoClasse = new ProdutoClasse();
                produtoClasse.setId(codProduto);
                
                ProdutoController produtoController = new ProdutoController();
                produtoController.incrementaQuantidade(produtoClasse, quantidade);
                this.dispose();
                
                ComprasEdit comprasEditTela = new ComprasEdit(this.compras);
                comprasEditTela.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao remover o item!");
            }

        } else {

        }

    }//GEN-LAST:event_itemCompraButtonDeleteMouseClicked

    private void itemCompraButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCompraButtonDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCompraButtonDeleteActionPerformed

    private void fornecedoresSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fornecedoresSelectMouseClicked
        // TODO add your handling code here:

        this.dispose();
        
        
        FornecedorController forncedorController = new FornecedorController();
        ArrayList<FornecedorClasse> fornecedores = forncedorController.select();

        FornecedoresListaCompra fornecedoresListaCompra = new FornecedoresListaCompra(fornecedores,this.compras);
        fornecedoresListaCompra.setVisible(true);

    }//GEN-LAST:event_fornecedoresSelectMouseClicked

    private void fornecedoresSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecedoresSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fornecedoresSelectActionPerformed

    private void compraEditSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraEditSaveMouseClicked
        // TODO add your handling code here:
        
        CompraController compraController = new CompraController();
        compraController.update(this.compras);
        
        this.dispose();
        

        ArrayList<CompraClasse> carregaCompras = compraController.select();
        


        
        
        Compras telaCompras = new Compras(carregaCompras);
        telaCompras.setVisible(true);
        
    }//GEN-LAST:event_compraEditSaveMouseClicked

    private void itemCompraButtonDeleteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemCompraButtonDeleteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCompraButtonDeleteKeyTyped

        public boolean preencheTabela(ArrayList<ItemCompraClasse> itemsCompra){
            DefaultTableModel tableModel = (DefaultTableModel) jcompraItemsTable.getModel();
                tableModel.setRowCount(0);
                itemsCompra.forEach((item)->{
                    tableModel.addRow(new Object[] {
                        item.getId(),
                        item.getCompra_id(),
                        item.getNome_produto(),
                        item.getProduto_id(),
                        item.getQtde(),
                        item.getValor(),
                        item.getValorUn(),
                        
                        
                    });
                
            });
                jcompraItemsTable.setModel(tableModel);
                
                return true;
    }
        
        
     public void carregaTela(){
         
     }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ComprasEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprasEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprasEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprasEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
//                new FornecedoresEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codCompraEdit;
    private javax.swing.JButton compraEditSave;
    private javax.swing.JFormattedTextField compraFornecedorEdit;
    private javax.swing.JFormattedTextField dataCompraEdit;
    private javax.swing.JLabel descricaoAddLabel;
    private javax.swing.JLabel descricaoAddLabel1;
    private javax.swing.JLabel descricaoCepAddLabel;
    private javax.swing.JButton fornecedoresSelect;
    private javax.swing.JButton itemCompraButtonAdd;
    private javax.swing.JButton itemCompraButtonDelete;
    private javax.swing.JButton itemCompraButtonEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jcompraItemsTable;
    // End of variables declaration//GEN-END:variables
}
