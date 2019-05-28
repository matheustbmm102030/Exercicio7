
package Quest3;

public class AlunoEsp extends AlunoGrad{
    private MateriasPosGrad soliciMatPosGrad;
    public AlunoEsp(String n,MateriasGrad smg,MateriasPosGrad smpg){
        super(n,smg);
        setSMPG(smpg);
    }
    
    void setSMPG(MateriasPosGrad smpg){ this.soliciMatPosGrad=smpg;}
    MateriasPosGrad getSMPG(){ return this.soliciMatPosGrad;}
    
}
