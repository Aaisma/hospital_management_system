package module;

import java.util.ArrayList;

public class Department extends Doctor{
    String department_name;
    String floor;

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public Department(ArrayList<Patient> patients, ArrayList<Doctor> doctor, ArrayList<Ward> ward, ArrayList<Department> department, ArrayList<Appointment> appointment, String time, Boolean booked_status, String name, String gender, String age, String experience, String expertise, String department_name, String floor) {
        super(patients, doctor, ward, department, appointment, time, booked_status, name, gender, age, experience, expertise);
        this.department_name = department_name;
        this.floor = floor;
    }
}
