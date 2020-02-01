package Classes;
import java.util.Random;

public class FamilyTeam {
    //Create a rondom obj to generate a pct for team
    Random familyPoint = new Random();
    private int Score = 0;
    private Family NumeFamilie1;
    int familyPoint1 = familyPoint.nextInt(101);

//----------------------------------------------------------constructor

    public FamilyTeam(Family newNumeFamilie1){
        this.NumeFamilie1 = newNumeFamilie1;
    }

//----------------------------------------------------------Get Method()


    public int getScore() {
        return Score;
    }

    public int getFamilyPoint1() {
        return familyPoint1;
    }

    public Family getNumeFamilie1() {
        return NumeFamilie1;
    }

//-----------------------------------------------------------Set Method()


    public void setScore(int score) {
        this.Score = score ;
    }

    public void setFamilyPoint1(int familyPoint1) {
        this.familyPoint1 = familyPoint1;
    }

    public void setNumeFamilie1(Family numeFamilie1) {
        this.NumeFamilie1 = numeFamilie1;
    }

//------------------------------------------------------------individual method how generate a value

    public  int generateRandomValue(){
        Random familyPoint = new Random();
        this.familyPoint1 = familyPoint.nextInt(101);
        return familyPoint1;

    }

}
