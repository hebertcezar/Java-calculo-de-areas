package pack;

public class Quadrado implements FigurasGeometricas{
    double lado;
    @Override
    public void area() {
        System.out.println(getLado()+"² = "+getLado()*getLado());
    }

    @Override
    public double volume() {
        return 0;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
