public class StringManipulationTest {
    public static void main(String[] args) {
        StringManipulation manipulate = new StringManipulation();

        String str = manipulate.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str);

        char letter = 'o';
        Integer a = manipulate.getIndexOrNull("Coding", letter);
        Integer b = manipulate.getIndexOrNull("Hello World", letter);
        Integer c = manipulate.getIndexOrNull("Hi", letter);
        System.out.println(a);
        System.out.println(b); 
        System.out.println(c);

        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = manipulate.getIndexOrNull(word, subString);
        Integer e = manipulate.getIndexOrNull(word, notSubString);
        System.out.println(a);
        System.out.println(b);

        String sub = manipulate.concatSubstring("Hello", 1, 2, "world");
        System.out.println(sub);
    }
}