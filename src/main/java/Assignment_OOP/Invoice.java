package Assignment_OOP;
/*
. (Invoice Class) Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store.
 An Invoice should include four pieces of information as instance variables—a part number (type String), a part description (type String),
 a quantity of the item being purchased (type int) and a price per item (double).
 Your class should have a constructor that initializes the four instance variables. Provide a set and a get method for each instance variable.
  In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item),
  then returns the amount as a double value. If the quantity is not positive, it should be set to 0. If the price per item is not positive,
  it should be set to 0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.

 */

public class Invoice {

    String partNum;
    String partDescrptn;
    int quantity;
    double pricePer;

    public String getPartNum() {
        return partNum;
    }

    public void setPartNum(String partNum) {
        this.partNum= partNum;
    }

    public String getPartDescrptn() {
        return partDescrptn;
    }

    public void setPartDescrptn(String partDescrptn) {
        this.partDescrptn = partDescrptn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if(quantity < 0)
            this.quantity = 0;
        else
            this.quantity = quantity;
    }

    public double getPricePer() {
        return pricePer;
    }

    public void setPricePer(double pricePer) {

        if(pricePer < 0.0)
            this.pricePer = 0.0;
        else
            this.pricePer = pricePer;
    }

    public Invoice(String partNum, String partDescrptn, int quantity, double pricePer) {
        this.partNum = partNum;
        this.partDescrptn = partDescrptn;

//        if(quantity < 0)
//            quantity = 0;
//        this.quantity = quantity;

        setQuantity(quantity);

//        if(pricePer < 0.0)
//            pricePer = 0.0;
//        this.pricePer = pricePer;

        setPricePer(pricePer);
    }

    public double getInvoiceAmount() {

//        if (quantity < 0) {
//            quantity = 0;
//        }
//
//        if (pricePer < 0)
//            pricePer = 0.0;

        return quantity * pricePer;

    }

}
//public class InvoiceTest give Error
 class InvoiceTest {

    public static void main(String[] args) {

        Invoice invoice = new Invoice("42", "Training Book", 2, 2);

        System.out.println("Your_total_invoice_amount_is : " + invoice.getInvoiceAmount());
        System.out.println(invoice.getQuantity());

    }

}