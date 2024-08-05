import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
int number,tempNumber;
int basValue;
int total =0;
Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        number = inp.nextInt();
        tempNumber = number;


        while(tempNumber != 0){
            basValue = tempNumber % 10;
            total += basValue;
            tempNumber /= 10;

        }

        System.out.println("Sayının basamakları toplamı:" +total);


    }
}