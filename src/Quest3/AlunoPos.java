
package Quest3;

public class AlunoPos extends Aluno{
    private MateriasPosGrad soliciMatPosGrad;
    public AlunoPos(String n,MateriasPosGrad smpg){
        super(n);
        setSMpG(smpg);
    }
    
    void setSMpG(MateriasPosGrad smpg){ this.soliciMatPosGrad=smpg;}
    MateriasPosGrad getSMPG(){ return this.soliciMatPosGrad;}
    
}
