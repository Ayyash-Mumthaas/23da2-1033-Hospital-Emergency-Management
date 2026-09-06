public class Main {
    public static void main(String[] args) {

        TreatmentStack treatmentStack = new TreatmentStack();

        TreatmentRecord treatment1 = new TreatmentRecord(
                1001,
                "Ayyash Mumthaas",
                "Medication",
                "Dr. Silva"
        );

        TreatmentRecord treatment2 = new TreatmentRecord(
                1003,
                "Mumthaas Haneefa",
                "Insulin Treatment",
                "Dr. Fernando"
        );

        TreatmentRecord treatment3 = new TreatmentRecord(
                1005,
                "Hafsa Jinnah",
                "Asthma Treatment",
                "Dr. Kumar"
        );

        System.out.println("=== ADDING TREATMENT RECORDS ===");

        treatmentStack.push(treatment1);
        treatmentStack.push(treatment2);
        treatmentStack.push(treatment3);

        System.out.println();

        treatmentStack.displayStack();

        System.out.println("\n=== POP ===");

        TreatmentRecord removedRecord = treatmentStack.pop();

        if (removedRecord != null) {
            System.out.println("Last treatment:");
            System.out.println(removedRecord);
        }

        System.out.println("\n=== STACK AFTER POP ===");

        treatmentStack.displayStack();

        System.out.println("\n=== EMPTY STACK TEST ===");

        treatmentStack.pop();
        treatmentStack.pop();

        System.out.println("\nTrying to pop from an empty stack:");
        treatmentStack.pop();
    }
}