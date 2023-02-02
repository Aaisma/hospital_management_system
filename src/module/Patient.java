package module;

import java.util.ArrayList;

public class Patient extends Cost {
    int Patient_id;
    String name;
    int age;
    String gender;

    public int getPatient_id() {
        return Patient_id;
    }

    public void setPatient_id(int patient_id) {
        Patient_id = patient_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Patient(ArrayList<Patient> patients, ArrayList<Doctor> doctor, ArrayList<Ward> ward, ArrayList<Department> department, ArrayList<Appointment> appointment, String time, Boolean booked_status, String medication, int price, int patient_id, String name, int age, String gender) {
        super(patients, doctor, ward, department, appointment, time, booked_status, medication, price);
        Patient_id = patient_id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
