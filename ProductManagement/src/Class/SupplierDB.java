package Class;

import java.util.ArrayList;

public class SupplierDB {

  public SupplierDB() {
  }
  public ArrayList<Supplier> getAll(){
    return db;
  }
  public int size(){
    return db.size();
  }
  public Supplier get(int index){
    return db.get(index);
  }
  public void add(Supplier sup){
    db.add(sup);
  }
  public void set(int index, Supplier sub){
    db.set(index, sub);
  }
  public void remove(int index){
    db.remove(index);
  }
  public void sortByName(){
    for(int i=0; i<db.size(); i++){
      for(int j=1+i; j<db.size(); j++){
        if(db.get(i).getName().compareTo(db.get(j).getName())>0){
          Supplier sup = db.get(i);
          db.set(i, db.get(j));
          db.set(j, sup);
        }
      }
    }
  }
  public ArrayList<Supplier> getFiltterName(String name){
    ArrayList<Supplier> ls = new ArrayList<>();
    if(name.length() == 0)
      return getAll();
    else{
      for(int i=0; i<db.size(); i++){
        String subName = db.get(i).getName();
        if(name.length()>subName.length())
          continue;
        subName = subName.substring(0, name.length());//chinda = 4 
        if(subName.equals(name))
          ls.add(db.get(i));
        }
      return ls;
    }
  }
  private ArrayList<Supplier> db = new ArrayList<>();
  
}
