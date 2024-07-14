public class main {
    public static void main(String[] args) {
        String variabelString;
        Pengguna pengguna = new Pengguna();
        Buku buku = new Buku();

    }
    public class Tamu extends Pengguna {
        private int sisaMasaAktif;

        public void menambahMasaAktif(int tambahan){
            this.sisaMasaAktif = this.sisaMasaAktif + tambahan;
        }

        public void hapus(){
            System.out.println("DELETE FROM pengguna WHERE status= 'tamu' ");
        }

        public void login(){
            System.out.println("Login sebagai tamu");
        }
    }
    public class Komik extends Buku {
        private int Volume;

        public void VolumeKomik(int tambahan){
            this.Volume = this.Volume + tambahan;
        }

        public void naikkanharga() {
            System.out.println("Overriding");
        }
    }
    
}
