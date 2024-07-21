
package formasgeometrica;

public class Circulo extends Forma {
    private final double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo de color " + color);
    }
}