package pack;

public class Trapezio implements FigurasGeometricas{
    double baseMaior;
    double baseMenor;
    double altura;
    @Override
    public void area() {
        System.out.println("("+getBaseMaior() + " + " + getBaseMenor() + ")"+ " x "+getAltura()+" /2 ="+((getBaseMaior()+getBaseMenor())*getAltura())/2);
    }

    @Override
    public double volume() {
        return 0;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }
}
