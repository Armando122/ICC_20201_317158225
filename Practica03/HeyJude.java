/*22 de agosto de 2019
*Programa para armar la canción Hey Jude utilizando condicionales
* if, while
*/

public class HeyJude{

//Frases de la canción
    public static String HEY = "Hey Jude ";
    public static String DON = "don't ";
    public static String MAK = "make it bad.";
    public static String BEA = "be afraid.";
    public static String LET = "let me down.";
    public static String TAK = "Take a sad song and make it better.";
    public static String YOW = "You were made to go out and get her.";
    public static String YOH = "You have found her, now go and get her.";
    public static String REM = "Remember to ";
    public static String LEH = "let her into you heart.";
    public static String LES = "let her into your skin.";
    public static String THE = "Then you ";
    public static String CAN = "can start ";
    public static String BEG = "begin ";
    public static String TOM = "to make it better ";
    public static String BET = "better ";
    public static String NA  = "na ";

    public static String AND = "And anytime you feel the pain, hey Jude, refrain,\n"
	                            + "Don’t carry the world upon your shoulders.\n"
                                    + "For well you know that it’s a fool who plays it cool\n"
	                            + "By making his world a little colder.";

    public static String SOL = "So let it out and let it in, hey Jude, begin,\n"
	                            + "You’re waiting for someone to perform with.\n"
	                            + "And don’t you know that it’s just you, hey jude, you’ll do,\n"
	                            + "The movement you need is on your shoulder.";

    public static void main(String[] args){
      int i = 0;
      while(i<12){
        System.out.println(HEY);

        for(int j = 0; j < 3; j++){

          if(j == 0 && (i == 0 || i == 3 || i == 6 || i == 9)){
            System.out.println(DON + MAK);
          }

          if(j == 1 && (i == 1 || i == 4 || i == 7 || i == 10)){
            System.out.println(DON + BEA);
          }

          if(j == 2 && (i == 2 || i == 5 || i == 8 || i == 11)){
            System.out.println(DON + LET);
          }

          int k=0;

          for(k=0; k < 3; k++){

            if(k == 0 && (j == 0 && (i == 0 || i == 3 || i == 6 || i == 9))){
              System.out.println(TAK);
              System.out.print(REM);
            }

            if(k == 1 && (j == 1 && (i == 1 || i == 4 || i == 7 || i == 10))){
              System.out.println(YOW);
              System.out.print(REM);
            }

            if(k == 2 && (j == 2 && (i == 2 || i == 5 || i == 8 || i == 11))){
              System.out.println(YOH);
              System.out.print(REM);
            }

          }

        }

        for (int l=0; l<2; l++) {

          if (l == 0 && (i == 0 || i == 2 || i == 4 || i == 6 || i == 8 || i == 10)) {
            System.out.println(LEH);
            System.out.print(THE);
          }

          if (l == 1 && (i == 1 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11)) {
            System.out.println(LES);
            System.out.print(THE);
          }

        }

        for (int m=0; m<2; m++) {

          if (m == 0 && (i == 0 || i == 2 || i == 4 || i == 6 || i == 8 || i == 10)) {
            System.out.println(CAN);
            System.out.println(TOM);
          }

          if (m == 1 && (i == 1 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11)) {
            System.out.println(BEG);
            System.out.println(TOM);
          }

        }

        i++;

        for (int h=0; h<2; h++) {

          switch(h){

            case 0:
            int u=0;

            while(u<5){
            System.out.print(BET);
            u++;
            }

            System.out.println("");
            break;

            case 1:
            int o=0;

            while(o<5){
            System.out.print(NA);
            o++;
            }

            System.out.println("");
            System.out.println("");
            break;
          }

        }

      }
      System.out.println(AND);
      System.out.println(SOL);
    }
}
