import java.util.Scanner;



public class Main {

    public static String optionsInput() {
        int[] scoreKeeper = new int[10];
            Scanner scanner = new Scanner(System.in);
            String[] options =
                    {"kæreste", "kaffemaskine", "Netflix", "sofa", "løbesko",
                            "guitar", "slik", "hund", "bog", "øl"};
            int arrayInput = scanner.nextInt();
            String inputToArray = (arrayInput == 1) ? options[0] : (arrayInput == 2) ? options[1] : (arrayInput == 3) ? options[2] :
                    (arrayInput == 4) ? options[3] : (arrayInput == 5) ? options[4] : (arrayInput == 6) ? options[5] :
                            (arrayInput == 7) ? options[6] : (arrayInput == 8) ? options[7] : (arrayInput == 9) ? options[8] :
                                    (arrayInput == 10) ? options[9] : "Try again!";
            int scoreKeeping = (arrayInput == 1)?scoreKeeper[0] : (arrayInput == 2) ? scoreKeeper[1] : (arrayInput == 3) ? scoreKeeper[2] :
                    (arrayInput == 4) ? scoreKeeper[3] : (arrayInput == 5) ? scoreKeeper[4] : (arrayInput == 6) ? scoreKeeper[5] :
                            (arrayInput == 7) ? scoreKeeper[6] : (arrayInput == 8) ? scoreKeeper[7] : (arrayInput == 9) ? scoreKeeper[8] : scoreKeeper[9];
            System.out.println(inputToArray);

            return inputToArray;
    }




    public static void main(String[] args) {
        /*
        String[] options =
                {"kæreste","kaffemaskine","Netflix","sofa","løbesko",
                        "guitar","slik", "hund", "bog","øl"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvilke ting vil du helst have med på en øde ø?"
                +"\n1 kæreste\n2 kaffemaskine\n3 Netflix\n4 sofa\n5 løbesko\n6 guitar\n7 slik\n8 hund\n9 bog\n10 øl\nIndtast valg:" );
        int[]  arrayInput = new int[10];
        String inputToArray = (scanner.nextInt() == 1)?options[0]:(scanner.nextInt() == 2)?options[1]:(scanner.nextInt() == 3)?options[2]:
                (scanner.nextInt() == 4)?options[3]:(scanner.nextInt() == 5)?options[4]:(scanner.nextInt() == 6)?options[5]:
                        (scanner.nextInt() == 7)?options[6]:(scanner.nextInt() == 8)?options[7]:(scanner.nextInt() == 9)?options[8]:
                                (scanner.nextInt() == 10)?options[9]:"Try again!";
        System.out.println(options);

         */
        System.out.println("Hvilke ting vil du helst have med på en øde ø?"
                + "\n1 kæreste\n2 kaffemaskine\n3 Netflix\n4 sofa\n5 løbesko\n6 guitar\n7 slik\n8 hund\n9 bog\n10 øl\n");
        int i = 0;
        do { System.out.println("Indtast værdi: ");
        i++;
        optionsInput();
    } while( i < 10);


    }
}
