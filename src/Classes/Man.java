package Classes;

public class Man extends Human {
    private boolean longHair;
    private boolean inteligent;
    private String munceste;

//---------------------------------------------------------------Constructor

    public Man(String Name, int Age, char Sex, boolean newlongHair, boolean newinteligent, String newMunceste){
        super(Name, Age, Sex);
        this.longHair = newlongHair;
        this.inteligent = newinteligent;
        this.munceste = newMunceste;
    }

//-----------------------------------------------------------------getMethod()

    public Boolean getLonghair(){
        return longHair;
    }

    public Boolean getInteligent(){
        return inteligent;
    }

    public String getMunceste(){
        return munceste;
    }

//----------------------------------------------------------------setMethod()

    public void setLongHair(boolean newLongHair){
        this.longHair = newLongHair;
    }

    public void setInteligent(boolean newInteligence){
        this.inteligent = newInteligence;
    }

    public void setMunceste(String newMunceste){
        this.munceste = newMunceste;
    }

//---------------------------------------------------------------Individual Method()
    public static void MakeMoney(int Money){
        System.out.println("Azi a facut " + Money);

    }

    public  void prezentareMan(){
        System.out.println("Ma numesc " + super.getName() + " Am varsta de " + super.getAge() + " Am genul " + super.getSex());
        System.out.println("Par lung: " + this.longHair + " Sunt inteligent: " + this.inteligent + " Muncesc: " + this.munceste);
    }
}
