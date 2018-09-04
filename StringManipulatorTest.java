public class StringManipulatorTest{
    public static void main(String[] args){
        StringManipulator manipulator = new StringManipulator();

        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str);

        char letter = 'o';
        Integer aa = manipulator.getIndexOrNull("Coding", letter);
        Integer bb = manipulator.getIndexOrNull("Hello World", letter);
        Integer cc = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(aa); 
        System.out.println(bb); 
        System.out.println(cc);

        String wordd = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer a = manipulator.getIndexOrNull(wordd, subString);
        Integer b = manipulator.getIndexOrNull(wordd, notSubString);
        System.out.println(a); 
        System.out.println(b); 

        String word = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word);
    }
}