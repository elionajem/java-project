package Patisserie;

import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elio-PC
 */
public class Patisserie extends javax.swing.JFrame {

    /**
     * Creates new form Patisserie
     */
    public Connection con;
    public Patisserie() {
        initComponents();
        setTitle("Patisserie");
        setLocationRelativeTo(this);
        rbexo.setEnabled(false);
        txtID.setEnabled(false);
        txtname.setEnabled(false);
        txtadress.setEnabled(false);
        txtdate.setEnabled(false);
        txttel.setEnabled(false);
        txtdateoforder.setEnabled(false);
        txtproduct.setEnabled(false);
        jButton1.setEnabled(false);
        
        
        
        


        
        
        
    }
    public Connection getConnection(){  
        String JDBC_DRIVER ="com.mysql.jdbc.Driver";
        String URL = "jdbc:mysql://localhost:3306/pattiserie";
        String USERNAME = "root";
        String PASSWORD = "mysql";
        try {
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex){
            System.err.println(ex.getMessage());
        }
        return con;
    }
            
     
        
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbxpers = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        rbexo = new javax.swing.JRadioButton();
        rbnormal = new javax.swing.JRadioButton();
        lblprice = new javax.swing.JLabel();
        btnprice = new javax.swing.JButton();
        btnneworder = new javax.swing.JButton();
        cbxcake = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtadress = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        txtdateoforder = new javax.swing.JTextField();
        txtproduct = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton10.setText("Logut");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel1.setText("Size of the cake");

        cbxpers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "6 pers", "10 pers", "15 pers", "20 pers", " ", " " }));
        cbxpers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxpersActionPerformed(evt);
            }
        });

        jLabel2.setText("Cake Name");

        buttonGroup1.add(rbexo);
        rbexo.setText("exotic");

        buttonGroup1.add(rbnormal);
        rbnormal.setSelected(true);
        rbnormal.setText("normal");

        btnprice.setText("Price");
        btnprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpriceActionPerformed(evt);
            }
        });

        btnneworder.setText("New Order");
        btnneworder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnneworderActionPerformed(evt);
            }
        });

        cbxcake.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "bahamas", "foret noire", "foret blanche", "mille feuille vanille", "mille feuille chocolat" }));
        cbxcake.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxcakeItemStateChanged(evt);
            }
        });

        jLabel8.setText("Customer Name");

        jLabel9.setText("Adress");

        jLabel10.setText("Tel");

        jLabel11.setText("Date");

        jLabel12.setText("Date of order");

        jLabel13.setText("product");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });

        txttel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelActionPerformed(evt);
            }
        });

        txtdateoforder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateoforderActionPerformed(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setText("ID");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jButton2.setText("Orders");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblprice, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnprice, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(51, 51, 51)
                                                .addComponent(btnneworder, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxpers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbxcake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(257, 257, 257)
                                .addComponent(rbnormal)
                                .addGap(45, 45, 45)
                                .addComponent(rbexo)))
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtID))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                        .addComponent(txtadress)
                                        .addComponent(txtdate)
                                        .addComponent(txttel)
                                        .addComponent(txtdateoforder)
                                        .addComponent(txtproduct)))
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 110, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel13, jLabel8, jLabel9});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtadress, txtdate, txtdateoforder, txtname, txtproduct, txttel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxcake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxpers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnormal)
                    .addComponent(rbexo))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnprice)
                    .addComponent(btnneworder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(lblprice, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                    .addComponent(txtadress))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdateoforder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtproduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(269, 269, 269))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel13, jLabel8, jLabel9});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtadress, txtdate, txtdateoforder, txtname, txtproduct, txttel});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.dispose();
        
            Login login =new Login();
            login.setVisible(true); 
    }//GEN-LAST:event_jButton10ActionPerformed
     
    private void btnpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpriceActionPerformed

        int price=0;
        switch(cbxcake.getSelectedItem().toString()){
            case "bahamas":
                price=3;
                break;
                
            case "foret noire":
                price=2;
                break;
            case "foret blanche":
                    price=2;
                break;
            case "mille feuille vanille":
                price=4;
                break;
            case "mille feuille chocolat":
                price=4;
                break;
                
        }
        
        switch(cbxpers.getSelectedItem().toString()){
            case "6 pers":
                price=price*6;
                break;
                
            case "10 pers":
                price=price*10;
                break;
            case "15 pers":
                    price=price*15;
                break;
            case"20 pers":
                 price=price*20;
                 break;
                         
                
        }
        if(rbexo.isSelected()){
            price=price+5;
        }
        lblprice.setText("The Price is"+price+" $");
        rbexo.setEnabled(false);
        cbxpers.setEnabled(false);
        cbxcake.setEnabled(false);
        rbnormal.setEnabled(false);
        btnprice.setEnabled(false);
        lblprice.setVisible(true);
        lblprice.setEnabled(true);
            txtID.setEnabled(true);
        txtname.setEnabled(true);
        txtadress.setEnabled(true);
        txtdate.setEnabled(true);
        txttel.setEnabled(true);
        txtdateoforder.setEnabled(true);
        txtproduct.setEnabled(true);
        jButton1.setEnabled(true);
        
        
        
    }//GEN-LAST:event_btnpriceActionPerformed

    private void btnneworderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnneworderActionPerformed

         cbxpers.setEnabled(true);
        cbxcake.setEnabled(true);
        rbnormal.setEnabled(true);
        btnprice.setEnabled(true);
        lblprice.setEnabled(false);
        lblprice.setVisible(false);
        cbxpers.setSelectedIndex(0);
        cbxcake.setSelectedIndex(0);
         txtID.setEnabled(false);
        txtname.setEnabled(false);
        txtadress.setEnabled(false);
        txtdate.setEnabled(false);
        txttel.setEnabled(false);
        txtdateoforder.setEnabled(false);
        txtproduct.setEnabled(false);
        jButton1.setEnabled(false);
        
        txtID.setText(null);   
        txtname.setText(null);
        txtadress.setText(null);
        txttel.setText(null);
        txtdate.setText(null);
        txtdateoforder.setText(null);
        txtproduct.setText(null);
       
      
        
        
        
                
    }//GEN-LAST:event_btnneworderActionPerformed

    private void cbxpersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxpersActionPerformed
     
        
            
        

    }//GEN-LAST:event_cbxpersActionPerformed

    private void cbxcakeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxcakeItemStateChanged
    if((cbxcake.getSelectedItem().equals("foret noire"))||(cbxcake.getSelectedItem().equals("foret blanche"))){
           rbexo.setEnabled(true);
       }else{
           rbexo.setEnabled(false);
           rbnormal.setSelected(true);
       }


    }//GEN-LAST:event_cbxcakeItemStateChanged

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txttelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelActionPerformed

    private void txtdateoforderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateoforderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateoforderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if((txtID.getText().equals(""))||(txtname.getText().equals(""))||(txtadress.getText().equals(""))||(txttel.getText().equals(""))
                ||(txtdate.getText().equals(""))||(txtdateoforder.getText().equals(""))||(txtproduct.getText().equals("")))
        {             JOptionPane.showMessageDialog(null,"3abbe l fieldet");}

        
        
        else {
        try { 
        String ID = txtID.getText();
        String Name = txtname.getText();
        String Address = txtadress.getText();
        String Tel = txttel.getText();
        String Date = txtdate.getText();
        String DateOfOrder = txtdateoforder.getText();
        String Product = txtproduct.getText();
        
        getConnection();
                    String query = "insert into customer_info values"
                    + "('"+ID+"','"+Name+"','"+Address+"','"+Tel+"','"+Date+"',"
                    + "'"+DateOfOrder+"','"+Product+"')";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(query);
        JOptionPane.showMessageDialog(this, "Saved!");
       }catch (Exception e){
       JOptionPane.showMessageDialog(null, e.getMessage());
       
        }   }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                    this.dispose();

        
        table tabs=new table();
            tabs.setVisible(true); 


    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Patisserie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patisserie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patisserie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patisserie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Patisserie().setVisible(true);
            } 
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnneworder;
    private javax.swing.JButton btnprice;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbxcake;
    private javax.swing.JComboBox cbxpers;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblprice;
    private javax.swing.JRadioButton rbexo;
    private javax.swing.JRadioButton rbnormal;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtadress;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtdateoforder;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtproduct;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables

    static class ColumnsPriv {

        public ColumnsPriv() {
        }
    }

    static class CustomerInfo {

        public CustomerInfo() {
        }
    }

    static class Customer {

        public Customer() {
        }
    }
}
