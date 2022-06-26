/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_nguoi_du_lich.Data;

/**
 *
 * @author thanh
 */
public class Person {
    private int idTraverler;
    private String name;
    private String address;
    private String phone;

    public int getIdTraverler() {
        return idTraverler;
    }

    public void setIdTraverler(int idTraverler) {
        this.idTraverler = idTraverler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    public Person(int idTraverler, String name, String address, String phone) {
        this.idTraverler = idTraverler;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Person() {
    }
    
}
