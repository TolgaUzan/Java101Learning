package Bolum6_Siniflar_Classes._2NesneOlusturmaVeSinifMethodlari;

public class Cars {

    //properties - veriables
    private String marka;
    private int teker;
    private int kapi;
    private String renk;
    private int hiz;
    private int hizLimit=300;
    public Cars() {

    }

    public Cars(String marka, int teker, int kapi, String renk, int hiz) {
        this.marka = marka;
        this.teker = teker;
        this.kapi = kapi;
        this.renk = renk;
        this.hiz = hiz;
    }

    void hizArttir(int artis){
        if((hiz+artis)<hizLimit){
            hiz+=artis;
        }else{
            System.out.println("300 den fazla basamam");
        }
    }
    void kapıAc(){
        System.out.println(this.marka+" kapılar açıldı..");
    }

    public int getHizLimit() {
        return hizLimit;
    }

    public void setHizLimit(int hizLimit) {
        this.hizLimit = hizLimit;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getTeker() {
        return teker;
    }

    public void setTeker(int teker) {
        this.teker = teker;
    }

    public int getKapi() {
        return kapi;
    }

    public void setKapi(int kapi) {
        this.kapi = kapi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

}
