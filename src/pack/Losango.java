package pack;

public class Losango implements FigurasGeometricas{
    double diagonalMaior;
    double diagonalMenor;
    @Override
    public void area() {
        System.out.println(getDiagonalMaior() +" x "+ getDiagonalMenor()+ " /2 =" + (getDiagonalMenor()*getDiagonalMenor())/2);
    }

    @Override
    public double volume() {
        return 0;
    }

    public double getDiagonalMaior() {
        return diagonalMaior;
    }

    public void setDiagonalMaior(double diagonalMaior) {
        this.diagonalMaior = diagonalMaior;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }
}
