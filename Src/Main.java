import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;



public class Main {

    public static int optionsInput(int arrayInput) {
            int[] Arrays = new int[10];
            String[] options =
                    {"skattermaus", "kaffemaskine", "Netflix", "sofa", "løbesko",
                            "guitar", "slik", "hund", "bog", "øl"};
            int inputToArray = (arrayInput == 1) ? 0 : (arrayInput == 2) ? 1 : (arrayInput == 3) ? 2 :
                    (arrayInput == 4) ? 3 : (arrayInput == 5) ? 4 : (arrayInput == 6) ? 5 :
                            (arrayInput == 7) ? 6 : (arrayInput == 8) ? 7 : (arrayInput == 9) ? 8 : (arrayInput == 10) ? 9 : 11;
           System.out.println(options[inputToArray]);
        return inputToArray;
    }

public static int scoreConverter(int score){
            int inputToArray = (score == 1) ? 0 : (score == 2) ? 1 : (score == 3) ? 2 :
                    (score == 4) ? 3 : (score == 5) ? 4 : (score == 6) ? 5 :
                            (score == 7) ? 6 : (score == 8) ? 7 : (score == 9) ? 8 : 9;

        return inputToArray;
}
public static OptionalInt largestNumber(int[] arrayInput){
    OptionalInt theLargestNumber = Arrays.stream(arrayInput).max();
    return theLargestNumber;

}





    public static void main(String[] args) {
        System.out.println("Hvilke ting vil du helst have med på en øde ø?"
                + "\n1 skattermaus\n2 kaffemaskine\n3 Netflix\n4 sofa\n5 løbesko\n6 guitar\n7 slik\n8 hund\n9 bog\n10 øl\n");
        int[] arrays = new int[10];
        int i = 0;
        do {
            String[] options =
                    {"skattermaus", "kaffemaskine", "Netflix", "sofa", "løbesko",
                            "guitar", "slik", "hund", "bog", "øl"};
            System.out.println("Indtast værdi: ");
            Scanner scanner = new Scanner(System.in);
            int arrayInput = scanner.nextInt();
            optionsInput(arrayInput);
            arrays[scoreConverter(arrayInput)]++;
            Arrays.stream(arrays).count();


            if (i == 9) {
                System.out.println(Arrays.toString(arrays));
                if (arrays[4] > arrays[1] && arrays[4] > arrays[2] && arrays[4] > arrays[0]
                        && arrays[4] > arrays[3] && arrays[4] > arrays[5]
                        && arrays[4] > arrays[6] && arrays[4] > arrays[7]
                        && arrays[4] > arrays[8] && arrays[4] > arrays[9]) {
                    System.out.println("Det mest valgte er " + options[4] + ".");
                }
                else if (arrays[1] > arrays[2] && arrays[1] > arrays[0]
                        && arrays[1] > arrays[3] && arrays[1] > arrays[5]
                        && arrays[1] > arrays[6] && arrays[1] > arrays[7]
                        && arrays[1] > arrays[8] && arrays[1] > arrays[9]) {
                    System.out.println("Det mest valgte er " + options[1] + ".");
                }
                else if (arrays[2] > arrays[1] &&
                        arrays[2] > arrays[3] && arrays[2] > arrays[5] && arrays[2] > arrays[0]
                        && arrays[2] > arrays[6] && arrays[2] > arrays[7]
                        && arrays[2] > arrays[8] && arrays[2] > arrays[9]) {
                    System.out.println("Det mest valgte er " + options[2] + ".");
                }
                else if(arrays[3] > arrays[1] && arrays[3] > arrays[5] && arrays[3] > arrays[0]
                        && arrays[3] > arrays[6] && arrays[3] > arrays[7]
                        && arrays[3] > arrays[8] && arrays[3] > arrays[9]) {
                    System.out.println("Det mest valgte er " + options[3] + ".");
                }
                else if (arrays[5] > arrays[1] && arrays[5] > arrays[3] && arrays[5] > arrays[0]
                        && arrays[5] > arrays[6] && arrays[5] > arrays[7]
                        && arrays[5] > arrays[8] && arrays[5] > arrays[9]) {
                    System.out.println("Det mest valgte er " + options[6] + ".");
                }
                else if (arrays[7] > arrays[1] && arrays[7] > arrays[2] && arrays[7] > arrays[0]
                        && arrays[7] > arrays[3] && arrays[7] > arrays[5]
                        && arrays[7] > arrays[6] && arrays[7] > arrays[8]
                        && arrays[7] > arrays[9]) {
                    System.out.println("Det mest valgte er " + options[7] + ".");
                }
                else if (arrays[8] > arrays[2] && arrays[8] > arrays[0]
                        && arrays[8] > arrays[3] && arrays[8] > arrays[5]
                        && arrays[8] > arrays[6] && arrays[8] > arrays[7] &&
                        arrays[8] > arrays[9] && arrays[8] > arrays[1]) {
                    System.out.println("Det mest valgte er " + options[8] + ".");
                }
                else if (arrays[0] > arrays[2] && arrays[0] > arrays[1]
                        && arrays[0] > arrays[3] && arrays[0] > arrays[5]
                        && arrays[0] > arrays[6] && arrays[0] > arrays[7]
                        && arrays[0] > arrays[8] && arrays[0] > arrays[9]) {
                    System.out.println("Det mest valgte er " + options[0] + ".");

                } else if (arrays[6] > arrays[1] && arrays[6] > arrays[3] && arrays[6] > arrays[0]
                        && arrays[6] > arrays[7]
                        && arrays[6] > arrays[8] && arrays[6] > arrays[9]) {
                    System.out.println("Det mest valgte er " + options[6] + ".");

                } else if (arrays[9] > arrays[1] && arrays[9] > arrays[3] && arrays[9] > arrays[0]
                        && arrays[9] > arrays[6] && arrays[9] > arrays[7]
                        && arrays[9] > arrays[8]) {
                    System.out.println("Det mest valgte er " + options[9] + ".");

                } else {
                    System.out.println("ingen favoritter :(");
                }

            }i++;
        }while (i < 10);


        }
    }