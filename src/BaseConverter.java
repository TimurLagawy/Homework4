import java.util.Scanner;

public abstract class BaseConverter {

    abstract void convert();

    {


        Scanner in = new Scanner(System.in);
        System.out.println("Введите градусы Цельсия");
        int c = in.nextInt();
        System.out.println(c + "градусы Цельсия = " + (c * 1.8 + 32) + "градусов Фарингейта = " + (c + 273) + " градусов Кельвина ");

    }
}