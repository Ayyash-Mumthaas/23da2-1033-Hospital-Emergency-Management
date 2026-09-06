import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static PatientBST patientBST = new PatientBST();
    static EmergencyQueue emergencyQueue = new EmergencyQueue();
    static TreatmentStack treatmentStack = new TreatmentStack();

    public static void main(String[] args) {

        // Sample patients for demonstration
        patientBST.insert(new Patient(
                1001,
                "Ayyash Mumthaas",
                22,
                "0771234567",
                "Fever"
        ));

        patientBST.insert(new Patient(
                1003,
                "Mumthaas Haneefa",
                46,
                "0753456789",
                "Diabetes"
        ));

        patientBST.insert(new Patient(
                1005,
                "Hafsa Jinnah",
                23,
                "0712345678",
                "Asthma"
        ));

        patientBST.insert(new Patient(
                1008,
                "Jinnah Hameedh",
                56,
                "0764567890",
                "Migraine"
        ));

        System.out.println("==============================================");
        System.out.println("     HOSPITAL EMERGENCY MANAGEMENT SYSTEM");
        System.out.println("==============================================");
        System.out.println("Sample patient records loaded for demonstration.");

        boolean running = true;

        while (running) {

            displayMenu();

            int choice = readInt("Enter your choice: ");

            System.out.println();

            switch (choice) {

                case 1:
                    registerPatient();
                    break;

                case 2:
                    searchPatient();
                    break;

                case 3:
                    deletePatient();
                    break;

                case 4:
                    displayPatients();
                    break;

                case 5:
                    addToEmergencyQueue();
                    break;

                case 6:
                    treatNextEmergencyPatient();
                    break;

                case 7:
                    emergencyQueue.displayQueue();
                    break;

                case 8:
                    completeTreatment();
                    break;

                case 9:
                    popLastTreatment();
                    break;

                case 10:
                    treatmentStack.displayStack();
                    break;

                case 11:
                    addPatientVisit();
                    break;

                case 12:
                    removePatientVisit();
                    break;

                case 13:
                    searchPatientVisit();
                    break;

                case 14:
                    displayPatientVisitHistory();
                    break;

                case 0:
                    running = false;
                    System.out.println("Thank you for using the Hospital Emergency Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }

            System.out.println();
        }

        scanner.close();
    }

    // ========================= MENU =========================

    public static void displayMenu() {

        System.out.println();
        System.out.println("--------------- MAIN MENU ----------------");
        System.out.println("1.  Register New Patient");
        System.out.println("2.  Search Patient");
        System.out.println("3.  Delete Patient");
        System.out.println("4.  Display Patients by ID");
        System.out.println("5.  Add Patient to Emergency Queue");
        System.out.println("6.  Treat Next Emergency Patient");
        System.out.println("7.  Display Emergency Queue");
        System.out.println("8.  Complete Treatment");
        System.out.println("9.  Pop Last Treatment Record");
        System.out.println("10. Display Treatment History");
        System.out.println("11. Add Patient Visit");
        System.out.println("12. Remove Patient Visit");
        System.out.println("13. Search Patient Visit");
        System.out.println("14. Display Patient Visit History");
        System.out.println("0.  Exit");
        System.out.println("-------------------------------------------");
    }

    // ========================= PATIENT BST =========================

    public static void registerPatient() {

        System.out.println("=== REGISTER NEW PATIENT ===");

        int patientId = readPositiveInt("Enter Patient ID: ");

        if (patientBST.search(patientId) != null) {
            System.out.println("Patient ID already exists.");
            return;
        }

        String name = readNonEmptyString("Enter Patient Name: ");
        int age = readPositiveInt("Enter Age: ");
        String contact = readNonEmptyString("Enter Contact Number: ");
        String condition = readNonEmptyString("Enter Medical Condition: ");

        Patient patient = new Patient(
                patientId,
                name,
                age,
                contact,
                condition
        );

        patientBST.insert(patient);

        System.out.println("Patient registered successfully.");
    }

    public static void searchPatient() {

        System.out.println("=== SEARCH PATIENT ===");

        int patientId = readPositiveInt("Enter Patient ID: ");

        Patient patient = patientBST.search(patientId);

        if (patient != null) {
            System.out.println("Patient found:");
            System.out.println(patient);
        } else {
            System.out.println("Patient not found.");
        }
    }

    public static void deletePatient() {

        System.out.println("=== DELETE PATIENT ===");

        int patientId = readPositiveInt("Enter Patient ID: ");

        Patient patient = patientBST.search(patientId);

        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }

        patientBST.delete(patientId);

        System.out.println("Patient deleted successfully.");
    }

    public static void displayPatients() {

        System.out.println("=== PATIENT RECORDS BY ID ===");

        patientBST.displayInOrder();
    }

    // ========================= EMERGENCY QUEUE =========================

    public static void addToEmergencyQueue() {

        System.out.println("=== ADD PATIENT TO EMERGENCY QUEUE ===");

        int patientId = readPositiveInt("Enter Patient ID: ");

        Patient patient = patientBST.search(patientId);

        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }

        emergencyQueue.enqueue(patient);

        System.out.println("Added patient:");
        System.out.println(patient);
    }

    public static void treatNextEmergencyPatient() {

        System.out.println("=== TREAT NEXT EMERGENCY PATIENT ===");

        Patient patient = emergencyQueue.dequeue();

        if (patient != null) {
            System.out.println("Next patient for treatment:");
            System.out.println(patient);
        }
    }

    // ========================= TREATMENT STACK =========================

    public static void completeTreatment() {

        System.out.println("=== COMPLETE TREATMENT ===");

        int patientId = readPositiveInt("Enter Patient ID: ");

        Patient patient = patientBST.search(patientId);

        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }

        String treatment = readNonEmptyString("Enter Treatment: ");
        String doctor = readNonEmptyString("Enter Doctor Name: ");

        TreatmentRecord record = new TreatmentRecord(
                patient.patientId,
                patient.name,
                treatment,
                doctor
        );

        treatmentStack.push(record);

        System.out.println("Treatment completed and added to treatment history.");
    }

    public static void popLastTreatment() {

        System.out.println("=== POP LAST TREATMENT RECORD ===");

        TreatmentRecord record = treatmentStack.pop();

        if (record != null) {
            System.out.println("Last treatment record:");
            System.out.println(record);
        }
    }

    // ========================= VISIT LINKED LIST =========================

    public static Patient getPatientForVisit() {

        int patientId = readPositiveInt("Enter Patient ID: ");

        Patient patient = patientBST.search(patientId);

        if (patient == null) {
            System.out.println("Patient not found.");
        }

        return patient;
    }

    public static void addPatientVisit() {

        System.out.println("=== ADD PATIENT VISIT ===");

        Patient patient = getPatientForVisit();

        if (patient == null) {
            return;
        }

        int visitId = readPositiveInt("Enter Visit ID: ");
        String date = readNonEmptyString("Enter Visit Date: ");
        String doctor = readNonEmptyString("Enter Doctor Name: ");
        String diagnosis = readNonEmptyString("Enter Diagnosis: ");
        String treatment = readNonEmptyString("Enter Treatment: ");

        Visit visit = new Visit(
                visitId,
                date,
                doctor,
                diagnosis,
                treatment
        );

        patient.visitHistory.addVisit(visit);
    }

    public static void removePatientVisit() {

        System.out.println("=== REMOVE PATIENT VISIT ===");

        Patient patient = getPatientForVisit();

        if (patient == null) {
            return;
        }

        int visitId = readPositiveInt("Enter Visit ID: ");

        patient.visitHistory.removeVisit(visitId);
    }

    public static void searchPatientVisit() {

        System.out.println("=== SEARCH PATIENT VISIT ===");

        Patient patient = getPatientForVisit();

        if (patient == null) {
            return;
        }

        int visitId = readPositiveInt("Enter Visit ID: ");

        Visit visit = patient.visitHistory.searchVisit(visitId);

        if (visit != null) {
            System.out.println("Visit found:");
            System.out.println(visit);
        } else {
            System.out.println("Visit not found.");
        }
    }

    public static void displayPatientVisitHistory() {

        System.out.println("=== DISPLAY PATIENT VISIT HISTORY ===");

        Patient patient = getPatientForVisit();

        if (patient == null) {
            return;
        }

        System.out.println("Visit history for " + patient.name + ":");

        patient.visitHistory.displayVisits();
    }

    // ========================= INPUT VALIDATION =========================

    public static int readInt(String message) {

        while (true) {

            System.out.print(message);

            if (scanner.hasNextInt()) {

                int value = scanner.nextInt();
                scanner.nextLine();

                return value;

            } else {

                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }

    public static int readPositiveInt(String message) {

        while (true) {

            int value = readInt(message);

            if (value > 0) {
                return value;
            }

            System.out.println("Please enter a positive number.");
        }
    }

    public static String readNonEmptyString(String message) {

        while (true) {

            System.out.print(message);

            String value = scanner.nextLine().trim();

            if (!value.isEmpty()) {
                return value;
            }

            System.out.println("This field cannot be empty.");
        }
    }
}