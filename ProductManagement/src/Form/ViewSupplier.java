
package Form;

import Class.Supplier;
import Class.SupplierDB;
import PlugIn.SubDefaultTableModel;
import PlugIn.SubJTable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class ViewSupplier extends javax.swing.JPanel {

  private SupplierDB db = null ;
  private SubDefaultTableModel mod;
  private SubJTable stable;
  public ViewSupplier() {
    initComponents();
    th.start();
    stable = (SubJTable) table;
    mod = new SubDefaultTableModel();
    stable.setModel(mod);
    mod.addColumn("ID");
    mod.addColumn("Name");
    mod.addColumn("Gender");
    mod.addColumn("Phone");
    mod.addColumn("Email");
    mod.addColumn("Date");
    mod.addColumn("Address");
    mod.addColumn("Image");
    stable.setColumnWidth(0, 20);
    stable.setColumnWidth(1, 100);
    stable.setColumnWidth(2, 30);
    stable.setColumnWidth(3, 50);
    stable.setColumnWidth(4, 130);
    stable.setColumnWidth(5, 50);
    stable.setColumnWidth(6, 120);
    stable.setColumnWidth(7, 120);
  }
  public void setDB(SupplierDB db){
    this.db = db;
  }
  private Thread th = new Thread(new Runnable(){
    @Override
    public void run() {
      try {
        while(true){
          Date date = new Date();
          SimpleDateFormat sdf = new SimpleDateFormat("EEE,dd/MMM/yyyy hh:mm:ss a");
          lbDate.setText(sdf.format(date));
          Thread.sleep(1000);
        }
      } catch (Exception e) {
      }
    }
  });
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    pHeader = new javax.swing.JPanel();
    lbDate = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    table = new SubJTable();
    jLabel2 = new javax.swing.JLabel();
    txtName = new javax.swing.JTextField();
    btnSort = new javax.swing.JButton();
    btnRemove = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();

    setBackground(new java.awt.Color(204, 204, 255));
    setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

    pHeader.setBackground(new java.awt.Color(0, 102, 102));
    pHeader.setPreferredSize(new java.awt.Dimension(207, 50));

    lbDate.setFont(new java.awt.Font("AKbalthom KhmerGothic", 1, 14)); // NOI18N
    lbDate.setForeground(new java.awt.Color(255, 255, 255));
    lbDate.setText("Mon,12/Apil/2000 12:12:12 AM");

    javax.swing.GroupLayout pHeaderLayout = new javax.swing.GroupLayout(pHeader);
    pHeader.setLayout(pHeaderLayout);
    pHeaderLayout.setHorizontalGroup(
      pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pHeaderLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(lbDate)
        .addContainerGap())
    );
    pHeaderLayout.setVerticalGroup(
      pHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pHeaderLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lbDate, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        .addContainerGap())
    );

    table.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    table.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {

      }
    ));
    jScrollPane1.setViewportView(table);

    jLabel2.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel2.setText("Search Name");

    txtName.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtName.addCaretListener(new javax.swing.event.CaretListener() {
      public void caretUpdate(javax.swing.event.CaretEvent evt) {
        txtNameCaretUpdate(evt);
      }
    });

    btnSort.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    btnSort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sort_x24.png"))); // NOI18N
    btnSort.setText("Sort");
    btnSort.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSortActionPerformed(evt);
      }
    });

    btnRemove.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/waste_24px.png"))); // NOI18N
    btnRemove.setText("Remove");
    btnRemove.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRemoveActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Suppiler Information");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(pHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
      .addComponent(jScrollPane1)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnRemove)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addGap(18, 18, 18)
            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(6, 6, 6))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(pHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(5, 5, 5)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(6, 6, 6)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(jLabel2))
          .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(6, 6, 6)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        .addGap(6, 6, 6)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnRemove)
          .addComponent(btnSort)))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void txtNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNameCaretUpdate
    ArrayList<Supplier> ls = new ArrayList<>();
    String name = txtName.getText().toLowerCase();
    ls = db.getFiltterName(name);
    setElement(ls);
  }//GEN-LAST:event_txtNameCaretUpdate

  private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
    db.sortByName();
    setElement(db.getAll());
  }//GEN-LAST:event_btnSortActionPerformed

  private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
    while(!stable.getSelectionModel().isSelectionEmpty()){
      int index = stable.getSelectedRow();
      mod.removeRow(index);
      db.remove(index);
    }
  }//GEN-LAST:event_btnRemoveActionPerformed
  public void setElement(ArrayList<Supplier> ls){
    mod.removeAllRows();
    for(int i=0; i<ls.size(); i++)
      mod.addRow(ls.get(i).toString().split("\t"));
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnRemove;
  private javax.swing.JButton btnSort;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lbDate;
  private javax.swing.JPanel pHeader;
  private javax.swing.JTable table;
  private javax.swing.JTextField txtName;
  // End of variables declaration//GEN-END:variables
}
