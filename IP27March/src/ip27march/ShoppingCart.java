package ip27march;

import java.util.LinkedList;
import java.util.List;


public class ShoppingCart {

  public Integer id;
  public List<Item>items;
  
  public ShoppingCart()
  {
      id=0;
      items=new LinkedList<>();
  }

  public void addItem(Item newItem) {
      items.add(newItem);
  }

  public void checkout() {
      items.forEach((item) -> {
          System.out.println(item.toString());
      });
  }

  public void removeItem(Item oldItem) {
      items.remove(oldItem);
  }

}