package school.sptech;

public class Desenvolvedor {
    protected String nome;
    protected double valorHora;
    protected Integer qtdHoras;

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, double valorHora, Integer qtdHoras) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.qtdHoras = qtdHoras;
    }

    public Double calcularSalario(){
        return valorHora*qtdHoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Integer qtdHora) {
        this.qtdHoras = qtdHora;
    }
}
