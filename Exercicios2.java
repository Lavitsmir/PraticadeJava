import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {
        int ex;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Qual o Número do ex que você deseja? (1 até 41)");
        ex = Sc.nextInt();

        switch (ex) {

            case 1 -> {
                //Faça um programa que leia 2 números e fale qual o maior
                int x, y;
                System.out.println("Digite o primeiro número: ");
                x = Sc.nextInt();
                System.out.println("Digite o segundo número: ");
                y = Sc.nextInt();

                if (x > y) {
                    System.out.println("O número "+ x + " é maior");
                }
                else if (y > x) {
                    System.out.println("O número " + y + " é maior");
                }
            }
            case 2 -> {
                //Leia um número fornecido pelo usuário. Se esse número for positivo, calcule a raiz quadrada do número.
                // Se o número for negativo, mostre uma mensagem dizendo que o número é inválido.
                float x;
                System.out.println("Digite o número");
                x = Sc.nextFloat();
                if (x > 0) {
                    System.out.println(Math.sqrt(x));
                }
                else {
                    System.out.println("O número é inválido");
                }
            }
            case 3 -> {
                //Leia um numero real. Se o número for positivo imprima a raiz quadrada.
                // Do contrário, imprima o numero ao quadrado.
                float x;
                System.out.println("Digite o número");
                x = Sc.nextFloat();
                if (x > 0) {
                    System.out.println(Math.sqrt(x));
                }
                else {
                    System.out.println(Math.pow(x,2));
                }
            }
            case 4 -> {
                // Faça um programa que leia um número e, caso ele seja positivo, calcule e mostre:
                //• O número digitado ao quadrado
                //• A raiz quadrada do número digitado
                float x;
                System.out.println("Digite o número");
                x = Sc.nextFloat();
                if (x > 0) {
                    System.out.println("O raiz é: "+ Math.sqrt(x));
                    System.out.println("O quadrado é: "+ Math.pow(x,2));
                }
                else {
                    System.out.println("O número é negativo");
                }
            }
            case 5 -> {
                //Faça um programa que receba um número inteiro e verifique se este número é par ou impar.
                int x;
                System.out.println("Digite o número");
                x = Sc.nextInt();
                if (x % 2 == 0) {
                    System.out.println("É par");
                }
                else {
                    System.out.println("Impar");
                }
            }
            case 6 -> {
                //Escreva um programa que, dados dois números inteiros,
                // mostre na tela o maior deles, assim como a diferença existente entre ambos.
                int x,y,r;
                System.out.println("Digite o primeiro número");
                x = Sc.nextInt();
                System.out.println("Digite o segundo número");
                y = Sc.nextInt();

                if (x > y) {
                    r = x - y;
                    System.out.printf("%d, %d",x,r);
                }
                else {
                    r = y - x;
                    System.out.printf("%d, %d",y,r);
                }
            }
            case 7 -> {
                //Faça um programa que receba dois números e mostre o maior.
                // Se por acaso, os dois números forem iguais, imprima a mensagem Números iguais.
                float x,y;
                System.out.println("Digite o primeiro número");
                x = Sc.nextFloat();
                System.out.println("Digite o segundo número");
                y = Sc.nextFloat();

                if (x == y) {
                    System.out.println("Números Iguais");
                }
                else System.out.println(Math.max(x, y));
            }
            case 8 -> {
                //Faça um programa que leia 2 notas de um aluno, verifique se as notas são válidas e exiba na tela a média destas notas.
                // Uma nota válida deve ser, obrigatoriamente, um valor entre 0.0 e 10.0,
                // onde caso a nota não possua um valor válido, este fato deve ser informado ao usuário e o programa termina.
                float x,y;
                System.out.println("Primeira nota: ");
                x = Sc.nextFloat();
                System.out.println("Segunda Nota: ");
                y = Sc.nextFloat();

                if (x <= 10.0 && x >= 0.0 && y <= 10.0 && y >= 0.0) {
                    double r = (x + y) / 2;
                    System.out.println(r);
                }
                else {
                    System.out.println("Valor invalido");
                }
            }
            case 9 -> {
                //Leia o salário de um trabalhador e o valor da prestação de um empréstimo.
                // Se a prestação for maior que 20% do salário imprima:
                // Empréstimo não concedido, caso contrário imprima: Empréstimo concedido.
                float x,y;
                System.out.println("Salario: ");
                x = Sc.nextFloat();
                System.out.println("Prestação: ");
                y = Sc.nextFloat();
                if ((1.2 * y) > x) {
                    System.out.println("Empréstimo não concedido");
                }
                else System.out.println("Empréstimo concedido");
            }
            case 10 -> {
                //Faça um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu peso ideal, utilizando as seguintes fórmulas (onde h corresponde à altura):
                //Homens: (72.7*h) - 58
                //Mulheres: (62.1 h) - 44,7
                System.out.println("Qual o sexo, digite M ou F: ");
                String x = Sc.next();
                System.out.println("Altura: ");
                float h = Sc.nextFloat();

                if (x == "M") {
                    double r = (72.7*h) - 58;
                    System.out.println();
                }
                if (x == "F") {
                    double r = (62.1*h) - 44.7;
                    System.out.println();
                }
            }

            default -> System.out.println("O exercicio ou não está feito ainda, ou não existe :p");
        }
    }
}
