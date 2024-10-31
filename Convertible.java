package car;

public class Convertible extends Car {
    private String roofType;

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public Convertible() {
        super(numWheels, price, numDoors, isElectric);
        this.roofType = roofType;
    }

    public Convertible() {
        //TODO Auto-generated constructor stub
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Roof Type: " + roofType);
    }
    
}