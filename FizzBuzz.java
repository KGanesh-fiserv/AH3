import java.util.Scanner;
public class FizzBuzz {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int ans = input.nextInt();

        fizzBuzz(ans);
        System.out.println("-----------------------------------------");
        fizzBuzzRecursive(ans);
    }

    private static void fizzBuzzRecursive(int ans) {
        if(ans == 1){
                System.out.println(1);
        }
        else{
            if(ans%3 == 0 && ans%5 == 0)
                System.out.println("FizzBuzz");
            else if(ans%5 ==0)
                System.out.println("Buzz");
            else if(ans%3 == 0)
                System.out.println("Fizz");
            else
                System.out.println(ans);
            fizzBuzzRecursive(ans - 1);
        }

    }

    private static void fizzBuzz(int ans) {
        for(int i = 1; i<=ans; i++){
            if(i%3 == 0 && i%5 == 0)
                System.out.println("FizzBuzz");
            else if(i%5 ==0)
                System.out.println("Buzz");
            else if(i%3 == 0)
                System.out.println("Fizz");
            else
                System.out.println(i);
        }
    }
    
}
