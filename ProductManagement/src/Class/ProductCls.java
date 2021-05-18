
package Class;

import javax.swing.Icon;

public class ProductCls {

  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
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
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  public ProductCls() {
  }

  public ProductCls(int id, String name, String category,String image) {
    this.id = id;
    this.name = name;
    this.category = category;
    this.image = image;
  }

  @Override
  public String toString() {
    return getId()+"\t"+getName()+"\t"+getCategory()+"\t"+getImage();
  }
  
  private int id;
  private String name;
  private String category;
  private String image;
}
