public class Petani extends Manusia implements Pajak {
    private String asalKota;
    private static int counterPetani = 0;
    
    public Petani(String nama, int tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }
    
    public static int getCounterPetani() {
        return counterPetani;
    }
    
    @Override
    public int hitungMasaKerja() {
        return (2025 - tglMulaiKerja) + 1;
    }
    
    @Override
    public double hitungPajak() {
        return 0;
    }
}