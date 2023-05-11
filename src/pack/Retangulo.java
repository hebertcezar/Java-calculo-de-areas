package pack;

public class Retangulo implements FigurasGeometricas{

    double base;
    double altura;

    @Override
    public void area() {
        System.out.println(getAltura()+" x "+ getBase()+" = "+getAltura()*getBase());
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
