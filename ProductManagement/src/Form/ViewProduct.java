package Form;

import Class.ProductDB;
import Class.ProductShopCls;
import PlugIn.SubDefaultTableModel;
import PlugIn.SubJTable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class ViewProduct extends javax.swing.JPanel {
  private SubJTable stable;
  private SubDefaultTableModel mod;
  private ProductDB db;
  public ViewProduct() {
    initComponents();
    th.start();
    stable = (SubJTable) table;
    mod = new SubDefaultTableModel();
    stable.setModel(mod);
    mod.addColumn("ID");
    mod.addColumn("Name");
    mod.addColumn("Category");
    mod.addColumn("Image");
    mod.addColumn("Total Qty");
    mod.addColumn("In Stuck");
    mod.addColumn("Out Stuck");
    mod.addColumn("Price In");
    mod.addColumn("Price Out");
    mod.addColumn("Date");
    stable.setColumnWidth(0, 20);
    stable.setColumnWidth(1, 100);
    stable.setColumnWidth(2, 50);
    stable.setColumnWidth(3, 300);
    stable.setColumnWidth(4, 30);
    stable.setColumnWidth(5, 30);
    stable.setColumnWidth(6, 30);
    stable.setColumnWidth(7, 30);
    stable.setColumnWidth(8, 30);
    stable.setColumnWidth(9, 100);
  }
  public void setDB(ProductDB db){
    this.db = db;
  }
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    pHeader = new javax.swing.JPanel();
    lbDate = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    table = new SubJTable();
    jLabel2 = new javax.swing.JLabel();
    txtName = new javax.swing.JTextField();
    btnRemove = new javax.swing.JButton();
    btnSort = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    btnViewData = new javax.swing.JButton();

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
    table.setRowHeight(20);
    jScrollPane1.setViewportView(table);

    jLabel2.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    jLabel2.setText("Search Name");

    txtName.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    txtName.addCaretListener(new javax.swing.event.CaretListener() {
      public void caretUpdate(javax.swing.event.CaretEvent evt) {
        txtNameCaretUpdate(evt);
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

    btnSort.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    btnSort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sort_x24.png"))); // NOI18N
    btnSort.setText("Sort");
    btnSort.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSortActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Product Information");

    btnViewData.setFont(new java.awt.Font("Kh Content", 1, 12)); // NOI18N
    btnViewData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Black_Eye_24.png"))); // NOI18N
    btnViewData.setText("View Data");
    btnViewData.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnViewDataActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(pHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
      .addComponent(jScrollPane1)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnViewData)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        .addGap(6, 6, 6)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(6, 6, 6)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(jLabel2))
          .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnRemove)
          .addComponent(btnSort)
          .addComponent(btnViewData))
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents

  private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
    while(!stable.getSelectionModel().isSelectionEmpty()){
      int index = stable.getSelectedRow();
      mod.removeRow(index);
      db.remove(index);
    }
  }//GEN-LAST:event_btnRemoveActionPerformed

  private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
    db.sortCategory();
    setElement(db.getAll());
  }//GEN-LAST:event_btnSortActionPerformed

  private void txtNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNameCaretUpdate
    ArrayList<ProductShopCls> ls = new ArrayList<>();
    String name = txtName.getText().toLowerCase();
    ls = db.getFiltterName(name);
    setElement(ls);
  }//GEN-LAST:event_txtNameCaretUpdate

  private void btnViewDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDataActionPerformed
   //Don't allow because it is for testing
//   Date date = new Date();
//   ProductShopCls pro[] = {
//                           //add beer
//                           new ProductShopCls(1, "ABC Bottle", "Beer", "E:/Java/ProductManagement/src/Product JPEG/ABC-Bottle.jpg", 500,0,0.7, 1, date),
//                           new ProductShopCls(2, "ABC can", "Beer", "E:/Java/ProductManagement/src/Product JPEG/ABC-Can.jpg", 500, 0, 0.5,0.7, date),
//                           new ProductShopCls(3, "Anchor Can", "Beer", "E:/Java/ProductManagement/src/Product JPEG/Anchor-Can.jpg", 500, 0,0.5, 0.6, date),
//                           new ProductShopCls(4, "Anchor Bottle", "Beer", "E:/Java/ProductManagement/src/Product JPEG/Anchor-Bottle.jpg", 500, 0,0.5, 0.6, date),
//                           new ProductShopCls(5, "Angkor Can", "Beer", "E:/Java/ProductManagement/src/Product JPEG/Angkor-Can.jpg", 500, 0,0.5, 0.6, date),
//                           new ProductShopCls(6, "Angkor Bottle", "Beer", "E:/Java/ProductManagement/src/Product JPEG/Angkor-Bottle.jpg", 500,0, 0.5, 0.6, date),
//                           new ProductShopCls(7, "Tiger Can", "Beer", "E:/Java/ProductManagement/src/Product JPEG/Tiger-Can.jpg", 500, 0, 0.5,0.6, date),
//                           new ProductShopCls(8, "Tiger Bottle", "Beer", "E:/Java/ProductManagement/src/Product JPEG/Tiger-Bottle.jpg", 500,0, 0.5, 0.6, date),
//                           new ProductShopCls(9, "Cambodia Can", "Beer", "E:/Java/ProductManagement/src/Product JPEG/Cambodia-Can.jpg", 500, 0,0.5, 0.6, date),
//                           new ProductShopCls(10, "Cambodia Bottle", "Beer", "E:/Java/ProductManagement/src/Product JPEG/Cambodia-Bottle.jpg", 500,0, 0.5, 0.6, date),
//                           //add Drink
//                           new ProductShopCls(11, "Apple Juice", "Drink", "E:/Java/ProductManagement/src/Product JPEG/Apple-Juice.jpg", 500,0, 0.5, 0.6, date),
//                           new ProductShopCls(12, "Carabao", "Drink", "E:/Java/ProductManagement/src/Product JPEG/Carabao.jpg", 500,0, 0.5, 0.6, date),
//                           new ProductShopCls(13, "Coca Bottle", "Drink", "E:/Java/ProductManagement/src/Product JPEG/Coca-Bottle.jpg", 500,0, 0.5, 0.6, date),
//                           new ProductShopCls(14, "Coca Can", "Drink", "E:/Java/ProductManagement/src/Product JPEG/Coca-Can.jpg", 500,0, 0.5, 0.6, date),
//                           new ProductShopCls(15, "Coca Zero", "Drink", "E:/Java/ProductManagement/src/Product JPEG/Coca-Zero.jpg", 500,0, 0.5, 0.6, date),
//                           new ProductShopCls(16, "Grape Fanta", "Drink", "E:/Java/ProductManagement/src/Product JPEG/Grape-Fanta.jpg", 500,0, 0.5, 0.6, date),
//                           new ProductShopCls(17, "Monster", "Drink", "E:/Java/ProductManagement/src/Product JPEG/Monster.jpg", 500,0, 0.5, 0.6, date),
//                           //add food
//                           new ProductShopCls(18, "Canned fish", "Food", "E:/Java/ProductManagement/src/Product JPEG/Canned-fish.jpg", 500,0, 0.5, 0.6, date),
//                           new ProductShopCls(19, "Good Nodle", "Food", "E:/Java/ProductManagement/src/Product JPEG/Good-Nodle.jpg", 500,0, 0.5, 0.6, date),
//                           new ProductShopCls(20, "Hot Dog", "Food", "E:/Java/ProductManagement/src/Product JPEG/HotDog.jpg", 500,0, 0.5, 0.6, date),
//                           new ProductShopCls(21, "Hot Pot", "Food", "E:/Java/ProductManagement/src/Product JPEG/Hotpot.jpg", 500,0, 0.5, 0.6, date),
//                           new ProductShopCls(22, "Red Panda Nodle", "Food", "E:/Java/ProductManagement/src/Product JPEG/Red-Panda-Nodle.jpg", 500,0, 0.5, 0.6, date),
//                           };
//   if(db.getAll()!=null){
//      for(int i=0; i<pro.length; i++){
//        db.add(pro[i]);
//      }
//       setElement(db.getAll());
//       System.out.println(db.size());
//   }
  }//GEN-LAST:event_btnViewDataActionPerformed
  public void setElement(ArrayList<ProductShopCls> ls){
    mod.removeAllRows();
    for(int i=0; i<ls.size(); i++)
        mod.addRow(ls.get(i).toString().split("\t"));    
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

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnRemove;
  private javax.swing.JButton btnSort;
  private javax.swing.JButton btnViewData;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lbDate;
  private javax.swing.JPanel pHeader;
  private javax.swing.JTable table;
  private javax.swing.JTextField txtName;
  // End of variables declaration//GEN-END:variables
}
