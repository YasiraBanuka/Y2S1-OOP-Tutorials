package Ex2;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        PriorityQueue<Patient> pq = new PriorityQueue<>();

        Patient p1 = new Patient("Amali", 23, 5);
        Patient p2 = new Patient("Sunil", 35, 6);
        Patient p3 = new Patient("Kamal", 30, 7);
        Patient p4 = new Patient("Nimal", 28, 8);

        pq.add(p1);
        pq.add(p2);
        pq.add(p3);
        pq.add(p4);

        System.out.println(pq.poll().getAppointmentNo());

        Patient p5 = new Patient("Ajith", 35, 4);
        pq.add(p5);

        System.out.println(pq.poll().getAppointmentNo());

        System.out.println(pq.poll().getAppointmentNo());

    }
}
