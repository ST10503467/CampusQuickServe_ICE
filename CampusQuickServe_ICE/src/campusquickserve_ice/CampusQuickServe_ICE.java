
package campusquickserve_ice;
import javax.swing.JOptionPane;

public class CampusQuickServe_ICE {
    static final double VAT_RATE = 0.15;                                                            

    static class OrderDiscount {
        private int quantity;
        private double subtotal;
        private static final double DISCOUNT_RATE = 0.10;
        private static final int DISCOUNT_THRESHHOLD = 3;
        
        public OrderDiscount(int quantity, double subtotal) {
            this.quantity = quantity;
            this.subtotal = subtotal;
        }
        
        public double getDiscount() {
            if (quantity > DISCOUNT_THRESHHOLD) {
                return subtotal * DISCOUNT_RATE;
            }
            return 0.0;
        }
        
        public double getDiscountedSubtotal() {
            return subtotal - getDiscount();
        }
    }
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter your name:");                          
        String studentNumber = JOptionPane.showInputDialog("Enter your Student Number: ");      
        String itemOrdered = JOptionPane.showInputDialog("Enter the item you ordered: ");       
        
        String inputQuantity = JOptionPane.showInputDialog("Enter the quantity: ");             
        int quantity = Integer.parseInt(inputQuantity);                                         
        
        String inputPricePerItem = JOptionPane.showInputDialog("Enter the price per item: ");   
        double pricePerItem = Double.parseDouble(inputPricePerItem);                            
        
        double subtotal = quantity * pricePerItem;                                             
        
        OrderDiscount order = new OrderDiscount(quantity, subtotal);
        double discount = order.getDiscount();
        double discountedSubtotal = order.getDiscountedSubtotal();
        
        double vat = discountedSubtotal * VAT_RATE;
        double total = discountedSubtotal + vat;
        
        String discountLine = (discount > 0)
                ? "Discount (10%): -R" + discount + "\n"
                : "";
        
        JOptionPane.showMessageDialog(null,                                                     
            "------ CAMPUS QUICKSERVE ------" + "\n" +
            "\n" +
            "\n" +
            "Customer: " + name + "\n" +
            "Student Number: " + studentNumber + "\n" +
            "\n" +
            "Item Ordered: " + itemOrdered + "\n" +
            "Quantity: " + quantity + "\n" + 
            "Price per item: R" + pricePerItem + "\n" +
            "\n" +
            "Subtotal: R" + subtotal + "\n" +
            discountLine +
            "VAT (15%): R" + vat + "\n" + 
            "Total: R" + total + "\n" +
            "\n" + 
            "\n" +
            "Thank you for your order!" + 
            "\n" +
            "------------------------------------------------");
         
    }
    
}
