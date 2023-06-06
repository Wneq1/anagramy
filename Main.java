import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
    
 System.out.println("Podaj 1-słowo: ");
    String str1 = scan.nextLine();
 System.out.println("Podaj 2-słowo: ");
    String str2 = scan.nextLine();
    
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    
    if(str1.length() == str2.length()) {

      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

      Arrays.sort(charArray1);
      Arrays.sort(charArray2);
      
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println(str1 + " i " + str2 + " są anagramami.");
      }
      else {
        System.out.println(str1 + " i " + str2 + " nie są anagramami.");
      }
    }
    else {
      System.out.println(str1 + " i " + str2 + " nie są anagramami.");
    }
  }
}


 