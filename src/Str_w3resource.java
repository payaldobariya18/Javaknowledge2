public class Str_w3resource {

static Str_w3resource strW3resource = new Str_w3resource();
    public static void main(String[] args) {
    strW3resource.contains("Javascript and Python","and");
    strW3resource.removespecialsymbol("$30.00 are not equal to $20.00");
    strW3resource.endswithanother("My name is Zara","My name is Sara","Zara");
    strW3resource.comparestring("Yoga Excercise", "Physical Excercise" , "yoga excerCise");
    strW3resource.extractnumber("Welcome12354 to856786 tutorials76 point89 ");
    }
   //java programme to test given string contains the specified sequence of char values
    void contains(String one, String two){
        System.out.println("Original String: " + one);
        System.out.println("Specified sequence of char value: " +two);
        System.out.println(one.contains(two));

    }
     // java programme to remove special symbol
    void removespecialsymbol(String sentence){
        System.out.println("Old: " + sentence);
        System.out.println("New: " + sentence.replaceAll(("[^a-zA-Z0-9_-]"), " "));
    }
    void endswithanother(String volume01, String volum02, String result)
    { boolean result01 = volume01.endsWith(result);
      boolean result02 = volum02.endsWith(result);
        System.out.println("\"" + volume01 + "\" ends with " + "\"" + result + "\"? " + result01);
        System.out.println("\"" + volum02+ "\" ends with " + "\"" + result + "\"? " + result02);
    }
    void comparestring(String line01, String line02, String lion03){
        boolean str01 = line01.equalsIgnoreCase(line02);
        boolean str02 = line01.equalsIgnoreCase(lion03);
        System.out.println("\"" +line01+ "\" equals \" " + line02 + "\"? " + str01);
        System.out.println("\"" +line01+ "\" equals \" " + lion03 + "\" ? " + str02);
    }
    void extractnumber(String sentence){
        System.out.println("Old: " + sentence);
        System.out.println("New: " + sentence.replaceAll("\\D+", " "));
    }



}
