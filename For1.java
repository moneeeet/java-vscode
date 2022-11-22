public class For1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            //int n = i + 1;
            //System.out.println("繰り返し:" + n + "周目");

            /* 
            if (i == 5) { この位置にbreakを記述したら４周目まで表示される
                break;　ループを中断する
            }
             */
            if (i == 5) { //ここなら５周目まで表示される
                System.out.println("次のループに進む");
                continue; //次のループ（周）に進む。ここでは、５周目を飛ばして10周目まで表示される。continuw以下は実行せず、１行目に戻って実行し始める
            }
            System.out.println("繰り返し:" + i + "周目");        
        } 
        System.out.println("新しいループ");
        for(int i = 1; i <= 5; i++) {
            //int n = i + 1;
            if(i == 3){
                break;
            }
            System.out.println("繰り返し:" + i + "周目");
        }
    }
}
