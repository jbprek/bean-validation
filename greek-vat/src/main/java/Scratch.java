import java.util.Arrays;

/**
 * @author prekezes.
 */
public class Scratch {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pow2(8)));
        System.out.println(Arrays.toString(invPow2(8)));
        System.out.println(Arrays.toString(pow10(8)));
        System.out.println(Arrays.toString(digits(123456789)));
        System.out.println(Arrays.toString(invDigits(123456789)));
    }

    static int[] pow2(final int zeroOffsetInclusive) {
        int[] arr = new int[zeroOffsetInclusive + 1];
        for (int i = 1; i <= zeroOffsetInclusive; ++i)
            arr[i] =  1 << i;
        return arr;
    }

    static int[] invPow2(final int zeroOffsetInclusive) {
        int[] arr = new int[zeroOffsetInclusive + 1];
        for (int i = zeroOffsetInclusive; i > 0; i--)
            arr[zeroOffsetInclusive - i] =  1 << i;

        return arr;
    }

    static int[] digits(final int numberWith9digits) {
        int[] arr = new int[9];
        int rem =  numberWith9digits;
        int mod =  numberWith9digits;
        int idx = 0;
        int div = 0;
        for (int i = 8; i >= 0; i--) {
            div = powten(i);
            rem = rem / div;
            mod = mod % div;
            arr[idx++] = rem;
            System.out.println("i=" + i + " rem=" + rem + " mod=" + mod);
            rem = mod;
        }
        return arr;
    }

    static int[] invDigits(final int numberWith9digits) {
        int[] arr = new int[9];
        int rem =  numberWith9digits;
        int mod =  numberWith9digits;
        int idx = 8;
        int div = 0;
        for (int i = 8; i >= 0; i--) {
            div = powten(i);
            rem = rem / div;
            mod = mod % div;
            arr[idx--] = rem;
            System.out.println("i=" + i + " rem=" + rem + " mod=" + mod);
            rem = mod;
        }
        return arr;
    }

    private static int[] pow10(final int zeroOffsetInclusive) {
        int[] arr = new int[zeroOffsetInclusive + 1];
        for (int i = 1; i <= zeroOffsetInclusive; ++i)
            arr[i] =  powten(i);
        return arr;
    }


    private static int powten( int exp)

    {
        int base = 10;
        int result = 1;
        while (exp != 0)
        {
            if ((exp & 1) == 1)
                result *= base;
            exp >>= 1;
            base *= base;
        }

        return result;
    }

}
