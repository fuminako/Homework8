public class Main {
    public static void main(String[] args) {
        // Задание 1
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;

        double[] fraction = {1.57, 7.654, 9.986};

        int[] number = {13, 17, 15};

        // Задание 2
        for (int i = 0; i < 3; i++) {
            if( i != 2 )
                System.out.print(integer[i] + ", ");
            else
                System.out.print(integer[i]);
        }
        System.out.println(" ");
        for (int f = 0; f < 3; f++) {
            if( f != 2 )
                System.out.print(fraction[f] + ", ");
            else
                System.out.print(fraction[f]);
        }
        System.out.println(" ");
        for (int n = 0; n < 3; n++) {
            if( n != 2 )
                System.out.print(number[n] + ", ");
            else
                System.out.print(number[n]);
        }
        System.out.println(" ");

        // Задание 3
        for (int in = integer.length - 1; in >= 0; in--) {
            if( in != 0 )
                System.out.print(integer[in] + ", ");
            else
                System.out.print(integer[in]);
        }
        System.out.println(" ");

        for (int frac = fraction.length - 1; frac >= 0; frac--) {
            if( frac != 0 )
                System.out.print(fraction[frac] + ", ");
            else
                System.out.print(fraction[frac]);
        }
        System.out.println(" ");

        for (int num = 2; num >= 0; num--) {
            if( num != 0 )
                System.out.print(number[num] + ", ");
            else
                System.out.print(number[num]);
        }
        System.out.println(" ");

        // Задание 4
        for (int in = 0; in < 3; in++) {
            if (integer[in] % 2 != 0)
                integer[in]++;
            System.out.println(integer[in]);
        }
    }
}