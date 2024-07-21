
package formasgeometrica;

public class Linea extends Forma {

    public Linea(String color, double largo) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando una linea de color " + color);
    }
}

