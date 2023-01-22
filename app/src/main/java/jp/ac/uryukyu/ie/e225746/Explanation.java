package jp.ac.uryukyu.ie.e225746;
import java.util.Scanner;


/**
 * ゲーム前の説明に関するクラス
 */
public class Explanation{

    /**
     * どの説明を表示するか入力を求めるメソッド
     */
    public void whatExplanation(){
        boolean flag;

        do{
            System.out.println("どの説明を聞く？");
            System.out.println("０：秘書問題とは");
            System.out.println("１：ゲームの遊び方");
            System.out.println("２：秘書問題の最適解");
            System.out.println("３：終了");

            System.out.print(">>> "); //入力時に現れるあれ 

            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            content(input);

            flag = !(input == 3);

            if (input == 3){
                System.out.println("\n");
            }
        }while(flag);
        
    }

    /**
     * 入力された数字に応じて、説明を表示するメソッド
     * @param num 説明番号
     */
    private void content(int num){
        if (num == 0){
            System.out.println("wikipedia参照");
            System.out.println();
        }
        if (num == 1){
            System.out.println("やればわかる");
            System.out.println();
        }
        if (num == 2){
            System.out.println("秘密");
            System.out.println();
        }
    }

}