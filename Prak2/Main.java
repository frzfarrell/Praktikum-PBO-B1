public class Main {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        MataKuliah RPL = new MataKuliah("RPL", "Rekayasa Perangkat Lunak", 3);
        Mahasiswa M1 = new Mahasiswa("211", "Ferza", "Informatika");
        Dosen D1 = new Dosen("010", "Roni", "Informatika");
        Kendaraan K1 = new Kendaraan("B9999WSW", "Motor");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.addMatkul(RPL);
        M1.printDetailMhs();
    }
}