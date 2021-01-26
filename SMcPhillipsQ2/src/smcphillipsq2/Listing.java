package smcphillipsq2;

import javax.swing.JOptionPane;

/**
 *
 * @author Shane McPhillips
 */
public class Listing {
    private String name;
    private int age;
    
    public Listing() {
        this(" ", 0);
    }
    
    public Listing(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age;
    }
    
    public void input() {
        this.name = JOptionPane.showInputDialog("Please enter a name for this Listing..");
        this.age = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number for the age for this Listing.."));
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public Listing clone() {
        return new Listing(this.name, this.age);
    }
}
