package StringQuestion.com;

public class RomanToIntegre {

    public static void main(String[] args) {

        System.out.println( romanToInt("LVIII"));

    }

    public static int romanToInt(String s){


        String[] game = s.split("");

        int finagle = getIntergerValue(game[game.length-1]);

        if(game.length>1) {

            for (int i = game.length-2; i >=0; i--) {
                 if(getIntergerValue(game[i])<getIntergerValue(game[i+1])){
                     finagle=finagle-getIntergerValue(game[i]);
                 }
                 else{
                     finagle=finagle+getIntergerValue(game[i]);
                 }
            }
        }else{
            return finagle;
        }

        return finagle;
    }




    private static int getIntergerValue(String s){

        s=s.toUpperCase();

        switch (s){
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            default:
                return 0;
        }

    }
}
