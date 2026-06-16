package DSA;

public class Frequency_of_Characters {
/*
  Input:  "hello"

Output:
h -> 1
e -> 1
l -> 2
o -> 1
  */
  public static void main(String[] args) {

        String str = "hello";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            System.out.println(ch + " -> " + count);
        }
    }
}
