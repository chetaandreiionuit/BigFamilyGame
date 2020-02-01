package Classes;

public class Dog  {
    private String Name;
    private int Age;
    private String Rasa;

//-------------------------------------------------------------------Constructor

    public Dog(String newName, int newAge, String newRasa) {
        this.Name = newName;
        this.Age = newAge;
        this.Rasa = newRasa;
    }


//--------------------------------------------------------------------Individual Method

    public void caineleMusca(String personName){
        System.out.println(this.Name + " Musca pe " + personName);
    }
}
