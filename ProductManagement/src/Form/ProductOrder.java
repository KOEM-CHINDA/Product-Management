
package Form;
import Class.BuyCls;
import Class.BuyProduct;
import Class.ProductDB;
import Class.ProductShopCls;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
/**
 *
 * @author CHINDA
 */
public class ProductOrder extends javax.swing.JFrame {
  private ProductDB db = new ProductDB();
  private BuyProduct buyDB;
  private final Color hover = new Color(245, 66, 152);
  private final Color exit = new Color(204,204,255);
  private final Color click = new Color(154,154,104);
  private boolean hide = true;
  ProductInfor pro = new ProductInfor();
  ViewOrder view = new ViewOrder(this, true);
  public ProductOrder() {
    initComponents();
    buyDB = new BuyProduct();
    Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
    this.setSize(ds);
    //pro.setDB(buyDB);
    view.setDB(buyDB);
    setItem(db.getAll(), "Beer");
  }
  public void setItem(ArrayList<ProductShopCls> ls, String category){
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10, 10, 10, 10);
    int x = 0;
    int y = 0;
    pMain.removeAll();
    for(int i=0; i<ls.size(); i++){
      ProductInfor pro = new ProductInfor();
      gbc.gridx = x;
      gbc.gridy = y;
      if(db.get(i).getCategory().equals(category)){
        pro.setId(ls.get(i).getId());
        pro.setImage(new ImageIcon(ls.get(i).getImage()));
        pro.setName(ls.get(i).getName());
        pro.setCategory(ls.get(i).getCategory());
        pro.setPrice(ls.get(i).getPriceOut());
        pMain.add(pro, gbc);
        x++;
        if(x==5){
          x=0;
          y++;
        }
      }
    }
    pMain.validate();
    pMain.repaint();
  }
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    pNavigation = new javax.swing.JPanel();
    pSubNavigation = new javax.swing.JPanel();
    pBack = new javax.swing.JPanel();
    lbBack = new javax.swing.JLabel();
    pSubNavigationHome = new javax.swing.JPanel();
    lbMenu = new javax.swing.JLabel();
    pMenu = new javax.swing.JPanel();
    pHeader = new javax.swing.JPanel();
    lbProduct = new javax.swing.JLabel();
    pBeer = new javax.swing.JPanel();
    lbBeer = new javax.swing.JLabel();
    pDrink = new javax.swing.JPanel();
    lbDrink = new javax.swing.JLabel();
    pFood = new javax.swing.JPanel();
    lbFood = new javax.swing.JLabel();
    pSnack = new javax.swing.JPanel();
    lbSnack = new javax.swing.JLabel();
    pWine = new javax.swing.JPanel();
    lbWine = new javax.swing.JLabel();
    pAddTocard = new javax.swing.JPanel();
    lbAddToCard = new javax.swing.JLabel();
    pHome = new javax.swing.JPanel();
    lbHome = new javax.swing.JLabel();
    pExit = new javax.swing.JPanel();
    lbExit = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    pMain = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Product Order");

    pNavigation.setPreferredSize(new java.awt.Dimension(200, 633));

    pSubNavigation.setBackground(new java.awt.Color(51, 51, 51));
    pSubNavigation.setPreferredSize(new java.awt.Dimension(50, 633));

    pBack.setBackground(new java.awt.Color(51, 51, 51));
    pBack.setLayout(new java.awt.BorderLayout());

    lbBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lbBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/next_x24.png"))); // NOI18N
    lbBack.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbBackMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbBackMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbBackMouseExited(evt);
      }
    });
    pBack.add(lbBack, java.awt.BorderLayout.CENTER);

    pSubNavigationHome.setBackground(new java.awt.Color(51, 51, 51));
    pSubNavigationHome.setLayout(new java.awt.BorderLayout());

    lbMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lbMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu_24px.png"))); // NOI18N
    pSubNavigationHome.add(lbMenu, java.awt.BorderLayout.CENTER);

    javax.swing.GroupLayout pSubNavigationLayout = new javax.swing.GroupLayout(pSubNavigation);
    pSubNavigation.setLayout(pSubNavigationLayout);
    pSubNavigationLayout.setHorizontalGroup(
      pSubNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(pBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addComponent(pSubNavigationHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    pSubNavigationLayout.setVerticalGroup(
      pSubNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pSubNavigationLayout.createSequentialGroup()
        .addComponent(pBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(pSubNavigationHome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    pMenu.setBackground(new java.awt.Color(204, 204, 255));

    pHeader.setBackground(new java.awt.Color(0, 102, 102));
    pHeader.setLayout(new java.awt.BorderLayout());

    lbProduct.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user_groups_24.png"))); // NOI18N
    lbProduct.setText("Smart Shop");
    pHeader.add(lbProduct, java.awt.BorderLayout.CENTER);

    pBeer.setBackground(new java.awt.Color(204, 204, 255));
    pBeer.setLayout(new java.awt.BorderLayout());

    lbBeer.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbBeer.setText("Beer");
    lbBeer.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbBeerMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbBeerMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbBeerMouseExited(evt);
      }
    });
    pBeer.add(lbBeer, java.awt.BorderLayout.CENTER);

    pDrink.setBackground(new java.awt.Color(204, 204, 255));
    pDrink.setLayout(new java.awt.BorderLayout());

    lbDrink.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbDrink.setText("Drink");
    lbDrink.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbDrinkMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbDrinkMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbDrinkMouseExited(evt);
      }
    });
    pDrink.add(lbDrink, java.awt.BorderLayout.CENTER);

    pFood.setBackground(new java.awt.Color(204, 204, 255));
    pFood.setLayout(new java.awt.BorderLayout());

    lbFood.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbFood.setText("Food");
    lbFood.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbFoodMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbFoodMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbFoodMouseExited(evt);
      }
    });
    pFood.add(lbFood, java.awt.BorderLayout.CENTER);

    pSnack.setBackground(new java.awt.Color(204, 204, 255));
    pSnack.setLayout(new java.awt.BorderLayout());

    lbSnack.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbSnack.setText("Snack");
    lbSnack.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbSnackMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbSnackMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbSnackMouseExited(evt);
      }
    });
    pSnack.add(lbSnack, java.awt.BorderLayout.CENTER);

    pWine.setBackground(new java.awt.Color(204, 204, 255));
    pWine.setLayout(new java.awt.BorderLayout());

    lbWine.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbWine.setText("Wine");
    lbWine.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbWineMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbWineMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbWineMouseExited(evt);
      }
    });
    pWine.add(lbWine, java.awt.BorderLayout.CENTER);

    pAddTocard.setBackground(new java.awt.Color(204, 204, 255));
    pAddTocard.setLayout(new java.awt.BorderLayout());

    lbAddToCard.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbAddToCard.setText("View Order");
    lbAddToCard.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbAddToCardMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbAddToCardMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbAddToCardMouseExited(evt);
      }
    });
    pAddTocard.add(lbAddToCard, java.awt.BorderLayout.CENTER);

    pHome.setBackground(new java.awt.Color(204, 204, 255));
    pHome.setLayout(new java.awt.BorderLayout());

    lbHome.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home_24.png"))); // NOI18N
    lbHome.setText("Home");
    lbHome.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbHomeMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbHomeMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbHomeMouseExited(evt);
      }
    });
    pHome.add(lbHome, java.awt.BorderLayout.CENTER);

    pExit.setBackground(new java.awt.Color(204, 204, 255));
    pExit.setLayout(new java.awt.BorderLayout());

    lbExit.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_24px.png"))); // NOI18N
    lbExit.setText("Exit");
    lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbExitMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbExitMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbExitMouseExited(evt);
      }
    });
    pExit.add(lbExit, java.awt.BorderLayout.CENTER);

    javax.swing.GroupLayout pMenuLayout = new javax.swing.GroupLayout(pMenu);
    pMenu.setLayout(pMenuLayout);
    pMenuLayout.setHorizontalGroup(
      pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(pHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addComponent(pBeer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addComponent(pDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addComponent(pFood, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addComponent(pSnack, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addComponent(pWine, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addComponent(pAddTocard, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addComponent(pHome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addComponent(pExit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    pMenuLayout.setVerticalGroup(
      pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pMenuLayout.createSequentialGroup()
        .addComponent(pHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(pBeer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(pDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(pFood, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(pSnack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(pWine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(pAddTocard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(pHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(pExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout pNavigationLayout = new javax.swing.GroupLayout(pNavigation);
    pNavigation.setLayout(pNavigationLayout);
    pNavigationLayout.setHorizontalGroup(
      pNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pNavigationLayout.createSequentialGroup()
        .addComponent(pSubNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(pMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    pNavigationLayout.setVerticalGroup(
      pNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pNavigationLayout.createSequentialGroup()
        .addComponent(pSubNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
      .addComponent(pMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    getContentPane().add(pNavigation, java.awt.BorderLayout.LINE_START);

    pMain.setBackground(new java.awt.Color(204, 204, 255));
    pMain.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    pMain.setLayout(new java.awt.GridBagLayout());
    jScrollPane2.setViewportView(pMain);

    getContentPane().add(jScrollPane2, java.awt.BorderLayout.CENTER);

    setBounds(0, 0, 1173, 837);
  }// </editor-fold>//GEN-END:initComponents

  private void lbBeerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBeerMouseClicked
    pBeer.setBackground(click);
    setItem(db.getAll(), "Beer");
    
  }//GEN-LAST:event_lbBeerMouseClicked

  private void lbBeerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBeerMouseEntered
    pBeer.setBackground(hover);
  }//GEN-LAST:event_lbBeerMouseEntered

  private void lbBeerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBeerMouseExited
    pBeer.setBackground(exit);
  }//GEN-LAST:event_lbBeerMouseExited

  private void lbDrinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDrinkMouseClicked
    pDrink.setBackground(click);
    setItem(db.getAll(), "Drink");
  }//GEN-LAST:event_lbDrinkMouseClicked

  private void lbDrinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDrinkMouseEntered
    pDrink.setBackground(hover);
  }//GEN-LAST:event_lbDrinkMouseEntered

  private void lbDrinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDrinkMouseExited
    pDrink.setBackground(exit);
  }//GEN-LAST:event_lbDrinkMouseExited

  private void lbFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFoodMouseClicked
    pFood.setBackground(click);
    setItem(db.getAll(), "Food");
    
  }//GEN-LAST:event_lbFoodMouseClicked

  private void lbFoodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFoodMouseEntered
    pFood.setBackground(hover);
  }//GEN-LAST:event_lbFoodMouseEntered

  private void lbFoodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFoodMouseExited
    pFood.setBackground(exit);
  }//GEN-LAST:event_lbFoodMouseExited

  private void lbSnackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSnackMouseClicked
    pSnack.setBackground(click);
    setItem(db.getAll(), "Snack");
  }//GEN-LAST:event_lbSnackMouseClicked

  private void lbSnackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSnackMouseEntered
    pSnack.setBackground(hover);
  }//GEN-LAST:event_lbSnackMouseEntered

  private void lbSnackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSnackMouseExited
    pSnack.setBackground(exit);
  }//GEN-LAST:event_lbSnackMouseExited

  private void lbWineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbWineMouseClicked
    pWine.setBackground(click);
    setItem(db.getAll(), "Wine");
  }//GEN-LAST:event_lbWineMouseClicked

  private void lbWineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbWineMouseEntered
    pWine.setBackground(hover);
  }//GEN-LAST:event_lbWineMouseEntered

  private void lbWineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbWineMouseExited
    pWine.setBackground(exit);
  }//GEN-LAST:event_lbWineMouseExited

  private void lbAddToCardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAddToCardMouseClicked
    pAddTocard.setBackground(click);
    
    if(buyDB.getAll()!=null){
      view.setElement(buyDB.getAll());
    }
    view.setVisible(true);
    
  }//GEN-LAST:event_lbAddToCardMouseClicked

  private void lbAddToCardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAddToCardMouseEntered
    pAddTocard.setBackground(hover);
  }//GEN-LAST:event_lbAddToCardMouseEntered

  private void lbAddToCardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAddToCardMouseExited
    pAddTocard.setBackground(exit);
  }//GEN-LAST:event_lbAddToCardMouseExited

  private void lbHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseClicked
    removeElement(buyDB.getAll());
    LogIn.main(null);
    this.dispose();
    
  }//GEN-LAST:event_lbHomeMouseClicked

  private void lbHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseEntered
    pHome.setBackground(hover);
  }//GEN-LAST:event_lbHomeMouseEntered

  private void lbHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseExited
    pHome.setBackground(exit);
  }//GEN-LAST:event_lbHomeMouseExited

  private void lbBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBackMouseClicked
    pBack.setBackground(click);
    if(hide == true){
      Icon icon = new ImageIcon(getClass().getResource("/Images/previous_x24.png"));
      lbBack.setIcon(icon);
      this.pNavigation.setPreferredSize(new Dimension(50,pNavigation.getHeight()));
      SwingUtilities.updateComponentTreeUI(this);
      hide = false;
    }else{
      Icon icon = new ImageIcon(getClass().getResource("/Images/next_x24.png"));
      lbBack.setIcon(icon);
      pNavigation.setPreferredSize(new Dimension(200,pNavigation.getHeight()));
      SwingUtilities.updateComponentTreeUI(this);
      hide = true;
    }
  }//GEN-LAST:event_lbBackMouseClicked

  private void lbBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBackMouseEntered
    pBack.setBackground(hover);
  }//GEN-LAST:event_lbBackMouseEntered

  private void lbBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBackMouseExited
    pBack.setBackground(new Color(51, 51, 51));
  }//GEN-LAST:event_lbBackMouseExited

  private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
    pExit.setBackground(click);
    int press = JOptionPane.showConfirmDialog(this, "Do you want to exit?","Exit",JOptionPane.YES_NO_OPTION);
    if(press == JOptionPane.YES_OPTION)
    System.exit(0);
  }//GEN-LAST:event_lbExitMouseClicked

  private void lbExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseEntered
    pExit.setBackground(hover);
  }//GEN-LAST:event_lbExitMouseEntered

  private void lbExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseExited
    pExit.setBackground(exit);
  }//GEN-LAST:event_lbExitMouseExited
  private void removeElement(ArrayList<BuyCls> ls){
    for(int i=ls.size()-1; i>=0; i--)
      ls.remove(i);
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
      java.util.logging.Logger.getLogger(ProductOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(ProductOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(ProductOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(ProductOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ProductOrder().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JLabel lbAddToCard;
  private javax.swing.JLabel lbBack;
  private javax.swing.JLabel lbBeer;
  private javax.swing.JLabel lbDrink;
  private javax.swing.JLabel lbExit;
  private javax.swing.JLabel lbFood;
  private javax.swing.JLabel lbHome;
  private javax.swing.JLabel lbMenu;
  private javax.swing.JLabel lbProduct;
  private javax.swing.JLabel lbSnack;
  private javax.swing.JLabel lbWine;
  private javax.swing.JPanel pAddTocard;
  private javax.swing.JPanel pBack;
  private javax.swing.JPanel pBeer;
  private javax.swing.JPanel pDrink;
  private javax.swing.JPanel pExit;
  private javax.swing.JPanel pFood;
  private javax.swing.JPanel pHeader;
  private javax.swing.JPanel pHome;
  private javax.swing.JPanel pMain;
  private javax.swing.JPanel pMenu;
  private javax.swing.JPanel pNavigation;
  private javax.swing.JPanel pSnack;
  private javax.swing.JPanel pSubNavigation;
  private javax.swing.JPanel pSubNavigationHome;
  private javax.swing.JPanel pWine;
  // End of variables declaration//GEN-END:variables
}
