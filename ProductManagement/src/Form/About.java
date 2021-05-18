package Form;
/**
 *
 * @author CHINDA
 */
public class About extends javax.swing.JPanel {

  private String dep = "សូមអរគុណចំពោះការប្រើប្រាស់កម្មវិធីមួយនេះ។<br> Creator: <font color = red><b>គឹម ចិន្ដា</b></font> <br>"
          + "           Telephone: <b>087 629 243,0974837343</b><br>Email: koemchinda.it@gmail.com";
  public About() {
    initComponents();
    txtDecription.setText(dep);
  }

  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane2 = new javax.swing.JScrollPane();
    txtDecription = new javax.swing.JTextPane();

    setLayout(new java.awt.BorderLayout());

    txtDecription.setContentType("text/html"); // NOI18N
    txtDecription.setFont(new java.awt.Font("Kh Content", 1, 24)); // NOI18N
    txtDecription.setFocusable(false);
    jScrollPane2.setViewportView(txtDecription);

    add(jScrollPane2, java.awt.BorderLayout.CENTER);
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JTextPane txtDecription;
  // End of variables declaration//GEN-END:variables
}
