
package thisanahtar_maku3;

public class Ogrenci {
    private String isim;
    private String soyisim;
    private int dogumYili;
    
    public Ogrenci(String isim,String soyisim,int dogumYili){
    
    this.isim=isim;
    this.soyisim=soyisim;
    this.dogumYili=dogumYili;
    }
    
    public void setIsım(String isim){
    this.isim=isim;
    }
    public String getIsim(){
    return isim;
    }
    
    public String getSoyisim(){
        return soyisim;
    }
      public void setSoyisim(){
    this.soyisim=soyisim;
    }
      
    public int getDogumYili(){
    return dogumYili;
    }
    public void setdogumYili(int dogumYili){
    this.dogumYili=dogumYili;
    }
}
