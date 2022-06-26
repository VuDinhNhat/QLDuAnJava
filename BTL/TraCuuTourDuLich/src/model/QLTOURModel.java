package model;

import java.util.ArrayList;


public class QLTOURModel {
    private ArrayList<Tour> dsTour;

    public QLTOURModel() {
        this.dsTour = new ArrayList<Tour>();
    }

    public QLTOURModel(ArrayList<Tour> dsTour) {
        this.dsTour = dsTour;
    }

    public ArrayList<Tour> getDsTour() {
        return dsTour;
    }

    public void setDsTour(ArrayList<Tour> dsTour) {
        this.dsTour = dsTour;
    }
    
    public void insertTour(Tour tour){
        this.dsTour.add(tour);
    }
    
    public void deleteTour(Tour tour){
        this.dsTour.remove(tour);
    }
    
    public void updateTour(Tour tour){
        this.dsTour.remove(tour);
        this.dsTour.add(tour);
    }
    
}
