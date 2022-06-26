package model;

import java.util.ArrayList;
import java.util.List;

public class Tour {
    private String maTour;
    private ArrayList<DiaDiem> hanhTrinh;
    private int soDiaDiem;
    private float tongChiPhi;

    public Tour() {
        this.hanhTrinh = new ArrayList<DiaDiem>();
    }

    public Tour(String maTour, ArrayList<DiaDiem> hanhTrinh, int soDiaDiem, float tongChiPhi) {
        this.maTour = maTour;
        this.hanhTrinh = hanhTrinh;
        this.soDiaDiem = soDiaDiem;
        this.tongChiPhi = tongChiPhi;
    }

    public String getMaTour() {
        return maTour;
    }

    public void setMaTour(String maTour) {
        this.maTour = maTour;
    }

    public ArrayList<DiaDiem> getHanhTrinh() {
        return hanhTrinh;
    }

    public void setHanhTrinh(ArrayList<DiaDiem> hanhTrinh) {
        this.hanhTrinh = hanhTrinh;
    }

    public int getSoDiaDiem() {
        return soDiaDiem;
    }

    public void setSoDiaDiem(int soDiaDiem) {
        this.soDiaDiem = soDiaDiem;
    }

    public float getTongChiPhi() {
        return tongChiPhi;
    }

    public void setTongChiPhi(float tongChiPhi) {
        this.tongChiPhi = tongChiPhi;
    }
    
    public void insertDiaDiem(DiaDiem diaDiem){
        this.hanhTrinh.add(diaDiem);
    }
    
    public void deleteDiaDiem(DiaDiem diaDiem){
        this.hanhTrinh.remove(diaDiem);
    }
    
    public void updateDiaDiem(DiaDiem diaDiem){
        this.hanhTrinh.remove(diaDiem);
        this.hanhTrinh.add(diaDiem);
    }
    
}
