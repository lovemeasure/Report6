package jp.ac.uryukyu.ie.e225746;
import java.util.Scanner;


/**
 * 難易度の設定やリザルトに関するクラス
 */
public class Score {
    /**
     * 応募してきた秘書の数(難易度)
     */
    private int numPeople;
    /**
     * 雇った人の優秀さ
     */
    private int adoptedPeople;

    /**
     * 変数の初期化
     */
    protected Score(){
        this.numPeople = -1;
        this.adoptedPeople = -1;
    }

    /**
     * 応募者数と雇った人を出力するメソッド
     */
    public void resultsDisplay(){
        System.out.println("あなたが採用した人は "+numPeople+" 人中");
        System.out.println();
        System.out.println(adoptedPeople+" 番目に優秀！");
        System.out.println("\n");

        if(adoptedPeople==1){
            System.out.println("あなたは最高の秘書を得た");
            System.out.println("あなたはその洞察力と秘書と共に、ビジネス世界の名を轟かせるだろう！");
            System.out.println();
            System.out.println("スコア："+(numPeople - adoptedPeople + 1));
            System.out.println("GOODEND");
            System.out.println("\n");
        }
        else{
            System.out.println("あなたは最高の秘書を得られなかった……");
            System.out.println("ざんねん。またあそんでね！");
            System.out.println();
            System.out.println("スコア："+(numPeople - adoptedPeople + 1));
            System.out.println("GAMEOVER");
            System.out.println("\n");
        }
    }

    /**
     * 応募者数を入力するメソッド
     */
    protected void difficultySetting(){
        System.out.println("難易度設定");
        System.out.println("何人の秘書が応募してきましたか？");
        System.out.print(">>> ");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("\n");

        this.numPeople = input;
    }

    /**
     * 応募者数のゲッター
     * @return 応募者数
     */
    protected int getDifficulty(){
        return this.numPeople;
    }

    /**
     * 雇った人のセッター
     */
    protected void setAdoptedPeople(int n){
        this.adoptedPeople = n;
    }
}
