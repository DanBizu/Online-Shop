package ip27march;


public class ShoppingCartItem extends ShoppingCart{

  public Integer quantity;
  public Integer totalPrice = 0;

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
  
  public void applyDiscount (Integer noOfelem) {
      noOfelem = this.quantity;
      for (Item currentItem: items) {
        totalPrice += currentItem.getPrice();
    }
      //Apply a discount for a quatity higher then 20
      if (quantity > 20) {
          totalPrice -= totalPrice/10;
      }
  }

}