public class LogicalOperators_01
{
    public static void main(String[] args) {

    int a = 5;
    int b = 10;
    int x = 6;
    int y = 9;
    boolean result = a < b && x < y;
    boolean subresult = a > b || x < y;

    System.out.println(!result);
    System.out.println(!subresult);



    }

}
