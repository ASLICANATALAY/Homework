package TASK2;

public class TaskTestQueue {
    public static void main(String[] args) {
        TreatmentQueue queue = new TreatmentQueue();
        queue.enqueue(new TreatmentRequest(1));
        queue.enqueue(new TreatmentRequest(2));
        queue.enqueue(new TreatmentRequest(3));
        queue.enqueue(new TreatmentRequest(4));
        queue.enqueue(new TreatmentRequest(5));
        queue.enqueue(new TreatmentRequest(6));
        queue.enqueue(new TreatmentRequest(7));
        queue.enqueue(new TreatmentRequest(8));
        queue.print();
        queue.size();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

    }
}
