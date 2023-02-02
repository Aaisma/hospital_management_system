package module;

import java.util.ArrayList;

public class Doctor extends Appointment{
        String Name;
        String gender;
        int age;
        String experience;
        String expertise;

        public String getName() {
                return Name;
        }

        public void setName(String name) {
                Name = name;
        }

        public String getGender() {
                return gender;
        }

        public void setGender(String gender) {
                this.gender = gender;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public String getExperience() {
                return experience;
        }

        public void setExperience(String experience) {
                this.experience = experience;
        }

        public String getExpertise() {
                return expertise;
        }

        public void setExpertise(String expertise) {
                this.expertise = expertise;
        }

        public Doctor(ArrayList<Patient> patients, ArrayList<Doctor> doctor, ArrayList<Ward> ward, ArrayList<Department> department, ArrayList<Appointment> appointment, String time, Boolean booked_status, String name, String gender, int age, String experience, String expertise) {
                super(patients, doctor, ward, department, appointment, time, booked_status);
                Name = name;
                this.gender = gender;
                this.age = age;
                this.experience = experience;
                this.expertise = expertise;
        }
}
