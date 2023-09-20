public class StringRevision {
    //java programme to get the character at the given index within the string.
    public static void main(String[] args) {
        String str = "Java practice";
        int index1 = str.charAt(7);
        int index2 = str.charAt(11);
        System.out.println("Original String " + " = " + str);
        System.out.println("The character position at 7 is " + (char)index1);
        System.out.println("The character position at 11 is " + (char)index2);

     // java programme to get the character(unicode code point)at the given index within the string
        String name = "Amazon website.com";
        System.out.println("Original String " + " = " + name);
        //codepoint at index 1
        int val1 = name.codePointAt(1);
        //codepoint at index 9
        int val2 = name.codePointAt(9);
        System.out.println("Character(unicode point)" + " = " + val1);
        System.out.println("Character(unicode point)" + " = " + val2);

     // Java programme to get the character(unicode code point) before the specified index within String
        String sub = "Gherkin Language";
        System.out.println("Original String " + " = " + sub);
        int first1 = sub.codePointBefore(1);
        int first2 = sub.codePointBefore(9);
        System.out.println("Character(unicode point) " + " = " + first1);
        System.out.println("Character(unicode point) " + " = " + first2);

     //java programme to count Unicode code points in the specified text range of a String
        String branch = "w3rsource.com";
        System.out.println("Original String " + " = " + branch);
        int ctr = branch.codePointCount(1 , 10);
        System.out.println("Codepoint count " + " = " + ctr);







    }




}