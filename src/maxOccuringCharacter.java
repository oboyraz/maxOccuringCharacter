import java.util.Scanner;

public class maxOccuringCharacter {

    /*
* Write a Java program to get a String from user as input and find the maximum
		 * occurring character in that string.(Ignore case sensitivity).
		 *
		 * Input : Learning java is easy
		 *
		 * Output: maximum occurring character is : a
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("write a sentence: ");
        String input = scan.nextLine().toLowerCase();
        maksimumKarakterBul(input);
    }
    private static void maksimumKarakterBul(String input) {
        input = input.replaceAll("\\s+", "");
        int countChr = 0;
        int findIndex = -1;
        for (int i = 0; i <input.length() ; i++) {
            int count = 0;
            for (int j = 1; j <input.length() ; j++) {
                if (input.charAt(i)==input.charAt(j)){
                    count++;
                }
            }
            if (countChr < count){
                countChr = count;
                findIndex = i;
            }
        }
        System.out.println("maximum occurring character is: " + input.charAt(findIndex));
    }
}