package TASK3;

public class DischargeStack {
    private static class Node {
        DischargeRecord data;//keeps the discharge record
        Node next;
        Node(DischargeRecord data) {//stores data when creating a new node
            this.data = data;
            next=null;
        }
    }
    private Node top;//displays the topmost item in the stack
    public void push(DischargeRecord d) {//adds a new discharge record
        Node newNode = new Node(d);//create a new node
        if(top==null) {//if the stack is empty
            top=newNode;//the new node is at the top
        }else {
            newNode.next=top;// Connect the next node to the old top node
            top=newNode;//Place the new knot at the top
        }
    }
    public DischargeRecord pop() {
        if (top == null) {
            System.out.println("TASK1.Patient document is empty");
            return null;
        } else {
            DischargeRecord record = top.data;//get the data from the top one
            System.out.println("Taburcu kaydı çıkarıldı: Hasta ID = " + top.data.patientId);
            top = top.next;//goes to the next node at the top
            return record;

        }
    }
    public void peek() {
        if (top == null) {
            System.out.println("TASK1.Patient document is empty!");
        } else {
            //show the topmost discharge record
            System.out.println("First patient ID = " + top.data.patientId + ", Discharge Time = " + top.data.dischargeTime);
        }
    }
    public void printStack() {
        if (top == null) {
            System.out.println("TASK1.Patient document is empty!");
        } else {

            Node temp = top;//Start from the top with a temporary knot
            int count = 1;//numbering counter
            System.out.println("Taburcu Stack İçeriği ");

            while (temp != null) {//Scroll to the end of the stack and print the data.
                System.out.println(count + ". TASK1.Patient ID: " + temp.data.patientId +  ", Discharge Time: " +temp.data.dischargeTime);
                temp = temp.next;//go to next node
                count++;//increase the meter
            }
            System.out.println("============================\n");
        }
    }
}
