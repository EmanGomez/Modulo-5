
package formasgeometrica;

public abstract class Forma {
    protected String color;

    public Forma(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void dibujar();
}

