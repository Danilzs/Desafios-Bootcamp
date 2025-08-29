import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        float valor = dado.nextFloat();

        if(valor < 50){
            System.out.println("Desconto de 0%");
        }else if(valor < 100){
            System.out.println("Desconto de 10%");
        }else{
            System.out.println("Desconto de 20%");
        }

        }
    }
