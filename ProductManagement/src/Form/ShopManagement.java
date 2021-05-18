
package Form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import Class.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class ShopManagement extends javax.swing.JFrame {
  private final Color hover = new Color(245, 66, 152);
  private final Color exit = new Color(204,204,255);
  private final Color click = new Color(154,154,104);
  private boolean hide = true;
  private ProductDB dbPro;
  private SupplierDB dbSup;
  private AccountDB dbUser;
  AddProduct pProduct = new AddProduct();
  AddSupplier pSupplier = new AddSupplier();
  ViewProduct vPro = new ViewProduct();
  ViewSupplier vSup = new ViewSupplier();
  UserLogIn userLogIn = new UserLogIn();
  About about = new About();
  public ShopManagement() {
    initComponents();
  }
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    pNavigation = new javax.swing.JPanel();
    pSubNavigation = new javax.swing.JPanel();
    pBack = new javax.swing.JPanel();
    lbBack = new javax.swing.JLabel();
    pHomeNavigation = new javax.swing.JPanel();
    lbHome = new javax.swing.JLabel();
    pSetting = new javax.swing.JPanel();
    lbSetting = new javax.swing.JLabel();
    pMenu = new javax.swing.JPanel();
    pSubMenu = new javax.swing.JPanel();
    pHeader = new javax.swing.JPanel();
    lbProduct = new javax.swing.JLabel();
    pAddProduct = new javax.swing.JPanel();
    lbProduct1 = new javax.swing.JLabel();
    pAddSupplier = new javax.swing.JPanel();
    lbSupplier = new javax.swing.JLabel();
    pViewProduct = new javax.swing.JPanel();
    lbSupplier1 = new javax.swing.JLabel();
    pViewSupplier = new javax.swing.JPanel();
    lbSupplier2 = new javax.swing.JLabel();
    pViewUserLogIn = new javax.swing.JPanel();
    lbUser = new javax.swing.JLabel();
    pExit = new javax.swing.JPanel();
    lbSupplier3 = new javax.swing.JLabel();
    pSubSetting = new javax.swing.JPanel();
    pAbout = new javax.swing.JPanel();
    lbSupplier4 = new javax.swing.JLabel();
    pHome = new javax.swing.JPanel();
    lbProduct2 = new javax.swing.JLabel();
    pHeader1 = new javax.swing.JPanel();
    lbProduct3 = new javax.swing.JLabel();
    pMain = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setUndecorated(true);
    setPreferredSize(new java.awt.Dimension(607, 393));
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });

    pNavigation.setPreferredSize(new java.awt.Dimension(200, 575));
    pNavigation.setLayout(new java.awt.BorderLayout());

    pSubNavigation.setBackground(new java.awt.Color(51, 51, 51));
    pSubNavigation.setPreferredSize(new java.awt.Dimension(50, 575));
    pSubNavigation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

    pSubNavigation.add(pBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

    pHomeNavigation.setBackground(new java.awt.Color(51, 51, 51));
    pHomeNavigation.setLayout(new java.awt.BorderLayout());

    lbHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lbHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu_24px.png"))); // NOI18N
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
    pHomeNavigation.add(lbHome, java.awt.BorderLayout.CENTER);

    pSubNavigation.add(pHomeNavigation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 50, 34));

    pSetting.setBackground(new java.awt.Color(51, 51, 51));
    pSetting.setLayout(new java.awt.BorderLayout());

    lbSetting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lbSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings_24px.png"))); // NOI18N
    lbSetting.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbSettingMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbSettingMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbSettingMouseExited(evt);
      }
    });
    pSetting.add(lbSetting, java.awt.BorderLayout.CENTER);

    pSubNavigation.add(pSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 95, 50, 34));

    pNavigation.add(pSubNavigation, java.awt.BorderLayout.LINE_START);

    pMenu.setBackground(new java.awt.Color(204, 204, 255));
    pMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    pSubMenu.setBackground(new java.awt.Color(204, 204, 255));
    pSubMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    pHeader.setBackground(new java.awt.Color(0, 102, 102));
    pHeader.setLayout(new java.awt.BorderLayout());

    lbProduct.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user_groups_24.png"))); // NOI18N
    lbProduct.setText("Smart Shop");
    pHeader.add(lbProduct, java.awt.BorderLayout.CENTER);

    pSubMenu.add(pHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

    pAddProduct.setBackground(new java.awt.Color(204, 204, 255));
    pAddProduct.setLayout(new java.awt.BorderLayout());

    lbProduct1.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbProduct1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus_x24.png"))); // NOI18N
    lbProduct1.setText("Add Product");
    lbProduct1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbProduct1MouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbProduct1MouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbProduct1MouseExited(evt);
      }
    });
    pAddProduct.add(lbProduct1, java.awt.BorderLayout.CENTER);

    pSubMenu.add(pAddProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, 40));

    pAddSupplier.setBackground(new java.awt.Color(204, 204, 255));
    pAddSupplier.setLayout(new java.awt.BorderLayout());

    lbSupplier.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/supplier_24px.png"))); // NOI18N
    lbSupplier.setText("Add Supplier");
    lbSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbSupplierMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbSupplierMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbSupplierMouseExited(evt);
      }
    });
    pAddSupplier.add(lbSupplier, java.awt.BorderLayout.CENTER);

    pSubMenu.add(pAddSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 150, 40));

    pViewProduct.setBackground(new java.awt.Color(204, 204, 255));
    pViewProduct.setLayout(new java.awt.BorderLayout());

    lbSupplier1.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbSupplier1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/coins_24px.png"))); // NOI18N
    lbSupplier1.setText("View Product");
    lbSupplier1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbSupplier1MouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbSupplier1MouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbSupplier1MouseExited(evt);
      }
    });
    pViewProduct.add(lbSupplier1, java.awt.BorderLayout.CENTER);

    pSubMenu.add(pViewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 150, 40));

    pViewSupplier.setBackground(new java.awt.Color(204, 204, 255));
    pViewSupplier.setLayout(new java.awt.BorderLayout());

    lbSupplier2.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbSupplier2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/database_view_24px.png"))); // NOI18N
    lbSupplier2.setText("View Supplier");
    lbSupplier2.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbSupplier2MouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbSupplier2MouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbSupplier2MouseExited(evt);
      }
    });
    pViewSupplier.add(lbSupplier2, java.awt.BorderLayout.CENTER);

    pSubMenu.add(pViewSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 150, 40));

    pViewUserLogIn.setBackground(new java.awt.Color(204, 204, 255));
    pViewUserLogIn.setLayout(new java.awt.BorderLayout());

    lbUser.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User_x24.png"))); // NOI18N
    lbUser.setText("User LogIn");
    lbUser.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbUserMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbUserMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbUserMouseExited(evt);
      }
    });
    pViewUserLogIn.add(lbUser, java.awt.BorderLayout.CENTER);

    pSubMenu.add(pViewUserLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 150, 40));

    pExit.setBackground(new java.awt.Color(204, 204, 255));
    pExit.setLayout(new java.awt.BorderLayout());

    lbSupplier3.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbSupplier3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_24px.png"))); // NOI18N
    lbSupplier3.setText("Exit");
    lbSupplier3.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbSupplier3MouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbSupplier3MouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbSupplier3MouseExited(evt);
      }
    });
    pExit.add(lbSupplier3, java.awt.BorderLayout.CENTER);

    pSubMenu.add(pExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 150, 40));

    pMenu.add(pSubMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 570));

    pSubSetting.setBackground(new java.awt.Color(204, 204, 255));
    pSubSetting.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    pAbout.setBackground(new java.awt.Color(204, 204, 255));
    pAbout.setLayout(new java.awt.BorderLayout());

    lbSupplier4.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbSupplier4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/high_importance_24px.png"))); // NOI18N
    lbSupplier4.setText("About");
    lbSupplier4.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbSupplier4MouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbSupplier4MouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbSupplier4MouseExited(evt);
      }
    });
    pAbout.add(lbSupplier4, java.awt.BorderLayout.CENTER);

    pSubSetting.add(pAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 150, 40));

    pHome.setBackground(new java.awt.Color(204, 204, 255));
    pHome.setLayout(new java.awt.BorderLayout());

    lbProduct2.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbProduct2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home_24.png"))); // NOI18N
    lbProduct2.setText("Home");
    lbProduct2.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lbProduct2MouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        lbProduct2MouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        lbProduct2MouseExited(evt);
      }
    });
    pHome.add(lbProduct2, java.awt.BorderLayout.CENTER);

    pSubSetting.add(pHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, 40));

    pHeader1.setBackground(new java.awt.Color(0, 102, 102));
    pHeader1.setLayout(new java.awt.BorderLayout());

    lbProduct3.setFont(new java.awt.Font("Kh Content", 1, 18)); // NOI18N
    lbProduct3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user_groups_24.png"))); // NOI18N
    lbProduct3.setText("Smart Shop");
    pHeader1.add(lbProduct3, java.awt.BorderLayout.CENTER);

    pSubSetting.add(pHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

    pMenu.add(pSubSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 570));

    pNavigation.add(pMenu, java.awt.BorderLayout.CENTER);

    getContentPane().add(pNavigation, java.awt.BorderLayout.LINE_START);

    pMain.setBackground(new java.awt.Color(204, 204, 255));
    pMain.setLayout(new java.awt.BorderLayout());
    getContentPane().add(pMain, java.awt.BorderLayout.CENTER);

    setBounds(0, 0, 983, 575);
  }// </editor-fold>//GEN-END:initComponents

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
   this.setSize(ds);
   pSubSetting.setVisible(false);
   addPanel(pProduct);
   dbSup = new SupplierDB();
   dbPro = new ProductDB();
   dbUser = new AccountDB();
   pProduct.setDB(dbPro);
   pSupplier.setDB(dbSup);
  }//GEN-LAST:event_formWindowOpened

  private void lbBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBackMouseEntered
    pBack.setBackground(hover);
  }//GEN-LAST:event_lbBackMouseEntered

  private void lbBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBackMouseExited
    pBack.setBackground(new Color(51,51,51));
  }//GEN-LAST:event_lbBackMouseExited

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

  private void lbHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseEntered
   pHomeNavigation.setBackground(hover);
  }//GEN-LAST:event_lbHomeMouseEntered

  private void lbHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseExited
    pHomeNavigation.setBackground(new Color(51,51,51));
  }//GEN-LAST:event_lbHomeMouseExited

  private void lbHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseClicked
   pSubMenu.setVisible(true);
   pSubSetting.setVisible(false);
    addPanel(pProduct);
  }//GEN-LAST:event_lbHomeMouseClicked

  private void lbSettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSettingMouseEntered
    pSetting.setBackground(hover);
  }//GEN-LAST:event_lbSettingMouseEntered

  private void lbSettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSettingMouseExited
    pSetting.setBackground(new Color(51,51,51));
  }//GEN-LAST:event_lbSettingMouseExited

  private void lbSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSettingMouseClicked
    pSubMenu.setVisible(false);
    pSubSetting.setVisible(true);
    addPanel(about);
  }//GEN-LAST:event_lbSettingMouseClicked

  private void lbProduct1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbProduct1MouseEntered
    pAddProduct.setBackground(hover);
  }//GEN-LAST:event_lbProduct1MouseEntered

  private void lbProduct1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbProduct1MouseExited
    pAddProduct.setBackground(exit);
  }//GEN-LAST:event_lbProduct1MouseExited

  private void lbProduct1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbProduct1MouseClicked
    pAddProduct.setBackground(click);
    addPanel(pProduct);
  }//GEN-LAST:event_lbProduct1MouseClicked

  private void lbSupplier4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSupplier4MouseClicked
    addPanel(about);
  }//GEN-LAST:event_lbSupplier4MouseClicked

  private void lbSupplier4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSupplier4MouseEntered
     pAbout.setBackground(hover);
  }//GEN-LAST:event_lbSupplier4MouseEntered

  private void lbSupplier4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSupplier4MouseExited
    pAbout.setBackground(exit);
  }//GEN-LAST:event_lbSupplier4MouseExited

  private void lbSupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSupplierMouseEntered
    pAddSupplier.setBackground(hover);
  }//GEN-LAST:event_lbSupplierMouseEntered

  private void lbSupplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSupplierMouseExited
    pAddSupplier.setBackground(exit);
  }//GEN-LAST:event_lbSupplierMouseExited

  private void lbSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSupplierMouseClicked
    pAddSupplier.setBackground(click);
    addPanel(pSupplier);
  }//GEN-LAST:event_lbSupplierMouseClicked

  private void lbSupplier1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSupplier1MouseClicked
    pViewProduct.setBackground(click);
    if(dbPro.getAll()!=null){
      vPro.setDB(dbPro);
      vPro.setElement(dbPro.getAll());
    }
    addPanel(vPro);
  }//GEN-LAST:event_lbSupplier1MouseClicked

  private void lbSupplier1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSupplier1MouseEntered
    pViewProduct.setBackground(hover);
  }//GEN-LAST:event_lbSupplier1MouseEntered

  private void lbSupplier1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSupplier1MouseExited
    pViewProduct.setBackground(exit);
  }//GEN-LAST:event_lbSupplier1MouseExited

  private void lbSupplier2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSupplier2MouseEntered
    pViewSupplier.setBackground(hover);
  }//GEN-LAST:event_lbSupplier2MouseEntered

  private void lbSupplier2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSupplier2MouseExited
    pViewSupplier.setBackground(exit);
  }//GEN-LAST:event_lbSupplier2MouseExited

  private void lbSupplier2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSupplier2MouseClicked
    pViewSupplier.setBackground(click);
    if(dbSup.getAll()!=null){
      vSup.setDB(dbSup);
      vSup.setElement(dbSup.getAll());
    }
    addPanel(vSup);
  }//GEN-LAST:event_lbSupplier2MouseClicked

  private void lbProduct2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbProduct2MouseEntered
    pHome.setBackground(hover);
  }//GEN-LAST:event_lbProduct2MouseEntered

  private void lbProduct2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbProduct2MouseExited
    pHome.setBackground(exit);
  }//GEN-LAST:event_lbProduct2MouseExited

  private void lbProduct2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbProduct2MouseClicked
    LogIn.main(null);
    this.dispose();
  }//GEN-LAST:event_lbProduct2MouseClicked

  private void lbSupplier3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSupplier3MouseEntered
    pExit.setBackground(hover);
  }//GEN-LAST:event_lbSupplier3MouseEntered

  private void lbSupplier3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSupplier3MouseExited
    pExit.setBackground(exit);
  }//GEN-LAST:event_lbSupplier3MouseExited

  private void lbSupplier3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSupplier3MouseClicked
    pExit.setBackground(click);
    int press = JOptionPane.showConfirmDialog(this, "Do you want to exit?","Exit",JOptionPane.YES_NO_OPTION);
    if(press == JOptionPane.YES_OPTION)
      System.exit(0);
  }//GEN-LAST:event_lbSupplier3MouseClicked

  private void lbUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUserMouseClicked
    pViewUserLogIn.setBackground(click);
    if(dbUser.getAll()!=null){
      userLogIn.setDB(dbUser);
      userLogIn.setElement(dbUser.getAll());
    }
    addPanel(userLogIn);
  }//GEN-LAST:event_lbUserMouseClicked

  private void lbUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUserMouseEntered
    pViewUserLogIn.setBackground(hover);
  }//GEN-LAST:event_lbUserMouseEntered

  private void lbUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUserMouseExited
    pViewUserLogIn.setBackground(exit);
  }//GEN-LAST:event_lbUserMouseExited
  public void addPanel(JPanel panel){
    pMain.removeAll();
    pMain.add(panel);
    pMain.validate();
    pMain.repaint();
    
  }
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
      java.util.logging.Logger.getLogger(ShopManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(ShopManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(ShopManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(ShopManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ShopManagement().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel lbBack;
  private javax.swing.JLabel lbHome;
  private javax.swing.JLabel lbProduct;
  private javax.swing.JLabel lbProduct1;
  private javax.swing.JLabel lbProduct2;
  private javax.swing.JLabel lbProduct3;
  private javax.swing.JLabel lbSetting;
  private javax.swing.JLabel lbSupplier;
  private javax.swing.JLabel lbSupplier1;
  private javax.swing.JLabel lbSupplier2;
  private javax.swing.JLabel lbSupplier3;
  private javax.swing.JLabel lbSupplier4;
  private javax.swing.JLabel lbUser;
  private javax.swing.JPanel pAbout;
  private javax.swing.JPanel pAddProduct;
  private javax.swing.JPanel pAddSupplier;
  private javax.swing.JPanel pBack;
  private javax.swing.JPanel pExit;
  private javax.swing.JPanel pHeader;
  private javax.swing.JPanel pHeader1;
  private javax.swing.JPanel pHome;
  private javax.swing.JPanel pHomeNavigation;
  private javax.swing.JPanel pMain;
  private javax.swing.JPanel pMenu;
  private javax.swing.JPanel pNavigation;
  private javax.swing.JPanel pSetting;
  private javax.swing.JPanel pSubMenu;
  private javax.swing.JPanel pSubNavigation;
  private javax.swing.JPanel pSubSetting;
  private javax.swing.JPanel pViewProduct;
  private javax.swing.JPanel pViewSupplier;
  private javax.swing.JPanel pViewUserLogIn;
  // End of variables declaration//GEN-END:variables
}
