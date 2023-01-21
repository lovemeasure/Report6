import jp.ac.uryukyu.ie.e225746.*;

public class Main {
    public static void main(String[] args){

        Explanation e = new Explanation();//説明画面
        e.whatExplanation();

        Interview i = new Interview();//難易度設定、ゲーム
        i.StartInterview();

        Score sc = i.getsc();
        sc.resultsDisplay();//リザルト
    }
}