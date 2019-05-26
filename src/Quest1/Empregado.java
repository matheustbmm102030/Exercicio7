
package Quest1;

public class Empregado extends Pessoa {
    private double salarioBase,imposto;
    private int codigoSetor;
    public Empregado(String n,String e,String t,int cs,double sb,double i){
        super(n,e,t);
        setCS(cs);
        setSB(sb);
        setImp(i);
    }
    void setCS(int cs){ this.codigoSetor=cs;}
    int getCs(){ return this.codigoSetor;}
    
    void setSB(double sb){ this.salarioBase=sb;}
    double getSB(){ return this.salarioBase;}
    
    void setImp(double i){ this.imposto=i;}
    double getImp(){ return this.imposto;}
    
    double calcularSalario(){
        return this.salarioBase-(this.salarioBase*(this.imposto/100));
    }
    
}
