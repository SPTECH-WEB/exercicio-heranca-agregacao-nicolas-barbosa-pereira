package school.sptech;

import school.sptech.especialistas.DesenvolvedorMobile;
import school.sptech.especialistas.DesenvolvedorWeb;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedores;

    public Consultoria() {
        this.desenvolvedores=new ArrayList<>();
    }

    public Consultoria(Integer vagas, String nome) {
        this.vagas = vagas;
        this.nome = nome;
        this.desenvolvedores=new ArrayList<>();
    }

    public void contratar(Desenvolvedor desenvolvedor){
        if (desenvolvedores.size()<vagas){
            desenvolvedores.add(desenvolvedor);
        }
    }
    public void contratarFullstack(DesenvolvedorWeb desenvolvedor){
        if (desenvolvedor.isFullstack()){
            desenvolvedores.add(desenvolvedor);
        }else {
            System.out.println("não é fullstack");
        }
    }

    public Double getTotalSalarios(){
        double salarioSomado=0.0;
        for (Desenvolvedor d : desenvolvedores){
            salarioSomado+=d.calcularSalario();
        }

        return salarioSomado;
    }

    public Integer qtdDesenvolvedoresMobile(){
        Integer qntMobile=0;
        for (Desenvolvedor d : desenvolvedores){
            if(d instanceof DesenvolvedorMobile){
            qntMobile++;
            }
        }
        return qntMobile;
    }

    public List<Desenvolvedor> buscarPorSalarioMaiorIgualQue(Double salario){
        List<Desenvolvedor> maiorIgual= new ArrayList<>();
        for (Desenvolvedor d :desenvolvedores){
            if(d.calcularSalario() >=salario){
                maiorIgual.add(d);
            }
        }
        return maiorIgual;
    }

    public Desenvolvedor buscarMenorSalario(){
        if(desenvolvedores.isEmpty()){
            return null;
        }
        Desenvolvedor menorSalario = desenvolvedores.get(0);

        for (Desenvolvedor dev: desenvolvedores){
            if (dev.calcularSalario()<=menorSalario.calcularSalario()){
                menorSalario=dev;
            }
        }

        return menorSalario;

    }

        public List<Desenvolvedor> buscarPorTecnologia(String tecnologia){
            List<Desenvolvedor> mesmaTecnologia = new ArrayList<>();
            for (Desenvolvedor d : desenvolvedores){


                if (d instanceof DesenvolvedorWeb web){
                    if( web.getBackend() .equals(tecnologia) ||
                            web.getFrontend().equals(tecnologia)||
                            web.getSgbd().equals(tecnologia)){
                        mesmaTecnologia.add(d);
                    }
                }

                if(d instanceof DesenvolvedorMobile mob){
                    if(mob.getLinguagem().equals(tecnologia)||
                            mob.getPlataforma().equals(tecnologia)){
                        mesmaTecnologia.add(d);

                    }
                }


            }

            return mesmaTecnologia;
        }
    public Double getTotalSalariosPorTecnologia(String tecnologia){
        double salarioTecnologia=0.0;
        for (Desenvolvedor d : desenvolvedores){


            if (d instanceof DesenvolvedorWeb web){
                if( web.getBackend() .equals(tecnologia) ||
                        web.getFrontend().equals(tecnologia)||
                        web.getSgbd().equals(tecnologia)){
                    salarioTecnologia+=d.calcularSalario();                }
            }

            if(d instanceof DesenvolvedorMobile mob){
                if(mob.getLinguagem().equals(tecnologia)||
                        mob.getPlataforma().equals(tecnologia)){
                    salarioTecnologia+=d.calcularSalario();

                }
            }


        }
        return salarioTecnologia;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public List<Desenvolvedor> getDesenvolvedores() {
        return desenvolvedores;
    }

    public void setDesenvolvedores(List<Desenvolvedor> desenvolvedores) {
        this.desenvolvedores = desenvolvedores;
    }
}
