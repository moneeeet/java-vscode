public class Array1 {
    public static void main(String[] args) {
        String name = "鈴木太郎";
        String email = "suzuki_taro";
        String phone = "090-0000-0000";
        System.out.println(name);
        System.out.println(email);
        System.out.println(phone);

        System.out.println(); //カッコの中が空欄なら１行空行になる

        String[] customer; //string型の配列を宣言
        customer = new String[3]; //配列の初期化を宣言
        customer[0] = "鈴木太郎"; //[0]で１番目。０から開始する。これを「添字」または「index」という。
        customer[1] = "suzuki_taro@xxxx.com"; //[1]で２番目
        customer[2] = "090-0000-9999"; //[2]で３番目
        System.out.println(customer[0]);
        System.out.println(customer[1]);
        System.out.println(customer[2]);

    }
}
