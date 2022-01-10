package stock.check;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author emjai
 */
public class order {
    private int orderNumber;
    private double paid;
    static ArrayList<orderItem> Items;
    private Customer customer;
    private String description,item;
    private boolean completed;
    private Date dateReceived,dateReturned;

    public order(int orderNumber, double paid, Customer customer, boolean completed, String description, String item, Date dateReceived, Date dateReturned) {
        this.orderNumber = orderNumber;
        this.paid = paid;
        this.customer = customer;
        this.description = description;
        this.item = item;
        this.completed = completed;
        this.dateReceived = dateReceived;
        this.dateReturned = dateReturned;
    }
    public order(int orderNumber, double paid, Customer customer, String description, String item, Date dateReceived) {
        this.orderNumber = orderNumber;
        this.paid = paid;
        this.customer = customer;
        this.description = description;
        this.item = item;
        this.completed = false;
        this.dateReceived = dateReceived;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getDateReceived() {
        return dateReceived;
    }

    public Date getDateReturned() {
        return dateReturned;
    }

    public String getDescription() {
        return description;
    }

    public static ArrayList<orderItem> getItems() {
        return Items;
    }

    public String getItem() {
        return item;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public double getPaid() {
        return paid;
    }
    public double getTotal() {
        double total =0.0;
        for(orderItem Item:Items)total += Item.getPrice();
        return total;
    }

    

    
}
