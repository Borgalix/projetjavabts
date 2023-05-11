/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projet.appplicationfrais;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tyvinec
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        this.tableModel = new DefaultTableModel();
        tableUtil.setModel(tableModel);
        tableModel.setColumnIdentifiers(new Object[]{"id", "nom", "prenom", "login", "adresse", "cp", "ville", "date d'embauche"});
        Dao d1 = new Dao();
        String roquette = "SELECT * FROM `visiteur` WHERE nom LIKE '" + txtAreaNom.getText() + "%' AND "
                + "prenom LIKE '" + txtAreaPrenom.getText() + "%' AND id LIKE '%" + txtAreaId.getText()
                + "%' AND adresse LIKE '%" + txtAreaAdresse.getText() + "%' AND cp LIKE '%" + txtAreaCp.getText() + "%' "
                + "AND ville LIKE '" + txtAreaVille.getText() + "%' AND dateEmbauche LIKE '%" + txtAreaDateEmbauche.getText() + "%'";
        String Roquette_insert = "INSERT INTO `visiteur`(`id`, `nom`, `prenom`, `login`, `mdp`, `adresse`, `cp`, `ville`, `dateEmbauche`) VALUES (" + txtAreaId.getText()
                + " " + txtAreaNom.getText() + "," + txtAreaPrenom.getText() + ",login,mdp," + txtAreaAdresse.getText() + "," + txtAreaCp.getText() + "," + txtAreaVille.getText() + "," + txtAreaDateEmbauche.getText() + ")";

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jMenu1 = new javax.swing.JMenu();
        ajouterBtn = new javax.swing.JButton();
        ModifierBtn = new javax.swing.JButton();
        supprimerBtn = new javax.swing.JButton();
        rechercherBtn = new javax.swing.JButton();
        quitterBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUtil = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaPrenom = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAreaNom = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtAreaId = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtAreaAdresse = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtAreaCp = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtAreaDateEmbauche = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtAreaVille = new javax.swing.JTextArea();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ajouterBtn.setText("Ajouter");
        ajouterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouterBtnMouseClicked(evt);
            }
        });

        ModifierBtn.setText("Modifier");
        ModifierBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModifierBtnMouseClicked(evt);
            }
        });
        ModifierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierBtnActionPerformed(evt);
            }
        });

        supprimerBtn.setText("supprimer");
        supprimerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supprimerBtnMouseClicked(evt);
            }
        });

        rechercherBtn.setText("Rechercher");
        rechercherBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rechercherBtnMouseClicked(evt);
            }
        });
        rechercherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercherBtnActionPerformed(evt);
            }
        });

        quitterBtn.setText("Quitter");
        quitterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterBtnActionPerformed(evt);
            }
        });

        tableUtil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableUtil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUtilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUtil);

        txtAreaPrenom.setColumns(20);
        txtAreaPrenom.setLineWrap(true);
        txtAreaPrenom.setRows(1);
        txtAreaPrenom.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane5.setViewportView(txtAreaPrenom);

        jLabel1.setText("nom");

        jLabel2.setText("prenom");

        txtAreaNom.setColumns(20);
        txtAreaNom.setLineWrap(true);
        txtAreaNom.setRows(1);
        txtAreaNom.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane6.setViewportView(txtAreaNom);

        txtAreaId.setColumns(20);
        txtAreaId.setLineWrap(true);
        txtAreaId.setRows(1);
        txtAreaId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane7.setViewportView(txtAreaId);

        jLabel3.setText("id");

        jLabel4.setText("adresse");

        jLabel5.setText("cp");

        jLabel6.setText("date embauche");

        txtAreaAdresse.setColumns(20);
        txtAreaAdresse.setLineWrap(true);
        txtAreaAdresse.setRows(1);
        txtAreaAdresse.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane8.setViewportView(txtAreaAdresse);

        txtAreaCp.setColumns(20);
        txtAreaCp.setLineWrap(true);
        txtAreaCp.setRows(1);
        txtAreaCp.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane9.setViewportView(txtAreaCp);

        txtAreaDateEmbauche.setColumns(20);
        txtAreaDateEmbauche.setLineWrap(true);
        txtAreaDateEmbauche.setRows(1);
        txtAreaDateEmbauche.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane10.setViewportView(txtAreaDateEmbauche);

        jLabel7.setText("ville");

        txtAreaVille.setColumns(20);
        txtAreaVille.setLineWrap(true);
        txtAreaVille.setRows(1);
        txtAreaVille.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane11.setViewportView(txtAreaVille);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(ajouterBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ModifierBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(supprimerBtn)
                        .addGap(38, 38, 38)
                        .addComponent(rechercherBtn)))
                .addGap(2, 2, 2)
                .addComponent(quitterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(569, 569, 569))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(jLabel7))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rechercherBtn)
                    .addComponent(supprimerBtn)
                    .addComponent(ajouterBtn)
                    .addComponent(ModifierBtn)
                    .addComponent(quitterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {

            String url = "jdbc:mysql://localhost/gsb_frais";
            String user = "root";
            String passwd = "";
            Connection connect;
            connect = DriverManager.getConnection(url, user, passwd);
            Statement stmt = connect.createStatement();
            ResultSet sr = stmt.executeQuery("SELECT `id`, `nom`, `prenom`,`login`, `adresse`, `cp`, `ville`, `dateembauche` FROM visiteur");

            tableModel.setRowCount(0);
            while (sr.next()) {
                Visiteur v1 = new Visiteur(sr.getString("id"), sr.getString("nom"), sr.getString("prenom"), sr.getString("login"), sr.getString("adresse"), sr.getInt("cp"), sr.getString("ville"), sr.getString("dateembauche"));
                tableModel.addRow(v1.toArray());
                System.out.println("hello");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }


    }//GEN-LAST:event_formWindowOpened

    private void rechercherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercherBtnActionPerformed

    }//GEN-LAST:event_rechercherBtnActionPerformed

    private void ajouterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterBtnMouseClicked
        System.out.println("clic ajouter");
        char login1 = txtAreaPrenom.getText().charAt(0);
        String login = login1 + txtAreaNom.getText();
        System.out.println(login);
        String Roquette_insert = "INSERT INTO `visiteur`(`id`, `nom`, `prenom`, `login`, `adresse`, `cp`, `ville`, `dateEmbauche`) VALUES (" + txtAreaId.getText()
                + " " + txtAreaNom.getText() + "," + txtAreaPrenom.getText() + ",login,mdp," + txtAreaAdresse.getText() + "," + txtAreaCp.getText() + "," + txtAreaVille.getText() + "," + txtAreaDateEmbauche.getText() + ")";

    }//GEN-LAST:event_ajouterBtnMouseClicked

    private void ModifierBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifierBtnMouseClicked
        System.out.println("clic modifier");
    }//GEN-LAST:event_ModifierBtnMouseClicked

    private void supprimerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerBtnMouseClicked

        try {
            int ligne = tableUtil.getSelectedRow();
            String url = "jdbc:mysql://localhost/gsb_frais";
            String user = "root";
            String passwd = "";
            Connection connect;
            connect = DriverManager.getConnection(url, user, passwd);
            Statement stmt = connect.createStatement();
            String sql = "DELETE FROM visiteur " + "WHERE id = a93";
//                    + tableUtil.getValueAt(ligne, 0).toString();
//            
//            PreparedStatement pstmt = connect.prepareStatement("UPDATE EMPLOYEE SET SALARY =  ? WHERE  ID =  ?");
//            pstmt.setBigDecimal(1, 153833.00);
//            pstmt.setInt(2, 110592)
//            stmt.execute(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
//        switch (colonne) {
//            case 1:
//                System.out.println(" id = " + tableUtil.getValueAt(ligne, colonne).toString());
//                break;
//            case 2:
//                System.out.println(" nom = " + tableUtil.getValueAt(ligne, colonne).toString());
//                String req2 = " nom = " + tableUtil.getValueAt(ligne, colonne).toString();
//                break;
//            case 3:
//                System.out.println(" prenom = " + tableUtil.getValueAt(ligne, colonne).toString());
//                String req3 = " prenom = " + tableUtil.getValueAt(ligne, colonne).toString();
//                break;
//            case 4:
//                System.out.println(" adresse = " + tableUtil.getValueAt(ligne, colonne).toString());
//                String req4 = " adresse = " + tableUtil.getValueAt(ligne, colonne).toString();
//                break;
//            case 5:
//                System.out.println(" login = " + tableUtil.getValueAt(ligne, colonne).toString());
//                String req5 = " login = " + tableUtil.getValueAt(ligne, colonne).toString();
//                break;
//            case 6:
//                System.out.println(" cp = " + tableUtil.getValueAt(ligne, colonne).toString());
//                String req6 = " cp = " + tableUtil.getValueAt(ligne, colonne).toString();
//                break;
//            case 7:
//                System.out.println(" ville = " + tableUtil.getValueAt(ligne, colonne).toString());
//                String req7 = " ville = " + tableUtil.getValueAt(ligne, colonne).toString();
//                break;
//            case 8:
//                System.out.println(" dateembauche = " + tableUtil.getValueAt(ligne, colonne).toString());
//                String req8 = " dateembauche = " + tableUtil.getValueAt(ligne, colonne).toString();
//                break;
//        }


    }//GEN-LAST:event_supprimerBtnMouseClicked

    private void rechercherBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechercherBtnMouseClicked
        String roquette = "SELECT * FROM `visiteur` WHERE nom LIKE '" + txtAreaNom.getText() + "%' AND "
                + "prenom LIKE '" + txtAreaPrenom.getText() + "%' AND id LIKE '%" + txtAreaId.getText()
                + "%' AND adresse LIKE '%" + txtAreaAdresse.getText() + "%' AND cp LIKE '%" + txtAreaCp.getText() + "%' "
                + "AND ville LIKE '" + txtAreaVille.getText() + "%' AND dateEmbauche LIKE '%" + txtAreaDateEmbauche.getText() + "%'";

        System.out.println("clic rechercher");
        try {
            String url = "jdbc:mysql://localhost/gsb_frais";
            String user = "root";
            String passwd = "";
            Connection connect;
            connect = DriverManager.getConnection(url, user, passwd);
            Statement stmt = connect.createStatement();
            ResultSet sr = stmt.executeQuery(roquette);

            tableModel.setRowCount(0);
            while (sr.next()) {
                Visiteur v2 = new Visiteur(sr.getString("id"), sr.getString("nom"), sr.getString("prenom"), sr.getString("login"), sr.getString("adresse"), sr.getInt("cp"), sr.getString("ville"), sr.getString("dateembauche"));
                tableModel.addRow(v2.toArray());

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_rechercherBtnMouseClicked

    private void quitterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterBtnActionPerformed
        System.out.println("clic quitter");
        System.exit(0);
    }//GEN-LAST:event_quitterBtnActionPerformed

    private void tableUtilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUtilMouseClicked
        System.out.println("vous avez cliqué");
// TODO add your handling code here:
    }//GEN-LAST:event_tableUtilMouseClicked

    private void ModifierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierBtnActionPerformed
        String Roquette_insert = "INSERT INTO `visiteur`(`id`, `nom`, `prenom`, `login`, `adresse`, `cp`, `ville`, `dateEmbauche`) VALUES (" + txtAreaId.getText()
                + " " + txtAreaNom.getText() + "," + txtAreaPrenom.getText() + ",login,mdp," + txtAreaAdresse.getText() + "," + txtAreaCp.getText() + "," + txtAreaVille.getText() + "," + txtAreaDateEmbauche.getText() + ")";        // TODO add your handling code here:
    }//GEN-LAST:event_ModifierBtnActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainWindow().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ModifierBtn;
    private javax.swing.JButton ajouterBtn;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton quitterBtn;
    private javax.swing.JButton rechercherBtn;
    private javax.swing.JButton supprimerBtn;
    private javax.swing.JTable tableUtil;
    private javax.swing.JTextArea txtAreaAdresse;
    private javax.swing.JTextArea txtAreaCp;
    private javax.swing.JTextArea txtAreaDateEmbauche;
    private javax.swing.JTextArea txtAreaId;
    private javax.swing.JTextArea txtAreaNom;
    private javax.swing.JTextArea txtAreaPrenom;
    private javax.swing.JTextArea txtAreaVille;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel tableModel;

}
