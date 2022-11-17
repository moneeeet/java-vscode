public class While1 {
    public static void main(String[] args) {
        System.out.println("番号！");
        int number = 1;
        while(number >= 1 && number <= 11) { //カリキュラムではnumber <=10だった
            System.out.println(number + "!");
            number++;
        }
    }
}
