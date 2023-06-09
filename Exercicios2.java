import java.util.Objects;
import java.util.Random;
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

                if (Objects.equals(x, "M")) {
                    double r = (72.7*h) - 58;
                    System.out.println(r);
                }
                if (Objects.equals(x, "F")) {
                    double r = (62.1*h) - 44.7;
                    System.out.println(r);
                }
            }
            case 11 -> {
                //Escreva um programa que leia um número inteiro maior do que zero e devolva, na tela, a soma de todos os seus algarismos.
                // Por exemplo, ao número 251 corresponderá o valor 8 (2+5+1).
                // Se o número lido não for maior do que zero, o programa terminará com a mensagem "Número inválido".
                System.out.println("Digite o número de 3 digitos: ");
                int n = Sc.nextInt();
                int s = 0;

                while (n > 0) {
                    s += n % 10;
                    n /= 10;
                }
                System.out.printf("A soma é: %d", s);
            }
            case 12 -> {
                //Ler um número inteiro. Se o número lido for negativo, escreva a mensagem "Número inválido".
                // Se o número for positivo, calcular o logaritmo deste numero.
                System.out.println("Digite o Número: ");
                int a = Sc.nextInt();

                if (a < 0) {
                    System.out.println("Número invalido");
                }
                else {
                    System.out.println(Math.log(a));
                }
            }
            case 13 -> {
                //Faça um algoritmo que calcule a média ponderada das notas de 3 provas.
                // A primeira e a segunda prova têm peso 1 e a terceira tem peso 2.
                // Ao final, mostrar a média do aluno e indicar se o aluno foi aprovado ou reprovado.
                // A nota para aprovação deve ser igual ou superior a 60 pontos.
                System.out.println("Digite a nota da 1 prova: ");
                float a = Sc.nextFloat();
                System.out.println("Digite a nota da 2 prova: ");
                float b = Sc.nextFloat();
                System.out.println("Digite a nota da 3 prova: ");
                float c = Sc.nextFloat();

                double r = (c*2) + b + a / 4;

                System.out.printf("O resultado foi %f", r);
            }
            case 14 -> {
                //A nota final de um estudante é calculada a partir de três notas atribuídas entre o intervalo de 0 até 10, respectivamente,
                // a um trabalho de laboratório, a uma avaliação semestral e a um exame final.
                // A média das três notas mencionadas anteriormente obedece aos pesos:
                // Trabalho de Laboratório: 2; Avaliação Semestral: 3; Exame Final: 5.
                // De acordo com o resultado, mostre na tela se o aluno está reprovado
                // (média entre 0 e 2,9), de recuperação (entre 3 e 4,9) ou se foi aprovado.
                // Faça todas as verificações necessárias.
                System.out.println("Qual foi a nota do trabalho? ");
                float t = Sc.nextFloat();
                System.out.println("Qual foi a nota da Avaliação? ");
                float a = Sc.nextFloat();
                System.out.println("Qual foi a nota do exame? ");
                float e = Sc.nextFloat();

                double f = (t * 2) + (a * 3) + (e * 5) / 10;

                System.out.printf("A média final foi: %f", f);
            }
            case 15 -> {
                //Usando switch, escreva um programa que leia um inteiro entre 1 e 7 e
                // imprima o dia da semana correspondente a este numero. Isto é, domingo se 1, segunda-feira se 2, e assim por diante.
                System.out.println("Digite um número de 1 a 7:" );
                int d = Sc.nextInt();

                switch (d) {
                    case 1 -> System.out.println("Domingo");
                    case 2 -> System.out.println("Segunda");
                    case 3 -> System.out.println("Terça");
                    case 4 -> System.out.println("Quarta");
                    case 5 -> System.out.println("Quinta");
                    case 6 -> System.out.println("Sexta");
                    case 7 -> System.out.println("Sábado");
                }
            }
            case 16 -> {
                //Usando switch, escreva um programa que leia um inteiro entre 1 e 12 e imprima o mês correspondente a este numero.
                // Isto é, janeiro se 1, fevereiro se 2, e assim por diante.
                System.out.println("Digite um número de 1 a 12:" );
                int m = Sc.nextInt();

                switch (m) {
                    case 1 -> System.out.println("Janeiro");
                    case 2 -> System.out.println("Fevereiro");
                    case 3 -> System.out.println("Março");
                    case 4 -> System.out.println("Abril");
                    case 5 -> System.out.println("Maio");
                    case 6 -> System.out.println("Junho");
                    case 7 -> System.out.println("Julho");
                    case 8 -> System.out.println("Agosto");
                    case 9 -> System.out.println("Setembro");
                    case 10 -> System.out.println("Outubro");
                    case 11 -> System.out.println("Novembro");
                    case 12 -> System.out.println("Dezembro");
                }
            }
            case 17 -> {
                //Faça um programa que calcule e mostre a área de um trapézio. Sabe-se que:
                //(basemaior+basemenor) * altura
                //2
                //Lembre-se a base maior e a base menor devem ser números maiores que zero.
                System.out.println("Qual a base maior? ");
                float bma = Sc.nextFloat();
                System.out.println("Qual a base menor? ");
                float bme = Sc.nextFloat();
                System.out.println("Qual a altura? ");
                float a = Sc.nextFloat();

                if (bma > 0 || bme > 0 || a > 0) {
                    double r = (bma + bme) * a;

                    System.out.printf("O resultado é : %f", r);
                }
                else System.out.println("Valor Inválido");
            }
            case 18 -> {
                //Faça um programa que mostre ao usuário um menu com 4 opções de operações matemáticas (as básicas, por exemplo).
                // O usuário escolhe uma das opções e o seu programa então pede dois valores numéricos e realiza a operação,
                // mostrando o resultado e saindo.
            }
            case 19 -> {
                //Faça um programa para verificar se um determinado número inteiro e divisível por 3 ou 5,
                // mas não simultaneamente pelos dois.
                System.out.println("Digite um valor inteiro: ");
                int a = Sc.nextInt();

                if (a % 3 == 0) {
                    if (a % 5 == 0) System.out.println("Ele é divisivel por 3 e 5");
                    else System.out.println("Ele é divisivel somente por 3!");
                } else if (a % 5 == 0) System.out.println("Ele é divisivel somente por 5!");

                else System.out.println("Ele não é divisivel nem por 3, e nem por 5");

            }
            case 20 -> {
                //Dados três valores, A, B, C, verificar se eles podem ser valores dos lados de um triângulo e, se forem,
                // se é um triângulo escaleno, equilátero ou isoscele, considerando os seguintes conceitos:
                //O comprimento de cada lado de um triângulo é menor do que a soma dos outros dois lados.
                //Chama-se equilátero o triângulo que tem três lados iguais.
                //Denominam-se isosceles o triângulo que tem o comprimento de dois lados iguais.
                //Recebe o nome de escaleno o triângulo que tem os três lados diferentes.
                System.out.println("Digite o primeiro lado do triângulo: ");
                float a = Sc.nextFloat();
                System.out.println("Digite o segundo lado do triângulo: ");
                float b = Sc.nextFloat();
                System.out.println("Digite o terceiro lado do triângulo: ");
                float c = Sc.nextFloat();

                if (a == b && b == c) System.out.println("Triângulo equilatero");
                else if (a == b || a == c || b == c) System.out.println("Triângulo Isosceles");
                else System.out.println("Triângulo Escaleno");
            }
            case 21 -> {
                //Escreva o menu de opções abaixo. Leia a opção do usuário e execute a operação escoIhida.
                // Escreva uma mensagem de erro se a opção for inválida.
                //Escolha a opção:
                //1- Soma de 2 números.
                //2- Diferença entre 2 números (maior pelo menor).
                //3- Produto entre 2 números.
                //4- Divisão entre 2 números (o denominador não pode ser zero).
                //Opção
            }
            case 22 -> {
                //Leia a idade e o tempo de serviço de um trabalhador e escreva se ele pode ou não se aposentar.
                // As condições para aposentadoria são
                //Ter pelo menos 65 anos,
                //• Ou ter trabalhado pelo menos 30 anos,
                //⚫ Ou ter pelo menos 60 anos e trabalhado pelo menos 25 anos.
                System.out.println("Qual a sua idade? ");
                int i = Sc.nextInt();
                System.out.println("Quantos anos foram trabalhados? ");
                int it = Sc.nextInt();

                if (i >= 65 || it > 35) {
                    System.out.println("Pode se aposentar!");
                }
                else if (i >= 60 || it >= 25) {
                    System.out.println("Pode se aposentar!");
                }
                else System.out.println("Ainda não pode se aposentar.");
            }
            case 23 -> {
                //Determine se um determinado ano lido é bissexto. Sendo que um ano é bissexto se for divisível por 400 ou se for divisível por 4 e não for divisível por 100.
                // Por exemplo: 1988, 1992, 1996
                System.out.println("Digite o ano: ");
                int ano = Sc.nextInt();

                if (ano % 400 == 0) System.out.println("É bissexto!");
                else if (ano % 4 == 0) {
                    if (ano % 100 == 0) System.out.println("Não é bissexto");
                    else System.out.println("É bissexto!");
                }
                else System.out.println("Não é bissexto");
            }
            case 24 -> {
                //Uma empresa vende o mesmo produto para quatro diferentes estados.
                // Cada estado possui uma taxa diferente de imposto sobre o produto (MG 7%; SP 12%; RJ 15%; MS 8%).
                // Faça um programa em que o usuário entre com o valor e o estado destino do produto e o
                // programa retorne o preço final do produto acrescido do imposto do estado em que ele será vendido.
                // Se o estado digitado não for válido, mostrar uma mensagem de erro.
            }
            case 25 -> {
                //Calcule as raízes da equação de 2o grau.
                //Lembrando que:
                //x = -b±√d/2a
                //Onde
                //d = b*b - 4ac
                //E ax*x + bx + c = 0 representa uma equação de 2o grau.
                //A variável a tem que ser diferente de zero. Caso seja igual, imprima a mensagem "Não é equação de segundo grau".
                //Se A<0, não existe real. Imprima a mensagem Não existe raiz.
                //• Se A = 0, existe uma raiz real. Imprima a raiz e a mensagem Raiz única.
                //Se A≥ 0, imprima as duas raízes reais.
                System.out.println("Digite a variavel a: ");
                double a = Sc.nextDouble();
                System.out.println("Digite a variavel b: ");
                double b = Sc.nextDouble();
                System.out.println("Digite a variavel c: ");
                double c = Sc.nextDouble();
                if (a != 0) {
                    double delta = Math.pow(b, 2) - (4 * a * c);
                    if (delta < 0) System.out.println("Não existe raiz");
                    if (delta == 0) {
                        double x = -b / (2 * a);
                        System.out.println("A raiz vai ser: " + x);
                    } else {
                        double x1 = ((-b * Math.sqrt(delta)) / 2 * a);
                        double x2 = ((-b * -Math.sqrt(delta)) / 2 * a);

                        System.out.printf("A Raiz 1 é : %f \nA Raiz 2 é: %f", x1, x2);
                    }
                }
                else System.out.println("a = 0, portanto não é equação do segundo grau");
            }
            case 26 -> {
                //Leia a distância em Km e a quantidade de litros de gasolina consumidos por um carro em um percurso,
                // calcule o consumo em Km/l e escreva uma mensagem de acordo com a tabela abaixo:
                //CONSUMO       (km/l)      MENSAGEM
                //menor que     8           Venda o carro!
                //entre         8 e 12      Econômico!
                //maior que     12          Super econômico!
                System.out.println("Qual a distância percorrida? ");
                double d = Sc.nextDouble();
                System.out.println("Qual a quantidade de gasolina consumida? ");
                double g = Sc.nextDouble();

                double r = d / g;

                if (r < 8) System.out.println("Venda o carro!");
                else if (r >= 8 && r <= 12) System.out.println("Econômico!");
                else System.out.println("Super econômico!");
            }
            case 27 -> {
                //Escreva um programa que, dada a idade de um nadador, classifique-o em uma das seguintes categorias:
                //Categoria             Idade
                //Infantil A            5  a  7
                //Infantil B            8 a 10
                //Juvenil A             11 a 13
                //Juvenil B Sênior      14 a 17
                //maiores de 18 anos    18+
                System.out.println("Qual a sua idade? ");
                int i = Sc.nextInt();

                if (i >= 5 && i <= 7) {
                    System.out.println("Infantil A");
                } else if (i >= 8 && i <= 10) {
                    System.out.println("Infantil B");
                } else if (i >= 11 && i <= 13) {
                    System.out.println("Juvenil A");
                } else if (i >= 14 && i <= 17) {
                    System.out.println("Juvenil B");
                } else if (i >= 18) {
                    System.out.println("Maior que 18");
                }else System.out.println("Muito novo para as categorias.");
            }
            case 28 -> {
                //Faça um programa que leia três números inteiros positivos e efetue o cálculo de uma das seguintes médias de acordo com um valor numérico digitado pelo usuário:
                //(a) Geométrica: cbrt(x*y*z)
                //(b) Ponderada: x+2*y+3*z/6
                //(c) Harmônica: 1 / 1/x + 1/y + 1/z
                //(d) Aritmética:x+y+z / 3
                System.out.println("Todos os números tem que ser inteiros!");
                System.out.println("Digite o X: ");
                double x = Sc.nextInt();
                System.out.println("Digite o Y: ");
                double y = Sc.nextInt();
                System.out.println("Digite o Z: ");
                double z = Sc.nextInt();
                double r;

                System.out.println("Digite o número da opção desejada!");
                System.out.println("1. Geométrica");
                System.out.println("2. Ponderada");
                System.out.println("3. Harmônica");
                System.out.println("4. Aritmética");
                int escolha = Sc.nextInt();

                switch (escolha) {

                    case 1 -> {
                        r = Math.cbrt(x*y*z);
                        System.out.println("O resultado é: " + r);
                    }
                    case 2 -> {
                        r = (x + (2 * y) + (3 * z)) / 6;
                        System.out.println("O resultado é: " + r);
                    }
                    case 3 -> {
                        r = 1 / ((1/x) +(1/y) + (1/y));
                        System.out.println("O resultado é: " + r);
                    }
                    case 4 -> {
                        r = (x + y + z) / 3;
                        System.out.println("O resultado é: " + r);
                    }
                    default -> System.out.println("Essa escolha não existe!");
                }
            }
            case 29 -> {
                //Faça uma prova de matemática para crianças que estão aprendendo a somar números inteiros menores do que 100.
                // Escolha números aleatórios entre 1 e 100, e mostre na tela a pergunta:
                // qual é a soma de a + b, onde a e b são os números aleatórios. Peça a resposta.
                // Faça cinco perguntas ao aluno, e mostre para ele as perguntas e as respostas corretas, além de quantas vezes o aluno acertou.
                Random rand = new Random();
                
            }
            case 30 -> {
                //Faça um programa que receba três números e mostre-os em ordem crescente.

                System.out.println("Digite o primeiro número: ");
                int a = Sc.nextInt();
                System.out.println("Digite o segundo numero: ");
                int b = Sc.nextInt();
                System.out.println("Digite o terceiro numero: ");
                int c = Sc.nextInt();

                if (a > b && a > c && b > c) {
                    System.out.printf("%d, %d, %d",a, b, c);
                } else if (a > b && c > b) {
                    System.out.printf("%d, %d, %d",a, c, b);
                } else if ((b > a) && (b > c) && (a > c)) {
                    System.out.printf("%d, %d, %d",b, a, c);
                } else if (b > a && b > c && c > a) {
                    System.out.printf("%d, %d, %d",b, c, a);
                } else if (c > a && c > b && a > b) {
                    System.out.printf("%d, %d, %d",c, a, b);
                } else if (a < c && c > b && b > a) {
                    System.out.printf("%d, %d, %d",c, b, a);
                }
            }
            case 31 -> {
                //Faça um programa que receba a altura e o peso de uma pessoa.
                // De acordo com a tabela a seguir, verifique e mostra qual a classificação dessa pessoa.
                //Altura           peso
                //               até 60  entre 60-90    acima de 90
                //menos que 1,2   A         D              G
                //de 1,2 a 1,7    B         E              H
                //Maior q 1,7     C         F              I
                System.out.println("Qual a altura da pessoa? ");
                float h = Sc.nextFloat();
                System.out.println("Qual o peso da pessoa?");
                float p = Sc.nextFloat();

                if (h < 1.2){
                    if (p < 60) System.out.println("A");
                    else if (p >= 60 && p <= 90) System.out.println("D");
                    else System.out.println("G");
                }
                else if (h >= 1.2 && h <= 1.7) {
                    if (p < 60) System.out.println("B");
                    else if (p >= 60 && p <= 90) System.out.println("E");
                    else System.out.println("H");
                }
                else {
                    if (p < 60) System.out.println("C");
                    else if (p >= 60 && p <= 90) System.out.println("F");
                    else System.out.println("I");
                }
            }
            case 32 -> {
                //Escrever um programa que leia o código do produto escolhido do cardápio de uma lanchonete e a quantidade.
                // O programa deve calcular o valor a ser pago por aquele lanche.
                // Considere que a cada execução somente será calculado um pedido. O cardápio da lanchonete segue o padrão abaixo:
                //Especificação      código    preço
                //Cachorro Quente    100       1.2
                //Bauru Simples      101       1.3
                //Bauru com Ovo      102       1.5
                //Hamburguer         103       1.2
                //CheeseBurguer      104       1.7
                //Suco               105       2.2
                //Refrigerante       106       1.0
                System.out.println("Qual o código do produto?");
                int c = Sc.nextInt();
                int q;
                double p, r;

                switch (c) {

                    case 100 -> {
                        System.out.println("Cachorro Quente, Quantos foram pedidos? ");
                        q = Sc.nextInt();
                        p = 1.2;

                        r = p * q;
                        System.out.println("O preço é: " + r);
                    }
                    case 101 -> {
                        System.out.println("Bauru Simples, Quantos foram pedidos? ");
                        q = Sc.nextInt();
                        p = 1.3;

                        r = p * q;
                        System.out.println("O preço é: " + r);
                    }
                    case 102 -> {
                        System.out.println("Bauru com Ovo, Quantos foram pedidos? ");
                        q = Sc.nextInt();
                        p = 1.5;

                        r = p * q;
                        System.out.println("O preço é: " + r);
                    }
                    case 103 -> {
                        System.out.println("Hamburguer, Quantos foram pedidos? ");
                        q = Sc.nextInt();
                        p = 1.2;

                        r = p * q;
                        System.out.println("O preço é: " + r);
                    }
                    case 104 -> {
                        System.out.println("CheeseBurguer, Quantos foram pedidos? ");
                        q = Sc.nextInt();
                        p = 1.7;

                        r = p * q;
                        System.out.println("O preço é: " + r);
                    }
                    case 105 -> {
                        System.out.println("Suco, Quantos foram pedidos? ");
                        q = Sc.nextInt();
                        p = 2.2;

                        r = p * q;
                        System.out.println("O preço é: " + r);
                    }
                    case 106 -> {
                        System.out.println("Refrigerante, Quantos foram pedidos? ");
                        q = Sc.nextInt();
                        p = 1.0;

                        r = p * q;
                        System.out.println("O preço é: " + r);
                    }
                    default -> System.out.println("O produto não existe!");
                }
            }
            case 33 -> {
                // Um produto vai sofrer aumento de acordo com a tabela abaixo. Leia o preço antigo,
                // calcule e escreva o preço novo, e escreva uma mensagem em função do preço novo (de acordo com a segunda tabela).
                //Preço antigo        Percentual de Aumento            Preço Novo               Mensagem
                //Até 50R$              5%                              Até 80R$                Barato
                //Entre 50R$ e 100R$    10%                             entre 80R$ e 120R$      Normal
                //Acima de 100R$        15%                             entre 120R$ e 200R$     Caro
                //                                                      Acima de 200R$          Muito Caro
            }
            case 34 -> {
                //Leia a nota e o número de faltas de um aluno, e escreva seu conceito.
                // De acordo com a tabela abaixo, quando o aluno tem mais de 20 faltas ocorre uma redução de conceito.
                //  Nota            Conceito (Até 20 Faltas)    Conceito (Mais de 20 Faltas)
                //  9.0 até 10.0            A                           B
                //  7.5 até 8.9             B                           C
                //  5.0 até 7.4             C                           D
                //  4.0 até 4.9             D                           E
                //  0.0 até 3.9             E                           E
            }
            case 35 -> {
                //Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está entre 1 e 12,
                //e se o dia existe naquele mês. Note que Fevereiro tem 29 dias em anos bissextos, e 28 dias em anos não bissextos.
            }
            case 36 -> {
                //Escreva um programa que, dado o valor da venda, imprima a comissão que deverá ser paga ao vendedor.
                // Para calcular a comissão, considere a tabela abaixo:
                //  Venda Mensal                                                Comissão
                //  Maior ou igual a R$100.000,00                               R$700,00 + 16% das vendas
                //  Menor que R$100.000,00 e maior ou igual a R$80.000,00       R$650,00 + 14% das vendas
                //  Menor que R$80.000,00 e maior ou igual a R$60.000,00        R$600,00 + 14% das vendas
                //  Menor que R$60.000,00 e maior ou igual a R$40.000,00        R$550,00 + 14% das vendas
                //  Menor que R$40.000,00 e maior ou igual a R$20.000,00        R$500,00 + 14% das vendas
                //  Menor que R$20.000,00                                       R$400,00 + 14% das vendas
            }
            case 37 -> {
                //As tarifas de certo parque de estacionamento são as seguintes:
                //1° e 2° hora - R$ 1,00 cada
                //3o e 4o hora - R$ 1,40 cada
                //5 hora e seguintes - R$ 2,00 cada
                //O número de horas a pagar é sempre inteiro e arredondado por excesso.
                // Deste modo, quem estacionar durante 61 minutos pagará por duas horas, que é o mesmo que pagaria se tivesse permanecido 120 minutos.
                // Os momentos de chegada ao parque e partida deste são apresentados na forma de pares de inteiros, representando horas e minutos.
                // Por exemplo, o par 12 50 representará "dez para a uma da tarde". Pretende-se criar um programa que, lidos pelo teclado os momentos de chegada e de partida,
                // escreva na tela o preço cobrado pelo estacionamento. Admite-se que a chegada e a partida se dão com intervalo não superior a 24 horas.
                // Portanto, se uma dada hora de chegada for superior à da partida, isso não é uma situação de erro, antes significará que a partida ocorreu no dia seguinte ao da chegada.
            }
            case 38 -> {
                //Leia uma data de nascimento de uma pessoa fornecida através de três números inteiros: Dia, Mês e Ano.
                // Teste a validade desta data para saber se esta é uma data válida.
                // Teste se o dia fornecido é um dia válido: dia > 0, dia 28 para o mês de fevereiro (29 se o ano for bissexto),
                // dia ≤ 30 em abril, junho, setembro e novembro, dia 31 nos outros meses. Teste a validade do mês: mês > 0 e mês < 13.
                // Teste a validade do ano: ano < ano atual (use uma constante definida com o valor igual a 2008). Imprimir: "data válida" ou "data inválida" no final da execução do programa.
            }
            case 39 -> {
                //Uma empresa decide dar um aumento aos seus funcionários de acordo com uma tabela que considera o salário atual e o tempo de serviço de cada funcionário.
                // Os funcionários com menor salário terão um aumento proporcionalmente maior do que os funcionários com um salário maior,
                // e conforme o tempo de serviço na empresa, cada funcionário irá receber um bônus adicional de salário. Faça um programa que leia:
                //o valor do salário atual do funcionário;
                //o tempo de serviço desse funcionário na empresa (número de anos de trabalho na empresa).
                //Use as tabelas abaixo para calcular o salário reajustado deste funcionário e imprima o valor do salário final reajustado,
                // ou uma mensagem caso o funcionário não tenha direito a nenhum aumento.
                //  Salário Atual       Reajuste(%)     Tempo de Serviço        Bônus
                //  Até 500,00              25%         Abaixo de 1 ano         Sem Bônus
                //  Até 1000,00             20%         De 1 a 3 anos           100,00
                //  Até 1500,00             15%         De 4 a 6 anos           200,00
                //  Até 2000,00             10%         De 7 a 10 anos          300,00
                //  Acima de 2000,00     Sem reajuste   Mais de 10 anos         500,00
            }
            case 40 -> {
                //O custo ao consumidor de um carro novo é a soma do custo de fábrica, da comissão do distribuidor, e dos impostos.
                // A comissão e os impostos são calculados sobre o custo de fábrica, de acordo com a tabela abaixo. Leia o custo de fábrica e escreva o custo ao consumidor.
                //  Custo de Fábrica            % do Distribuidor       % dos Impostos
                // Até R$12.000,00                      5                   isento
                // entre R$12.000,00 e R$25.000,00      10                    15
                // acima de R$25.000,00                 15                    20
            }
            case 41 -> {
                //Faça um algoritmo que calcule o IMC de uma pessoa e mostre sua classificação de acordo com a tabela abaixo:
                //      IMC             Classificação
                //  < 18,5              Abaixo do Peso
                //  18,6 - 24,9         Saudavel
                //  25,0 - 29,9         Peso em Excesso
                //  30,0 - 24,9         Obesidade Grau I
                //  35,0 - 39,9         Obesidade Grau II (Severa)
                //  >= 40               Obesidade Grau III (Mórbida)
            }
            default -> System.out.println("O exercicio ou não está feito ainda, ou não existe :p");
        }
    }
}
