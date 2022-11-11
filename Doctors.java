package Classes;

public class Doctors extends Hospital{
    //in the Hospital is name , number , location ,
    private String   major  ;

    public Doctors() {
    }

    public Doctors(String name, String location, int number, int numberOfClinics, String major) {
        super(name, location, number, numberOfClinics);
        this.major = major;
    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
