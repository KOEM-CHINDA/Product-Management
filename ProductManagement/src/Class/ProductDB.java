
package Class;

import java.util.ArrayList;

public class ProductDB {
  public ProductDB() {
  }
  public ArrayList<ProductShopCls> getAll(){
    return db;
  }
  public int size(){
    return db.size();
  }
  public ProductShopCls get(int index){
    return db.get(index);
  }
  public void add(ProductShopCls pro){
    db.add(pro);
  }
  public void set(int index, ProductShopCls pro){
    db.set(index, pro);
  }
  public void remove(int index){
    db.remove(index);
  }
  public void sortCategory(){
    for(int i=0; i<db.size(); i++){
      for(int j=1+i; j<db.size(); j++){
        if(db.get(i).getCategory().compareTo(db.get(j).getCategory())>0){
          ProductShopCls pro = db.get(i);
          db.set(i, db.get(j));
          db.set(j, pro);
        }
      }
    }
  }
  public ArrayList<ProductShopCls> getFiltterName(String name){
    ArrayList<ProductShopCls> ls = new ArrayList<>();
    if(name.length() == 0)
      return getAll();
    else{
      for(int i=0; i<db.size(); i++){
        String subName = db.get(i).getName();
        if(name.length()>subName.length())
          continue;
      subName = subName.substring(0, name.length());
      if(subName.equals(name))
        ls.add(db.get(i));
      }
    }
    return ls;
  }
  private static ArrayList<ProductShopCls> db = new ArrayList<>();
  

}
