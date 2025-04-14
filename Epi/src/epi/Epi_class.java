package epi;
import java.util.Date;
public class Epi_class {
    private String nome;
    private String codigo;
    private Date dataValidade;
    private Date turno;
    
    public Epi_class(String nome, String codigo, Date dataValidade){
        this.nome = nome;
        this.codigo = codigo;
        this.dataValidade = dataValidade;
    }
    
    @Override
    public String toString(){
        return ("Epi{" + "nome ='" + nome + '\'' + ", codigo ='" + codigo + '\'' + ", validade =" + dataValidade + '}');
    }
}
