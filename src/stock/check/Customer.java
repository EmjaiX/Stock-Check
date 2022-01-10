package stock.check;

/**
 *
 * @author emjai
 */
class Customer {
    private int id;
    private String fname,lname,contact;

    public Customer(String fname, String lname, String contact, int id) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.contact = contact;
    }

//    public Customer() {
//    }

    Customer(int customer) {
        this.fname = null;
        this.lname = null;
        this.contact = null;
        for(Customer c:StockCheck.Customers){
            if(c.getId()==customer){
                this.id = c.getId();
                this.fname = c.getFname();
                this.lname = c.getLname();
                this.contact = c.getContact();
                break;
            }
        }
        if(this.fname!=null) return;
        this.id = getLastID();
        this.fname = "John" + this.id;    
        this.lname = "Doe";    
        this.contact = "0000000";    
        update();
    }

    public String getContact() {
        return contact;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getId() {
        return id;
    }


    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    } 

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() { 
        return this.fname + " " + this.lname;
    }

    private void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int getLastID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
