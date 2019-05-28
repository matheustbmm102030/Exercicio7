
package Quest3;

public class MateriasGrad extends Materias{
    private String xxx;
    
    MateriasGrad(String y,String x){
        super(y);
        setXxx(x);
    }
    
    void setXxx(String x){ this.xxx=x;}
    String getXxx(){ return this.xxx;}
}
