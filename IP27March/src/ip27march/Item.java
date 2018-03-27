package ip27march;

public class Item {

  private Integer price;
  private String name;
  private Integer id;

    public Item(Integer price, String name, Integer id) {
        this.price = price;
        this.name = name;
        this.id = id;
    }

  
  public String getName() {
    return name;
  }

  public Integer getPrice() {
    return price;
  }

  public Integer getId() {
    return id;
  }

    @Override
    public String toString() {
        return "Item{" + "price=" + price + ", name=" + name + ", id=" + id + '}';
    }
  
}
