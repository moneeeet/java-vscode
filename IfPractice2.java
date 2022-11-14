public class IfPractice2 {
    public static void main(String [] args ) {
        String homeTown = "chiba";
        String bloodType = "AB";
        if(homeTown == "tokyo" || bloodType.equals("A")) {
            System.out.println("私は東京出身、または血液型がA型です");
        }else {
            System.out.println("私の出身地は東京でも、血液型がA型でもありません");
        }
    }    
}
