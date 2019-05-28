
package Quest2;

public class ProfDesnatado {
    private double salHora;
    private int horas;
    
    public void setSalH(double sh){ this.salHora=sh;}
    public double getSalH(){ return this.salHora;}

    public void setHoras(int h){ this.horas=h;}
    public int getHoras(){ return this.horas;}

    public double calSal(){
        
        return this.horas*this.salHora;
    }
    
}
