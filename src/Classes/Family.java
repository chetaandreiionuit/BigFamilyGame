package Classes;

public class Family {
    private String name;
    private Man[] manMembers;
    private Woman[] womanMembers;
    private int income ;
    private int costs;

//---------------------------------------------Constructor

    public Family(String newName,Man newManMembers[],Woman newWomanMembers[], int newIncome, int newcosts){
        this.name = newName;
        this.manMembers = newManMembers;
        this.womanMembers = newWomanMembers;
        this.income = newIncome;
        this.costs = newcosts;
    }

//----------------------------------------------Get Method()

    public String getName(){
        return name;
    }

    public Man[] getManMembers() {
        return manMembers;
    }

    public Woman[] getWomanMembers(){
        return womanMembers;
    }

    public int getIncome(){
        return income;
    }

    public int getCosts(){
        return costs;
    }

//-----------------------------------------------Set Method()

    public void setName(String newName){
        this.name = newName;
    }

    public void setManMembers(Man newManMembers[]){
        this.manMembers = newManMembers;
    }

    public void setWomanMembers(Woman newWomanMembers[]){
        this.womanMembers = newWomanMembers;
    }

    public void setIncome(int newIncome){
        this.income = newIncome;
    }

    public void setCosts(int newCost){
        this.costs = newCost;
    }


}

