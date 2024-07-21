
package formasgeometrica;

public class Triangulo extends Forma {
    private final double base;
    private final double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triangulo de color " + color);
    }
}
