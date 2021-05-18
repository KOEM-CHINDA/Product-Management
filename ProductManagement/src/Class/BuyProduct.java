
package Class;

import java.util.ArrayList;

/**
 *
 * @author CHINDA
 */
public class BuyProduct {

  public BuyProduct() {
  }
  public void removeAll(){
    for(int i=db.size()-1; i>=0; i--)
      db.remove(i);
  }
  public void remove(int index){
    db.remove(index);
  }
  public void add(BuyCls buy){
    db.add(buy);
  }
  public ArrayList<BuyCls> getAll(){
    return db;
  }
  public int size(){
    return db.size();
  }
  public BuyCls get(int index){
    return db.get(index);
  }
  public void set(int index, BuyCls buy){
    db.set(index, buy);
  }
  private static ArrayList<BuyCls> db = new ArrayList<>();
}
