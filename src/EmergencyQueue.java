public class EmergencyQueue {

    private PatientNode front;
    private PatientNode rear;

    public EmergencyQueue() {
        front = null;
        rear = null;
    }

    // Add a patient to the end of the queue
    public void enqueue(Patient patient) {

        PatientNode newNode = new PatientNode(patient);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.right = newNode;
            rear = newNode;
        }

        System.out.println("Patient added to emergency queue.");
    }

    // Remove the patient at the front of the queue
    public Patient dequeue() {

        if (front == null) {
            System.out.println("Emergency queue is empty.");
            return null;
        }

        Patient patient = front.patient;
        front = front.right;

        if (front == null) {
            rear = null;
        }

        System.out.println("Patient removed from emergency queue.");
        return patient;
    }

    // Display all waiting patients
    public void displayQueue() {

        if (front == null) {
            System.out.println("Emergency queue is empty.");
            return;
        }

        PatientNode current = front;

        System.out.println("=== EMERGENCY QUEUE ===");

        while (current != null) {
            System.out.println(current.patient);
            current = current.right;
        }
    }

    // Check whether the queue is empty
    public boolean isEmpty() {
        return front == null;
    }
}