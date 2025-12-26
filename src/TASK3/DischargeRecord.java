package TASK3;

class DischargeRecord {
    int patientId;
    long dischargeTime;

    public DischargeRecord(int patientId, long dischargeTime) {
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis();
    }
}



