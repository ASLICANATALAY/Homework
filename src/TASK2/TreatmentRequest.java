package TASK2;

class TreatmentRequest {
    int patientId;
    long requestTime;
    boolean isPriority;



    public TreatmentRequest(int patientId,int requestTime,boolean isPriority) {
        this.patientId = patientId;
        this.requestTime = System.currentTimeMillis();
        this.isPriority = isPriority;
    }
    public TreatmentRequest(int patientId){
        this.patientId=patientId;
        this.requestTime=System.currentTimeMillis();
        this.isPriority=false;
    }



    public String toString() {
        return "patientID=" + patientId +  " Request Time=" + requestTime+ ", Priority: " + (isPriority ? "Yes" : "No") ;
}}
