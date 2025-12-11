class TreatmentQueue {

    private class Node {
        TreatmentRequest data;
        Node next;

        public Node(TreatmentRequest data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;  // Front of the line
    private Node rear;   // The back of the queue
    private int size;
    // Queue size


    public TreatmentQueue() {
        front = null;
        rear = null;
        size = 0;
    }


    void enqueue(TreatmentRequest patient) {
        Node newNode = new Node(patient);

        if (isEmpty( )) {
            front =newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Patient " + patient.patientId+"added to hospital document");
    }
    void deQueue(){
        if(isEmpty()){
            System.out.println("Hospital document is empty.");
        }else{
            System.out.println("patient"+front.data+"removed");
            front=front.next;
            size--;
        }
    }
    private boolean isEmpty(){
        return size==0;
    }
    void print(){
        if(isEmpty()){
            System.out.println("Hospital document is empty.");
        }else{
            Node temp=front;
            int count=1;
            while(temp!=null){
                System.out.println(count+"->"+temp.data);
                temp=temp.next;
                count++;
            }
        }

    }
    void size(){
        System.out.println("There are"+size+"patient in the queue.");

    }

}
