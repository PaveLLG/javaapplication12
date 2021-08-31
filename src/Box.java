import java.util.Comparator;

public class Box implements Comparable<Box> {

    private int a,b,c;

    public Box(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    @Override
    public String toString() {
        return "Box " +
                "a = " + a +
                ", b = " + b +
                ", c = " + c ;
    }

    public int volume(){
        return a*b*c;
    }

    @Override
    public int compareTo(Box rValue) {
        return volume()-rValue.volume();
    }

//    public class CompareByA implements Comparator<Box> {
//        @Override
//        public int compare(Box b1, Box b2) {
//            return b1.a - b2.a;
//        }
//    }


    // третий вариант
//    public static Comparator<Box> compareByA(){
//        class CMP implements Comparator<Box>{
//            @Override
//            public int compare(Box b1, Box b2) {
//                return b1.a - b2.a;
//            }
//        }
//        return new  CMP();
//    }

    public static Comparator<Box> compareByA(){
        return new Comparator<Box>() {
            {
                //....
            }

            @Override
            public int compare(Box b1, Box b2) {
                return b1.a - b2.a;
            }

        };
    }




    public static class CompareByA implements Comparator<Box> {
        @Override
        public int compare(Box b1, Box b2) {
            return b1.a - b2.a;
        }
    }

}


