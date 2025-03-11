public class AngkaSial {
    public void cobaAngka (int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }
    
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

//Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
/*Jawaban: Tidak. Jika eksepsi terjadi sebelum mencapai baris ini, program akan langsung melompat ke blok catch, sehingga baris tersebut tidak akan dieksekusi. */

//Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
/*Jawaban: Ya. Baris ini berada di dalam blok catch, sehingga akan dijalankan jika terjadi eksepsi AngkaSialException.*/
