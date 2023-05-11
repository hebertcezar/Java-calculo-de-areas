package pack;

import java.util.Scanner;

public class DoFigurasGeometricas {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num;

        do {
            System.out.println("Digite 1 para calcular a aréa de um Circulo");
            System.out.println("Digite 2 para calcular a aréa de um Retângulo");
            System.out.println("Digite 3 para calcular a aréa de um Quadrado");
            System.out.println("Digite 4 para calcular a aréa de um Trapézio");
            System.out.println("Digite 5 para calcular a aréa de um Losango");
            System.out.println("Digite 6 para calcular a aréa de um Triângulo");
            System.out.println("Digite 0 encerrar o programa");

            num=leia.nextInt();

            if (num==1){
                Circulo circulo = new Circulo();
                System.out.printf("Digite o raio\n");
                circulo.setPi(3.14);
                circulo.setRaio(leia.nextDouble());
                circulo.area();
            }
            if (num==2){
                Retangulo retangulo = new Retangulo();
                System.out.printf("Digite a base\n");
                retangulo.setBase(leia.nextDouble());
                System.out.println("Digite a altura");
                retangulo.setAltura(leia.nextDouble());
                retangulo.area();

            }
            if (num==3){
                Quadrado quadrado = new Quadrado();
                System.out.printf("Digite o lado\n");
                quadrado.setLado(leia.nextDouble());
                quadrado.area();
            }
            if (num==4){
                Trapezio trapezio = new Trapezio();
                System.out.printf("Digite a base maior\n");
                trapezio.setBaseMaior(leia.nextDouble());
                System.out.println("Digite a base menor");
                trapezio.setBaseMenor(leia.nextDouble());
                System.out.println("Digite a altura");
                trapezio.setAltura(leia.nextDouble());
                trapezio.area();
            }
            if (num==5){
                Losango losango = new Losango();
                System.out.printf("Digite a diagonal maior\n");
                losango.setDiagonalMaior(leia.nextDouble());
                System.out.println(("Digite a diagonal menor"));
                losango.setDiagonalMenor(leia.nextDouble());
                losango.area();

            }
             if (num==6){
                 Triangulo triangulo = new Triangulo();
                 System.out.printf("Digite a base\n");
                 triangulo.setBase(leia.nextDouble());
                 System.out.println("Digite a altura");
                 triangulo.setAltura(leia.nextDouble());
                 triangulo.area();
            }break;


        }while(num!=0);




//        num=leia.nextDouble();
//        System.out.printf(String.valueOf(num));

    }
}
