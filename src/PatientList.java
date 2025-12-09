class PatientList {


    private class Node {
        Patient data;
        Node next;

        public Node(Patient data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;


    public PatientList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    void addPatient(Patient p) {
        Node node=new Node(p);

        if (head == null) {

            head = node;
            tail = node;
        } else {

            tail.next = node;
            tail = node;
        }
        size++;
        System.out.println("Patient added: " + p.name);
    }


    void removePatient(int id) {
        if (head == null) {
            System.out.println("Hospital document is empty.");
        }else{
            if(head.next==null&& head.data.id==id){
                head=null;
                tail=null;
                System.out.println(id+"removed the hospital document.");
            }else if(head.next!=null && head.data.id==id){
                head=head.next;
                System.out.println(id+"removed the hospital document.");
            }else{
                Node current = head;
                while (current.next != null && current.next.data.id!=id) {
                    current=current.next;
                }
                if(current.next!=null){
                    current.next=current.next.next;
                }

                System.out.println("Patient ID " + id + " removed.");
                size--;
            }

        }

    }


    void findPatient(int id) {
        if (head == null) {
            System.out.println("Patient ID " + id + " not found in the hospital dokument.");
        } else {
            Node current = head;

            while (current != null) {
                if (current.data.id == id) {
                    System.out.println("Patient found: " + current.data);

                }
                current = current.next;
            }

    }}


    void printList() {
          if (head == null) {
                System.out.println("Hospital document is empty.");

           }else{

            System.out.println("\n Patient List  ");
            Node current = head;
            int count = 1;

            while (current != null) {
                System.out.println(count + ". " + current.data);
                current = current.next;
                count++;
            }
            System.out.println("Total patients size: " + size);
        }


    }
}