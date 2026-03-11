
package campusquickserve_ice;

import javax.swing.JOptionPane;

public class CampusQuickServe_ICE {

static final double VAT_RATE = 0.15;                                                            // Declare constant VAT rate

    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter your name:");                          // Get user's name.
        
        String studentNumber = JOptionPane.showInputDialog("Enter your Student Number: ");      // Get user's student number.
        
        String itemOrdered = JOptionPane.showInputDialog("Enter the item you ordered: ");       // Get user's order item.
        
        String inputQuantity = JOptionPane.showInputDialog("Enter the quantity: ");             // Get quantity of item. 
        int quantity = Integer.parseInt(inputQuantity);                                         // Convert string into integer.
        
        String inputPricePerItem = JOptionPane.showInputDialog("Enter the price per item: ");   // Get price per item ordered.
        double pricePerItem = Double.parseDouble(inputPricePerItem);                            // Convert string into double.
        
        double subtotal = quantity * pricePerItem;                                              // Calculate subtotal.
        double vat = subtotal * VAT_RATE;                                                       // Calculate amount of VAT to be paid.
        double total = subtotal + vat;                                                          // Calculate order total.
        
        JOptionPane.showMessageDialog(null,                                                     // Format output message.
            "------ CAMPUS QUICKSERVE ------" + "\n" +
            "\n" +
            "Customer: " + name + "\n" +
            "Student Number: " + studentNumber + "\n" +
            "\n" +
            "Item Ordered: " + itemOrdered + "\n" +
            "Quantity: " + quantity + "\n" + 
            "Price per item: R" + pricePerItem + "\n" +
            "\n" +
            "Subtotal: R" + subtotal + "\n" + 
            "VAT (15%): R" + vat + "\n" + 
            "Total: R" + total + "\n" +
            "\n" + 
            "\n" +
            "Thank you for your order!" + 
            "\n" +
            "-----------------------------");
         
    }
    
}
