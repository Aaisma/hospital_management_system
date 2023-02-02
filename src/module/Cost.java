package module;

import java.util.ArrayList;

public class Cost extends Appointment{
    String medication;
    int price;

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Cost(ArrayList<Patient> patients, ArrayList<Doctor> doctor, ArrayList<Ward> ward, ArrayList<Department> department, ArrayList<Appointment> appointment, String time, Boolean booked_status, String medication, int price) {
        super(patients, doctor, ward, department, appointment, time, booked_status);
        this.medication = medication;
        this.price = price;
    }
}
