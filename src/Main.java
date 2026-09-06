public class Main {
    public static void main(String[] args) {

        VisitLinkedList visitHistory = new VisitLinkedList();

        Visit visit1 = new Visit(
                501,
                "2026-09-01",
                "Dr. Silva",
                "Fever",
                "Medication"
        );

        Visit visit2 = new Visit(
                502,
                "2026-09-03",
                "Dr. Fernando",
                "Diabetes",
                "Insulin Treatment"
        );

        Visit visit3 = new Visit(
                503,
                "2026-09-05",
                "Dr. Kumar",
                "Asthma",
                "Inhaler Treatment"
        );

        System.out.println("=== ADDING PATIENT VISITS ===");

        visitHistory.addVisit(visit1);
        visitHistory.addVisit(visit2);
        visitHistory.addVisit(visit3);

        System.out.println();

        visitHistory.displayVisits();

        System.out.println("\n=== SEARCH VISIT 502 ===");

        Visit foundVisit = visitHistory.searchVisit(502);

        if (foundVisit != null) {
            System.out.println("Visit found:");
            System.out.println(foundVisit);
        } else {
            System.out.println("Visit not found.");
        }

        System.out.println("\n=== REMOVE VISIT 502 ===");

        visitHistory.removeVisit(502);

        System.out.println("\n=== VISITS AFTER REMOVAL ===");

        visitHistory.displayVisits();

        System.out.println("\n=== REMOVE NON-EXISTING VISIT ===");

        visitHistory.removeVisit(999);

        System.out.println("\n=== EMPTY LIST TEST ===");

        visitHistory.removeVisit(501);
        visitHistory.removeVisit(503);

        visitHistory.displayVisits();
    }
}