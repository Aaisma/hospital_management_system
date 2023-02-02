package module;

import java.util.ArrayList;

public class Appointment extends Reception {
    String time;
    Boolean booked_status;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Boolean getBooked_status() {
        return booked_status;
    }

    public void setBooked_status(Boolean booked_status) {
        this.booked_status = booked_status;
    }

    public Appointment(ArrayList<Patient> patients, ArrayList<Doctor> doctor, ArrayList<Ward> ward, ArrayList<Department> department, ArrayList<Appointment> appointment, String time, Boolean booked_status) {
        super(patients, doctor, ward, department, appointment);
        this.time = time;
        this.booked_status = booked_status;
    }
}
