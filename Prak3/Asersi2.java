class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0): "Jari jari tidak boleh nol!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

//secara konsep, ada yang kurang tepat pada program Asersi2 di atas.

/*Jawaban: Program Asersi2 tidak menggunakan assertion dengan tepat.
Assertion seharusnya digunakan untuk memeriksa kondisi yang seharusnya tidak mungkin terjadi dalam program, bukan untuk memvalidasi input pengguna. Dalam kode ini, nilai jariJari diinisialisasi dengan 0, sehingga assertion akan selalu gagal jika fitur ini diaktifkan. */