/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_nguoi_du_lich.Data;

/**
 *
 * @author thanh
 */
public class Tour {
    private int id;
    private Person traveler;
    private Location lctStart;
    private Location[] way;
    private int cost;

    public Tour(int id, Person traveler, Location lctStart, Location[] way, int cost) {
        this.id = id;
        this.traveler = traveler;
        this.lctStart = lctStart;
        this.way = way;
        this.cost = cost;
    }

        public Tour() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getTraveler() {
        return traveler;
    }

    public void setTraveler(Person traveler) {
        this.traveler = traveler;
    }

    public Location getLctStart() {
        return lctStart;
    }

    public void setLctStart(Location lctStart) {
        this.lctStart = lctStart;
    }

    public Location[] getWay() {
        return way;
    }
        public String outputWay(){
        String str = "";
        for(int i = 0; i < way.length; i++){
            if(i==way.length-1){
                str+= way[i].getNameLoaction();
                continue;
            }
            str += way[i].getNameLoaction() + "->";
        }
        return str;
    }
    public void setWay(Location[] way) {
        this.way = way;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return id + ";" + traveler.getName() + ";" + lctStart.getNameLoaction() + ";" + outputWay() + ";" + cost;
    }
    
}
