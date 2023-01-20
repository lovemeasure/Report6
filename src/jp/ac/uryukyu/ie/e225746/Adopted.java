package jp.ac.uryukyu.ie.e225746;
import java.util.ArrayList;
import java.util.Collections;

public class Adopted {
    private ArrayList<Integer> nonAdoptedPeople;

    public Adopted(){
        this.nonAdoptedPeople = new ArrayList<Integer>();
    }

    public void setNonAdopted(int _nonAdopted){
        this.nonAdoptedPeople.add(_nonAdopted);
    }

    public void getNonAdoptedPeople(){
        
    }

    public void PrintgetNonAdoptedPeople(){
        System.out.println(this.nonAdoptedPeople+"デバック用");        
    }


    
    public Boolean isRelativeBest(int interviewer){
        /*本来は相対順位を返すメソッドにする予定ではあるが、
         * 相対順位が1位でない場合採用が強制スキップされる仕様なので
         * 相対順位が1位である場合Trueを、
         * そうでない場合Falseを返すメソッドとして実装している
         */
        int min = Collections.min(this.nonAdoptedPeople);
        
        return (interviewer <= min);
    }

    public Boolean isAbsoluteBest(){
        int min = Collections.min(this.nonAdoptedPeople);
        return (min == 1);
    }
        
}
