public class Ogrenci {
    private String ad;
    private String bolum;
    private double gano;
    private int girisYili;
    private String ogrNo;
    private int bolumKodu = 104;
    public Ogrenci(Ogrenci ogrenci){

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public String getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public int getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(int bolumKodu) {
        this.bolumKodu = bolumKodu;
    }

    public Ogrenci(String name, String bolum){
        this.ad =name;
        this.bolum = bolum;
    }
    public Ogrenci(int girisYili, double gano){
        this.girisYili = girisYili;
        if (gano<0 || 4<gano){
            throw new IllegalArgumentException("Öğrenci bulunamadı! ");
        }
        this.gano=gano;
    }
    public Ogrenci(String name, String bolum, double gano, int girisYili){
        this.ad =name;
        this.bolum = bolum;
        if (gano<0 || 4<gano){
            throw new IllegalArgumentException("Öğrenci bulunamadı! ");
        }
        this.gano=gano;
        this.girisYili = girisYili;
    }
    public double harcHesaplama(int dersSayisi){
        return dersSayisi*80;
    }
    public double harcHesaplama(int dersSayisi, double dersUcreti){
        return dersSayisi*dersUcreti;
    }
    public String ogrenciNo(){
        return this.ogrNo =(girisYili +""+ bolumKodu +""+"001");
    }
}
