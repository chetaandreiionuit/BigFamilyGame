package Classes;

public class Human {
    private String Name;
    private int Age;
    private char Sex;

//---------------------------------------------------------------------Constructor

    public Human(String newName, int newAge, char newSex) {
        this.Name = newName;
        this.Age = newAge;
        this.Sex = newSex;
    }

//---------------------------------------------------------------------GetMethod()

    public  String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public char getSex() {
        return Sex;
    }

//--------------------------------------------------------------------SetMethod()
    public  void setName(String newName) {
        this.Name = newName;
    }

    public void setAge(int newAge) {
        this.Age = newAge;
    }

    public void setSex(char newSex) {
        this.Sex = newSex;
    }

//-----------------------------------------------------------------Individual Method()

    public void SayMyName() {
        System.out.println("Ma numesc: " + this.Name);
    }
}