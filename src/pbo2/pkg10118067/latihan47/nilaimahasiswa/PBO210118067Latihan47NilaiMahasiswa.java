/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan47.nilaimahasiswa;

/**
 *
 * @author
 * Nama     : Agus Awaludin
 * Kelas    : PBO2
 * NIM      : 10118067
 * Latihan ini berisi tentang bagaimana menampikna nilai akhir dari beberapa
 * variabel dalam sebuah program
 */
public class PBO210118067Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NilaiAkhir na1,na2,na3;
        
        na1 = new NilaiAkhir(75, 45, 34);
        na1.tampilNilai();
        na2 = new NilaiAkhir(60, 80, 75);
        na2.tampilNilai();
        na3 = new NilaiAkhir(30, 80, 40);
        na3.tampilNilai();
    }
    
}
