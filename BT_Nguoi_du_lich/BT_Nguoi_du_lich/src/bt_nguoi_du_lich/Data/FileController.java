/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_nguoi_du_lich.Data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
        *
 * @author thanh
 */

public class FileController {
    static List<Location> locations = getAllLocation("Location.txt");
    
    public static int [][]ArrayTrongSo(String filename){
        int [][]arrTrongSo = new int[100][100];
        FileReader fd = null;
        BufferedReader bd = null;
        try{
            fd = new FileReader(filename);
            bd = new BufferedReader(fd);
            String line = "";
            int index = 0;
            int cot = 0;
            
            while((line=bd.readLine())!=null){
                String []str = line.split(", ");
                cot = str.length;
                for(int i = 0; i < str.length; i++){

                    arrTrongSo[index][i] = Integer.parseInt(str[i].trim());
                }
                index++;
                            }
             int [][]arrTrongSoNew = new int[index][cot];
             for(int i = 0; i < arrTrongSoNew.length; i++){
                 for(int j = 0; j < arrTrongSoNew[i].length; j++){
                     arrTrongSoNew[i][j] = arrTrongSo[i][j];
                 }
             }
             
            return arrTrongSoNew;
        }catch(IOException ex){
            System.out.println("Looi doc file");
            return null;
        }finally{
            try {
                bd.close();
                fd.close();
            } catch (IOException ex) {
                Logger.getLogger(FileController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static List<Location> getAllLocation(String filename){
        List<Location> lcts = new ArrayList<>();
        FileReader fd = null;
        BufferedReader bd = null;
        try{
            fd = new FileReader(filename);
            bd = new BufferedReader(fd);
            String line = "";
            while((line = bd.readLine())!=null){
                String str[] = line.split(";");
                Location lct = new Location(Integer.parseInt(str[0]), str[1]);
//                lct.idLocation = Integer.parseInt(str[0]);
//                lct.nameLoaction = str[1];
//                String neib[] = str[2].split(",");
//                lct.setNeighbour(new int [neib.length][2]);
//                for(int i = 0; i < neib.length; i++){
//                    String x[] = (neib[i].split("-"));
//                      for(int j = 0; j < 2; j++){
//                        lct.neighbour[i][j] = Integer.parseInt(x[j]);
//                    }
//                }
                lcts.add(lct);
            }
        }catch(IOException ex){
                System.out.println("Loi doc file");
        }finally{
            try{
            bd.close();
            fd.close();
            }catch(IOException ex){
                System.out.println("Loi close");
                }
            }
        return lcts;
    }
//    public static List<Tour> getAllTour(String filename){
//        List<Tour> tours = new ArrayList<>();
//        FileReader fd = null;
//        BufferedReader bd = null;
//        try{
//            fd = new FileReader(filename);
//            bd = new BufferedReader(fd);
//            String line = "";
//            while((line = bd.readLine())!=null){
//                  String str[] = line.split(";");
//                  String LocationStartName = str[2];
//                  Location locationStart = new Location();
//                  for(Location lct : locations){
//                      if(locationStart == lct){
//                          locationStart = lct;
//                      }
//                  }
//                  Tour tour = new Tour(Integer.parseInt(str[0]), str[1],locationStart)
//                  tours.add(tour);
//            }
//        }catch(IOException ex){
//                System.out.println("Loi doc file");
//        }finally{
//            try{
//            bd.close();
//            fd.close();
//            }catch(IOException ex){
//                System.out.println("Loi close");
//                }
//            }
//        return tours;
//    }
    
    public static void writeTourFile(String filename, Tour tour){
        FileWriter fw=null;
        BufferedWriter bw=null; 
        try{
            fw = new FileWriter(filename, true);
            bw = new BufferedWriter(fw);
//            int id = 1;
            bw.write(tour.getId() + ";" + tour.getTraveler().getName()+ ";" + tour.getLctStart().getNameLoaction() + ";" + tour.outputWay() + ";" + tour.getCost());
            bw.newLine();
        }catch(IOException ex){
            System.out.println("loi ghi file");
        }finally{
            try{
                bw.close();
                fw.close();
            }catch(IOException ex){
                System.out.println("Loi close");
            }
        }
    }
    public static void writePersonFile(String filename, Person person){
        FileWriter fw=null;
        BufferedWriter bw=null; 
        try{
            fw = new FileWriter(filename, true);
            bw = new BufferedWriter(fw);
//            int id = 1;
            bw.write(person.getIdTraverler() + ";" + person.getName() + ";" + person.getAddress() + ";" + person.getPhone());
            bw.newLine();
        }catch(IOException ex){
            System.out.println("loi ghi file");
        }finally{
            try{
                bw.close();
                fw.close();
            }catch(IOException ex){
                System.out.println("Loi close");
            }
        }
    }
 

}
