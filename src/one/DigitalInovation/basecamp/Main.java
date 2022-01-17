package one.DigitalInovation.basecamp;

public class Main {
    public static void main(String[] args) {

        //Retornos
        System.out.println("Exercicio retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("A área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("A área do retângulo é " + areaRetangulo);

        double areaTrapezio =  Quadrilatero.area(7,8,9);
        System.out.println("A área do trapézio é " + areaTrapezio);
    }
}
