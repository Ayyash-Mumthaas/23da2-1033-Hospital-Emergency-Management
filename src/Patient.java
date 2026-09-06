public class Patient {
    int patientId;
    String name;
    int age;
    String contact;
    String medicalCondition;
    VisitLinkedList visitHistory;

    public Patient(int patientId, String name, int age, String contact, String medicalCondition) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.medicalCondition = medicalCondition;
        this.visitHistory = new VisitLinkedList();
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientId
                + ", Name: " + name
                + ", Age: " + age
                + ", Contact: " + contact
                + ", Condition: " + medicalCondition;
    }
}