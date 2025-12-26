import TASK3.DischargeRecord;
import TASK3.DischargeStack;

public static void main(String[] args) {
    DischargeStack stack = new DischargeStack();

    stack.push(new DischargeRecord(1, 10));
    stack.push(new DischargeRecord(2, 20));
    stack.push(new DischargeRecord(3, 30));
    stack.push(new DischargeRecord(4, 40));
    stack.push(new DischargeRecord(5, 50));

    stack.pop();
    stack.pop();

    stack.printStack();
}
