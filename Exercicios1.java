// EXERCICIOS CURSO JAVA, START DATE -> 07/03/2023
import java.util.Scanner;
public class Exercicios1 {
    public static void main(String[] args) {
        int ex;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Qual o Número do ex que você deseja? (1 até 53)");
        ex = Sc.nextInt();

        switch (ex) {
            case 1 -> {
                // Faça um programa que leia um número real e o imprima
                System.out.println("Diga um número inteiro: ");

                int x1 = Sc.nextInt();

                System.out.printf("O número inteiro é: %d", x1);
            }
            case 2 -> {
                // Faça um programa que leia um número real e o imprima.
                System.out.println("Diga um número real: ");

                Float x2 = Sc.nextFloat();

                System.out.printf("O número real é: %f", x2);
            }
            case 3 -> {
                // Peça ao usuário para digitar três valores inteiros e imprima a soma deles.
                System.out.println("Digite o primeiro número: ");
                int x3 = Sc.nextInt();

                System.out.println("Digite o segundo número: ");
                int y3 = Sc.nextInt();

                System.out.println("Digite o terceiro número: ");
                int z3 = Sc.nextInt();

                int r3 = x3 + y3 + z3;

                System.out.printf("A soma entre os 3 valores é: %d", r3);
            }
            case 4 -> {
                // Leia um número real e imprima o resultado do quadrado desse número.
                System.out.println("Digite o número real: ");

                float x4 = Sc.nextFloat();
                float r4 = x4 * x4;

                System.out.printf("O quadrado do número real é: %f", r4);
            }
            case 5 -> {
                // Leia um número real e imprima a quinta parte deste número.
                System.out.println("Digite o número real: ");
                float x5 = Sc.nextFloat();

                float r5 = x5 / 5;

                System.out.printf("A quinta parte do número %f é %f", x5, r5);
            }
            // Começa dia 08/03/2023
            case 6 -> {
                // Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
                // A fórmula de conversão é: FC (9.0/5.0) +32.0, sendo F a temperatura em Fahrenheit e Ca temperatura em Celsius.
                System.out.println("Digite a temperatura em graus Celsius: ");
                double c6 = Sc.nextDouble();

                double f6 = c6 * (9.0 / 5.0) + 32;

                System.out.printf("A temperatura em graus fahrenheit é: %f", f6);
            }
            case 7 -> {
                //Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
                // A fórmula de conversão é: C = 5.0 (F-32.0)/9.0, sendo C a temperatura em Celsius e F a temperatura em Fahrenheit.
                System.out.println("Digite a temperatura em graus Fahrenheit: ");
                float f7 = Sc.nextFloat();

                double c7 = 5.0 * (f7 - 32) / 9;

                System.out.printf("A temperatura em graus celsius é: %f", c7);
            }
            case 8 -> {
                //Leia uma temperatura em graus Kelvin e apresente-a convertida em graus Celsius.
                // A fórmula de conversão é: CK-273.15, sendo C a temperatura em Celsius e Ka temperatura em Kelvin.
                System.out.println("Digite a temperatura em Kelvin: ");
                float k8 = Sc.nextFloat();

                double c8 = k8 - 273.15;

                System.out.printf("A temperatura em graus celsius é: %f", c8);
            }
            case 9 -> {
                //Leia uma temperatura em graus Celsius e apresente-a convertida em graus Kelvin.
                // A fórmula de conversão é: K = C + 273.15, sendo C a temperatura em Celsius e Ka temperatura em Kelvin.
                System.out.println("Digite a temperatura em Celsius: ");
                float c9 = Sc.nextFloat();

                double k9 = c9 + 273.15;

                System.out.printf("A temperatura em Kelvin é: %f", k9);
            }
            case 10 -> {
                //Leia uma velocidade em km/h (quilômetros por hora) e apresente-a convertida em m/s (metros por segundo).
                // A fórmula de conversão é: M = K/3.6, sendo K a velocidade em km/h e M em m/s.
                System.out.println("Digite a velocidade em km/h: ");
                float k10 = Sc.nextFloat();

                double m10 = k10/3.6;

                System.out.printf("A velocidade em metros por segundo é: %f", m10);
            }
            case 11 -> {
                //Leia uma velocidade em m/s (metros por segundo) e apresente-a convertida em km/h (quilômetros por hora).
                // A fórmula de conversão é: K = M 3.6, sendo K a velocidade em km/h e M em m/s.
                System.out.println("Digite a velocidade em m/s: ");
                float m11 = Sc.nextFloat();

                double k11 = m11*3.6;

                System.out.printf("A velocidade em k/m é: %f", k11);
            }
            case 12 -> {
                //Leia uma distância em milhas e apresente-a convertida em quilômetros.
                // A fórmula de conversão é: K = 1,61 M, sendo K a distância em quilômetros e M em milhas.
                System.out.println("Digite as milhas: ");
                float m12 = Sc.nextFloat();

                double k12 = 1.61*m12;

                System.out.printf("A distância em kilometros é: %f", k12);
            }
            case 13 -> {
                //Leia uma distância em quilômetros e apresente-a convertida em milhas.
                // A fórmula de conversão é: M = K / 1,61, sendo K a distância em quilômetros e M em milhas.
                System.out.println("Digite as milhas: ");
                float k13 = Sc.nextFloat();

                double m13 = k13 / 1.61;

                System.out.printf("A distância em milhas é: %f", m13);
            }
            case 14 -> {
                //Leia um ângulo em graus e apresente-o convertido em radianos.
                // A fórmula de conversão é: R=G * π/180, sendo Go ângulo em graus e R em radianos e π = 3.14.
                System.out.println("Digite o angulo em graus: ");
                float g14 = Sc.nextFloat();

                double r14 = g14 * 3.14/180;

                System.out.printf("O angulo em radianos é: %f", r14);
            }
            case 15 -> {
                //Leia um ângulo em radianos e apresente-o convertido em graus.
                // A fórmula de conversão é: G = R * 180/π, sendo Go ângulo em graus e R em radianos e π = 3.14.
                System.out.println("Digite o angulo em radianos: ");
                float r15 = Sc.nextFloat();

                double g15 = r15 * 180/3.14;

                System.out.printf("O angulo em graus é: %f", g15);
            }
            case 16 -> {
                //Leia um valor de comprimento em polegadas e apresente-o convertido em centímetros.
                // A fórmula de conversão é: C = P2, 54, sendo C o comprimento em centímetros e Po comprimento em polegadas.
                System.out.println("Digite o comprimento em polegadas: ");
                float p16 = Sc.nextInt();

                double c16 = p16 * 2.54;

                System.out.printf("O comprimento em centimetros é: %f", c16);
            }
            case 17 -> {
                //Leia um valor de comprimento em centímetros e apresente-o convertido em polegadas.
                // A fórmula de conversão é: P = 4, sendo C o comprimento em centímetros e Po comprimento em polegadas.
                System.out.println("Digite o comprimento em centimetros: ");
                float c17 = Sc.nextFloat();

                double p17 = c17/2.54;

                System.out.printf("O comprimento em centimetros é: %f", p17);
            }
            case 18 -> {
                //Leia um valor de volume em metros cúbicos m3 e apresente-o convertido em litros.
                // A fórmula de conversão é: L= 1000 M, sendo L o volume em litros e M o volume em metros cúbicos.
                System.out.println("Digite o valor em metros cubicos: ");
                float m18 = Sc.nextFloat();

                double l18 = 1000 * m18;

                System.out.printf("O valor em litros é: %f", l18);
            }
            case 19 -> {
                //Leia um valor de volume em litros e apresente-o convertido em metros cúbicos m3.
                // A fórmula de conversão é: M = 1000, sendo L o volume em litros e M o volume em metros cúbicos.
                System.out.println("Digite o valor em metros cubicos: ");
                float l19 = Sc.nextFloat();

                double m19 = l19 / 1000;

                System.out.printf("O valor em litros é: %f", m19);
            }
            case 20 -> {
                //Leia um valor de massa em quilogramas e apresente-o convertido em libras.
                // A fórmula de conversão é: L= K / 0,45, sendo K a massa em quilogramas e L a massa em libras.

                System.out.println("Digite o valor em quilogramas: ");
                float q20 = Sc.nextFloat();

                double l20 = q20 /0.45;

                System.out.printf("O valor em libras é: %f", l20);
            }
            case 21 -> {
                //Leia um valor de massa em libras e apresente-o convertido em quilogramas.
                // A fórmula de conversão é: K = L 0, 45, sendo K a massa em quilogramas e L a massa em libras.
                System.out.println("Digite o valor em libras: ");
                float l21 = Sc.nextFloat();

                double q21 = l21 * 0.45;

                System.out.printf("O valor em quilogramas é: %f", q21);
            }
            case 22 -> {
                //Leia um valor de comprimento em jardas e apresente-o convertido em metros.
                // A fórmula de conversão é: M = 0,91 J, sendo J o comprimento em jardas e M o comprimento em metros.
                System.out.println("Digite o valor em jardas: ");
                float j22 = Sc.nextFloat();

                double m22 = 0.91 * j22;

                System.out.printf("O valor em metros é: %f", m22);
            }
            case 23 -> {
                // Leia um valor de comprimento em metros e apresente-o convertido em jardas.
                // A fórmula de conversão é: J = M / 0.91 sendo J o comprimento em jardas e M o comprimento e metros.
                System.out.println("Digite o valor em metros: ");
                float m23 = Sc.nextFloat();

                double j23 = m23 / 0.91;

                System.out.printf("O valor em jardas é: %f", j23);
            }
            case 24 -> {
                //Leia um valor de área em metros quadrados m2 e apresente-o convertido em acres.
                // A fórmula de conversão é: A = M 0,000247, sendo M a área em metros quadrados e A a área em acres.
                System.out.println("Digite a área em metros: ");
                float m24 = Sc.nextFloat();

                double a24 = m24 * 0.000247;

                System.out.printf("A área em acres é: %f", a24);
            }
            case 25 -> {
                //Leia um valor de área em acres e apresente-o convertido em metros quadrados m2.
                // A fórmula de conversão é: M = A* 4048, 58, sendo M a área em metros quadrados e A a área em acres.
                System.out.println("Digite a área em acres: ");
                float a25 = Sc.nextFloat();

                double m25 = a25 * 4048.58;

                System.out.printf("A área em metros quadrados é: %f", m25);
            }
            case 26 -> {
                // Leia um valor de área em metros quadrados m2 e apresente-o convertido em hectares.
                // A fórmula de conversão é: H = M 0,0001, sendo M a área em metros quadrados e H a área em hectares.
                System.out.println("Digite a área em metros: ");
                float m26 = Sc.nextFloat();

                double h26 = m26 * 0.0001;

                System.out.printf("A área em hectares é: %f", h26);
            }
            case 27 -> {
                // Leia um valor de área em hectares e apresente-o convertido em metros quadrados m2.
                // A fórmula de conversão é: M = H 10000, sendo M a área em metros quadrados e H a área em hectares.
                System.out.println("Digite a área em hectares: ");
                float h27 = Sc.nextFloat();

                double m27 = h27 * 10000;

                System.out.printf("A área em metros quadrados é: %f", m27);
            }
            case 28 -> {
                //Faça a leitura de três valores e apresente como resultado a soma dos quadrados dos três valores lidos.
                System.out.println("Digite o primeiro valor: ");
                int x = Sc.nextInt();
                x = x * x;
                System.out.println("Digite o segundo valor: ");
                int y = Sc.nextInt();
                y = y * y;
                System.out.println("Digite o terceiro valor: ");
                int z = Sc.nextInt();
                z = z * z;

                int r = x + y + z;

                System.out.printf("O resultado da soma dos quadrados dos valores é: %d", r);
            }
            case 29 -> {
                //Leia quatro notas, calcule a média aritmética e imprima o resultado.
                System.out.println("Digite a primeira nota: ");
                float x = Sc.nextFloat();
                System.out.println("Digite a segunda nota: ");
                float y = Sc.nextFloat();
                System.out.println("Digite a terceira nota: ");
                float z = Sc.nextFloat();
                System.out.println("Digite a quarta nota: ");
                float a = Sc.nextFloat();

                float m = (x + y + z + a) / 4;

                System.out.printf("A média aritmetica das 4 notas é: %f", m);
            }
            case 30 -> {
                //Leia um valor em real e a cotação do dólar. Em seguida, imprima o valor correspondente em dólares.
                // Cotação do Dólar no momento do exercicio: 5,12 (08/03/2023)
                System.out.println("Digite o valor em reais: ");
                float x = Sc.nextFloat();

                double d = x * 5.12;

                System.out.printf("O valor em Dólar é: %.2f", d);
            }
            case 31 -> {
                //Leia um número inteiro e imprima o seu antecessor e o seu sucessor.
                System.out.println("Digite um número inteiro: ");
                int x = Sc.nextInt();

                int y = x - 1;
                int z = x + 1;
                System.out.printf("O antecessor do numero %d, é: %d, e o sucessor é: %d", x, y, z);
            }
            // Começa dia 09/03/2023
            case 32 -> {
                //Leia um número inteiro e imprima a soma do sucessor de seu triplo com o antecessor de seu dobro.
                System.out.println("Digite um número inteiro: ");
                int x = Sc.nextInt();

                int y = (2 * x) - 1;
                int z = (3 * x) + 1;

                int r = y + z;

                System.out.printf("O resultado da soma é: %d", r);
            }
            case 33 -> {
                // Leia o tamanho do lado do quadrado e diga sua área
                System.out.println("Diga o tamanho do lado do quadrado: ");
                float l = Sc.nextFloat();

                double a = Math.pow(l, 2);

                System.out.printf("A área do quadrado é: %f", a);
            }
            case 34 -> {
                // Leia o raio do circulo e calcule e imprima a área do circulo correspondente.
                // a área do circulo é = π * raio2, considere π = 3.141592
                System.out.println("Digite o raio do circulo: ");
                double r = Sc.nextFloat();
                double p = 3.141592;

                double a = p * Math.pow(r, 2);

                System.out.printf("A area do circulo é: %.2f", a);
            }
            case 35 -> {
                // Sejam a e b os catetos de um triangulo, onde a hipotenusa é criada pela equação sqrt(a2 + b2)
                // faça um programa que receba o a e o b e calcule a hipotenusa.
                System.out.println("Insira o cateto a: ");
                float a = Sc.nextFloat();
                System.out.println("Insira o cateto b: ");
                float b = Sc.nextFloat();

                double h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

                System.out.printf("A hipotenusa é: %.2f", h);
            }
            case 36 -> {
                // Leia a altura e o raio de um cilindro circular e imprima o volume do cilindro.
                // O volume é calculado por: V = p * r2 * h onde pi = 3.141592
                System.out.println("Insira a altura: ");
                float h = Sc.nextFloat();
                System.out.println("Insira o raio: ");
                float r = Sc.nextFloat();
                double p = 3.141592;

                double v = p * Math.pow(r, 2) * h;

                System.out.printf("O volume do cilindro é: %f", v);
            }
            case 37 -> {
                //Faça um programa que leia o valor de um produto e imprima o valor com 12% de desconto
                System.out.println("Insira o valor do produto: ");
                float p = Sc.nextFloat();

                double f = p * 0.88;

                System.out.printf("O produto ficará custando: %.2fR$", f);
            }
            case 38 -> {
                //Leia o salário do funcionario, calcule um novo salário com 25 a mais.
                System.out.println("Insira o salário: ");
                float s = Sc.nextFloat();

                double r = (s * 0.25) + s;

                System.out.printf("O novo salário é: %.2fR$", r);
            }
            case 39 -> {
                // Uma recompensa foi dada para 3 pessoas, o primeiro ganha 46%, o segundo 32% e o ultimo o restante.
                // O usuario insere a recompensa e imprima o resultado para cada membro
                System.out.println("Qual a recompensa? ");
                double r = Sc.nextDouble();

                double p = r * 0.46;
                double s = r * 0.32;
                double t = r * 0.22;

                System.out.printf("O primeiro recebe: %.2fR$ \nO segundo recebe: %.2fR$ \nO terceiro recebe %.2fR$", p, s, t);
            }
            case 40 -> {
                //Uma empresa contrata um encanador 30R$ por dia, Faça um programa que solicite os dias trabalhados e imprima
                // a quantia liquida e sabendo que vão ser descontados 8% para imposto de renda;
                System.out.println("Quantos dias trabalhados? ");
                int d = Sc.nextInt();

                double s = (d * 30) * 0.92;

                System.out.printf("O total vai ser: %.2fR$", s);
            }
            case 41 -> {
                //Faça um programa que leia o valor da hora de trabalho e numero de horas trabalhadas. Imprima o valor
                // a ser pago ao funcionario adicionando 10%
                System.out.println("Quantas horas foram trabalhadas? ");
                float h = Sc.nextFloat();
                System.out.println("Qual o valor da hora? ");
                float v = Sc.nextFloat();

                double s = (h * v) * 1.1;

                System.out.printf("O valor do salário é: %.2fR$", s);
            }
            case 42 -> {
                //Receba o salário base de um funcionario, calcule e imprima o salario que ele tem que receber.
                // Sabendo que ele recebe 5% de gratificação sobre a base e tem que pagar 7% de impostos sobre o salario base
                System.out.println("Qual o salario base? ");
                double s = Sc.nextDouble();

                double f = s - s * 0.02;

                System.out.printf("Ele ganhará: %.2fR$", f);
            }
            case 43 -> {
                //Escreva um programa pra ajudar os vendedores, a partir de um valor total: o total a pagar com 10% off
                // Valor em 3x - Comissão do vendedor: A vista 5% do valor com desconto - Parcelado 5% do total
                System.out.println("Qual o valor do produto? ");
                double s = Sc.nextDouble();

                double o = s * 0.9;
                System.out.printf("O valor com 10 off de desconto: %.2fR$\n", o);

                double t = s / 3;
                System.out.printf("O produto seria em 3 parcelas de %.2fR$\n", t);

                double v = o * 0.05;
                double p = s * 0.05;
                System.out.printf("A comissão do vendedor seria: \n%.2fR$ se fosse a vista \nE se for parcelado será %.2fR$", v, p);
            }
            case 44 -> {
                //Escreva um programa que receba a altura que necessita ser atingida
                // e a altura do degrau da escada e calcule quantos degraus são necessarios pra chegar a x altura
                System.out.println("Digite a altura que quer ser alcançada: ");
                float a = Sc.nextFloat();
                System.out.println("Digite a altura do degrau da escada: ");
                float b = Sc.nextFloat();

                double r = a / b;

                System.out.printf("Será necessario: " + Math.ceil(r));
            }
            case 45 -> {
                // Faça um programa pra converter uma letra maiuscula em minuscula. Use a tabela ASCII pra resolver o problema
                System.out.println("Insira o caracter em maiusculo: ");
                char c = Sc.next().charAt(0);

                int a = c;
                a = a + 32;
                c = (char)a;

                System.out.printf("O caracter em minusculo é: %c", c);
            }
            case 46 -> {
                //Faça um programa que imprima um numero de 3 digitos ao contrario
                System.out.println("Insira um numero de 100 a 999 (Um digito por vez)");
                char x = Sc.next().charAt(0);
                char y = Sc.next().charAt(0);
                char z = Sc.next().charAt(0);

                System.out.printf("%c%c%c", z, y, x);
            }
            case 47 -> {
                //Faça um programa que imprima um numero de 4 digitos ao contrario
                System.out.println("Insira um numero de 1000 a 9999 (Um digito por vez)");
                char x = Sc.next().charAt(0);
                char y = Sc.next().charAt(0);
                char z = Sc.next().charAt(0);
                char a = Sc.next().charAt(0);

                System.out.printf("%c%c%c%c", a, z, y, x);
            }
            case 48 -> {
                //Leia um valor inteiro em segundos e o imprima em horas, minutos e segundos
                System.out.println("Qual o valor em segundos?");
                int s = Sc.nextInt();
                int m = s * 60;
                int h = m * 24;

                System.out.printf("O tempo em Segundos é: %de\nEm minutos: %d\nEm horas: %d",s, m, h);
            }
            case 49 -> {
                System.out.println();
                // Faça um programa que leia horario de inicio e a duração em segundos de uma experencia biologica.
                // O programa deve resultar com o novo horario.
                System.out.println("Digite o horario de inicio, horas: ");
                int h = Sc.nextInt();
                System.out.println("Digite os minutos: ");
                int m = Sc.nextInt();
                System.out.println("Digite os segundos: ");
                int s = Sc.nextInt();
                System.out.println("Qual foi a duração em segundos do experimento?");
                int d = Sc.nextInt();

                s = (m * 60) + (h * 24 * 60) + s;

                System.out.printf("O tempo total em segundos é: %d", s);
            }
            case 50 -> {
                // Calcule o ano de nascimento da pessoa de acordo com a idade dele
                System.out.println("Qual o seu ano de nascimento?");
                int x = Sc.nextInt();
                System.out.println("Qual a sua idade? ");
                int y = Sc.nextInt();

                int i = y - x;

                System.out.printf("o seu ano de nascimento é: %d", i);
            }
            case 51 -> {
                //Escreva um programa que leia as coordenadas x e y de pontos e calcule sua distancia da origem
                System.out.println("Escreva o ponto x: ");
                int x = Sc.nextInt();
                System.out.println("Escreve a o ponto y: ");
                int y = Sc.nextInt();

                System.out.printf("O novo ponto é (%d,%d)", x, y);
            }
            case 52 -> {
                //3 amigos jogam na loteria, caso eles ganhem o premio é repartido proporcionalmente para o tanto que cada um
                //investiu na aposta. Imprima quanto cada um ganharia do premio.
                System.out.println("Quanto o primeiro investiu? ");
                double x = Sc.nextFloat();
                System.out.println("Quanto o segundo investiu? ");
                double y = Sc.nextFloat();
                System.out.println("Quanto o terceiro investiu? ");
                double z = Sc.nextFloat();
                System.out.println("Quanto valia o premio? ");
                double d = Sc.nextFloat();

                double x1 = x /(x+y+z);
                double y1 = y /(x+y+z);
                double z1 = z /(x+y+z);

                double x2 = d * x1;
                double y2 = d * y1;
                double z2 = d * z1;

                System.out.printf("O primeiro: %fR$\nO Segundo: %fR$\nO Terceiro: %fR$", x2, y2, z2);

            }
            case 53 -> {
                //Faça um programa para ler as dimensões de um terreno e o preço da tela. Imprima o custo
                System.out.println("Insira a largura: ");
                float l = Sc.nextFloat();
                System.out.println("Insira o comprimento: ");
                float c = Sc.nextFloat();
                System.out.println("Insira o preço da tela: ");
                float t = Sc.nextFloat();

                double a = l * c;
                double p = a * t;

                System.out.printf("O preço da area é: %f", p);
            }
            default -> System.out.println("O exercicio ou não está feito ainda, ou não existe :p");
        }
    }
}
