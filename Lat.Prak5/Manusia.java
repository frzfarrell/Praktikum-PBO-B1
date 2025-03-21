public abstract class Manusia {
    protected String nama;
    protected String alamat;
    protected double pendapatan;
    protected int tglMulaiKerja;
    private static int counterMns = 0;
    
    public Manusia(String nama, int tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    
    public static int getCounterMns() {
        return counterMns;
    }
    
    public abstract int hitungMasaKerja();
    
    public abstract double hitungPajak();
    
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Pajak: " + hitungPajak());
    }
}