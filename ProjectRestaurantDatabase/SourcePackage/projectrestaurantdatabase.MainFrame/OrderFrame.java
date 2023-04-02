/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrestaurantdatabase.MainFrame;

import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import projectrestaurantdatabase.Controller.OrderController;
import projectrestaurantdatabase.Helper.Helper;
import projectrestaurantdatabase.Model.OrderModel;
import projectrestaurantdatabase.Model.UserModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Asus
 */
public class OrderFrame extends javax.swing.JFrame {
    
    OrderModel model = new OrderModel();
    OrderController controller = new OrderController();
    
    Helper helper = new Helper();
    String order_database_id;
    ResultSet rs;
    
    String id_admin;

    /**
     * Creates new form MainFrame
     */
    public OrderFrame() {
        initComponents();
        getAllData();
        clear();
    }
    
     public OrderFrame(UserModel userModel) {
        initComponents();
        this.clear();
        
        String labelMessage = "Hi, " + userModel.getName();
        this.label_name.setText(labelMessage);
        this.id_admin = userModel.getId();
    }
    
    public void getAllData(){
        this.rs = controller.get();
        loadTable(this.rs);
    }
    public void loadTable(ResultSet rs){
        tb_product.setModel(DbUtils.resultSetToTableModel(rs)); 
    }
        public void clear() {
        tf_customer.setText("");
        tf_table.setText("");
        tf_payment.setText("");
        cb_method.setSelectedIndex(0);
        dp_date.setDate(null);
        
        btn_update.setEnabled(false);
        btn_delete.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tf_table = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dp_date = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        tf_customer = new javax.swing.JTextField();
        tf_payment = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_product = new javax.swing.JTable();
        tf_search = new javax.swing.JTextField();
        btn_search_id = new javax.swing.JButton();
        btn_search_name = new javax.swing.JButton();
        cb_method = new javax.swing.JComboBox<>();
        btn_submit = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        label_name = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("Jumlah Pesanan");

        jLabel13.setText("Payment Method ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 153));

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("PAYMENT METHOD");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAMA CUSTOMER");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NOMOR TABLE");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PAYMENT DATE");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID PAYMENT");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RESTAURANT ORDER");

        tb_product.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_productMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_product);

        btn_search_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_search_id.setText("CARI DENGAN ID ");
        btn_search_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_idActionPerformed(evt);
            }
        });

        btn_search_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_search_name.setText("CARI DENGAN NAMA CUSTOMER");
        btn_search_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_nameActionPerformed(evt);
            }
        });

        cb_method.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cb_method.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CASH", "E-WALLET", "DEBIT/KREDIT" }));

        btn_submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_submit.setText("SUBMIT");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_next.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_next.setText("NEXT");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        label_name.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        label_name.setForeground(new java.awt.Color(255, 255, 255));
        label_name.setText("label_name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_customer)
                            .addComponent(tf_table)
                            .addComponent(tf_payment)
                            .addComponent(dp_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_method, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_search_id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_search_name))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label_name)
                        .addGap(76, 76, 76))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(label_name))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search_name)
                    .addComponent(btn_search_id)
                    .addComponent(tf_customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_method, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dp_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_submit)
                    .addComponent(btn_update))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_delete)
                    .addComponent(btn_next))
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void tb_productMouseClicked(java.awt.event.MouseEvent evt) {                                        
     // TODO add your handling code here:
     try{
         String id = helper.getValueRows(tb_product, 0);
         String name = helper.getValueRows(tb_product, 1);
         String table = helper.getValueRows(tb_product, 2);
         String id_payment = helper.getValueRows(tb_product, 3);
         String payment_method = helper.getValueRows(tb_product, 4);
         String payment =  helper.getValueRows(tb_product, 5);
                 
         btn_update.setEnabled(true);
         btn_delete.setEnabled(true);
         
         this.order_database_id = id;
         tf_customer.setText(name);
         tf_table.setText(table);
         tf_payment.setText(id_payment);
         cb_method.setSelectedItem(payment_method);
         dp_date.setDate(new Date(helper.parseStringToDatepickerFormat(payment)));
     }
     catch(Exception e){
         System.out.println(e.getMessage());
     }
    }                                       

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {                                           
       // TODO add your handling code here:
        try {
            String name = tf_customer.getText();
            String table = tf_table.getText();
            String id_payment = tf_payment.getText();
            String payment_method = cb_method.getSelectedItem().toString();

            Date date = dp_date.getDate();

            model.setName(name);
            model.setTable(table);
            model.setId_payment(id_payment);
            model.setPayment_method(payment_method);
            model.setPayment(date);
            
            Boolean result = controller.create(model);
            
            String msg = "Gagal menambahkan data!";
            if(result) {
                msg = "Berhasil menambahkan data";
            }
            
            JOptionPane.showMessageDialog(null, msg);
            this.clear();
            getAllData();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }                                          

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {                                           
      // TODO add your handling code here:
        try {
           
            String name = tf_customer.getText();
            String table = tf_table.getText();
            String id_payment = tf_payment.getText();
            String payment_method = cb_method.getSelectedItem().toString();

            Date date = dp_date.getDate();

            model.setName(name);
            model.setTable(table);
            model.setId_payment(id_payment);
            model.setPayment_method(payment_method);
            model.setPayment(date);

            Boolean result = controller.update(this.order_database_id, model);
            
            String msg = "Gagal merubah data!";
            if(result) {
                msg = "Berhasil merubah data";
            }
            
            JOptionPane.showMessageDialog(null, msg);
            this.clear();
            this.getAllData();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }                                          

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {                                           
          // TODO add your handling code here:
        try {
            
            Boolean result = controller.delete(this.order_database_id);
            
            String msg = "Gagal menghapus data!";
            if(result) {
                msg = "Berhasil menghapus data";
            }
            
            JOptionPane.showMessageDialog(null, msg);
            
            this.clear();
            this.getAllData();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }                                          

    private void btn_search_idActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        search("id",tf_search.getText());
    }                                             

    private void btn_search_nameActionPerformed(java.awt.event.ActionEvent evt) {                                                
       // TODO add your handling code here:
        search("name",tf_search.getText());
    }                                               

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        new MenuFrame().show();
        this.dispose();
    }                                        

    private void search(String type, String query){
        try{
            if(query.isEmpty()){
                this.rs = controller.get();
            }
            else if(type.equals("id") && !query.isEmpty()){
                this.rs = controller.showById(query);
            }
            else if(type.equals("name") && !query.isEmpty()){
                this.rs = controller.showByName(query);
            }
            
            loadTable(this.rs);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_search_id;
    private javax.swing.JButton btn_search_name;
    private javax.swing.JButton btn_submit;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cb_method;
    private org.jdesktop.swingx.JXDatePicker dp_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_name;
    private javax.swing.JTable tb_product;
    private javax.swing.JTextField tf_customer;
    private javax.swing.JTextField tf_payment;
    private javax.swing.JTextField tf_search;
    private javax.swing.JTextField tf_table;
    // End of variables declaration                   
}
