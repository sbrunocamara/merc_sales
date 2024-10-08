/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package merc.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import merc.Classes.EnderecoClasse;
import merc.controller.EnderecoController;




/**
 *
 * @author bsbru
 */
public class Enderecos extends javax.swing.JFrame {

    public  ArrayList<EnderecoClasse> enderecos;
    /**
     * Creates new form Fornecedores
     */
    public Enderecos(ArrayList<EnderecoClasse> enderecos) {
        
        
        this.dispose();
        
    
        initComponents();
       
        
        this.enderecos = enderecos;
        
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
        jTableEnderecos = new javax.swing.JTable();
        jButtonEnderecosAdd = new javax.swing.JButton();
        EnderecosButtonEdit = new javax.swing.JButton();
        EnderecosButtonDelete = new javax.swing.JButton();

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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/endereco.png"))); // NOI18N
        jLabel1.setText("Endereços");

        jTableEnderecos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Descrição", "CEP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEnderecos.setToolTipText("");
        jTableEnderecos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEnderecosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEnderecos);

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

        jButtonEnderecosAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add.png"))); // NOI18N
        jButtonEnderecosAdd.setText("Novo");
        jButtonEnderecosAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEnderecosAddMouseClicked(evt);
            }
        });
        jButtonEnderecosAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnderecosAddActionPerformed(evt);
            }
        });

        EnderecosButtonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/editar.png"))); // NOI18N
        EnderecosButtonEdit.setText("Editar");
        EnderecosButtonEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnderecosButtonEditMouseClicked(evt);
            }
        });
        EnderecosButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnderecosButtonEditActionPerformed(evt);
            }
        });

        EnderecosButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/remover.png"))); // NOI18N
        EnderecosButtonDelete.setText("Excluir");
        EnderecosButtonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnderecosButtonDeleteMouseClicked(evt);
            }
        });
        EnderecosButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnderecosButtonDeleteActionPerformed(evt);
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
                                .addComponent(jButtonEnderecosAdd)
                                .addGap(18, 18, 18)
                                .addComponent(EnderecosButtonEdit)
                                .addGap(18, 18, 18)
                                .addComponent(EnderecosButtonDelete))))
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
                            .addComponent(EnderecosButtonEdit)
                            .addComponent(EnderecosButtonDelete)
                            .addComponent(jButtonEnderecosAdd))))
                .addGap(18, 18, 18)
                .addComponent(jPanelFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnderecosAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnderecosAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEnderecosAddActionPerformed

    private void jButtonEnderecosAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnderecosAddMouseClicked
        // TODO add your handling code here:
        this.dispose();
        EnderecosAdd telaEnderecoAdd = new EnderecosAdd();
        telaEnderecoAdd.setVisible(true);
    }//GEN-LAST:event_jButtonEnderecosAddMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       

    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jTableEnderecosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEnderecosMouseClicked
        // TODO add your handling code here:
//        System.out.println(jTableFornecedores.getModel().getValueAt(jTableFornecedores.getSelectedRow(), 0));
    }//GEN-LAST:event_jTableEnderecosMouseClicked

    private void EnderecosButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnderecosButtonEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnderecosButtonEditActionPerformed

    private void EnderecosButtonEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnderecosButtonEditMouseClicked
        // TODO add your handling code here:
        
        
        if(jTableEnderecos.getSelectedRow() < 0){
            return;
            
        }
        
        Integer id = (Integer)jTableEnderecos.getModel().getValueAt(jTableEnderecos.getSelectedRow(), 0);
        String descricao = (String)jTableEnderecos.getModel().getValueAt(jTableEnderecos.getSelectedRow(), 1);
        String cep = (String)jTableEnderecos.getModel().getValueAt(jTableEnderecos.getSelectedRow(), 2);

       EnderecoClasse endereco = new EnderecoClasse();
       
       endereco.setId(id);
       endereco.setDescricao(descricao);
       endereco.setCep(cep);
               
        
        this.dispose();
        EnderecosEdit telaEnderecoEdit = new EnderecosEdit(endereco);
        telaEnderecoEdit.setVisible(true);
        
    }//GEN-LAST:event_EnderecosButtonEditMouseClicked

    private void EnderecosButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnderecosButtonDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnderecosButtonDeleteActionPerformed

    private void EnderecosButtonDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnderecosButtonDeleteMouseClicked
        // TODO add your handling code here:
           if(jTableEnderecos.getSelectedRow() < 0){
            return;
            
        }
        
        Integer id = (Integer)jTableEnderecos.getModel().getValueAt(jTableEnderecos.getSelectedRow(), 0);

        
       EnderecoClasse endereco = new EnderecoClasse();
       endereco.setId(id);
       
       int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Você realmente deseja excluir o item selecionado?", "Confirmação", dialogButton);
       
       if(dialogResult == 0) {
           EnderecoController enderecoController = new EnderecoController();
           boolean remove = enderecoController.remove(endereco);
           
           if(remove == true){
                JOptionPane.showMessageDialog(null, "Item removido com sucesso!");
                  this.dispose();
                  this.carregaTela();
           }else{
               JOptionPane.showMessageDialog(null, "Erro ao remover o item!");
           }
           
             } else {
               
                         } 
       
    }//GEN-LAST:event_EnderecosButtonDeleteMouseClicked

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
            java.util.logging.Logger.getLogger(Enderecos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Enderecos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Enderecos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Enderecos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            
  
            public void run() {
     
            
                
                new Enderecos(enderecos).setVisible(true);

            }
        });
        
     
    }
    
    public boolean preencheTabela(){
            DefaultTableModel tableModel = (DefaultTableModel) jTableEnderecos.getModel();
                tableModel.setRowCount(0);
                enderecos.forEach((endereco)->{
                    tableModel.addRow(new Object[] {
                        endereco.getId(),
                        endereco.getDescricao(),
                        endereco.getCep(),

                        
                    });
                
            });
                jTableEnderecos.setModel(tableModel);
                
                return true;
    }
    
    public void carregaTela(){
         EnderecoController  enderecoController = new EnderecoController();
        ArrayList<EnderecoClasse> carregaEnderecos = enderecoController.select();
        

        
        
        Enderecos telaEnderecos = new Enderecos(carregaEnderecos);
        telaEnderecos.setVisible(true);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnderecosButtonDelete;
    private javax.swing.JButton EnderecosButtonEdit;
    private javax.swing.JButton jButtonEnderecosAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFornecedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEnderecos;
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
