package DSA;

public class Print_Even_Word_From_a_String {
  /* Input:
"I am learning Java"

Words:
I        -> length 1 (odd)
am       -> length 2 (even)
learning -> length 8 (even)
Java     -> length 4 (even)

Output:
am
learning
Java
  */
   public static void main(String[] args) {

        String str = "I am learning Java";

        String[] words = str.split(" ");

        for (String word : words) {

            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }

}
