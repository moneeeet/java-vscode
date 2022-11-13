public class IfTest5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 11;
        if(++a == 6 || --b == 10) { //orなので左が成立したら右は無視
            System.out.println("条件成立！");
            System.out.println("a:" +a);
            System.out.println("a:" +b);
        } else {
            System.out.println("条件不成立！");
            System.out.println("a:" +a);
            System.out.println("a:" +b);
        }
        
    }
    
}
