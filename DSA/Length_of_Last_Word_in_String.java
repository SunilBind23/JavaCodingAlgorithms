package DSA;

public class Length_of_Last_Word_in_String {
/* Input:  "Hello World"
Output: 5
  */
   public static void main(String[] args) {

        String str = "Hello World";

        str = str.trim();

        String[] words = str.split(" ");

        System.out.println(words[words.length - 1].length());
    }
}
