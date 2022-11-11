package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Controlor {
    Booking booking;
    ArrayList<Booking>bookingArrayList;
    public Controlor() {
        this.bookingArrayList=new ArrayList<>();
    }
    public ArrayList<Booking> getBookingArrayList() {
        return bookingArrayList;
    }

    public Controlor(Booking booking) {

    }
    public void addbooking(Booking booking){
        getBookingArrayList().add(booking);

    }
    String patient_name, patient_gender;
    double patient_age,price=3000,time=System.currentTimeMillis();
    public boolean addbook(String patient_name, double patient_age, String patient_gender ){
        this.patient_name=patient_name;
        this.patient_age=patient_age;
        this.patient_gender=patient_gender;
        return true;

    }
    public  void displayhospitals() throws FileNotFoundException {
        Scanner file = new Scanner(new File("C:\\Users\\EBH\\BookingProject\\HospitalsFile.txt"));
        while (file.hasNextLine())
            System.out.println( file.next());


    }
   public void diplayclinics() throws FileNotFoundException {
        System.out.println(" Clinics displayed");
        Scanner file = new Scanner(new File("C:\\Users\\EBH\\BookingProject\\ClinicsFile.txt"));
        while (file.hasNextLine())
            System.out.println(file.nextLine());
    }
    public Booking getBooking() {
        return booking;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public String getPatient_gender() {
        return patient_gender;
    }

    public double getPatient_age() {
        return patient_age;
    }

    public double getPrice() {
        return price;
    }

    public double getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "booking=" + booking +
                ", patient_name='" + patient_name + '\'' +
                ", patient_gender='" + patient_gender + '\'' +
                ", patient_age=" + patient_age +
                ", price=" + price +
                ", time=" + time +"order = "+Booking.order+
                '}';
    } public void writeStudentsFile() throws FileNotFoundException {
    PrintWriter printWriter=new PrintWriter("C:\\Users\\EBH\\BookingProject\\BookingsFile.txt");
                    for (int j=0; j<=5;j++) {
        printWriter.write(booking.getPatient_name()+"   "+booking.getPatient_age()+"  "+booking.getPatient_gender());
        System.out.println("another way");
        printWriter.write(booking.anthertoString());

    }
        printWriter.close();


    }



}
