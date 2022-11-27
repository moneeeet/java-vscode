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
        customer = new String[3]; 
        customer[0] = "鈴木太郎"; 
        customer[1] = "suzuki_taro@xxxx.com";
        customer[2] = "090-0000-9999"; 
        System.out.println(customer[0]);
        System.out.println(customer[1]);
        System.out.println(customer[2]);

    }
}
