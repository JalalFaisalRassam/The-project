package Classes;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
    private String name , location  ;
    private int number,numberOfClinics;
    ArrayList<Hospital> hospitalArrayList=new ArrayList<>();

    public Hospital(String name, String location, int number) {
        this.name = name;
        this.location = location;
        this.number = number;
    }

    public Hospital(String name, String location, int number, int numberOfClinics) {
        this.name = name;
        this.location = location;
        this.number = number;
        this.numberOfClinics = numberOfClinics;
    }

    public Hospital() {
    }

    public Hospital(ArrayList<Hospital> hospitalArrayList) {
        this.hospitalArrayList = hospitalArrayList;
    }

    public ArrayList<Hospital> getHospitalArrayList() {
        return hospitalArrayList;
    }

    public void setHospitalArrayList(ArrayList<Hospital> hospitalArrayList) {
        this.hospitalArrayList = hospitalArrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberOfClinics() {
        return numberOfClinics;
    }

    public void setNumberOfClinics(int numberOfClinics) {
        this.numberOfClinics = numberOfClinics;
    }


    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", number=" + number +
                ", numberOfClinics=" + numberOfClinics +
                '}';
//
    }

}
