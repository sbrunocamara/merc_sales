/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package merc.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import merc.Classes.EnderecoClasse;
import merc.Classes.FornecedorClasse;
import merc.Classes.ItemCompraClasse;
import merc.controller.EnderecoController;
import merc.controller.FornecedorController;

/**
 *
 * @author bsbru
 */
public class itemCompraEdit extends javax.swing.JFrame {
    
    
   public  ItemCompraClasse itemsCompra;

    /**
     * Creates new form UsuariosAdd
     */
    public itemCompraEdit(ItemCompraClasse itemCompra) {
        initComponents();
//        
//        String [] ListData={"aa"};
//        produtosLista.setListData(ListData);
        
        produtoItemCompraEdit.setText(itemCompra.getNome_produto());
        itemCompraCodEdit.setText(Integer.toString(itemCompra.getId()));
        quantidadeItemCompraEdit.setText(Integer.toString(itemCompra.getQtde()));
        
        
        this.itemsCompra = itemCompra;
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
        produtoItemCompraEditLabel = new javax.swing.JLabel();
        itemCompraCodEdit = new javax.swing.JFormattedTextField();
        quantidadeItemCompraEditLabel = new javax.swing.JLabel();
        quantidadeItemCompraEdit = new javax.swing.JFormattedTextField();
        enderecoEditSave = new javax.swing.JButton();
        produtoItemCompraEdit = new javax.swing.JFormattedTextField();
        descricaoAddLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtosLista = new javax.swing.JList<>();

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
        jLabel1.setText("Alterar item compra");

        produtoItemCompraEditLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        produtoItemCompraEditLabel.setText("Produto:");

        itemCompraCodEdit.setToolTipText("");
        itemCompraCodEdit.setEnabled(false);
        itemCompraCodEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCompraCodEditActionPerformed(evt);
            }
        });

        quantidadeItemCompraEditLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        quantidadeItemCompraEditLabel.setText("Quantidade:");

        quantidadeItemCompraEdit.setToolTipText("");
        quantidadeItemCompraEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeItemCompraEditActionPerformed(evt);
            }
        });

        enderecoEditSave.setText("Salvar");
        enderecoEditSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoEditSaveActionPerformed(evt);
            }
        });

        produtoItemCompraEdit.setToolTipText("");
        produtoItemCompraEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoItemCompraEditActionPerformed(evt);
            }
        });

        descricaoAddLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descricaoAddLabel1.setText("Cod item:");

        jScrollPane1.setViewportView(produtosLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(247, 247, 247))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(descricaoAddLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemCompraCodEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(363, 363, 363)
                            .addComponent(enderecoEditSave)
                            .addGap(0, 264, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(quantidadeItemCompraEditLabel)
                                        .addComponent(produtoItemCompraEditLabel))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(quantidadeItemCompraEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(produtoItemCompraEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricaoAddLabel1)
                    .addComponent(itemCompraCodEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(produtoItemCompraEditLabel)
                    .addComponent(produtoItemCompraEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantidadeItemCompraEditLabel)
                    .addComponent(quantidadeItemCompraEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(enderecoEditSave)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemCompraCodEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCompraCodEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCompraCodEditActionPerformed

    private void quantidadeItemCompraEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeItemCompraEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantidadeItemCompraEditActionPerformed
 
    private void limpaTela(java.awt.event.ActionEvent evt){
        
        itemCompraCodEdit.setText("");
        quantidadeItemCompraEdit.setText("");
        
    }
    
    private void atualizaTela(java.awt.event.ActionEvent evt){
        
        itemCompraCodEdit.setText(this.enderecos.getDescricao());
        quantidadeItemCompraEdit.setText(this.enderecos.getCep());

        
        
    }
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:


        this.dispose();
        
        
        EnderecoController enderecoController = new EnderecoController();
        ArrayList<EnderecoClasse> carregaEnderecos = enderecoController.select();



        Enderecos telaEndereco = new Enderecos(carregaEnderecos);
        telaEndereco.setVisible(true);

        
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        new Fornecedores.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void enderecoEditSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoEditSaveActionPerformed
        // TODO add your handling code here:

         if(itemCompraCodEdit.getText().isEmpty()|| quantidadeItemCompraEdit.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Dados incompletos!");
           return;
            
        }

        this.enderecos.setDescricao(itemCompraCodEdit.getText());
        this.enderecos.setCep(quantidadeItemCompraEdit.getText());  
       
 
        try{
            
            EnderecoController enderecoController = new EnderecoController();
            
            EnderecoClasse update = enderecoController.update(this.enderecos);
      
            
            
            if(this.enderecos == update){
             JOptionPane.showMessageDialog(null, "Endereço alterado com sucesso!");
             this.enderecos = update;
             this.atualizaTela(evt);
            
            }
            
            
        }catch(Exception e){
            
            
            return;
        
    }
    }//GEN-LAST:event_enderecoEditSaveActionPerformed

    private void produtoItemCompraEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoItemCompraEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produtoItemCompraEditActionPerformed

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
            java.util.logging.Logger.getLogger(itemCompraEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(itemCompraEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(itemCompraEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(itemCompraEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel descricaoAddLabel1;
    private javax.swing.JButton enderecoEditSave;
    private javax.swing.JFormattedTextField itemCompraCodEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField produtoItemCompraEdit;
    private javax.swing.JLabel produtoItemCompraEditLabel;
    private javax.swing.JList<String> produtosLista;
    private javax.swing.JFormattedTextField quantidadeItemCompraEdit;
    private javax.swing.JLabel quantidadeItemCompraEditLabel;
    // End of variables declaration//GEN-END:variables
}
