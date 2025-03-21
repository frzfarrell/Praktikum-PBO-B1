public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;
    
    public Pengusaha(String nama, int tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
    
    @Override
    public int hitungMasaKerja() {
        return (2025 - tglMulaiKerja) + 4;
    }
    
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
}