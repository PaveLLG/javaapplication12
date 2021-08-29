import java.util.Arrays;

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

        Box.CompareByA cmp = new Box(0,0,0).new CompareByA();
        Arrays.sort(boxes, cmp);

        for (Box box: boxes){
            System.out.println(box);
        }

    }


}
