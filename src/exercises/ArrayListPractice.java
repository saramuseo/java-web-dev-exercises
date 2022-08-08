package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static int sum (ArrayList<Integer> arr){
        int evenTotal = 0;
        for (int i : arr){
            if (i%2 == 0) {
                evenTotal += i;
            }
        }
        return (evenTotal);
    }
    public static ArrayList<String> fiveLetter (ArrayList<String> wordList) {
        int searchNumber;
        ArrayList<String> fiveLetterWords = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter length of word to search: ");
        searchNumber = input.nextInt();

        for (String i : wordList) {
            if (i.length() == searchNumber) {
               fiveLetterWords.add(i);
            }
        }
        return fiveLetterWords;
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(ArrayListPractice.sum(integers));

        ArrayList<String> wordArray = new ArrayList<>(
        Arrays.asList("word1", "smaller word", "words", "another word", "small", "onetwo", "threes"));

        System.out.println(ArrayListPractice.fiveLetter(wordArray));

    }

    }
