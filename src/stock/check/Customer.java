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

    public Customer() {
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
}
