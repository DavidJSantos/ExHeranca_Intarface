public class Retangulo extends FiguraGeometrica implements IFiguraGeometrica{

    private double base;
    private double altura;
    private double area;

    public Retangulo(String nome, double base, double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void getArea() {
        this.area = this.base * this.altura;
        super.mostrarDados();
        System.out.printf("Area do %s: %.2f%n", getNome(), area);
    }
}
