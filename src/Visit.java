public class Visit {

    int visitId;
    String date;
    String doctor;
    String diagnosis;
    String treatment;

    public Visit(int visitId, String date, String doctor, String diagnosis, String treatment) {
        this.visitId = visitId;
        this.date = date;
        this.doctor = doctor;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    @Override
    public String toString() {
        return "Visit ID: " + visitId
                + ", Date: " + date
                + ", Doctor: " + doctor
                + ", Diagnosis: " + diagnosis
                + ", Treatment: " + treatment;
    }
}