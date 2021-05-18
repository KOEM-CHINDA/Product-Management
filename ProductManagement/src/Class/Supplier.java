
package Class;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;

public class Supplier extends PersonCls{
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public Supplier() {
  }

  public Supplier(int id, String name, String gender,String phone, String email,Date date,String place,String image) {
    super(id, name, gender, place, date);
    this.phone = phone;
    this.email = email;
    this.image = image;
  }
  @Override
  public String toString() {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yy");
    return super.getId()+"\t"+super.getName()+"\t"+super.getGender()+"\t"+getPhone()+"\t"+getEmail()+"\t"+sdf.format(super.getDate())+"\t"+super.getPlaceOfBirth()+"\t"+getImage();
  }
  private String image;
  private String phone;
  private String email;
}
