public class Bebas {
    private int id;
    private String hari;
    private String matkul;
    private int pengajar;

    public int getid(){
        return this.id;
    }
    public String getHari() {
        return this.hari;
    }
    public String getMatkul() {
        return this.matkul;
    }
    public int getPengajar() {
        return this.pengajar;
    }

    public void absensi(){
        System.out.println("Masuk, Ijin, Sakit");
    }
    public void nilai(){
        System.out.println("Nilai Tugas, Absensi, UTS, UAS");
    }
}
