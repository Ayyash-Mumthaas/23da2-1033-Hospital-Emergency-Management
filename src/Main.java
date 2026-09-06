public class Main {
    public static void main(String[] args) {

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

        System.out.println("=== ADDING VISITS FOR AYYASH ===");

        patient1.visitHistory.addVisit(
                new Visit(
                        501,
                        "2026-09-01",
                        "Dr. Silva",
                        "Fever",
                        "Medication"
                )
        );

        patient1.visitHistory.addVisit(
                new Visit(
                        502,
                        "2026-09-03",
                        "Dr. Fernando",
                        "Fever",
                        "Follow-up treatment"
                )
        );

        System.out.println();

        System.out.println("=== AYYASH'S VISIT HISTORY ===");
        patient1.visitHistory.displayVisits();

        System.out.println();

        System.out.println("=== HAFSA'S VISIT HISTORY ===");

        patient2.visitHistory.addVisit(
                new Visit(
                        601,
                        "2026-09-05",
                        "Dr. Kumar",
                        "Asthma",
                        "Inhaler Treatment"
                )
        );

        patient2.visitHistory.displayVisits();

        System.out.println();

        System.out.println("=== SEARCH AYYASH'S VISIT 502 ===");

        Visit foundVisit = patient1.visitHistory.searchVisit(502);

        if (foundVisit != null) {
            System.out.println("Visit found:");
            System.out.println(foundVisit);
        } else {
            System.out.println("Visit not found.");
        }

        System.out.println();

        System.out.println("=== REMOVE AYYASH'S VISIT 501 ===");

        patient1.visitHistory.removeVisit(501);

        System.out.println();

        System.out.println("=== AYYASH'S HISTORY AFTER REMOVAL ===");
        patient1.visitHistory.displayVisits();

        System.out.println();

        System.out.println("=== HAFSA'S HISTORY REMAINS UNCHANGED ===");
        patient2.visitHistory.displayVisits();
    }
}