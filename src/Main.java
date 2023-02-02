import module.Doctor;
import module.Patient;
import module.Ward;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Patient p1=new Patient("Diabetes_Insulin",12000,1234,"Ayden R.",17,"Male");
        Patient p2=new Patient("Tuberculosis_INH",18000,1256,"Chaire W.",23,"Female");
        Patient p3=new Patient("Dengue_Oral rehydration",12000,1234,"Shree P.",17,"Male");
        Patient p4=new Patient("Tumer_Bleomycin",18000,1256,"Nehh A.",23,"Female");

        Ward w1= new Ward("A","Female_Quater","20-30","5","Neonatal","Child Specialist","2nd","101);


/*
        ArrayList<Doctor> Male_Doctor=new ArrayList<>();
        ArrayList<Doctor> Female_Doctor=new ArrayList<>();
        Doctor d1=new Doctor("Charaka","Female",29,"4 years","General Physician",);
        Doctor d2=new Doctor("Shaun Murphy","Female",53,"25 years","Nephrologist");
        Doctor d3=new Doctor("Hippocrates","Male",38,"11 years","Anesthesiologist");
        Doctor d4=new Doctor("Sanduk Ruit","Male",46,"16 years","Surgeon");
        Doctor d5=new Doctor("John Jones","Male",29,"4 years","Cardiologist");
        Doctor d6=new Doctor("Mikey Addams","Female",53,"25 years","Dermatologist");

        Male_Doctor.add(d3);
        Male_Doctor.add(d4);
        Male_Doctor.add(d5);

        Female_Doctor.add(d1);
        Female_Doctor.add(d2);
        Female_Doctor.add(d6);


    }
    */
}
