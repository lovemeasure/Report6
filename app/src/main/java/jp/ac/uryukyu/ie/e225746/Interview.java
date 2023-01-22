package jp.ac.uryukyu.ie.e225746;
import java.util.Scanner;

/**
 * 秘書ゲームのインタビュー部分のクラス
 */
public class Interview {
    /**
     * インタビュー回数 
     */
    private int numInterviewed;
    /**
     * スコア記録やリザルト画面表示用
     */
    private Score sc = new Score();
    /**
     * スコア記録やリザルト画面表示用
     */
    private Adopted a = new Adopted();
    /**
     * 秘書のリスト用
     */
    private Secretary se = new Secretary();


    /**
     * コンストラクタの初期化。
     * インタビュー回数の変数。
     */
    public Interview(){
        this.numInterviewed = 0;
    }

    /**
     * 面接(ゲーム)を開始する
     */
    public void StartInterview(){
        Boolean adoptedFlag = true;

        sc.difficultySetting(); //難易度設定
        se.secretarySetting(sc.getDifficulty()); //秘書乱数設定
        
        do{
            this.numInterviewed += 1; //ターン数
            HowManyInterviews(); // 残り人数

            if (this.numInterviewed < sc.getDifficulty()){//最後の一人ではないなら
                if (this.numInterviewed > 1){
                    adoptedFlag = a.isRelativeBest(se.getOneOfSecretary(this.numInterviewed -1));
                    //採用スキップするかどうか判定
                    //ここを突破すればskipなし面接
                }
            
            
                if (adoptedFlag){//skipなし面接
                    System.out.println("今までの人よりもいいな。雇うべきかどうか？");
                    adoptedFlag = alternative(); //雇うかどうか
                }
                else{//skip面接
                    System.out.println("今までの人の方がよかったなぁ"+ " (面接自動skip)");
                    /*順位最小化問題とかなら全員選択できた方がいいと思うけど、
                    *こっちの方がテンポがいいのと、最後までスキップされないかハラハラして、良さそう
                    */
                }
            }
            else{
                System.out.println("あれ、もう他に応募者いないのか");
                System.out.println("…………最後の人を採用するしかない");
                adoptedFlag = true;
            }

            if (!adoptedFlag){//採用しなかったら
                a.setNonAdopted(se.getOneOfSecretary(this.numInterviewed -1));
                System.out.println("採用を見送った\n\n");
            }

            if (adoptedFlag){//採用したら
                System.out.println("採用した！！\n\n");
                System.out.println("面接終了");
                System.out.println("\n\n");
                sc.setAdoptedPeople(se.getOneOfSecretary(this.numInterviewed -1));
                break;
            }

        }while(this.numInterviewed < sc.getDifficulty());
        //応募者数に達したらwhileを終えるようにしているが、最後の人を強制的に雇うようにしているので、Trueにしても問題はない
    }

    /**
     * 残り応募者数(ターン数)を表示する
     */
    private void HowManyInterviews(){
        System.out.println(this.numInterviewed+"人目の面接");
        System.out.println("残り応募者"+(sc.getDifficulty() - this.numInterviewed)+"人");
        System.out.println();
    }

    /**
     *雇うかどうかの入力を求めるメソッド
     * @return 雇った場合true、雇わなかった場合false 
     */
    private Boolean alternative(){
        System.out.println("０：不採用");
        System.out.println("１：採用");

        System.out.print(">>> "); //入力時に現れるあれ 

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.println(); //採用はtrue
        if (input == 1){
            return true;
        }

        else{//input == 0やその他入力 //不採用はfalse
            return false;
        }
    }

    /**
     * scのゲッター
     * @return sc
     */
    public Score getsc(){
        return sc;
    }

}
