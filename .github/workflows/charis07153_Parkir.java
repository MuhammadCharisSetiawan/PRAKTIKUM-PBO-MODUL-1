package charis07103_main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class charis07153_Parkir {
    static ArrayList <charis07153_Kendaraan> kendaraan = new ArrayList();
    static ArrayList <charis07153_Nota> nota = new ArrayList();
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
                System.out.println("Program Sistem Informasi Data Parkir Bandara Juanda");
                int charis07153_pilihan;
                do {
                    System.out.println("[1] Input data");
                    System.out.println("[2] Delete data");
                    System.out.println("[3] Lihat data"); 
                    System.out.println("[4] Cetak nota");
                    System.out.println("[5] Exit");
                    System.out.print("Pilihan = ");
                    charis07153_pilihan = input.nextInt();
                    switch(charis07153_pilihan){
                       case 1:
                           charis07153_input();
                           break;
                       case 2 :
                           charis07153_hapus();
                           break;
                       case 3 :
                           charis07153_lihatdata();
                           break;
                       case 4 : 
                           charis07153_cetaknota();
                           break;
                } 
                
            }while(charis07153_pilihan!=5);
    }
    
    static void charis07153_input() {
        System.out.println("Kondisi Kendaraan       = "+charis07153_Kondisi.kondisikendaraan[0]);
        System.out.print("Masukkan Nama Petugas  = ");
        String charis07153_petugas = input.next();
        System.out.println("-------Mobil atau Motor--------");
        System.out.print("Masukkan Jenis Kendaraan  = ");
        String charis07153_jeniskendaraan = input.next();
        System.out.print("Masukkan Plat Nomor       = ");
        String charis07153_platnomor = input.next();
        kendaraan.add(new charis07153_Kendaraan(charis07153_platnomor,charis07153_jeniskendaraan));
        System.out.print("Masukkan Tanggal Masuk (MM-dd-yyyy)= ");
        Date Tanggalparkir =new Date(input.next());
        String charis07153_jammasuk;
        String charis07153_menitmasuk;                
        DateFormat formatcharis07153_Hmasuk = new SimpleDateFormat("HH");
        DateFormat formatcharis07153_Mmasuk = new SimpleDateFormat("mm");
        Date getcharis07153_jammasuk = new Date();
        Date getcharis07153_menitmasuk = new Date(); 
        charis07153_jammasuk = formatcharis07153_Hmasuk.format(getcharis07153_jammasuk);
        charis07153_menitmasuk = formatcharis07153_Mmasuk.format(getcharis07153_menitmasuk);
        System.out.print("Masukkan Jam Keluar       = ");
        int charis07153_jamkeluar = input.nextInt();
        System.out.print("Masukkan Menit Keluar     = ");
        int charis07153_menitkeluar = input.nextInt();
       nota.add(new charis07153_Nota(Tanggalparkir,charis07153_jammasuk,charis07153_menitmasuk,charis07153_jamkeluar,charis07153_menitkeluar,charis07153_petugas)); 
        
    }
    
    static void charis07153_hapus(){
        int charis07153_index;
        if(kendaraan.isEmpty()){
        System.out.println("DATA PARKIR KOSONG");
        }
        else{
        for(int charis07153_i=0;charis07153_i<=kendaraan.size();charis07153_i++){
        System.out.println("["+charis07153_i+"]"+"Plat nomor          = "+kendaraan.get(charis07153_i).getcharis07153_Platnomor());                        
        System.out.print("Plat nomor yang mau dihapus = ");
        charis07153_index = input.nextInt();
        kendaraan.remove(charis07153_index);
        System.out.println("Data Telah Terhapus");
    }
        }
        }
    
    static void charis07153_lihatdata(){
            if(kendaraan.isEmpty()){
            System.out.println("DATA PARKIR KOSONG");
        }else{
        for(int charis07153_i=0;charis07153_i<kendaraan.size();charis07153_i++){
        System.out.println("Nama Petugas Parkir = "+nota.get(charis07153_i).getCharis07153_petugas());
        System.out.println("Jenis kendaraan     = "+kendaraan.get(charis07153_i).getcharis07153_Jeniskendaraan());
        System.out.println("Plat nomor          = "+kendaraan.get(charis07153_i).getcharis07153_Platnomor());            
        System.out.println("Tanggal parkir      = "+new SimpleDateFormat("dd-MM-yyyy").format(nota.get(charis07153_i).Tanggalparkir));
        System.out.println("Waktu masuk         = "+nota.get(0).jammasuk + " : " + nota.get(0).menitmasuk + " WIB");
        System.out.println("Waktu keluar        = "+nota.get(0).jamkeluar + " : " + nota.get(0).menitkeluar + " WIB");
        System.out.println("-----------------------------------------------------------");
        }
    }
    }
    
    static void charis07153_cetaknota(){
        int charis07153_x;
            if(kendaraan.isEmpty()){
            System.out.println("DATA PARKIR KOSONG");
        }else{
                for(int charis07153_i=0;charis07153_i<kendaraan.size();charis07153_i++){
           System.out.println("["+charis07153_i+"]"+"Plat nomor          = "+kendaraan.get(charis07153_i).getcharis07153_Platnomor());                        
        }
        System.out.print("index plat nomor = ");
        charis07153_x = input.nextInt();
        int charis07153_timeH = Integer.parseInt(nota.get(0).jammasuk);
        int charis07153_timeM = Integer.parseInt(nota.get(0).menitmasuk);        
        System.out.println("====BANDARA UDARA JUANDA SURABAYA====");
        System.out.println("====================================");
            System.out.println("Kondisi kendaraan   = "+charis07153_Kondisi.kondisikendaraan[1]+"\n");
            System.out.println("Nama Petugas Parkir = "+nota.get(charis07153_x).getCharis07153_petugas());
            System.out.println("Jenis kendaraan     = "+kendaraan.get(charis07153_x).getcharis07153_Jeniskendaraan());
            System.out.println("Plat nomor          = "+kendaraan.get(charis07153_x).getcharis07153_Platnomor());
            System.out.println("Tanggal parkir      = "+new SimpleDateFormat("dd-MM-yyyy").format(nota.get(charis07153_x).Tanggalparkir));
            System.out.println("Waktu masuk         = " + charis07153_timeH + " : " + charis07153_timeM + " WIB");
            System.out.println("Waktu keluar        = " +nota.get(charis07153_x).jamkeluar + " : " + nota.get(charis07153_x).menitkeluar + " WIB");
            int durasijam = nota.get(charis07153_x).jamkeluar - charis07153_timeH;
            int durasimenit = nota.get(charis07153_x).menitkeluar - charis07153_timeM;
            System.out.println("Durasi parkir       = " + durasijam + " : " + durasimenit);  
            if ("Mobil".equals(kendaraan.get(charis07153_x).getcharis07153_Jeniskendaraan())){
                int harga1 = durasijam*5000;
                int harga2 = durasimenit*100;
                int totalH = harga1 + harga2;
                System.out.println("Harga parkir        = "+totalH);
            }
            else if ("Motor".equals(kendaraan.get(charis07153_x).getcharis07153_Jeniskendaraan())){
                int harga1 = durasijam*2000;
                int harga2 = durasimenit*50;
                int totalH = harga1 + harga2;
                System.out.println("Harga parkir        = "+totalH);
            }
            else{
                System.out.println("PILIHAN KENDARAAN SALAH");
            }
        System.out.println("====================================");
        kendaraan.remove(charis07153_x);
    }
}
}
   
