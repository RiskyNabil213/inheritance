package car;
public class Car extends vehicle {
    private int numDoors;
    private boolean isElectric;

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public Car(int numWheels, double price, int numDoors, boolean isElectric) {
        super(numWheels, price);
        this.numDoors = numDoors;
        this.isElectric = isElectric;
    }

    // Metode untuk menghitung harga setelah diskon
    public double applyDiscount(double discountPercentage) {
        return price - (price * discountPercentage / 100);
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Doors: " + numDoors + ", Electric: " + isElectric);
    }
}

