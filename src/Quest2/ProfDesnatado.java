
package Quest2;

public class ProfDesnatado {
    private double salHora;
    private int horas;
    
    void setSalH(double sh){ this.salHora=sh;}
    double getSalH(){ return this.salHora;}

    void setHoras(int h){ this.horas=h;}
    int getHoras(){ return this.horas;}

    double calSal(){
        
        return this.horas*this.salHora;
    }
    
}
