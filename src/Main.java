public class Main {
    public static void main(String[] args) {

        MyStack stack = new MyStack();
        System.out.println("--- Stack Exercise ---");
        stack.printList();
        System.out.println();


        System.out.println("--- 1. PUSH  ---");
        stack.push(10);
        stack.printList();
        stack.push(20);
        stack.printList();
        stack.push(30);
        stack.printList();
        stack.push(40);
        stack.printList();
        stack.push(50);
        stack.printList();
        System.out.println();


        System.out.println("--- 2. POP  ---");
        int popped = stack.pop();
        System.out.println("Deleted Node (Pop): " + popped);
        stack.printList();


        System.out.println("--- 3. DELETE MIDDLE  ---");
        int deleted = stack.deleteMiddle();
        System.out.println("Deleted Middle Element: " + deleted);
        stack.printList();


    }
}

