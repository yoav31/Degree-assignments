package lab13;

import java.util.ArrayList;
public class GradeTracker {
    private ArrayList <Double> list;

    public GradeTracker(){
        this.list=new ArrayList<>();
    }

    public void addGrade(double num){
        list.add(num);
    }
    public double getAverage(){
        double count=0;
        for(int i=0; i<list.size(); i++){
            count += list.get(i);
        }
        return count/list.size();
    }
    public double getHighestGrade(){
        double temp=list.get(0);
        for(int i=1; i< list.size(); i++){
            if(temp < list.get(i)){
                temp=list.get(i);
            }
        }
        return temp;
    }

    public double getLowestGrade(){
        double temp=list.get(0);
        for(int i=1; i< list.size(); i++){
            if(temp > list.get(i)){
                temp=list.get(i);
            }
        }
        return temp;
    }


}



