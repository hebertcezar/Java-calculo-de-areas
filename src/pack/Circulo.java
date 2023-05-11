package pack;

public class Circulo implements FigurasGeometricas{
    double pi;
    double raio;

    @Override
    public void area() {
        System.out.println(getPi() +" x "+"("+getRaio()+" x "+getRaio()+")" + " = "+getPi()*(getRaio()*getRaio())+"\n");
    }

    @Override
    public double volume() {
        return 0;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
