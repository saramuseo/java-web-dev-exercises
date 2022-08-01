package exercises;

import java.util.Scanner;

public class Rose {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String newAlice = alice.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("What term would you like to search for?");


        String searchTerm = input.nextLine();
        String newSearchTerm = searchTerm.toLowerCase();

        input.close();

        int index = newAlice.indexOf(newSearchTerm);
        int length = searchTerm.length();
        int endofSlice = index + length + 1;
        int aliceLength = alice.length();
        String lessAlice;
        lessAlice = alice.substring(0, index) + "_____ " + alice.substring(endofSlice, aliceLength);

        if (newAlice.contains(newSearchTerm)) {
            System.out.println(searchTerm + " was found. It was first found at index " + index + " and is " + length + " characters long." +
                    "The sentence without this word would look like: " + lessAlice);
        }

        else {
            System.out.println(searchTerm + " is not in this sentence.");
        }


    }
}
