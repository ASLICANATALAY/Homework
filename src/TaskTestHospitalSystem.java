public static void main(String[] args) {
    HospitalSystem system = new HospitalSystem();
    system.addPatient(1, "Ahmet", 7, 41);
    system.addPatient(2, "Mehmet", 5, 30);

    system.findPatient(1); // HashMap sayesinde O(1)
    system.processTreatment();

}

