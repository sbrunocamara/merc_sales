/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package merc.view;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import merc.Classes.FornecedorClasse;
import merc.controller.FornecedorController;
import merc.database.ConnectionDB;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPCell;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;
import java.awt.Desktop;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author bsbru
 */
public class Fornecedores extends javax.swing.JFrame {

    public ArrayList<FornecedorClasse> fornecedores;

    /**
     * Creates new form Fornecedores
     */
    public Fornecedores(ArrayList<FornecedorClasse> fornecedores) {

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
        jTableFornecedores = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        FornecedoresButtonEdit = new javax.swing.JButton();
        fornecedoresButtonDelete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fornecedores.png"))); // NOI18N
        jLabel1.setText("Fornecedores");

        jTableFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Email", "CNPJ", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFornecedores.setToolTipText("");
        jTableFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFornecedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFornecedores);

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

        FornecedoresButtonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/editar.png"))); // NOI18N
        FornecedoresButtonEdit.setText("Editar");
        FornecedoresButtonEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FornecedoresButtonEditMouseClicked(evt);
            }
        });
        FornecedoresButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FornecedoresButtonEditActionPerformed(evt);
            }
        });

        fornecedoresButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/remover.png"))); // NOI18N
        fornecedoresButtonDelete.setText("Excluir");
        fornecedoresButtonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fornecedoresButtonDeleteMouseClicked(evt);
            }
        });
        fornecedoresButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecedoresButtonDeleteActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/reports.png"))); // NOI18N
        jButton2.setText("Gerar relatório");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButton2)
                        .addGap(61, 61, 61)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(FornecedoresButtonEdit)
                                .addGap(18, 18, 18)
                                .addComponent(fornecedoresButtonDelete))
                            .addGroup(layout.createSequentialGroup()
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FornecedoresButtonEdit)
                            .addComponent(fornecedoresButtonDelete)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
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

    private void jTableFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFornecedoresMouseClicked
        // TODO add your handling code here:
//        System.out.println(jTableFornecedores.getModel().getValueAt(jTableFornecedores.getSelectedRow(), 0));
    }//GEN-LAST:event_jTableFornecedoresMouseClicked

    private void fornecedoresButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecedoresButtonDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fornecedoresButtonDeleteActionPerformed

    private void fornecedoresButtonDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fornecedoresButtonDeleteMouseClicked
        // TODO add your handling code here:
        if (jTableFornecedores.getSelectedRow() < 0) {
            return;

        }

        Integer id = (Integer) jTableFornecedores.getModel().getValueAt(jTableFornecedores.getSelectedRow(), 0);

        FornecedorClasse fornecedor = new FornecedorClasse();
        fornecedor.setId(id);

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Você realmente deseja excluir o item selecionado?", "Confirmação", dialogButton);

        if (dialogResult == 0) {
            FornecedorController fornecedorController = new FornecedorController();
            boolean remove = fornecedorController.remove(fornecedor);

            if (remove == true) {
                JOptionPane.showMessageDialog(null, "Item removido com sucesso!");
                this.dispose();
                this.carregaTela();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao remover o item!");
            }

        } else {

        }

    }//GEN-LAST:event_fornecedoresButtonDeleteMouseClicked

    private void FornecedoresButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FornecedoresButtonEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FornecedoresButtonEditActionPerformed

    private void FornecedoresButtonEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FornecedoresButtonEditMouseClicked
        // TODO add your handling code here:

        if (jTableFornecedores.getSelectedRow() < 0) {
            return;

        }

        Integer id = (Integer) jTableFornecedores.getModel().getValueAt(jTableFornecedores.getSelectedRow(), 0);
        String nome = (String) jTableFornecedores.getModel().getValueAt(jTableFornecedores.getSelectedRow(), 1);
        String email = (String) jTableFornecedores.getModel().getValueAt(jTableFornecedores.getSelectedRow(), 2);
        String cnpj = (String) jTableFornecedores.getModel().getValueAt(jTableFornecedores.getSelectedRow(), 3);
        String telefone = (String) jTableFornecedores.getModel().getValueAt(jTableFornecedores.getSelectedRow(), 4);

        FornecedorClasse fornecedor = new FornecedorClasse();
        fornecedor.setId(id);
        fornecedor.setNome(nome);
        fornecedor.setEmail(email);
        fornecedor.setCnpj(cnpj);
        fornecedor.setTelefone(telefone);

        this.dispose();
        FornecedoresEdit telaFornecedorEdit = new FornecedoresEdit(fornecedor);
        telaFornecedorEdit.setVisible(true);

    }//GEN-LAST:event_FornecedoresButtonEditMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.dispose();
        FornecedoresAdd telaFornecedorAdd = new FornecedoresAdd();
        telaFornecedorAdd.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        
        this.geraRelatorio();
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new Fornecedores(fornecedores).setVisible(true);

            }
        });

    }

    public boolean preencheTabela() {
        DefaultTableModel tableModel = (DefaultTableModel) jTableFornecedores.getModel();
        tableModel.setRowCount(0);
        fornecedores.forEach((fornecedor) -> {
            tableModel.addRow(new Object[]{
                fornecedor.getId(),
                fornecedor.getNome(),
                fornecedor.getEmail(),
                fornecedor.getTelefone(),
                fornecedor.getCnpj()

            });

        });
        jTableFornecedores.setModel(tableModel);

        return true;
    }

    public void carregaTela() {
        FornecedorController fornecedoresController = new FornecedorController();
        ArrayList<FornecedorClasse> carregaFornecedores = fornecedoresController.select();

        Fornecedores telaFornecedores = new Fornecedores(carregaFornecedores);
        telaFornecedores.setVisible(true);
    }

    public void geraRelatorio() {
        

        Date dataName = new Date();
        String dataFormatadaFileName = new SimpleDateFormat("dd_MM_YY_HHmmss").format(dataName);
        
        Path path = FileSystems.getDefault().getPath("").toAbsolutePath();
        
        String fileName = "fornecedores_"+dataFormatadaFileName+".pdf";
        
        String dest = path+"/src/reports/"+fileName;
        
        File file = new File(dest);
        file.getParentFile().mkdirs();

        try {
            
        Date data = new Date();
        String dataFormatada = new SimpleDateFormat("dd-MM-YYYY HH:mm:ss").format(data);

            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(dest));
            document.open();

             int totalItems = this.fornecedores.size();
                
//            String dataString = data.toString();
            Chunk linebreak = new Chunk(new DottedLineSeparator());

 
            Font f=new Font(Font.FontFamily.COURIER,30.0f,Font.BOLD,BaseColor.BLACK);
            Paragraph tittle = new Paragraph("Relatório Fornecedores",f);
            tittle.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(tittle); 
            document.add(linebreak);  
  
     
            document.add(new Paragraph("Gerado em " + dataFormatada));
            document.add(linebreak);
            
             document.add(new Paragraph("Total de items: " + totalItems));
            document.add(linebreak);
 
//            document.add(new Paragraph("Periodo:"));
//            document.add(linebreak);
            
            
            float columnWidth[] = {7, 32, 32, 27, 25};
            PdfPTable table = new PdfPTable(columnWidth);
            table.setWidthPercentage(100);

            table.addCell("ID");
            table.addCell("Nome");
            table.addCell("Email");
            table.addCell("CNPJ");
            table.addCell("Telefone");

            for (FornecedorClasse element : this.fornecedores) {

                table.addCell(element.getId().toString());
                table.addCell(element.getNome());
                table.addCell(element.getEmail());
                table.addCell(element.getTelefone());
                table.addCell(element.getCnpj());

            }

            document.add(table);
            document.close();
            
           File myFile = new File(dest);
           Desktop.getDesktop().open(myFile);

        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        } catch (FileNotFoundException e) {
        }
        catch(IOException e){
        }
    }

    
        
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FornecedoresButtonEdit;
    private javax.swing.JButton fornecedoresButtonDelete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFornecedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFornecedores;
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
