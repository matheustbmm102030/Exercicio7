
package Quest3;

public class AlunoGrad extends Aluno{
    private MateriasGrad soliciMatGrad;
    AlunoGrad(String n,MateriasGrad smg){
        super(n);
        setSMG(smg);
    }
    void setSMG(MateriasGrad smg){ this.soliciMatGrad=smg;}
    MateriasGrad getSMG(){ return this.soliciMatGrad;}
}
