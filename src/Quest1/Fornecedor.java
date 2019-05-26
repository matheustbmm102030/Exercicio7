
package Quest1;

public class Fornecedor extends Pessoa {
    
    private double valorCredito,valorDivida;
    
    public Fornecedor(String n,String e,String t,double vc,double vd){
        super(n,e,t);
        setVC(vc);
        setVD(vd);
    }   
    
    void setVC(double c){ this.valorCredito=c;}
    double getVC(){ return this.valorCredito;}

    void setVD(double d){ this.valorDivida=d;}
    double getVD(){ return this.valorDivida;}

    double obterSaldo(){
        return this.valorCredito-this.valorDivida;
    }
}
