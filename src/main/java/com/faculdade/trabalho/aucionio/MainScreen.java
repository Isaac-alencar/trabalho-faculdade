/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.faculdade.trabalho.aucionio;

/**
 *
 * @author isaac
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
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

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jPopupMenu5 = new javax.swing.JPopupMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        top_menu_cadastro = new javax.swing.JMenu();
        menu_item_client = new javax.swing.JMenu();
        menu_item_fornecedor = new javax.swing.JMenu();
        menu_item_user = new javax.swing.JMenu();
        top_menu_aplicacao = new javax.swing.JMenu();
        menu_item_calculator = new javax.swing.JMenu();
        top_menu_sair = new javax.swing.JMenu();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        top_menu_cadastro.setText("Cadastro");

        menu_item_client.setText("Cliente");
        menu_item_client.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menu_item_clientMenuSelected(evt);
            }
        });
        menu_item_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_item_clientMouseClicked(evt);
            }
        });
        top_menu_cadastro.add(menu_item_client);

        menu_item_fornecedor.setText("Fornecedor");
        menu_item_fornecedor.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menu_item_fornecedorMenuSelected(evt);
            }
        });
        menu_item_fornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_item_fornecedorMouseClicked(evt);
            }
        });
        top_menu_cadastro.add(menu_item_fornecedor);

        menu_item_user.setText("Usuário");
        menu_item_user.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menu_item_userMenuSelected(evt);
            }
        });
        menu_item_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_item_userMouseClicked(evt);
            }
        });
        top_menu_cadastro.add(menu_item_user);

        jMenuBar1.add(top_menu_cadastro);

        top_menu_aplicacao.setText("Aplicação");

        menu_item_calculator.setText("Calculadora");
        menu_item_calculator.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menu_item_calculatorMenuSelected(evt);
            }
        });
        menu_item_calculator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_item_calculatorMouseClicked(evt);
            }
        });
        top_menu_aplicacao.add(menu_item_calculator);

        jMenuBar1.add(top_menu_aplicacao);

        top_menu_sair.setText("Sair");
        top_menu_sair.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                top_menu_sairMenuSelected(evt);
            }
        });
        top_menu_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                top_menu_sairMouseClicked(evt);
            }
        });
        jMenuBar1.add(top_menu_sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_item_clientMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menu_item_clientMenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_item_clientMenuSelected

    private void menu_item_fornecedorMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menu_item_fornecedorMenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_item_fornecedorMenuSelected

    private void menu_item_userMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menu_item_userMenuSelected
        //
    }//GEN-LAST:event_menu_item_userMenuSelected

    private void menu_item_calculatorMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menu_item_calculatorMenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_item_calculatorMenuSelected

    private void top_menu_sairMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_top_menu_sairMenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_top_menu_sairMenuSelected

    private void menu_item_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_userMouseClicked
        new UserRegister().setVisible(true);
    }//GEN-LAST:event_menu_item_userMouseClicked

    private void menu_item_calculatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_calculatorMouseClicked
        new Calculator().setVisible(true);
    }//GEN-LAST:event_menu_item_calculatorMouseClicked

    private void menu_item_fornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_fornecedorMouseClicked
        new FornecedorRegister().setVisible(true);
    }//GEN-LAST:event_menu_item_fornecedorMouseClicked

    private void menu_item_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_item_clientMouseClicked
        new FornecedorRegister().setVisible(true);
    }//GEN-LAST:event_menu_item_clientMouseClicked

    private void top_menu_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_top_menu_sairMouseClicked
        new LoginScreen().setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_top_menu_sairMouseClicked

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu jPopupMenu5;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JMenu menu_item_calculator;
    private javax.swing.JMenu menu_item_client;
    private javax.swing.JMenu menu_item_fornecedor;
    private javax.swing.JMenu menu_item_user;
    private javax.swing.JMenu top_menu_aplicacao;
    private javax.swing.JMenu top_menu_cadastro;
    private javax.swing.JMenu top_menu_sair;
    // End of variables declaration//GEN-END:variables
}
