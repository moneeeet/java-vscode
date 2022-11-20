public class For1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            //int n = i + 1;
            //System.out.println("繰り返し:" + n + "周目");
            /* 
            if (i == 5) { この位置にbreakを記述したら４周目まで表示される
                break;
            }
             */
            System.out.println("繰り返し:" + i + "周目");
            if (i == 5) { //ここなら５周目まで表示される
                break;
            }
            
                
        }
    }
}
