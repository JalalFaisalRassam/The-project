package Classes;

public class Patient extends Hospital{
    //in the Hospital is name , number , location ,
    private String disease , gender  ;
    private double age , weight  ;

    public Patient() {
    }

    public Patient(String name, String location, int number, int numberOfClinics, String disease, String gender, double age, double weight) {
        super(name, location, number, numberOfClinics);
        this.disease = disease;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
