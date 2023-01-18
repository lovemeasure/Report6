package jp.ac.uryukyu.ie.e225746;
import java.util.Collections;
import java.util.ArrayList;

public class Secretary {
    ArrayList<Integer> secretaries;

    public Secretary(){
        this.secretaries = new ArrayList<Integer>();
    }

    public void secretarySetting(int numPeople){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1 ; i <= numPeople ; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        this.secretaries = list;
    }

    public int getOneOfSecretary(int n){
        return this.secretaries.get(n);
    }

    public void getSecretary(){
        
    }

    public void PrintgetSecretary(){
        System.out.println(this.secretaries+" デバック用");
    } 










    public int getSecretaries(int n){
        return this.secretaries.get(n);
    }

    public int getBestPersonIndex(){
        int min = Collections.min(this.secretaries);
        int minIndex = this.secretaries.indexOf(min);
        return minIndex;

    }

}
