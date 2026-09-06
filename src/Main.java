public class Main {
    public static void main(String[] args) {

        EmergencyQueue emergencyQueue = new EmergencyQueue();

        Patient patient1 = new Patient(
                1001,
                "Ayyash Mumthaas",
                22,
                "0771234567",
                "Fever"
        );

        Patient patient2 = new Patient(
                1003,
                "Mumthaas Haneefa",
                46,
                "0753456789",
                "Diabetes"
        );

        Patient patient3 = new Patient(
                1005,
                "Hafsa Jinnah",
                23,
                "0712345678",
                "Asthma"
        );

        System.out.println("=== ADDING PATIENTS TO EMERGENCY QUEUE ===");

        emergencyQueue.enqueue(patient1);
        emergencyQueue.enqueue(patient2);
        emergencyQueue.enqueue(patient3);

        System.out.println();

        emergencyQueue.displayQueue();

        System.out.println("\n=== DEQUEUE ===");

        Patient treatedPatient = emergencyQueue.dequeue();

        if (treatedPatient != null) {
            System.out.println("Next patient:");
            System.out.println(treatedPatient);
        }

        System.out.println("\n=== QUEUE AFTER DEQUEUE ===");

        emergencyQueue.displayQueue();

        System.out.println("\n=== EMPTY QUEUE TEST ===");

        emergencyQueue.dequeue();
        emergencyQueue.dequeue();

        System.out.println("\nTrying to dequeue from an empty queue:");
        emergencyQueue.dequeue();
    }
}