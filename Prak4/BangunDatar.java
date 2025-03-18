package SMT4.PBO.Prak4;

public class BangunDatar {
    // Atribut
    private int jmlSisi;  // Jumlah sisi
    private String warna; // Warna bangun datar
    private String border; // Jenis border

    // Konstruktor default
    public BangunDatar(double getJmlSisi, String warna, String border){
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
    }

     // Getter dan Setter untuk jmlSisi
    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    // Getter dan Setter untuk warna
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Getter dan Setter untuk border
    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    // Method untuk menampilkan informasi bangun datar
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}