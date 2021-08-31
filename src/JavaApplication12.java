import java.util.Arrays;
import java.util.Comparator;

public class JavaApplication12 {


    public static void main(String[] args) {
        Box[] boxes = {
                new Box(10,1,1),
                new Box(1,10,10),
                new Box(2,2,2)
        };

        //по объему
        Arrays.sort(boxes);


        for (Box box: boxes) {
            System.out.println(box);
        }

//        Box.CompareByA cmp = new Box(0,0,0).new CompareByA();
//        Arrays.sort(boxes, cmp);


//        Arrays.sort(boxes, new Box.CompareByA());

        // И Третий и четвертый вариант
//        Arrays.sort(boxes, Box.compareByA());

        Arrays.sort(boxes, new Comparator<Box>() {
            @Override
            public int compare(Box b1, Box b2) {
                return b1.getA() - b2.getA();
            }
        });


        for (Box box: boxes){
            System.out.println(box);
        }

    }


}
