package school.sptech.especialistas;

import school.sptech.Desenvolvedor;

public class DesenvolvedorWeb extends Desenvolvedor {
    private String backend,frontend,sgbd;
    private Integer horasMentoria;

    public DesenvolvedorWeb() {
    }

    public DesenvolvedorWeb(String nome, double valorHora, Integer qtdHora, String backend, Integer horasMentoria, String sgbd, String frontend) {
        super(nome, valorHora, qtdHora);
        this.backend = backend;
        this.horasMentoria = horasMentoria;
        this.sgbd = sgbd;
        this.frontend = frontend;
    }

    @Override
    public Double calcularSalario(){
        Double salario= qtdHoras*valorHora;
        return salario+=horasMentoria*300;
    }

    public Boolean isFullstack(){
        if(this.backend!=null && this.frontend!=null&&this.sgbd!=null){
            return true;
        }
        return false;
    }

    public String getBackend() {
        return backend;
    }

    public void setBackend(String backend) {
        this.backend = backend;
    }

    public String getFrontend() {
        return frontend;
    }

    public void setFrontend(String frontend) {
        this.frontend = frontend;
    }

    public String getSgbd() {
        return sgbd;
    }

    public void setSgbd(String sgbd) {
        this.sgbd = sgbd;
    }

    public Integer getHorasMentoria() {
        return horasMentoria;
    }

    public void setHorasMentoria(Integer horasMentoria) {
        this.horasMentoria = horasMentoria;
    }
}
