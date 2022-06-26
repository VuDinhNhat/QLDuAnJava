package model;

import java.util.Objects;

public class DiaDiem {
    private int maDiaDiem;
    private String tenDiaDiem;
    private float chiPhi;

    public DiaDiem(int maDiaDiem, String tenDiaDiem, float chiPhi) {
        this.maDiaDiem = maDiaDiem;
        this.tenDiaDiem = tenDiaDiem;
        this.chiPhi = chiPhi;
    }

    public int getMaDiaDiem() {
        return maDiaDiem;
    }

    public void setMaDiaDiem(int maDiaDiem) {
        this.maDiaDiem = maDiaDiem;
    }

    public String getTenDiaDiem() {
        return tenDiaDiem;
    }

    public void setTenDiaDiem(String tenDiaDiem) {
        this.tenDiaDiem = tenDiaDiem;
    }

    public float getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(float chiPhi) {
        this.chiPhi = chiPhi;
    }

    @Override
    public String toString() {
        return "DiaDiem{" + "maDiaDiem=" + maDiaDiem + ", tenDiaDiem=" + tenDiaDiem + ", chiPhi=" + chiPhi + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.maDiaDiem;
        hash = 37 * hash + Objects.hashCode(this.tenDiaDiem);
        hash = 37 * hash + Float.floatToIntBits(this.chiPhi);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DiaDiem other = (DiaDiem) obj;
        if (this.maDiaDiem != other.maDiaDiem) {
            return false;
        }
        if (Float.floatToIntBits(this.chiPhi) != Float.floatToIntBits(other.chiPhi)) {
            return false;
        }
        return Objects.equals(this.tenDiaDiem, other.tenDiaDiem);
    }
    
}
