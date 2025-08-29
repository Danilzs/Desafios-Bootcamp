import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dado = new Scanner (System.in);

        float salario = dado.nextFloat();
        float beneficios = dado.nextFloat();

        float imposto = 0;

        if(salario>=0 && salario<=1100){
            imposto = 0.5f * salario;
        } else if(salario<=2500){
            imposto = 0.10f * salario;
        } else{
            imposto = 0.15f * salario;
        }

        float salarioFinal = (salario - imposto) + beneficios;
        System.out.printf("Sálario final é %s", salarioFinal);

    }
}
