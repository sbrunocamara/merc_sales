/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package merc.view;

import javax.swing.JOptionPane;
import merc.Classes.UsuarioClasse;
import merc.controller.UsuarioController;

/**
 *
 * @author bsbru
 */
public class Auth extends javax.swing.JFrame {

    /**
     * Creates new form AuthTest
     */
    public Auth() {
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
        jLabel2 = new javax.swing.JLabel();
        usuarioEntrada = new javax.swing.JFormattedTextField();
        senhaEntrada = new javax.swing.JPasswordField();
        loginAction = new javax.swing.JButton();
        cancelaLoginAction = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autenticação");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Usuário:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Senha:");

        usuarioEntrada.setToolTipText("");
        usuarioEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioEntradaActionPerformed(evt);
            }
        });

        senhaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaEntradaActionPerformed(evt);
            }
        });

        loginAction.setText("Entrar");
        loginAction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginActionMouseClicked(evt);
            }
        });
        loginAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionActionPerformed(evt);
            }
        });

        cancelaLoginAction.setText("Cancelar");
        cancelaLoginAction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelaLoginActionMouseClicked(evt);
            }
        });
        cancelaLoginAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaLoginActionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usuarioEntrada)
                    .addComponent(senhaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(loginAction)
                        .addGap(18, 18, 18)
                        .addComponent(cancelaLoginAction)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usuarioEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(senhaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginAction)
                    .addComponent(cancelaLoginAction))
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioEntradaActionPerformed

    private void senhaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaEntradaActionPerformed

    private void loginActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionActionPerformed

    private void cancelaLoginActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaLoginActionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelaLoginActionActionPerformed

    private void loginActionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginActionMouseClicked
        // TODO add your handling code here:
        
        String email = usuarioEntrada.getText();
        String senha = senhaEntrada.getText();
        
        
        UsuarioController usuarioController = new UsuarioController();
        UsuarioClasse usuario = usuarioController.autenticaUsuario(email, senha);

        if(usuario.getId() != null){
            
            Principal principalTela = new Principal();
            principalTela.setVisible(true);
            this.setVisible(false);
            
        }else{
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
            usuarioEntrada.setText("");
            senhaEntrada.setText("");
        }
        
                
    }//GEN-LAST:event_loginActionMouseClicked

    private void cancelaLoginActionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelaLoginActionMouseClicked
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_cancelaLoginActionMouseClicked

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
            java.util.logging.Logger.getLogger(Auth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Auth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Auth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Auth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Auth().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelaLoginAction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginAction;
    private javax.swing.JPasswordField senhaEntrada;
    private javax.swing.JFormattedTextField usuarioEntrada;
    // End of variables declaration//GEN-END:variables
}
