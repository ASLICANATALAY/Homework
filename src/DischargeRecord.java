

class DischargeRecord {
    int patientId;
    long dischargeTime;

    public DischargeRecord(int patientId, long dischargeTime) {
        this.patientId = patientId;
        this.dischargeTime = dischargeTime;
    }
}


class Node {
    DischargeRecord data;
    Node next;

    public Node(DischargeRecord data) {
        this.data = data;
        this.next = null;
    }
}
