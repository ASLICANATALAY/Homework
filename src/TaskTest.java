public static void main(String[] args) {
    DischargeStack stack = new DischargeStack();

    stack.push(new DischargeRecord(1, 1000));
    stack.push(new DischargeRecord(2, 2000));
    stack.push(new DischargeRecord(3, 3000));
    stack.push(new DischargeRecord(4, 4000));
    stack.push(new DischargeRecord(5, 5000));

    stack.pop();
    stack.pop();

    stack.printStack();
}
