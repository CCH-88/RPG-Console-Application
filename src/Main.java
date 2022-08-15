public class Main {
    public static void main(String[] args) {




        //Test of levelUp function af mage
        Character aMage = new Mage();

        System.out.println("Level: " + aMage.getLevel() + "\n" + "Dexterity: " + aMage.getDexterity() +
                "\n" + "Intelligence: " + aMage.getIntelligence() +  "\n" + "Strength: " + aMage.getStrength());

        aMage.levelUp();

        System.out.println("\n" +"Level: " + aMage.getLevel() + "\n" + "Dexterity: " + aMage.getDexterity() +
                "\n" + "Intelligence: " + aMage.getIntelligence() +  "\n" + "Strength: " + aMage.getStrength());

        //Test of levelUp function af mage
        Character aRanger = new Ranger();

        System.out.println("Level: " + aRanger.getLevel() + "\n" + "Dexterity: " + aRanger.getDexterity() +
                "\n" + "Intelligence: " + aRanger.getIntelligence() +  "\n" + "Strength: " + aRanger.getStrength());

        aMage.levelUp();

        System.out.println("\n" +"Level: " + aRanger.getLevel() + "\n" + "Dexterity: " + aRanger.getDexterity() +
                "\n" + "Intelligence: " + aRanger.getIntelligence() +  "\n" + "Strength: " + aRanger.getStrength());

    }
}