
package formasgeometrica;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Rojo", 5.0);
        Linea linea = new Linea("negra", 10.0);
        Triangulo triangulo = new Triangulo("rosa", 6.0, 8.0);
        Cuadrado cuadrado = new Cuadrado("Amarillo", 4.0);

        circulo.dibujar();
        System.out.println("Area del circulo: " + circulo.calcularArea());

        linea.dibujar();

        triangulo.dibujar();
        System.out.println("Area del triangulo: " + triangulo.calcularArea());

        cuadrado.dibujar();
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
    }
}
