public class Patient {
    int patientId;
    String name;
    int age;
    String contact;
    String medicalCondition;

    public Patient(int patientId, String name, int age, String contact, String medicalCondition) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.medicalCondition = medicalCondition;
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