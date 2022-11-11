package Classes;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HMI {
    ArrayList<Booking>bookingArrayList=new ArrayList<>();
    Controlor controlor =new Controlor();
    String request=" ";
    public void insert() throws FileNotFoundException {



        Scanner scanner=new Scanner(System.in);
        System.out.println("make a password using  English letters : ");
        String  password = scanner.next();
        System.out.println("enter the password using  English letters : ");
        String inpassword = scanner.next();
        if (inpassword.equals(password)) {

            //  start;

            do {
                System.out.println("what do you want to do \n press dh to (displayHospitals)\npress dc to (displayClinics)\npress bc to (bookingClinic)\npress db to (displayBooking)\n press e to (exit)");
                request = scanner.next();
                if (request.equals("dh")) {
                    System.out.println(" hospitals displayed");
                }
                controlor.displayhospitals();
                if (request.equals("dc")) {
                    controlor.diplayclinics();


                }
                if (request.equals("bc")) {
                    Booking booking = new Booking();

                    for (int i = 0; i < 3; i++) {

                        Scanner in = new Scanner(System.in);
                        System.out.println("enter   patient_name \n patient_age\n patient_gender");
                        String name = in.next();
                        booking.setPatient_name(name);
                        double age = in.nextDouble();
                        booking.setPatient_age(age);
                        String gender = in.next();
                        booking.setPatient_gender(gender);
                        bookingArrayList.add(booking);
                        controlor.writeStudentsFile();

                        // booking.bookingArrayList.add(booking);

                    }
                }
                if (request.equals("disp")) {
                    Booking show = new Booking();
                    for (int i = 0; i < bookingArrayList.size(); i++) {
                        show = bookingArrayList.get(i);
                        System.out.println(show.bookingArrayList);
                        System.out.println(show.anthertoString());

                    }

                }
            } while (!request.equals("e"));
        }}}

