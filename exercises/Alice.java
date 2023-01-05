package exercises;

import java.util.Scanner;
public class Alice {

    public static void main(String[] arg) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Alright, so the next question is related to this sentence. " + sentence + "\nOkay, so lets see if we can print the right results. First, I want to see if the word you put in is in the sentence. Please type a word that was in the sentence.");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        String search = answer.toLowerCase();
        String alice = sentence.toLowerCase();
        Boolean isIt = alice.contains(search);
        int index = alice.indexOf(search) + 1;
        int length = search.length();
        System.out.println("Is it in the sentence? " + isIt + "\n");
        if (alice.contains(search)) {
            System.out.println(search + " is in the sentence with an index of " + index + " and the word has a length of " + length + ".");
        } else {
            System.out.println("Did you put the wrong word in on purpose?");
        }

    }
}
