public class FiguraGeometrica {

    private String nome;

    public FiguraGeometrica() {
    }

    public void mostrarDados(){
        System.out.println();
        System.out.println("---- Calculo da area do " + this.nome + " ----");
        System.out.println();
    }


    public FiguraGeometrica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
