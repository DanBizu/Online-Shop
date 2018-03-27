package ip27march;


public class Customer {

  private String customerName;
  private String username;
  private String password;

  public Customer(final String name, final String usernm, final String pass) {
    this.register(name, usernm, pass);
  }

  public Customer register(final String name, final String usernm, final String pass) {
    customerName = name;
    username = usernm;
    password = pass;
  }

  public void changePassword(final String newPassword) {
    password = newPassword;
  }

  public boolean login(final String pass) {
    return pass==password;
  }

}