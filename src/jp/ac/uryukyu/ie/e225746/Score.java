package jp.ac.uryukyu.ie.e225746;
import java.util.Scanner;

public class Score {
    private int numPeople;
    int adoptedPeople;

    public Score(){
        this.numPeople = -1;
        this.adoptedPeople = -1;
    }

    public void difficultySetting(){
        System.out.println("難易度設定");
        System.out.println("何人の秘書が応募してきましたか？");
        System.out.print(">>> ");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("\n");

        this.numPeople = input;
    }

    public int getDifficulty(){
        return this.numPeople;
    }

    public void setAdoptedPeople(int n){
        this.adoptedPeople = n;
    }



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
}
