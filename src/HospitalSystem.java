import java.util.HashMap;
class HospitalSystem {
    private PatientList patientList;
    private TreatmentQueue treatmentQueue;
    private TreatmentQueue priorityQueue;
    private DischargeStack dischargeStack;
    private HashMap<Integer,Patient> patientMap;//quick access to guests

    public HospitalSystem() {
        patientList = new PatientList();
        treatmentQueue = new TreatmentQueue();
        priorityQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientMap = new HashMap<>();
    }


    public void addPatient(int id, String name,int severity, int age) {
        Patient p=new Patient(id, name,severity, age);//adding new patient
        patientList.addPatient(p);//add to linked list
        patientMap.put(id, p);//add to hash

        System.out.println("Patient has been added to the system: " + p.name);
    }


    public void addTreatmentRequest(int patientId,int requestTime,boolean isPriority) {
        Patient p = patientMap.get(patientId);//find the patient
        if (p != null) {//if there is a patient
            TreatmentRequest request=new TreatmentRequest(patientId,requestTime,isPriority);
            if(isPriority){
                priorityQueue.enqueue(request);
            }else{
                treatmentQueue.enqueue(request);
            }
            System.out.println("Treatment request added for patient:"+patientId);
        } else {
            System.out.println("Patient not found!!");
        }
    }





    public void processTreatment() {
        TreatmentRequest request = priorityQueue.deQueue();//take priority requests from queue

        if(request==null){
            request = treatmentQueue.deQueue();
        }
        if(request==null){
            System.out.println("There is no patient.");
            return;
        }
        Patient p=patientMap.get(request.patientId);
        if(p!=null){
            dischargeStack.push(new DischargeRecord(request.patientId,System.currentTimeMillis()));
            System.out.println("patient"+request.patientId+"has been discharge");
        }
    }
    public void addDischargeRecord(int patientId,String reason) {
        Patient p = patientMap.get(patientId);//find patient

        if (p != null) {//if there is a patient
            dischargeStack.push(new DischargeRecord(patientId, System.currentTimeMillis()));//add discharge record
            patientList.removePatient(patientId);//remove the patient from linked list
            patientMap.remove(patientId);//and remove the patient from hashMap
            System.out.println("The patient " + patientId+" was discharged");
        } else {
            System.out.println("Patient not found!");
        }
    }


    public void findPatient(int id) {//search by id number
        Patient p = patientMap.get(id);
        if (p != null) System.out.println("The patient " + p+ "was found");
        else System.out.println("Patient not found!");
    }


    void sortPatientsBySeverity() {//prioritizes patients according to the level of urgency
        System.out.println("\nPatient are ranked according to severity level..");
        if (patientMap.size() == 0) {
            System.out.println("No patients to sort.");
            return;
        }

        // Convert HashMap values to array
        Patient[] patientArray = new Patient[patientMap.size()];
        int index = 0;
        for (Patient p : patientMap.values()) {
            patientArray[index] = p;
            index++;
        }

        // Bubble Sort - sorts in descending order (highest severity first)
        int n = patientArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare severity levels
                if (patientArray[j].severity < patientArray[j + 1].severity) {
                    // Swap patients
                    Patient temp = patientArray[j];
                    patientArray[j] = patientArray[j + 1];
                    patientArray[j + 1] = temp;
                }
            }
        }

        // Display sorted patients
        System.out.println("Patients sorted by severity (highest to lowest):");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < patientArray.length; i++) {
            Patient p = patientArray[i];
            System.out.println((i + 1) + ". ID: " + p.id + ", Name: " + p.name +
                    ", Severity: " + p.severity + ", Age: " + p.age);
        }
        System.out.println("------------------------------------------------");
        System.out.print("Sorting feature added.");
    }


    }




