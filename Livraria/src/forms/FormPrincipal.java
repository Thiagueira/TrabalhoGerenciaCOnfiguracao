/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import dao.ClienteDAO;
import dao.LivroDAO;
import dao.VendaDAO;
import javax.swing.JOptionPane;
import model.Livro;


public class FormPrincipal extends javax.swing.JFrame {

    public static ClienteDAO daoCliente = null; 
    public static LivroDAO daoLivro = null;    
    public static VendaDAO daoVenda = null;
            
    public FormPrincipal() {
        daoCliente = new ClienteDAO();
        daoLivro = new LivroDAO();
        daoVenda = new VendaDAO();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemLivros = new javax.swing.JMenuItem();
        jMenuItemCadCliente = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuItemConsCliente = new javax.swing.JMenuItem();
        jMenuConsultasLivros = new javax.swing.JMenu();
        jMenuItemConsultaLivros1 = new javax.swing.JMenuItem();
        jMenuItemConsultaLivros2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Livraria On-Line - Livro Certo!");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bookcase-books-bookshelves-270571(2).jpg"))); // NOI18N
        jPanel1.add(jLabel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenuCadastros.setText("Cadastros");

        jMenuItemLivros.setText("Livros");
        jMenuItemLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLivrosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemLivros);

        jMenuItemCadCliente.setText("Cliente");
        jMenuItemCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadClienteActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadCliente);
        jMenuCadastros.add(jSeparator1);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemSair);

        jMenuBar1.add(jMenuCadastros);

        jMenu1.setText("Vendas");

        jMenuItem1.setText("Efetuar Venda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Emitir NF");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenuConsultas.setText("Consultas");

        jMenuItemConsCliente.setText("Clientes");
        jMenuItemConsCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsClienteActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemConsCliente);

        jMenuConsultasLivros.setText("Livros");

        jMenuItemConsultaLivros1.setText("Livros com Area");
        jMenuItemConsultaLivros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaLivros1ActionPerformed(evt);
            }
        });
        jMenuConsultasLivros.add(jMenuItemConsultaLivros1);

        jMenuItemConsultaLivros2.setText("Livros com Tabela");
        jMenuItemConsultaLivros2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaLivros2ActionPerformed(evt);
            }
        });
        jMenuConsultasLivros.add(jMenuItemConsultaLivros2);

        jMenuConsultas.add(jMenuConsultasLivros);

        jMenuBar1.add(jMenuConsultas);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItemConsClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsClienteActionPerformed
        new FormConsultaCliente().setVisible(true);
    }//GEN-LAST:event_jMenuItemConsClienteActionPerformed

    private void jMenuItemCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadClienteActionPerformed
        new FormCliente().setVisible(true);
    }//GEN-LAST:event_jMenuItemCadClienteActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do sistema?", "Confirmação",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(op == JOptionPane.YES_OPTION)
            this.dispose();     
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemConsultaLivros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaLivros1ActionPerformed
        new FormConsultaLivroAreaTexto().setVisible(true);
    }//GEN-LAST:event_jMenuItemConsultaLivros1ActionPerformed

    private void jMenuItemLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLivrosActionPerformed
        new FormLivro().setVisible(true);
    }//GEN-LAST:event_jMenuItemLivrosActionPerformed

    private void jMenuItemConsultaLivros2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaLivros2ActionPerformed
        new FormConsultaLivroTabela().setVisible(true);
    }//GEN-LAST:event_jMenuItemConsultaLivros2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new FormVenda().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new FormNotaFiscal().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenu jMenuConsultasLivros;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemCadCliente;
    private javax.swing.JMenuItem jMenuItemConsCliente;
    private javax.swing.JMenuItem jMenuItemConsultaLivros1;
    private javax.swing.JMenuItem jMenuItemConsultaLivros2;
    private javax.swing.JMenuItem jMenuItemLivros;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
