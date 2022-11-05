public class EscapeTest {
    public static void main (String[] args) {
        System.out.println("Hello!!");
        System.out.println("\"Double quote(\") is desplayed."); //バックスラッシュ（＼ ooptionと￥マーク）でエスケープする。"は文字列を囲むという意味だけど、＼をすることによってエスケープさせることができる
        char c = '\''; //char型のシングルクオテーションでもバックスラッシュを使ってエスケープさせて表示させることができる
        System.out.println("c!");
        System.out.println("\\ is desplayed."); //バックスラッシュ２つで１つ表示させることができる
    }
    
}
