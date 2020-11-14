package charis07103_main;
import java.util.Date;

    public class charis07153_Nota {
    Date Tanggalparkir;
    String jammasuk, petugas;
    String menitmasuk;
    int jamkeluar;
    int menitkeluar;
    
        public charis07153_Nota(Date tanggalparkir, String jammasuk, String menitmasuk, int jamkeluar, int menitkeluar, String petugas){
        this.Tanggalparkir = tanggalparkir;
        this.jammasuk = jammasuk;
        this.jamkeluar = jamkeluar;
        this.menitmasuk = menitmasuk;
        this.menitkeluar = menitkeluar;
        this.petugas = petugas;
    }

    Date getCharis07153_Tanggalparkir() {
        return Tanggalparkir;
    }

    String getCharis07153_jammasuk() {
        return jammasuk;
    }

    String getCharis07153_petugas() {
        return petugas;
    }

    String getCharis07153_menitmasuk() {
        return menitmasuk;
    }

    int getCharis07153_jamkeluar() {
        return jamkeluar;
    }

    int getCharis07153_menitkeluar() {
        return menitkeluar;
    }
 
}

