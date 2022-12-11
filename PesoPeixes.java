import java.util.Scanner;

public class PesoPeixes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("EXERCÍCIO 14");
        System.out.println("Digite o total de peso dos peixes pescados:");
        double peso = Double.parseDouble(scanner.next());
        double excedente = peso - 50;
        double multa = excedente*4;
        if(excedente<50) {
            System.out.println("Você ultrapassou " + excedente + " Kg");
            System.out.println("Deve pagar uma multa no valor de R$ "+multa);
        }else{
            System.out.println("Você não ultrapassou do limite de kg");
        }
        System.out.println("=====================================");
    }
}
