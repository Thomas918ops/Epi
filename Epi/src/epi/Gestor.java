package epi;

import java.io.PrintStream;

public class Gestor extends Funcionario{
    private String turno;
    
    public Gestor(String nome, int matricula, String turno){
        super(nome, matricula);
        this.turno = turno;
    }
        public void baterPonto(){
        System.out.println(this.nome + " bateu o ponto no turno " + turno);
        }
    }
