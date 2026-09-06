public class Main {
    public static void main(String[] args) {

        PatientBST patientBST = new PatientBST();

        Patient patient1 = new Patient(
                1001,
                "Ayyash Mumthaas",
                22,
                "0771234567",
                "Fever"
        );

        Patient patient2 = new Patient(
                1005,
                "Hafsa Jinnah",
                23,
                "0712345678",
                "Asthma"
        );

        Patient patient3 = new Patient(
                1003,
                "Mumthaas Haneefa",
                46,
                "0753456789",
                "Diabetes"
        );

        Patient patient4 = new Patient(
                1008,
                "Jinnah Hameedh",
                56,
                "0764567890",
                "Migraine"
        );

        patientBST.insert(patient1);
        patientBST.insert(patient2);
        patientBST.insert(patient3);
        patientBST.insert(patient4);

        System.out.println("=== PATIENT RECORDS ===");
        patientBST.displayInOrder();

        System.out.println("\n=== SEARCH PATIENT ===");
        Patient foundPatient = patientBST.search(1003);

        if (foundPatient != null) {
            System.out.println("Patient found:");
            System.out.println(foundPatient);
        } else {
            System.out.println("Patient not found.");
        }

        System.out.println("\n=== DELETE PATIENT 1005 ===");
        patientBST.delete(1005);

        System.out.println("\n=== PATIENT RECORDS AFTER DELETION ===");
        patientBST.displayInOrder();
    }
}