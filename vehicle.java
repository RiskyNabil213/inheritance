package car;
public class vehicle {
    private int numWheels;
    protected double price;
    public vehicle(int numWheels,double price){
        this.numWheels=numWheels;
        this.price=price;
    }
    public int getNumWheels() {
        return numWheels;
    }
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void print(){
        System.out.println("Wheels :" + numWheels +",price: "+price) ;
    }
    public boolean isOnSale() {
        // Method to check if the vehicle is on sale
        return false;
    }
}
