package Ex2;

public class Patient extends Person implements Comparable{

    private int appointmentNo;

    public Patient(String name, int age, int appointmentNo) {
        super(name, age);
        this.appointmentNo = appointmentNo;
    }

    public void setAppointmentNo(int appointmentNo) {
        this.appointmentNo = appointmentNo;
    }

    public int getAppointmentNo() {
        return this.appointmentNo;
    }

    public int compareTo(Object o) {
        return this.appointmentNo - ((Patient)o).appointmentNo;
    }

}
