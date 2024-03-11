public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci1 =new Ogrenci( 1973,0.0);
        Ogrenci ogrenci2 =new Ogrenci("Gökhan ","Bilgisayar Müh. ",0.0,1985);
        Ogrenci ogrenci3 =new Ogrenci("Ayşe ", "Makine Müh. ", 0.0, 1985);
        Ogrenci ogrenci4 =new Ogrenci("Elif ", "Elektrik-Elektronik Müh. ", 1.98, 2020);
        System.out.println("Öğrenci Bilgileri ");
        System.out.println("OGR-1 "+ ogrenci1.getAd()+" "+ ogrenci1.getBolum()+" "+ ogrenci1.ogrenciNo()+" "+ ogrenci1.getGano());
        System.out.println("OGR-2 "+ ogrenci2.getAd()+ ogrenci2.getBolum()+ ogrenci2.ogrenciNo()+ ogrenci2.getGano());
        System.out.println("OGR-3 "+ ogrenci3.getAd()+ ogrenci3.getBolum()+ ogrenci3.ogrenciNo()+ ogrenci3.getGano());
        System.out.println("OGR-4 "+ ogrenci4.getAd()+ ogrenci4.getBolum()+ ogrenci4.ogrenciNo()+ ogrenci4.getGano());
        System.out.println("3. öğrencinin ödeyeceği harç: "+ ogrenci3.harcHesaplama(6,80));
        System.out.println("4. öğrencinin ödeyeceği harç: "+ ogrenci4.harcHesaplama(12));
    }
}
