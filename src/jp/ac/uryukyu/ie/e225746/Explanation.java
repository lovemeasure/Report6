package jp.ac.uryukyu.ie.e225746;
import java.util.Scanner;

public class Explanation{

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
                //scanner.close();//閉じると使えなくなるんだっけ？
            }

        }while(flag);
        
    }

    public void content(int num){
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