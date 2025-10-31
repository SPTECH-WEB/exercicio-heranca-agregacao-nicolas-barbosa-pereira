package school.sptech.especialistas;

import school.sptech.Desenvolvedor;

public class DesenvolvedorMobile extends Desenvolvedor {
    private String plataforma,linguagem;
    private Integer horasPrototipacao;

    public DesenvolvedorMobile() {
    }

    public DesenvolvedorMobile(String nome, double valorHora, Integer qtdHora, String plataforma, String linguagem, Integer horasPrototipacao) {
        super(nome, valorHora, qtdHora);
        this.plataforma = plataforma;
        this.linguagem = linguagem;
        this.horasPrototipacao = horasPrototipacao;
    }

    @Override
    public Double calcularSalario(){
        double salario= qtdHoras*valorHora;
         salario+=horasPrototipacao*200;
         return salario;

    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public Integer getHorasPrototipacao() {
        return horasPrototipacao;
    }

    public void setHorasPrototipacao(Integer horasPrototipacao) {
        this.horasPrototipacao = horasPrototipacao;
    }
}
