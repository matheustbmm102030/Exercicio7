
package Quest1;

public class Pessoa {
    private String nome,endereço,telefone;
    public Pessoa(String n,String e,String t){
        setNome(n);
        setEnd(e);
        setTel(t);
    }
    
    void setNome(String n){ this.nome=n;}
    String getNome(){ return this.nome;}
    
    void setEnd(String e){ this.endereço=e;}
    String getEnd(){ return this.endereço;}
    
    void setTel(String t){ this.telefone=t;}
    String getTel(){ return this.telefone;}
}
