public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int jumlah_halaman;
    private float harga;

    public int getid(){
        return this.id;
    }
    public String getJudul() {
        return this.judul;
    }
    public String getPenulis() {
        return this.penulis;
    }
    public int getjumlah_halaman() {
        return this.jumlah_halaman;
    }
    public float getHarga() {
        return this.harga;
    }

    public void naikkanharga(){
        System.out.println("Harga Naik satu kali lipat");
    }
    public void naikkanharga(float harga){
        System.out.println("Harga Naik dua kali lipat");
    }
}
