
package Class;

import java.util.ArrayList;
public class AccountDB {
    public ArrayList<AccountCls> getDb() {
        return db;
    }
    public static void setDb(ArrayList<AccountCls> aDb) {
        db = aDb;
    }
    public void remove(int index){
        db.remove(index);
    }
    public AccountCls get(int index){
        return db.get(index);
    }
    public int size(){
        return db.size();
    }
    public ArrayList<AccountCls> getAll(){
        return db;
    }
    public void set(int index,AccountCls acc){
        db.set(index, acc);
    }
    public void add(AccountCls acc){
        db.add(acc);
    }
    public AccountDB() {
    }
    public AccountDB(AccountCls acc) {
        db.add(acc);
    }
    public void sortByName(){
      for(int i=0; i<db.size(); i++){
        for(int j=i+1; j<db.size(); j++){
          if(db.get(i).getName().compareTo(db.get(j).getName())>0){
            AccountCls temp = db.get(i);
            db.set(i, db.get(j));
            db.set(j, temp);
          }
        }
      }
    }
    public ArrayList<AccountCls> getFiltterName(String name){
      ArrayList<AccountCls> ls = new ArrayList<>();
      if(name.length()==0)
        return getAll();
      else{
        for(int i=0; i<db.size(); i++){
          String subName = db.get(i).getName();
          if(name.length()>subName.length())
            continue;
          subName = subName.substring(0, name.length());
          if(name.equals(subName))
            ls.add(db.get(i));
        }
      }
      return ls;
    }
    private static ArrayList<AccountCls> db = new ArrayList<>();
    
}
