
import java.util.ArrayList;
import java.util.List;

public class TestClass {
    /*
    public static void main(String[] args) {
        int n=100;
        
        List<Integer> integers = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            integers.add((int) (Math.random()*n));
        }
        double avr=0;
        int sum=0;

        for (int i = 0; i < integers.size(); i++) {
            sum += integers.get(i);
        }System.out.print(sum);
        System.out.println(sum/n);
    }
}
*/
    public static void main(String[] args) {
        int n = 100;

        List<Integer> integers = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            integers.add((int) (Math.random() * n));
        }
        double even = 0;
        int noEven = 0;

        for (int i = 0; i < 100; i++) {
            if (integers.get(i) % 2 == 0) {
                even++;
            } else {
                noEven++;
            }
        }
    }}