package TASK2;

class TreatmentQueue {

    private class Node {
        TreatmentRequest data;//keeps the patient's information
        Node next;

        public Node(TreatmentRequest data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;  // Front of the line
    private Node rear;   // The back of the queue
    private int size;//keeps track of the number of people in line
    // Queue size


    public TreatmentQueue() {
        front = null;
        rear = null;
        size = 0;
    }


    void enqueue(TreatmentRequest patient) {//add a new patient to the queue
        Node newNode = new Node(patient);//create a new node

        if (isEmpty()) {//if queue is empty
            front =newNode;//The added patient will be both the first and last patient.
            rear = newNode;
        } else {//if the queue is full
            rear.next = newNode;//add to the end of the last one
            rear = newNode;//update the last node
        }
        size++;
        System.out.println("TASK1.Patient " + patient.patientId+"added to hospital document");
    }
    TreatmentRequest deQueue(){//removing patients from the queue
        if(isEmpty()){
            System.out.println("Hospital document is empty.");
            return null;
        }else{
            TreatmentRequest data=front.data;//retrieves the information of the top patient
            System.out.println("patient"+front.data+"removed");
            front=front.next;//scroll to the next node
            size--;
            return data;
        }
    }
    private boolean isEmpty(){
        return size==0;
    }//checks whether the queue is empty
    void print(){//print the whole list
        if(isEmpty()){
            System.out.println("Hospital document is empty.");
        }else{
            Node temp=front;//start from the top
            int count=1;
            while(temp!=null){//keep going until you reach the end of the list
                System.out.println(count+"->"+temp.data);
                temp=temp.next;//go to do next node
                count++;
            }
        }

    }
    void size(){
        System.out.println("There are"+size+"patient in the queue.");

    }

}