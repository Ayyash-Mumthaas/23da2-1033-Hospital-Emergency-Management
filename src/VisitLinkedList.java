public class VisitLinkedList {

    private VisitNode head;

    public VisitLinkedList() {
        head = null;
    }

    // Add a new visit to the end of the list
    public void addVisit(Visit visit) {

        VisitNode newNode = new VisitNode(visit);

        if (head == null) {
            head = newNode;
            System.out.println("Visit added successfully.");
            return;
        }

        VisitNode current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        System.out.println("Visit added successfully.");
    }

    // Remove a visit using Visit ID
    public void removeVisit(int visitId) {

        if (head == null) {
            System.out.println("Visit history is empty.");
            return;
        }

        if (head.visit.visitId == visitId) {
            head = head.next;
            System.out.println("Visit removed successfully.");
            return;
        }

        VisitNode current = head;

        while (current.next != null) {

            if (current.next.visit.visitId == visitId) {
                current.next = current.next.next;
                System.out.println("Visit removed successfully.");
                return;
            }

            current = current.next;
        }

        System.out.println("Visit not found.");
    }

    // Search for a visit using Visit ID
    public Visit searchVisit(int visitId) {

        VisitNode current = head;

        while (current != null) {

            if (current.visit.visitId == visitId) {
                return current.visit;
            }

            current = current.next;
        }

        return null;
    }

    // Display all visits
    public void displayVisits() {

        if (head == null) {
            System.out.println("Visit history is empty.");
            return;
        }

        System.out.println("=== PATIENT VISIT HISTORY ===");

        VisitNode current = head;

        while (current != null) {
            System.out.println(current.visit);
            current = current.next;
        }
    }

    // Check whether the list is empty
    public boolean isEmpty() {
        return head == null;
    }
}