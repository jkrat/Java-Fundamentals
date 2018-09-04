import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Puzzling {
    public static void main(String[] Args) {
        int[] task1 = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Character> alpha = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        Puzzling puzzle = new Puzzling();
        puzzle.printsum(task1);
        System.out.println(puzzle.arrayGt10(task1));

        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        
        System.out.println(puzzle.findLongNames(names));
        System.out.println(puzzle.randomLetters(alpha));
        System.out.println(puzzle.createRandString(alpha));
        System.out.println(puzzle.createListOfRandString(alpha));
        System.out.println(puzzle.addRandoms());
        // Collections.shuffle(alpha);
        // System.out.println(alpha.get(alpha.size() - 1)); 
        // Collections.sort(names);
        // System.out.println(names);
                
        // Random r = new Random();
        // System.out.println(r.nextInt()); // without bounds
        // System.out.println(r.nextInt(5)); // with bounds 0 to 5
    }
    public void printsum(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
    }
    public ArrayList<Integer> arrayGt10(int[] arr) {
        ArrayList<Integer> gt10 = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
            gt10.add(arr[i]);
            }
        }
        return gt10;
    }
    public ArrayList<String> findLongNames(ArrayList<String> arr) {
        ArrayList<String> longNames = new ArrayList<String>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() > 5) {
                longNames.add(arr.get(i));
            }
        }
        return longNames;
    }
    public ArrayList<Character> randomLetters(ArrayList<Character> arr) {
        ArrayList<Character> letters = new ArrayList<Character>();
        Collections.shuffle(arr);
        letters.add(arr.get(arr.size() - 1));
        letters.add(arr.get(0));
        if (arr.get(0) == 'a' || arr.get(0) == 'e' || arr.get(0) == 'i' || arr.get(0) == 'o' || arr.get(0) == 'u'){
            System.out.println("You've got a vowel!");
        }
    return letters;
    }
    public ArrayList<Integer> addRandoms() {
        ArrayList<Integer> randoms = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            randoms.add(55 + r.nextInt(45));
        }
        Collections.sort(randoms);
        randoms.add(randoms.get(0));
        randoms.add(randoms.get(randoms.size() - 2));
        return randoms;
    }
    public String createRandString(ArrayList<Character> arr) {
        Random r = new Random();
        String str = "";
        for (int i = 0; i < 5; i++) {
            str += arr.get(r.nextInt(25)); 
        }
        return str;
    }
    public ArrayList<String> createListOfRandString(ArrayList<Character> arr) {
        Random r = new Random();
        ArrayList<String> randStrings = new ArrayList<String>();
        for (int j = 0; j < 5; j++) {
            String str = "";
            for (int i = 0; i < 5; i++) {
                str += arr.get(r.nextInt(25)); 
            }
            randStrings.add(str);
        }
        return randStrings;
    }
}