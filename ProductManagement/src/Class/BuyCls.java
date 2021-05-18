package Class;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author CHINDA
 */
public class BuyCls extends ProductShopCls{

  public BuyCls() {
  }
  public BuyCls(int id, String name,String category, int qty, double price) {
    super.setId(id);
    super.setName(name);
    super.setCategory(category);
    super.setQty(qty);
    super.setPriceOut(price);
  }
  @Override
  public String toString() {
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
    return super.getId()+"\t"+super.getName()+"\t"+super.getCategory()+"\t"+super.getQty()+"\t"+nf.format(super.getPriceOut())+"\t"+nf.format(amount());
  }
  public double amount(){
    return super.getPriceOut()*super.getQty();
  }
  
}
