package Classes;

public class Clinic extends Hospital{
    //in the Hospital is name , number , location ,
    private String doctor;
    private double price ;

    public Clinic() {
    }

    public Clinic(String name, String location, int number,   String doctor, double price) {
        super(name, location, number);
        this.doctor = doctor;
        this.price = price;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clinic{" +
                "doctor='" + doctor + '\'' +
                ", price=" + price +
                '}';
    }
}
