package SMT4.PBO.Tugas Lanj. Poliformisme;

public class Main {
    public static void main(String[] args) {
        Anabul[] hewan = {
            new Kucing(),
            new Anjing(),
            new Burung()
        };

        for (Anabul h : hewan) {
            h.Gerak();
            h.Bersuara();
            System.out.println();
        }
    }
}