/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_nguoi_du_lich.Data;

/**
 *
 * @author thanh
 */
public class Location {
    private int idLocation;
    private String nameLoaction;
    private int idSetting;

    public Location(int idLocation, String nameLoaction, int idSetting) {
        this.idLocation = idLocation;
        this.nameLoaction = nameLoaction;
        this.idSetting = idSetting;
    }

    public Location(int idLocation, String nameLoaction) {
        this.idLocation = idLocation;
        this.nameLoaction = nameLoaction;
    }
    
    

    public Location() {
    }

    public int getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(int idLocation) {
        this.idLocation = idLocation;
    }

    public String getNameLoaction() {
        return nameLoaction;
    }

    public void setNameLoaction(String nameLoaction) {
        this.nameLoaction = nameLoaction;
    }

    public int getIdSetting() {
        return idSetting;
    }

    public void setIdSetting(int idSetting) {
        this.idSetting = idSetting;
    }

    @Override
    public String toString() {
        return idLocation + ";" + nameLoaction + ";" + idSetting;
    }

   
    
}
