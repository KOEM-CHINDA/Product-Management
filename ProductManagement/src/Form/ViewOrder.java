
package Form;

import Class.BuyCls;
import Class.BuyProduct;
import Class.ProductDB;
import Class.ProductShopCls;
import PlugIn.SubDefaultTableModel;
import PlugIn.SubJTable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author CHINDA
 */
public class ViewOrder extends javax.swing.JDialog {

  private BuyProduct db;
  private ProductDB proDB = new ProductDB();
  private SubDefaultTableModel mod;
  private SubJTable stable;
  public ViewOrder(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    stable = (SubJTable)table;
    mod = new SubDefaultTableModel();
    stable.setModel(mod);
    mod.addColumn("ID");
    mod.addColumn("Name");
    mod.addColumn("Category");
    mod.addColumn("Qty");
    mod.addColumn("Price");
    mod.addColumn("Amout");
    
  }
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel2 = new javax.swing.JPanel();
    jScrollPane3 = new javax.swing.JScrollPane();
    table = new SubJTable();
    btnOK = new javax.swing.JButton();
    btnCancle = new javax.swing.JButton();
    txtTotal = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("View Order");
    setBackground(new java.awt.Color(204, 51, 0));
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosing(java.awt.event.WindowEvent evt) {
        formWindowClosing(evt);
      }
    });

    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    table.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    table.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {

      }
    ));
    table.setRowHeight(20);
    jScrollPane3.setViewportView(table);

    jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 339));

    btnOK.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    btnOK.setText("OK");
    btnOK.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnOKActionPerformed(evt);
      }
    });
    jPanel2.add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 73, -1));

    btnCancle.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    btnCancle.setText("Cancel");
    btnCancle.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCancleActionPerformed(evt);
      }
    });
    jPanel2.add(btnCancle, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 73, -1));

    txtTotal.setFont(new java.awt.Font("Kh Content", 1, 14)); // NOI18N
    txtTotal.setText("Total: $ 00.00");
    txtTotal.setFocusable(false);
    jPanel2.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 180, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
    JOptionPane.showMessageDialog(this, "Please Refresh Product Order");
    for(int i=0; i<db.size();i++)
      for(int j=0; j<proDB.size(); j++)
        if(db.get(i).getId()==proDB.get(j).getId()){
          int temp = proDB.get(j).getOutStuck();
          proDB.get(j).setOutStuck(db.get(i).getQty()+temp);
          break;
        }
    db.removeAll();
    mod.removeAllRows();
    this.dispose();
    System.out.println(db.size());
  }//GEN-LAST:event_btnOKActionPerformed

  private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
    this.dispose();
  }//GEN-LAST:event_btnCancleActionPerformed

  private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
  this.dispose();
  }//GEN-LAST:event_formWindowClosing
  public void setDB(BuyProduct db){
    this.db = db;
  }
  public void setElement(ArrayList<BuyCls> ls){
    double amount = 0;
    DecimalFormat df = new DecimalFormat("$ #,##0.00");
    mod.removeAllRows();
    for(int i=0; i<ls.size(); i++){
      mod.addRow(ls.get(i).toString().split("\t"));
      amount += ls.get(i).amount();
    }
    txtTotal.setText("Total:"+df.format(amount));
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
      java.util.logging.Logger.getLogger(ViewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(ViewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(ViewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(ViewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        ViewOrder dialog = new ViewOrder(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCancle;
  private javax.swing.JButton btnOK;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JTable table;
  private javax.swing.JTextField txtTotal;
  // End of variables declaration//GEN-END:variables
}
