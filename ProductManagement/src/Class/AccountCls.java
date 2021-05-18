package Class;

/**
 *
 * @author chinda
 */
public class AccountCls extends PersonCls{
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    private String phone;
    private String email;
    private String password;

    public AccountCls( int id, String name, String gender,String phone, String email, String password) {
        super(id, name, gender);
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return super.user()+"\t"+getPhone()+"\t"+getEmail()+"\t"+getPassword();
    }
    
}
