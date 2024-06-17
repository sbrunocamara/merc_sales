/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package merc.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import merc.Classes.EnderecoClasse;
import merc.Classes.FornecedorClasse;
import merc.controller.EnderecoController;
import merc.controller.FornecedorController;

/**
 *
 * @author bsbru
 */
public class EnderecosAdd extends javax.swing.JFrame {

    /**
     * Creates new form UsuariosAdd
     */
    public EnderecosAdd() {
        initComponents();
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
        enderecoCepAddLabel = new javax.swing.JLabel();
        enderecoDescricaoAddLabel = new javax.swing.JLabel();
        enderecoDescricaoAdd = new javax.swing.JFormattedTextField();
        enderecoAddSave = new javax.swing.JButton();
        enderecoCepAdd = new javax.swing.JFormattedTextField();

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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add.png"))); // NOI18N
        jLabel1.setText("Novo Endereço");

        enderecoCepAddLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        enderecoCepAddLabel.setText("CEP:");

        enderecoDescricaoAddLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        enderecoDescricaoAddLabel.setText("Descrição:");

        enderecoDescricaoAdd.setToolTipText("");
        enderecoDescricaoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoDescricaoAddActionPerformed(evt);
            }
        });

        enderecoAddSave.setText("Salvar");
        enderecoAddSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoAddSaveActionPerformed(evt);
            }
        });

        enderecoCepAdd.setToolTipText("");
        enderecoCepAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoCepAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(247, 247, 247))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(enderecoDescricaoAddLabel)
                            .addComponent(enderecoCepAddLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enderecoCepAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enderecoDescricaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(enderecoAddSave)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoDescricaoAddLabel)
                    .addComponent(enderecoDescricaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoCepAddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enderecoCepAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128)
                .addComponent(enderecoAddSave)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enderecoDescricaoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoDescricaoAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoDescricaoAddActionPerformed

    private void enderecoAddSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoAddSaveActionPerformed
        // TODO add your handling code here:
       if(enderecoDescricaoAdd.getText().isEmpty() || enderecoCepAdd.getText().isEmpty()){
            
           JOptionPane.showMessageDialog(null, "Dados incompletos!");
           return;
            
        }
        try{
            
            EnderecoController enderecoController = new EnderecoController();
            
            Integer insert = enderecoController.newEndereco(enderecoDescricaoAdd.getText(),enderecoCepAdd.getText());
      
            
            if(insert <=0){
                 JOptionPane.showMessageDialog(null, "Erro ao inserir os dados!");
            }
            
            if(insert > 0){
             JOptionPane.showMessageDialog(null, "Endereço inserido com sucesso!");
             this.limpaTela(evt);
             

 
            }
            
            
        }catch(Exception e){
            
            return;
        
    }
    }//GEN-LAST:event_enderecoAddSaveActionPerformed
 
    private void limpaTela(java.awt.event.ActionEvent evt){
        
        enderecoDescricaoAdd.setText("");
        enderecoCepAdd.setText("");
        
    }
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:


        this.dispose();
        
        
        EnderecoController enderecoController = new EnderecoController();
        ArrayList<EnderecoClasse> carregaEnderecos = enderecoController.select();



        Enderecos enderecoFornecedor = new Enderecos(carregaEnderecos);
        enderecoFornecedor.setVisible(true);

        
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        new Enderecos.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void enderecoCepAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoCepAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoCepAddActionPerformed

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
            java.util.logging.Logger.getLogger(EnderecosAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnderecosAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnderecosAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnderecosAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnderecosAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enderecoAddSave;
    private javax.swing.JFormattedTextField enderecoCepAdd;
    private javax.swing.JLabel enderecoCepAddLabel;
    private javax.swing.JFormattedTextField enderecoDescricaoAdd;
    private javax.swing.JLabel enderecoDescricaoAddLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
