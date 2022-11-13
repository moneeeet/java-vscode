public class IfTest4 {
    public static void main(String[] args) {
        int myAge= 40;
        //char myBloodType = 'O'; //char型は１文字しか入れれないのでstring型に変更
        String myBloodType = "AB";
        if(myAge == 35 || myBloodType.equals("B")) {
            System.out.println("私の年齢は35歳または血液型はB型です！");
        } else if(myAge == 35 || myBloodType.equalsIgnoreCase("A")) {
            System.out.println("私の年齢は35歳または血液型はA型です！");
        } else if(myAge == 40 || myBloodType.equals("A")){
            System.out.println("私の年齢は40歳または血液型はO型です！");
        } else if(myAge == 40 || myBloodType.equals("AB")){
            System.out.println("私の年齢は35歳ではないです！");
        } else {
            System.out.println("私の年齢と血液型は、あなたの考えていることとは違います");
        }
        System.out.println("私の出身地は・・・");
    }
}
