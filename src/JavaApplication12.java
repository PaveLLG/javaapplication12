import java.util.Arrays;

public class JavaApplication12 {


    public static void main(String[] args) {
        Box[] boxes = {
                new Box(10,1,1),
                new Box(1,10,10),
                new Box(2,2,2)
        };

        Arrays.sort(boxes);


        for (Box box: boxes) {
            System.out.println(boxes);
        }


    }


}
