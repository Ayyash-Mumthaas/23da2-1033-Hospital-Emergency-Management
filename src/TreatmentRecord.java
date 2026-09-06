public class TreatmentRecord {

    int patientId;
    String patientName;
    String treatment;
    String doctor;

    public TreatmentRecord(int patientId, String patientName, String treatment, String doctor) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.treatment = treatment;
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientId
                + ", Patient Name: " + patientName
                + ", Treatment: " + treatment
                + ", Doctor: " + doctor;
    }
}