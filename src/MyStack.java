

public class MyStack {
    Node head;
    Node middle;
    int size;

    MyStack() {
        head = null;
        middle = null;
        size = 0;
    }


    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        size++;
        if (size == 1) {
            middle = newNode;
        } else if (size % 2 != 0) {
            middle = middle.prev;
        }
    }


    int pop() {
        if (size == 0) return -1;
        int val = head.data;
        head = head.next;
        if (head != null) head.prev = null;
        size--;
        if (size % 2 == 0 && middle != null) {
            middle = middle.next;
        }
        return val;
    }




    int deleteMiddle() {
        if (size == 0) {
            System.out.println("ERROR : Stack EMPTY.");
            return -1;
        }
        int val = middle.data;

        if (middle.prev != null) {middle.prev.next = middle.next;}

        if (middle.next != null) {middle.next.prev = middle.prev;}
        size--;


        if (size % 2 == 0) {
            middle = middle.next;
        } else {
            middle = middle.prev;
        }

        return val;
    }



    void printList() {
        Node current = head;
        System.out.print("Stack, Size: " + size + "): ");

        if (current == null) {
            System.out.println("[EMPTY]");
            return;
        }

        while (current != null) {
            System.out.print(current.data);
            if (current == middle) {
                System.out.print(" (Middle)");
            }
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

}
