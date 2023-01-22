package jp.ac.uryukyu.ie.e225746;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 雇わなかった人の情報を記録したり、今までの人よりも優秀か判断するためのクラス
 */
public class Adopted {
    /**
     * 雇わなかった人の情報を記録するリスト
     */
    private ArrayList<Integer> nonAdoptedPeople;

    /**
     *リストの初期化
     */
    protected Adopted(){
        this.nonAdoptedPeople = new ArrayList<Integer>();
    }

    /**
     * 相対順位が1位である場合Trueを、そうでない場合Falseを返すメソッド
     * @param interviewer 採用候補者の優秀さ
     * @return 相対順位が1位である場合True、そうでない場合False
     */
    protected Boolean isRelativeBest(int interviewer){
        int min = Collections.min(this.nonAdoptedPeople);
        
        return (interviewer <= min);
    }

    /**
     * 雇わなかった人の情報を追加するメソッド
     */
    protected void setNonAdopted(int nonAdopted){
        this.nonAdoptedPeople.add(nonAdopted);
    }   
}
