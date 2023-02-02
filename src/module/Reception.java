package module;
import java.util.ArrayList;
public class Reception {
    public ArrayList<Patient>patients;
    public ArrayList<Doctor>doctor;
    public ArrayList<Ward>ward;
    public ArrayList<Department>department;
    public ArrayList<Appointment>appointment;

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public ArrayList<Doctor> getDoctor() {
        return doctor;
    }

    public void setDoctor(ArrayList<Doctor> doctor) {
        this.doctor = doctor;
    }

    public ArrayList<Ward> getWard() {
        return ward;
    }

    public void setWard(ArrayList<Ward> ward) {
        this.ward = ward;
    }

    public ArrayList<Department> getDepartment() {
        return department;
    }

    public void setDepartment(ArrayList<Department> department) {
        this.department = department;
    }

    public ArrayList<Appointment> getAppointment() {
        return appointment;
    }

    public void setAppointment(ArrayList<Appointment> appointment) {
        this.appointment = appointment;
    }

    public Reception(ArrayList<Patient> patients, ArrayList<Doctor> doctor, ArrayList<Ward> ward, ArrayList<Department> department, ArrayList<Appointment> appointment) {
        this.patients = patients;
        this.doctor = doctor;
        this.ward = ward;
        this.department = department;
        this.appointment = appointment;
    }
}
