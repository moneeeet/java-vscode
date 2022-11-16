public class DoWhile1 {
    public static void main(String[] args) {
        System.out.println("多い番号じゅんから点呼取ります！");
        int number = 11;
        do {
            System.out.println(number + "!");
            number--;
        } while(number <= 10 && number >=1);
    }
}
