public class TreatmentStack {

    private TreatmentRecord[] stack;
    private int top;

    public TreatmentStack() {
        stack = new TreatmentRecord[100];
        top = -1;
    }

    // Add a treatment record to the top of the stack
    public void push(TreatmentRecord record) {

        if (top == stack.length - 1) {
            System.out.println("Treatment stack is full.");
            return;
        }

        top++;
        stack[top] = record;

        System.out.println("Treatment record added to stack.");
    }

    // Remove the most recent treatment record
    public TreatmentRecord pop() {

        if (top == -1) {
            System.out.println("Treatment stack is empty.");
            return null;
        }

        TreatmentRecord record = stack[top];
        stack[top] = null;
        top--;

        System.out.println("Treatment record removed from stack.");

        return record;
    }

    // Display treatment history
    public void displayStack() {

        if (top == -1) {
            System.out.println("Treatment stack is empty.");
            return;
        }

        System.out.println("=== TREATMENT HISTORY ===");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    // Check whether the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
}