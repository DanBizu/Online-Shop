
package ip27march;

import java.util.LinkedList;
import java.util.List;

public class Database {
    private List<Customer> CustomersDB;
    private List<Item> ItemsDB;

    public Database() {
        CustomersDB=new LinkedList<>();
        ItemsDB=new LinkedList<>();
        
    }
    public void addItem(Item newItem)
    {
        ItemsDB.add(newItem);
    }
    public void addCustomer(Customer newCustomer)
    {
        CustomersDB.add(newCustomer);
    }
    
    
}
