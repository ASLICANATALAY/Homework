package TASK1;

public class TaskTestPatient {
    public static void main(String[] args) {
        PatientList patientList = new PatientList();

        System.out.println("Task 1: Patient List Test\n");


        System.out.println("1- Adding 5 patients:");
        patientList.addPatient(new Patient(101, "Aslıcan Atalay", 8, 41));
        patientList.addPatient(new Patient(102, "Melisa Çelik", 5, 24));
        patientList.addPatient(new Patient(103, "Fatmanur Yurdakul", 9, 63));
        patientList.addPatient(new Patient(104, "Zülal Ceyhan", 3, 15));
        patientList.addPatient(new Patient(105, "Saadet Armut", 6, 56));


        patientList.printList();


        System.out.println("2- Removing patient with ID 103:");
        patientList.removePatient(103);


        System.out.println("3- Searching for patient with ID 102:");
        patientList.findPatient(102);


        System.out.println("4- Final patient list:");
        patientList.printList();
    }
}