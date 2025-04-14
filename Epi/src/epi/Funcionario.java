package epi;

import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario {
    protected String nome;
    protected int matricula;
    protected List<Epi> listaEpi;

    public Funcionario(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.listaEpi = new ArrayList<>();
    }

    public void adicionarEpi(Epi epi){
        listaEpi.add(epi);
    }

    public void listarEpi(){
        System.out.println("EPIs do funcionario " + nome + ":");
        for(Epi epi : listaEpi){
            System.out.println(epi);
        }
    }
}
