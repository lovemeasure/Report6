package jp.ac.uryukyu.ie.e225746;
import java.util.Collections;
import java.util.ArrayList;


/**
 * 応募者(秘書)リストに関するメソッドがあるクラス
 */
public class Secretary {
    /**
     * 応募してきた人の情報を記録するリスト
     */
    private ArrayList<Integer> secretaries;

    /**
     * リストの初期化
     */
    protected Secretary(){
        this.secretaries = new ArrayList<Integer>();
    }

    /**
     * リストをランダムに整数を設定するメソッド
     * @param numPeople 1からnumPeople人まで
     */
    protected void secretarySetting(int numPeople){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1 ; i <= numPeople ; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        this.secretaries = list;
    }

    /**
     * secretariesのn番目の要素を所得するメソッド
     * @param n
     * @return secretariesのn番目の要素
     */
    protected int getOneOfSecretary(int n){
        return this.secretaries.get(n);
    }

    /**
     * 最も優秀な応募者の順番のゲッター
     * @return 最も優秀な応募者の順番(インデックス)
     */
    protected int getBestPersonIndex(){
        int min = Collections.min(this.secretaries);
        int minIndex = this.secretaries.indexOf(min);
        return minIndex;
    }

    /**
     * 秘書リストのゲッター
     * @return 秘書リスト
     */
    public ArrayList<Integer> getSecretaries(){
        return this.secretaries;
    }

    



}
