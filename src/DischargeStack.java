public class DischargeStack {
    private static class Node {
        DischargeRecord data;
        Node next;
        Node(DischargeRecord data) {
            this.data = data;
            next=null;
        }
    }
    private Node top;
    public void push(DischargeRecord d) {
        Node newNode = new Node(d);
        if(top==null) {
            top=newNode;
        }else {
            newNode.next=top;
            top=newNode;
        }
    }
    public DischargeRecord pop() {
        if (top == null) {
            System.out.println("Patient document is empty");
            return null;
        } else {
            DischargeRecord record = top.data;
            System.out.println("Taburcu kaydı çıkarıldı: Hasta ID = " + top.data.patientId);
            top = top.next;
            return record;

        }
    }
    public void peek() {
        if (top == null) {
            System.out.println("Patient document is empty!");
        } else {
            System.out.println("First patient ID = " + top.data.patientId + ", Taburcu Zamanı = " + top.data.dischargeTime);
        }
    }
    public void printStack() {
        if (top == null) {
            System.out.println("Patient document is empty!");
        } else {

            Node temp = top;
            int count = 1;
            System.out.println("Taburcu Stack İçeriği ");

            while (temp != null) {
                System.out.println(count + ". Patient ID: " + temp.data.patientId +  ", Taburcu Zamanı: " +temp.data.dischargeTime);
                temp = temp.next;
                count++;
            }
            System.out.println("============================\n");
        }
    }
}
