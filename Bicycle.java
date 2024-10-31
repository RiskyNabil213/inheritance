package car;

public class Bicycle extends vehicle {
    private String bikeType;

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public Bicycle(int numWheels, double price, String bikeType) {
        super(numWheels, price);
        this.bikeType = bikeType;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Bike Type: " + bikeType);
    }
    public double applyDiscount(double discountPercentage) {
        return price - (price * discountPercentage / 100);
    
        
    }
}