import TASK4.HospitalSystem;

public static void main(String[] args) {
    HospitalSystem system = new HospitalSystem();
    system.addPatient(1, "Ahmet", 7, 41);
    system.addPatient(2, "Aslıcan", 5, 30);
    system.addPatient(3, "Melisa", 6, 37);
    system.addPatient(4, "Zülal", 9, 70);
    system.addPatient(5, "Saadet", 2, 44);
    system.addPatient(6, "Fatma", 1, 85);
    system.addPatient(7, "Fatma", 4, 11);
    system.addPatient(8, "Fatma", 3, 24);
    system.addPatient(9, "Fatma", 8, 56);
    system.addPatient(10, "Fatma", 10, 9);

    system.findPatient(1); // HashMap sayesinde O(1)
    system.sortPatientsBySeverity();
    system.processTreatment();

}

