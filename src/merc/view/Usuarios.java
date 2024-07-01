/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package merc.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import merc.Classes.FornecedorClasse;
import merc.Classes.UsuarioClasse;
import merc.controller.FornecedorController;
import merc.controller.UsuarioController;



/**
 *
 * @author bsbru
 */
public class Usuarios extends javax.swing.JFrame {

    public  ArrayList<UsuarioClasse> usuarios;
    /**
     * Creates new form Fornecedores
     */
    public Usuarios(ArrayList<UsuarioClasse> usuarios) {
        
        
        this.dispose();
        
    
        initComponents();
       
        
        this.usuarios = usuarios;
        
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
        jTableUsuarios = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        UsuáriosButtonEdit = new javax.swing.JButton();
        UsuáriosButtonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuários");
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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fornecedores.png"))); // NOI18N
        jLabel1.setText("Usuários");

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Email", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTableUsuarios.setToolTipText("");
        jTableUsuarios.setAutoscrolls(false);
        jTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuarios);

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add.png"))); // NOI18N
        jButton1.setText("Novo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        UsuáriosButtonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/editar.png"))); // NOI18N
        UsuáriosButtonEdit.setText("Editar");
        UsuáriosButtonEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuáriosButtonEditMouseClicked(evt);
            }
        });
        UsuáriosButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuáriosButtonEditActionPerformed(evt);
            }
        });

        UsuáriosButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/remover.png"))); // NOI18N
        UsuáriosButtonDelete.setText("Excluir");
        UsuáriosButtonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuáriosButtonDeleteMouseClicked(evt);
            }
        });
        UsuáriosButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuáriosButtonDeleteActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(UsuáriosButtonEdit)
                                .addGap(18, 18, 18)
                                .addComponent(UsuáriosButtonDelete))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
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
                            .addComponent(UsuáriosButtonEdit)
                            .addComponent(UsuáriosButtonDelete)
                            .addComponent(jButton1))))
                .addGap(18, 18, 18)
                .addComponent(jPanelFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       

    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosMouseClicked
        // TODO add your handling code here:
//        System.out.println(jTableFornecedores.getModel().getValueAt(jTableFornecedores.getSelectedRow(), 0));
    }//GEN-LAST:event_jTableUsuariosMouseClicked

    private void UsuáriosButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuáriosButtonDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuáriosButtonDeleteActionPerformed

    private void UsuáriosButtonDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuáriosButtonDeleteMouseClicked
        // TODO add your handling code here:
        if(jTableUsuarios.getSelectedRow() < 0){
            return;

        }

        Integer id = (Integer)jTableUsuarios.getModel().getValueAt(jTableUsuarios.getSelectedRow(), 0);

        UsuarioClasse usuario = new UsuarioClasse();
        usuario.setId(id);

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Você realmente deseja excluir o item selecionado?", "Confirmação", dialogButton);

        if(dialogResult == 0) {
            UsuarioController usuarioController = new UsuarioController();
            boolean remove = usuarioController.remove(usuario);

            if(remove == true){
                JOptionPane.showMessageDialog(null, "Item removido com sucesso!");
                this.dispose();
                this.carregaTela();
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao remover o item!");
            }

        } else {

        }

    }//GEN-LAST:event_UsuáriosButtonDeleteMouseClicked

    private void UsuáriosButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuáriosButtonEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuáriosButtonEditActionPerformed

    private void UsuáriosButtonEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuáriosButtonEditMouseClicked
        // TODO add your handling code here:

        if(jTableUsuarios.getSelectedRow() < 0){
            return;

        }

        Integer id = (Integer)jTableUsuarios.getModel().getValueAt(jTableUsuarios.getSelectedRow(), 0);
        String nome = (String)jTableUsuarios.getModel().getValueAt(jTableUsuarios.getSelectedRow(), 1);
        String email = (String)jTableUsuarios.getModel().getValueAt(jTableUsuarios.getSelectedRow(), 2);
        String situacao = (String)jTableUsuarios.getModel().getValueAt(jTableUsuarios.getSelectedRow(), 3);


        UsuarioClasse usuario = new UsuarioClasse();
        usuario.setId(id);
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSituacao(situacao);

        this.dispose();
        UsuariosEdit telaUsuarioEdit = new UsuariosEdit(usuario);
        telaUsuarioEdit.setVisible(true);

    }//GEN-LAST:event_UsuáriosButtonEditMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        UsuariosAdd telaUsuarioAdd = new UsuariosAdd();
        telaUsuarioAdd.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            
  
            public void run() {
     
            
                
                new Usuarios(usuarios).setVisible(true);

            }
        });
        
     
    }
    
    public boolean preencheTabela(){
            DefaultTableModel tableModel = (DefaultTableModel) jTableUsuarios.getModel();
                tableModel.setRowCount(0);
                usuarios.forEach((usuario)->{
                    tableModel.addRow(new Object[] {
                        usuario.getId(),
                        usuario.getNome(),
                        usuario.getEmail(),
                        usuario.getSituacao()
                        
                    });
                
            });
                jTableUsuarios.setModel(tableModel);
                
                return true;
    }
    
    public void carregaTela(){
        UsuarioController usuarioController = new UsuarioController();
        ArrayList<UsuarioClasse> carregaUsuarios = usuarioController.select();
        

        
        
        Usuarios telaUsuarios = new Usuarios(carregaUsuarios);
        telaUsuarios.setVisible(true);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UsuáriosButtonDelete;
    private javax.swing.JButton UsuáriosButtonEdit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFornecedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuarios;
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
