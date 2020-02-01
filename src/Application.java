import Classes.*;

public class Application {

    public static void main(String[] args) {

//-------------------------------------------------------------------------OBJECT FROM CLASSES

        Woman Dodo = new Woman("Fenesan Teodora", 24, 'f', true, false, "da");

        Man Bobo = new Man("Iudean Bogdan", 25, 'm', false, true, "da");

//----------------------------------------------------------------------------Method Prezentare:

//        Dodo.prezentareWoman();
//        Dodo.Cooking("fasole");
//
//        System.out.println();
//
//        Bobo.prezentareMan();
//        Bobo.MakeMoney(200);

//----------------------------------------------------------------------------Getter & Setter pentru obiecte:

//        Dodo.setName("Fenesan Bogdan");
//        Dodo.setAge(25);
//        Dodo.setSex('m');
//        Dodo.setInteligenta(true);
//        Dodo.setScandal("nu");
//        Dodo.setLongHair(true);

        Bobo.setName("Iudean Bogdan");
        Bobo.setAge(26);
        Bobo.setSex('f');
        Bobo.setInteligent(false);
        Bobo.setLongHair(true);
        Bobo.setMunceste("nu");

//-------------------------------------------------------------------------Methoda Prezentare 2:

//        Dodo.prezentareWoman();
//        System.out.println();
//        Bobo.prezentareMan();
//        System.out.println();

//-------------------------------------------------------------------------Creare caine si aplicare metoda Caine musca

//        Dog Yuri = new Dog("Yuri", 2,"Basset Hound");
//        Yuri.caineleMusca(Dodo.getName());

//--------------------------------------------------------------------------Creare pisica si aplicare metodaMiauna

//        Cat Pisi = new Cat("pisi",1,"Birmaneza");
//        Pisi.pisicaMiauna();

//--------------------------------------------------------------------------
//--------------------------------------------------------------------------Creare Familie Dancila + Prezentare

        Man cristinel = new Man("Cristinel Dancila", 50, 'm', false, false, "Fura Nevasta");
        Woman viorica = new Woman("Viorica Dancila", 50, 'f', true, false, "Incearca dar nu o ajuta capul");

        //am creat un array de obiecte:
        Man[] arrayMan = new Man[2];
        arrayMan[0] = cristinel;
        arrayMan[1] = Bobo;

        Woman[] arrayWoman = new Woman[2];
        arrayWoman[0] = Dodo;
        arrayWoman[1] = viorica;

        Family Dancila = new Family("Dancila", arrayMan, arrayWoman, 10000, 100);


//        System.out.println("The men in the family are: ");
//
//        for(Man memberMan : Dancila.getManMembers()){
//            memberMan.prezentareMan();
//            System.out.println();
//        }

//        System.out.println("The woman in the family are: ");
//
//        for(Woman memberWman : Dancila.getWomanMembers()){
//            memberWman.prezentareWoman();
//            System.out.println();
//        }

//----------------------------------------------------------------------------Creare familie Iohannis + prezentare

        Man Klaus = new Man("Klaus Iohannis", 50, 'm', false, true, "......");
        Man KlausKid = new Man("Kid Iohannis", 18, 'm', false, true, "Nu apuca");

        Woman Carmen = new Woman("Carmen Iohannis", 48, 'f', true, false, "da");

        Woman[] arrayWomanI = new Woman[1];
        arrayWomanI[0] = Carmen;

        Man[] arrayManI = new Man[2];
        arrayManI[0] = Klaus;
        arrayManI[1] = KlausKid;

        Family Iohannis = new Family("Iohannis", arrayManI, arrayWomanI, 1000, 100);

//        System.out.println("Men members in Iohannis:");
//
////        for(Man manMembers : Iohannis.getManMembers()){
//            manMembers.prezentareMan();
//        }
//        System.out.println();
//        System.out.println("Woman members in Iohannis fa");
//
//        for(Woman womanMembers : Iohannis.getWomanMembers()){
//            womanMembers.prezentareWoman();
//        }

//----------------------------------------------------------------------------Creare familie BradPit + preznetare

        Man Brad = new Man("Brad pit", 50, 'm', true, false, "Se preface");
        Man BradKid = new Man("Brad Pit's child", 10, 'm', false, false, "nu stie inca");
        Woman Angelina = new Woman("Angelina Brad Pit", 50, 'f', true, false, "Depresiva");
        Woman AngelinaKid = new Woman("Angelina Brad Pit child", 10, 'f', true, false, "are de la masa");

        Woman[] arrayWomanB = new Woman[2];
        arrayWomanB[0] = Angelina;
        arrayWomanB[1] = AngelinaKid;

        Man[] arrayManB = new Man[2];
        arrayManB[0] = Brad;
        arrayManB[1] = BradKid;

        Family BradPit = new Family("BradPit", arrayManB, arrayWomanB, 100000, 5000);

//       System.out.println("Men members in BradPit family");
//       for(Man manMembers : BradPit.getManMembers()){
//           manMembers.prezentareMan();
//       }
//       System.out.println();
//       System.out.println("Woman members in BradPi family");
//       for(Woman womanMember : BradPit.getWomanMembers()){
//           womanMember.prezentareWoman();
//       }

//----------------------------------------------------------------------Creare familie Stalin + prezentare

        Man stalinIosif = new Man("Stalin Iosif", 70, 'm', false, true, ":))");
        Woman StalinW1 = new Woman("Stalin's wife 1", 69, 'f', true, false, "nu are tupeu");
        Woman StalinW2 = new Woman("Stalin's wife 2", 68, 'f', true, false, "still fara tupeu ");

        Man[] arrayManS = new Man[1];
        arrayManS[0] = stalinIosif;

        Woman[] arrayWomanS = new Woman[2];
        arrayWomanS[0] = StalinW1;
        arrayWomanS[1] = StalinW2;

        Family Stalin = new Family("Stalin", arrayManS, arrayWomanS, 1000000000, 0);

//        System.out.println("Man in family Stalin is :");
//
//        for (Man manMembers : Stalin.getManMembers()){
//            manMembers.prezentareMan();
//        }
//        System.out.println();
//        System.out.println("Woman in Stalin's family");
//        for(Woman womanMemebers : Stalin.getWomanMembers()){
//            womanMemebers.prezentareWoman();
//        }

//-------------------------------------------------------------Creare family array
        Family[] allFamily = new Family[4];
        allFamily[0] = Dancila;
        allFamily[1] = Iohannis;
        allFamily[2] = BradPit;
        allFamily[3] = Stalin;

//-------------------------------------------------------------Clasament pe familii
//        for(int i = 0 ; i<allFamily.length ; i++){
//            for(int j = i+1; j< allFamily.length; j++){
//                if(allFamily[i].getIncome() < allFamily[j].getIncome()){
//                    Family o = allFamily[i];
//                    allFamily[i] = allFamily[j];
//                    allFamily[j] = o;
//                }
//            }
//        }
//        System.out.println("Most richest families are: ");
//
//        for(int i = 0; i< allFamily.length; i++){
//            System.out.println(allFamily[i].getName());
//        }

//--------------------------------------------------------------Team 1-2

        FamilyTeam Team1 = new FamilyTeam(Stalin);
        FamilyTeam Team2 = new FamilyTeam(Iohannis);
        FamilyGame Game1 = new FamilyGame(Team1, Team2);

//--------------------------------------------------------------Team 3-4

        FamilyTeam Team3 = new FamilyTeam(Dancila);
        FamilyTeam Team4 = new FamilyTeam(BradPit);
        FamilyGame Game2 = new FamilyGame(Team3, Team4);

//--------------------------------------------------------------Game1

        System.out.println("Game 1 Run: ");
        if (Team1.getFamilyPoint1() > Team2.getFamilyPoint1()) {

            Game1.setWinner(Team1);
            System.out.println(Team1.getNumeFamilie1().getName());
            System.out.println(Team1.getFamilyPoint1());
            System.out.println(Team1.getScore());

        } else if(Team1.getFamilyPoint1() < Team2.getFamilyPoint1()){
            Game1.setWinner(Team2);
            System.out.println(Team2.getNumeFamilie1().getName());
            System.out.println(Team2.getFamilyPoint1());
        }
        System.out.println();

//--------------------------------------------------------------Game2

        System.out.println("Game 2 Run");
        if (Team3.getFamilyPoint1() > Team4.getFamilyPoint1()) {
            Game2.setWinner(Team3);
            Team3.setScore(Team3.getScore()+1);
            System.out.println(Team3.getScore());
            System.out.println(Team3.getNumeFamilie1().getName());
            System.out.println(Team3.getFamilyPoint1());
        } else if(Team3.getFamilyPoint1() < Team4.getFamilyPoint1()){
            Game2.setWinner(Team4);
            Team4.setScore(Team4.getScore()+1);
            System.out.println(Team4.getScore());
            System.out.println(Team4.getNumeFamilie1().getName());
            System.out.println(Team4.getFamilyPoint1());
        }

//-------------------------------------------------------------------Finala

        System.out.println();
        System.out.println("Finala :");
        if (Game1.getWinner().generateRandomValue() > Game2.getWinner().generateRandomValue()) {
            System.out.println(Game1.getWinner().getNumeFamilie1().getName());
            System.out.println(Game1.getWinner().getFamilyPoint1());
        } else if (Game1.getWinner().generateRandomValue() < Game2.getWinner().generateRandomValue()) {
            System.out.println(Game2.getWinner().getNumeFamilie1().getName());
            System.out.println(Game2.getWinner().getFamilyPoint1());
        }

    }
}

//--------------------------------------------------------------------Creare procent castiguri




