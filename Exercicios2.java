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
                    case 1 -> {
                        System.out.println("Domingo");
                    }
                    case 2 -> {
                        System.out.println("Segunda");
                    }
                    case 3 -> {
                        System.out.println("Terça");
                    }
                    case 4 -> {
                        System.out.println("Quarta");
                    }
                    case 5 -> {
                        System.out.println("Quinta");
                    }
                    case 6 -> {
                        System.out.println("Sexta");
                    }
                    case 7 -> {
                        System.out.println("Sábado");
                    }
                }
            }
            case 16 -> {
                //Usando switch, escreva um programa que leia um inteiro entre 1 e 12 e imprima o mês correspondente a este numero.
                // Isto é, janeiro se 1, fevereiro se 2, e assim por diante.
                System.out.println("Digite um número de 1 a 12:" );
                int m = Sc.nextInt();

                switch (m) {
                    case 1 -> {
                        System.out.println("Janeiro");
                    }
                    case 2 -> {
                        System.out.println("Fevereiro");
                    }
                    case 3 -> {
                        System.out.println("Março");
                    }
                    case 4 -> {
                        System.out.println("Abril");
                    }
                    case 5 -> {
                        System.out.println("Maio");
                    }
                    case 6 -> {
                        System.out.println("Junho");
                    }
                    case 7 -> {
                        System.out.println("Julho");
                    }
                    case 8 -> {
                        System.out.println("Agosto");
                    }
                    case 9 -> {
                        System.out.println("Setembro");
                    }
                    case 10 -> {
                        System.out.println("Outubro");
                    }
                    case 11 -> {
                        System.out.println("Novembro");
                    }
                    case 12 -> {
                        System.out.println("Dezembro");
                    }
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
            }
            case 20 -> {
                //Dados três valores, A, B, C, verificar se eles podem ser valores dos lados de um triângulo e, se forem,
                // se é um triângulo escaleno, equilátero ou isoscele, considerando os seguintes conceitos:
                //O comprimento de cada lado de um triângulo é menor do que a soma dos outros dois lados.
                //Chama-se equilátero o triângulo que tem três lados iguais.
                //Denominam-se isosceles o triângulo que tem o comprimento de dois lados iguais.
                //Recebe o nome de escaleno o triângulo que tem os três lados diferentes.
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
                //Determine se um determinado ano lido é bissexto. Sendo que um ano é bissexto
                // se for divisível por 400 ou se for divisível por 4 e não for divisível por 100. Por exemplo: 1988, 1992, 1996
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
                //-b±√A
                //2a
                //Onde
                //A = B2-4ac
                //E ax2 + bx + c = 0 representa uma equação de 2o grau.
                //A variável a tem que ser diferente de zero. Caso seja igual, imprima a mensagem "Não é equação de segundo grau".
                //Se A<0, não existe real. Imprima a mensagem Não existe raiz.
                //• Se A = 0, existe uma raiz real. Imprima a raiz e a mensagem Raiz única.
                //Se A≥ 0, imprima as duas raízes reais.
            }
            case 26 -> {
                //Leia a distância em Km e a quantidade de litros de gasolina consumidos por um carro em um percurso,
                // calcule o consumo em Km/l e escreva uma mensagem de acordo com a tabela abaixo:
                //CONSUMO (km/l)
                //menor que
                //8
                //entre
                //8 e 14
                //maior que
                //12
                //MENSAGEM Venda o carro! Econômico!
                //Super econômico!
            }
            case 27 -> {
                //Escreva um programa que, dada a idade de um nadador, classifique-o em uma das seguintes categorias:
                //Categoria Idade
                //Infantil A
                //5  a  7
                //Infantil B
                //8 a 10
                //Juvenil A
                //11 a 13
                //Juvenil B Sênior
                //14 a 17
                //maiores de 18 anos
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
                //(a) Geométrica: *y*z
                //(b) Ponderada: +2*+3*2
                //6
                //(c) Harmônica: ++
                //(d) Aritmética:+y+z
            }
            case 29 -> {
                //Faça uma prova de matemática para crianças que estão aprendendo a somar números inteiros menores do que 100.
                // Escolha números aleatórios entre 1 e 100, e mostre na tela a pergunta:
                // qual é a soma de a + b, onde a e b são os números aleatórios. Peça a resposta.
                // Faça cinco perguntas ao aluno, e mostre para ele as perguntas e as respostas corretas, além de quantas vezes o aluno acertou.
            }
            case 30 -> {
                //Faça um programa que receba três números e mostre-os em ordem crescente.
                /*System.out.println("Digite o primeiro número: ");
                int a = Sc.nextInt();
                System.out.println("Digite o segundo numero: ");
                int b = Sc.nextInt();
                System.out.println("Digite o terceiro numero: ");
                int c = Sc.nextInt();

                if (a > b && a > c && b > c) {
                    System.out.printf("%f, %f, %f",a, b, c);
                } else if (a > b && c > b) {
                    System.out.printf("%f, %f, %f",a, c, b);
                } else if ((b > a) && (b > c) && (a > c)) {
                    System.out.printf("%f, %f, %f",b, a, c);
                } else if (b > a && b > c && c > a) {
                    System.out.printf("%f, %f, %f",b, c, a);
                } else if (c > a && c > b && a > b) {
                    System.out.printf("%f, %f, %f",c, a, b);
                } else if (c > a && c > b && b > a) {
                    System.out.printf("%f, %f, %f",c, b, a);
                }*/
            }
            case 31 -> {
                //Faça um programa que receba a altura e o peso de uma pessoa.
                // De acordo com a tabela a seguir, verifique e mostra qual a classificação dessa pessoa.
                //Altura           peso
                //               até 60  entre 60-90    acima de 90
                //menos que 1,2   A         D              G
                //de 1,2 a 1,7    B         E              H
                //Maior q 1,7     C         F              I
            }
            case 32 -> {
                //Escrever um programa que leia o código do produto escolhido do cardápio de uma lanchonete e a quantidade.
                // O programa deve calcular o valor a ser pago por aquele lanche.
                // Considere que a cada execução somente será calculado um pedido. O cardápio da lan- chonete segue o padrão abaixo:
                //Especificação      código    preço
                //Cachorro Quente    100       1.2
                //Bauru Simples      101       1.3
                //Bauru com Ovo      102       1.5
                //Hamburguer         103       1.2
                //CheeseBurguer      104       1.7
                //Suco               105       2.2
                //Refrigerante       106       1.0
            }
            case 33 -> {

            }

            default -> System.out.println("O exercicio ou não está feito ainda, ou não existe :p");
        }
    }
}
