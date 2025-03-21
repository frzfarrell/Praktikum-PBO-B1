public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;
    
    public PNS(String nama, int tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    
    public static int getCounterPNS() {
        return counterPNS;
    }
    
    @Override
    public int hitungMasaKerja() {
        return (2025 - tglMulaiKerja) + 6;
    }
    
    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }
}