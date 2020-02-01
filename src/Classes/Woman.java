package Classes;

public class Woman extends Human {
    private boolean longHair;
    private boolean inteligenta;
    private String scandal;

//----------------------------------------------------------------------Constructor

    public Woman(String Name, int Age, char Sex, boolean newlonghair, boolean newInteligenta, String newscandal) {
        super(Name, Age, Sex);
        this.longHair = newlonghair;
        this.inteligenta = newInteligenta;
        this.scandal = newscandal;
    }

//--------------------------------------------------------------------- GetMethod()

    public Boolean getLonghair() {
        return longHair;
    }

    public Boolean getInteligenta() {
        return inteligenta;
    }

    public String getScandal() {
        return scandal;
    }

//-----------------------------------------------------------------------SetMethod()

    public void setLongHair(boolean newlongHair) {
        this.longHair = newlongHair;
    }

    public void setInteligenta(boolean newInteligenta) {
        this.inteligenta = newInteligenta;
    }

    public void setScandal(String newScandal) {
        this.scandal = newScandal;
    }

//-------------------------------------------------------------------Individual Method()

    public static void Cooking(String Food) {
        System.out.println("Azi a facut : " + Food);
    }


    public  void prezentareWoman(){
        System.out.println("Ma numesc " + super.getName() + " Am varsta de " + super.getAge() + " Am genul " + super.getSex() );
        System.out.println("Par lung: " + this.longHair + " Sunt inteligenta: " + this.inteligenta + " Fac scandal: "+ this.scandal);
    }
}