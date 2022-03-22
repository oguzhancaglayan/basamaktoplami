import java.util.Scanner;

public class amstrongsayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, fakenum = 0, digitnum = 0, digitval, result = 0;
        boolean asknum = false;

        do {
            System.out.println("Please enter a number: ");
            num = input.nextInt();
            if (num >= 0) {
                asknum = true;
            }
        }
        while (!asknum);

        fakenum = num;

        while (fakenum != 0) {
            digitval = fakenum % 10;
            result += digitval;
            fakenum /= 10;
        }


        System.out.println("The sum of the digits of the number "+num+" is: "+result);


    }
}