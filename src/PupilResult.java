public class PupilResult {
static PupilResult pupilResult = new PupilResult();
    public static void main(String[] args) {
    ;
    pupilResult.marks01(50);
    pupilResult.marks02(56);
    pupilResult.marks03(54);
    pupilResult.marks04(52);
    pupilResult.totalmarks(50,56,54,52);
    }

    void totalmarks(int chemistry, int physics, int maths, int eng)
    {
        System.out.println("totalmarks " + " = " + (chemistry+physics+maths+eng));
       // totalmarks = (chemistry+physics+maths+eng)
    }
    void marks01(int chemistry){
        System.out.println("chemistry " + " = " + chemistry);
        //chemisry = answer
    }
    void marks02(int physics){
        System.out.println("physics " + " = " + physics);
    }
    void marks03(int maths){
        System.out.println("maths " + " = " + maths);
    }
    void marks04(int eng){
        System.out.println("eng " + " = " + eng);
    }















}
