public class PatientBST {
    private PatientNode root;

    public void insert(Patient patient) {
        root = insertRecursive(root, patient);
    }

    private PatientNode insertRecursive(PatientNode current, Patient patient) {
        if (current == null) {
            return new PatientNode(patient);
        }

        if (patient.patientId < current.patient.patientId) {
            current.left = insertRecursive(current.left, patient);
        } else if (patient.patientId > current.patient.patientId) {
            current.right = insertRecursive(current.right, patient);
        } else {
            System.out.println("Patient ID already exists.");
        }

        return current;
    }

    public Patient search(int patientId) {
        PatientNode current = root;

        while (current != null) {
            if (patientId == current.patient.patientId) {
                return current.patient;
            }

            if (patientId < current.patient.patientId) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return null;
    }

    public void delete(int patientId) {
        root = deleteRecursive(root, patientId);
    }

    private PatientNode deleteRecursive(PatientNode current, int patientId) {
        if (current == null) {
            return null;
        }

        if (patientId < current.patient.patientId) {
            current.left = deleteRecursive(current.left, patientId);
        } else if (patientId > current.patient.patientId) {
            current.right = deleteRecursive(current.right, patientId);
        } else {
            // Case 1: No children
            if (current.left == null && current.right == null) {
                return null;
            }

            // Case 2: Only right child
            if (current.left == null) {
                return current.right;
            }

            // Case 2: Only left child
            if (current.right == null) {
                return current.left;
            }

            // Case 3: Two children
            PatientNode smallestNode = findSmallest(current.right);
            current.patient = smallestNode.patient;
            current.right = deleteRecursive(current.right, smallestNode.patient.patientId);
        }

        return current;
    }

    private PatientNode findSmallest(PatientNode node) {
        PatientNode current = node;

        while (current.left != null) {
            current = current.left;
        }

        return current;
    }

    public void displayInOrder() {
        if (root == null) {
            System.out.println("No patients found.");
            return;
        }

        inOrderRecursive(root);
    }

    private void inOrderRecursive(PatientNode current) {
        if (current != null) {
            inOrderRecursive(current.left);
            System.out.println(current.patient);
            inOrderRecursive(current.right);
        }
    }
}