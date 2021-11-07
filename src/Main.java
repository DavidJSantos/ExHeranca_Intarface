import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double base;
        double altura;
        double raio;

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual forma geometrica deseja calcular?");
        System.out.println("1 - Triangulo");
        System.out.println("2 - Retangulo");
        System.out.println("3 - Circulo");
        System.out.println();
        System.out.print("Para selecionar, insira o numero correspondente: ");
        int opcao = sc.nextInt();
        System.out.println();

        switch (opcao){
            case 1:
                System.out.println("--- TRIANGULO ---");
                System.out.print("Informe a medida da base: ");
                base = sc.nextDouble();
                System.out.print("Informe a medida da altura: ");
                altura = sc.nextDouble();
                Triangulo triangulo = new Triangulo("Triangulo",base,altura);
                triangulo.getArea();
                break;

            case 2:
                System.out.println("--- RETANGULO ---");
                System.out.print("Informe a medida da base: ");
                base = sc.nextDouble();
                System.out.print("Informe a medida da altura: ");
                altura = sc.nextDouble();
                Retangulo retangulo = new Retangulo("Retangulo",base, altura);
                retangulo.getArea();
                break;

            case 3:
                System.out.println("--- CIRCULO ---");
                System.out.print("Informe a medida do raio: ");
                raio = sc.nextDouble();
                Circulo circulo = new Circulo("Circulo", raio);
                circulo.getArea();
                break;

            default:
                System.out.println("Opcao invalida!!!");
                break;
        }
        sc.close();
    }
}
