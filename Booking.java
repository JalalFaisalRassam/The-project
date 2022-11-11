package Classes;

import java.util.ArrayList;
import java.util.Objects;

public class Booking{

    static int order=0 ;
   private String patient_name,patient_gender ;
   double patient_age;
    private double price=0;
    private double time=System.currentTimeMillis();
    private double date;
    ArrayList<Booking>bookingArrayList;

    public Booking() {
        order++;
    }



    public Booking(String patient_name,  double patient_age, String patient_gender) {
        this.patient_name = patient_name;
        this.patient_age = patient_age;
        this.patient_gender = patient_gender;
        order++;
    }

    public Booking(String patient_name,  double patient_age, String patient_gender, double price, double time, double date) {
        this.patient_name = patient_name;
        this.patient_age = patient_age;
        this.patient_gender = patient_gender;
        this.price = price;
        this.time = System.currentTimeMillis();
        this.date = date;
        order++;
    }
    public Booking(ArrayList<Booking> bookingArrayList) {
        this.bookingArrayList =new ArrayList<Booking>();
    }
    public static int getOrder() {
        return order;
    }

    public static void setOrder(int order) {
        Booking.order = order;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public  double getPatient_age() {
        return patient_age;
    }

    public void setPatient_age( double patient_age) {
        this.patient_age = patient_age;
    }

    public String getPatient_gender() {
        return patient_gender;
    }

    public void setPatient_gender(String patient_gender) {
        this.patient_gender = patient_gender;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTime() {
        return time;
    }


    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Double.compare(booking.price, price) == 0 && Double.compare(booking.time, time) == 0 && Double.compare(booking.date, date) == 0 && patient_name.equals(booking.patient_name)
                &&Double.compare(booking.patient_age, patient_age) == 0  && patient_gender.equals(booking.patient_gender) && Objects.equals(bookingArrayList, booking.bookingArrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patient_name, patient_age, patient_gender, price, time, date, bookingArrayList);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "patient_name='" + patient_name + '\'' +
                ", patient_age='" + patient_age + '\'' +
                ", patient_gender='" + patient_gender + '\'' +
                ", price=" + price +
                ", time=" + time +
                ", date=" + date + "order " +order +
                '}';
    }


    public String anthertoString() {
        return "Booking{" +
                "patient_name='" + patient_name + '\'' +
                ", patient_age='" + patient_age + '\'' +
                ", patient_gender='" + patient_gender + '\'' +"order " +order +
                '}';
    }
}



