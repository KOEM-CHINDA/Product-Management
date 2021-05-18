
package Form;

import Class.ProductDB;
import Class.ProductShopCls;
import PlugIn.SubDefaultTableModel;
import PlugIn.SubJTable;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class ProductList extends javax.swing.JFrame {
  private ProductDB db;
  private SubJTable stable;
  private SubDefaultTableModel mod;
  public ProductList() {
    initComponents();
  }
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    pHeader = new javax.swing.JPanel();
    lbDate = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    txtName = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    table = new SubJTable();
    btnExit = new javax.swing.JButton();
    btnHome = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setUndecorated(true);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });

    pHeader.setBackground(new java.awt.Color(0, 102, 102));
    pHeader.setPreferredSize(new java.awt.Dimension(207, 48));

    lbDate.setFont(new java.awt.Font("AKbalthom KhmerGothic", 1, 14)); // NOI18N
    lbDate.setForeground(new java.awt.Color(255, 255, 255));
    lbDate.setText("Mon,12/Apil/2000 12:12:12 AM");

    javax.swing.GroupLayout pHeaderLayout = new javax.swing.GroupLayout(pHeader);
    pHeader.setLayout(pHeaderLayout);
    pHeaderLayout.setHorizontalGroup(
      pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pHeaderLayout.createSequentialGroup()
        .addContainerGap(563, Short.MAX_VALUE)
        .addComponent(lbDate)
        .addContainerGap())
    );
    pHeaderLayout.setVerticalGroup(
      pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pHeaderLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lbDate, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        .addContainerGap())
    );

    jLabel1.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Product Information");

    jLabel2.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel2.setText("Search Name");

    txtName.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtName.addCaretListener(new javax.swing.event.CaretListener() {
      public void caretUpdate(javax.swing.event.CaretEvent evt) {
        txtNameCaretUpdate(evt);
      }
    });

    table.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    table.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {

      }
    ));
    jScrollPane1.setViewportView(table);

    btnExit.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_24px.png"))); // NOI18N
    btnExit.setText("Exit");
    btnExit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnExitActionPerformed(evt);
      }
    });

    btnHome.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home_24.png"))); // NOI18N
    btnHome.setText("Home");
    btnHome.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnHomeActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(pHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
      .addComponent(jScrollPane1)
      .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(btnHome)
        .addGap(18, 18, 18)
        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel2)
        .addGap(18, 18, 18)
        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(pHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(jLabel2))
          .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnExit)
          .addComponent(btnHome))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txtNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNameCaretUpdate
    ArrayList<ProductShopCls> ls = new ArrayList<>();
    String name = txtName.getText().toLowerCase();
    ls = db.getFiltterName(name);
    setElement(ls);
  }//GEN-LAST:event_txtNameCaretUpdate

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(ds);
    th.start();
    db = new ProductDB();
    stable = (SubJTable)table;
    mod = new SubDefaultTableModel();
    stable.setModel(mod);
    mod.addColumn("ID");
    mod.addColumn("Name");
    mod.addColumn("Category");
    mod.addColumn("Image");
    mod.addColumn("Qty");
    mod.addColumn("Price In");
    mod.addColumn("Price Out");
    stable.setColumnWidth(0, 20);
    stable.setColumnWidth(1, 100);
    stable.setColumnWidth(2, 50);
    stable.setColumnWidth(3, 120);
    stable.setColumnWidth(4, 50);
    stable.setColumnWidth(5, 50);
    stable.setColumnWidth(6, 50);
    if(db.getAll()!=null)
      setElement(db.getAll());
  }//GEN-LAST:event_formWindowOpened

  private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
    LogIn.main(null);
    this.dispose();
  }//GEN-LAST:event_btnHomeActionPerformed

  private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
    int click = JOptionPane.showConfirmDialog(this, "Do you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
    if(click == JOptionPane.YES_OPTION)
      System.exit(0);
  }//GEN-LAST:event_btnExitActionPerformed
  private Thread th = new Thread(new Runnable() {
    @Override
    public void run() {
      try {
        while(true){
          Date date  = new Date();
          SimpleDateFormat sdf = new SimpleDateFormat("EEE,dd/MMMM/yyyy hh:mm:ss a");
          lbDate.setText(sdf.format(date));
          Thread.sleep(1000);
        }
      } catch (Exception e) {
      }
    }
  });
  private void setElement(ArrayList<ProductShopCls> ls){
    mod.removeAllRows();
    for(int i=0; i<ls.size();i++)
      mod.addRow(ls.get(i).viewProduct().split("\t"));
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
      java.util.logging.Logger.getLogger(ProductList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(ProductList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(ProductList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(ProductList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ProductList().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnExit;
  private javax.swing.JButton btnHome;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lbDate;
  private javax.swing.JPanel pHeader;
  private javax.swing.JTable table;
  private javax.swing.JTextField txtName;
  // End of variables declaration//GEN-END:variables
}
