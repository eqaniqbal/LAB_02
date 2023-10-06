public class Product{
    private int id;
    private String name;
    private double price;
    private int quantity;
    static int counter;
    private Date mfcDate;
    Product(String name, double price, int quantity, Date mfcDate)
    {
        this.id = counter++;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.mfcDate = mfcDate;


    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public int getId(){
        return id;
    }

    public Date getMfcDate() {
        return mfcDate;
    }

    public void setMfcDate(Date mfcDate) {
        this.mfcDate = mfcDate;
    }

    @Override
    public String toString(){
        String productdetails = String.format("%d %s %f %d %s",id,name,price,quantity,mfcDate);
        return productdetails;
    }
    public Product islatest(Product p1, Product p2) {
        Date temp = mfcDate.isrecent(p1.mfcDate, p2.mfcDate);
        return temp == p1.mfcDate ? p1 : p2;
    }
}

