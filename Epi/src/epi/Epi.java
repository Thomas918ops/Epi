package epi;
import java.util.Date;
public class Epi {
    private String nome;
    private String codigo;
    private Date dataValidade;
    private Date turno;
    
    public Epi(String luva, String epi100, Date date) {
        this.nome = nome;
        this.codigo = codigo;
        this.dataValidade = dataValidade;
        this.turno = turno;
        
        @Override
        String toString(){
        return "Epi{" + "nome ='" + nome + '\'' + ", codigo ='" + codigo + '/'' + ", dataValidade =" + dataValidade + ", turno ='" + turno + 
    }
    }
    

   public static void main(String[] args) {
    Operario op = new Operario("Joao", 123, "Tarde");
    Epi luva = new Epi("Luva", "Epi100", new Date());

    op.adicionarEpi(luva);
    op.listarEpi();
    }

    
    
}
