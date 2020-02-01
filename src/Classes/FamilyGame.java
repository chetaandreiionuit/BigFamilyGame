package Classes;

public class FamilyGame {
    private FamilyTeam Familie1;
    private FamilyTeam Familie2;
    private FamilyTeam Winner ;


//-------------------------------------------------------------------------Constructor

    public FamilyGame(FamilyTeam newFamilie1, FamilyTeam newFamilie2){
        this.Familie1 = newFamilie1;
        this.Familie2 = newFamilie2;

    }

//--------------------------------------------------------------------------set Method()

    public void setFamilie1(FamilyTeam familie1) {
        this.Familie1 = familie1;
    }

    public void setFamilie2(FamilyTeam familie2) {
        this.Familie2 = familie2;
    }

    public void setWinner(FamilyTeam winner) {
        this.Winner = winner;
    }

//----------------------------------------------------------------------------get Method()


    public FamilyTeam getFamilie1() {
        return Familie1;
    }

    public FamilyTeam getFamilie2() {
        return Familie2;
    }

    public FamilyTeam getWinner() {
        return Winner;
    }
}
