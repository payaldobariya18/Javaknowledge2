public class Calculator2 {
    static int a = 78;
    static int b = 5;
    static int answer;

    public static void main(String[] args) {
    addition();
    substraction();
    multiplication();
    division();
    modulus();
    System.out.println(a);//78
    System.out.println(++a);//79
    System.out.println(a++);//80
    System.out.println(b); //5
    System.out.println(--b);//4
    System.out.println(b--);//4
    System.out.println(b);//3

    }
    static void addition(){
        answer = a+b;
        System.out.println("addition of " +a+ " and " +b+ " = " + answer);

    }
    static void substraction(){
        answer = a-b;
        System.out.println("subsraction of " +a+ "and " +b+ " = " + answer);
    }
    static void multiplication(){
        answer = a*b;
        System.out.println("multiplication of " +a+ " and " +b+ " = " + answer);
    }
    static void division(){
        answer = a/b;
        System.out.println("division of " +a+ " and " +b+ " = " + answer);
    }

    static void modulus(){
        answer = a%b;
        System.out.println("modulus of " +a+ " and " +b+ " = " + answer);
    }



}