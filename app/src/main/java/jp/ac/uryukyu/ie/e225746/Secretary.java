package jp.ac.uryukyu.ie.e225746;
import java.util.Collections;
import java.util.ArrayList;

public class Secretary {
    private ArrayList<Integer> secretaries;

    protected Secretary(){
        this.secretaries = new ArrayList<Integer>();
    }

    protected void secretarySetting(int numPeople){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1 ; i <= numPeople ; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        this.secretaries = list;
    }

    protected int getOneOfSecretary(int n){
        return this.secretaries.get(n);
    }

    protected int getSecretaries(int n){
        return this.secretaries.get(n);
    }

    protected int getBestPersonIndex(){
        int min = Collections.min(this.secretaries);
        int minIndex = this.secretaries.indexOf(min);
        return minIndex;

    }

}
