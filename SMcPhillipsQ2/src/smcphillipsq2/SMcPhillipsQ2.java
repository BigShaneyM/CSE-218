package smcphillipsq2;

/**
 *
 * @author Shane McPhillips
 */
public class SMcPhillipsQ2 {
    
    public static void main(String[] args) {
        
        //Create a new listing array that can hold 3 data members.
        Listing[] listings = new Listing[3];
        
        //Poll for input for each of the 3 Listings.
        for (int i = 0; i < 3; i++) {
            Listing listing = new Listing();
            listing.input();
            listings[i] = listing;
        }
        
        //Output each listing in reverse order.
        for (int i = 2; i >= 0; i--) {
            System.out.println("Listing(" + (i + 1) + "): " + listings[i].toString());
        }
    }
    
}
