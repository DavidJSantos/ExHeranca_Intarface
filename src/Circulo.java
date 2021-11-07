public class Circulo extends FiguraGeometrica implements IFiguraGeometrica{

    private double raio;
    private double area;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    @Override
    public void getArea() {
        this.area = Math.PI * raio * raio;
        super.mostrarDados();
        System.out.printf("Area do %s: %.2f%n", getNome(), area);
    }
}
