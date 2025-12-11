public class TaskTest {
    public static void main(String[] args) {
        TreatmentQueue queue = new TreatmentQueue();
        queue.enqueue(new TreatmentRequest(101));
        queue.enqueue(new TreatmentRequest(102));
        queue.enqueue(new TreatmentRequest(103));
        queue.enqueue(new TreatmentRequest(104));
        queue.enqueue(new TreatmentRequest(105));
        queue.enqueue(new TreatmentRequest(106));
        queue.enqueue(new TreatmentRequest(107));
        queue.enqueue(new TreatmentRequest(108));
        queue.print();
        queue.size();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

    }
}
