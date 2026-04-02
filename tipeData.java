public class tipeData { //blok class
    //blok main --> psvm + tab
    public static void main(String[] args) {
        //coding

        /*universitas dinamika membutuhkan aplikasih sederhana
          untuk mencatat biodata mahasiswa. apa saja variabel dan tipe
          data yang diperlukan?
          
          NIM --> String
          Nama --> String
          Alamat --> String
          No. HP --> String
          Jenis Kelamin --> String
          Program Studi --> String
          Dosen wali --> String
          Sisa BOP --> int

          int : untuk perhitungan/kalkulasi angka
        */

        //1. Deklarasi variabel
        String nim = "25410100078";
        String nama = "aggjyan";
        String alamat = "Desa Gempolkerep RT6,RW1 gedeg,mojokerto";
        String noHp = "083833826557";
        String jenisKelamin = "perempuan";
        String programStudi = "s1 sistem informasi";
        String doswal = "bu Trisagirani";
        int sisaBop = 2000000;


        //2. Print nilai variabel --> sout + tab
        System.out.println("nim aggjyan adalah " + nim+ " dengan nama "+ nama);
        System.out.println(nim);

        // cara 3 dengan operator \n (untuk enter ke baris baru saat diprint)
        System.out.println("nim : " +nim + "\nnama: "+ nama);

        System.out.println("alamat mahasiswa : " +alamat);
        System.out.println("no hp mahasiswa : " +noHp);
        System.out.println("jenis kelamin mahasiswa : " +jenisKelamin);
        System.out.println("program studi mahasiswa : " +programStudi);
        System.out.println("dosen wali mahasiswa : " +doswal);
        System.out.println("sisa BOP mahasiswa : " +sisaBop);

        System.out.println();
    
    }
}