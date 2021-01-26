package smcphillipsq1;

import javax.swing.JOptionPane;

/**
 *
 * @author Shane McPhillips
 */
public class SMcPhillipsQ1 {

    public static void main(String[] args) {
        
        int n; double total = 0;
        String s; boolean peasEntered = false;
        double[] prices;
        String[] names;
        
        //n is the number of items and related prices to contain.
        s = JOptionPane.showInputDialog("Input the number of items you wish to store..");
        n = Integer.parseInt(s);
        
        prices = new double[n];
        names = new String[n];
        
        //Poll for name and price input for n times.
        for (int i = 0; i < n; i++) {
                String name = JOptionPane.showInputDialog("Input an item name..");
                names[i] = name;
                double price = Double.parseDouble(JOptionPane.showInputDialog("Input a price for the item.."));
                prices[i] = price;
                
                total += price;
                if (name.equalsIgnoreCase("peas"))
                    peasEntered = true;
            }
        
        //Traverse array and print out name and price.
        for(int i = (n-1); i >= 0; i--) {
                System.out.println("[Item]: " + names[i] + " [Price]: $" + prices[i]);
        }
        
        //Output average price if peasEntered is true.
        if (peasEntered)                                //Using float cast for min decimal places.
            System.out.println("The average price per item within this list is $" + (float)(total/n));
        else
            System.out.println("No Peas within your list... so no average output for you..");
        
    }
    
}
