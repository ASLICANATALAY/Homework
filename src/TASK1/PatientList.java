package TASK1;

class PatientList {


    private class Node {
        Patient data;//kepps the patient's information
        Node next;

        public Node(Patient data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;//the starting node of the list
    private Node tail;//the last knot in the rope
    private int size;//total number of patients


    public PatientList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    void addPatient(Patient p) {//add a new patient to the list
        Node node=new Node(p);

        if (head == null) {//if list is empty
            head = node;//The added patient will be both the first and last patient.
            tail = node;
        } else {
            //if the lis is full
            tail.next = node;//add to the end of the last one
            tail = node;//update the last node
        }
        size++;
        System.out.println("Patient" + p.name+"added to hospital document.");
    }


    public boolean removePatient(int id) {//Remove the patient with the given ID from the list
        if (head == null) {
            System.out.println("Hospital document is empty.");
            return false;
        } else {
            if (head.next == null && head.data.id == id) {//if there is a patient on the list
                head = null;
                tail = null;
                System.out.println(id + "removed the hospital document.");
                size--;
                return true;
            } else if (head.next != null && head.data.id == id) {//if the patient is at the top of the list to be deleted
                head = head.next;
                System.out.println(id + "removed the hospital document.");
                size--;
                return true;
            } else {//If the patient to be removed is in the middle or at the end
                Node current = head;
                //Go through the entire list until you find the patient to be discharged.
                while (current.next != null && current.next.data.id != id) {
                    current = current.next;
                }
                if (current.next != null) {
                    current.next = current.next.next;//remove the knot to be cut
                    System.out.println(id+"removed from the hospital document.");
                    size--;
                    return true;
                }else{
                System.out.println("Patient ID " + id + " removed.");
                return false;
            }}

    }

    }




    void findPatient(int id) {//Search for the list according to the patient's ID and print it.
        if (head == null) {
            System.out.println("Patient ID " + id + " not found in the hospital dokument.");
        } else {
            Node current = head;
            while (current != null) {//search the list from top to bottom
                if (current.data.id == id) {
                    System.out.println("Patient found: " + current.data);
                }
                current = current.next;//go to the next node
            }

        }}


    void printList() {//prints all patients on the list
        if (head == null) {
            System.out.println("Hospital document is empty.");
        }else{
            System.out.println("\n Patient List  ");
            Node current = head;
            int count = 1;
            while (current != null) {
                System.out.println(count + "-> " + current.data);
                current = current.next;
                count++;
            }
            System.out.println("Total patients size: " + size);
        }


    }
}
