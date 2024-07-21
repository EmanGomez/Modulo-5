
package formasgeometrica;

public class Cuadrado extends Forma {
    private final double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado de color " + color);
    }
}