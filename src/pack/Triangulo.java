package pack;

public class Triangulo implements FigurasGeometricas{
    double base;
    double altura;
    @Override
    public void area() {
        System.out.println(getBase()+ " * "+ getAltura()+" /2 = "+(getAltura()*getBase())/2);
    }

    @Override
    public double volume() {
        return 0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
