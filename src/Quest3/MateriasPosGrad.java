
package Quest3;

public class MateriasPosGrad extends Materias{
        private String zzz;
    
    MateriasPosGrad(String y,String z){
        super(z);
        setYyy(z);
    }
    
    void setZzz(String z){ this.zzz=z;}
    String getZzz(){ return this.zzz;}
}
