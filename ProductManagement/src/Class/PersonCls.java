
package Class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonCls {
  public String getPlaceOfBirth() {
    return placeOfBirth;
  }
  public void setPlaceOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
  public PersonCls() {
  }
  public PersonCls(int id, String name, String gender) {
   this.id = id;
   this.name = name;
   this.gender = gender;
  }
  public PersonCls(int id, String name, String gender,String place,Date date) {
   this.id = id;
   this.name = name;
   this.gender = gender;
   this.placeOfBirth = place;
   this.date = date;
  }
  public String user() {
    return getId()+"\t"+getName()+"\t"+getGender();
  }
  @Override
  public String toString() {
    
    return user()+"\t"+getPlaceOfBirth()+"\t"+getDate(); 
  }
  
  private int id;
  private String name;
  private String gender;
  private String placeOfBirth;
  private Date date;
}
