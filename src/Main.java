public class Main {
    public static void main(String[] args) {

        //Nået hertil: test af levelup...
        Character aMage = new Mage();
        System.out.println(aMage.getLevel() + "" + aMage.getDexterity() +
                            aMage.getIntelligence() + aMage.getStrength());
        aMage.levelUp();

        System.out.println(aMage.getLevel() + aMage.getDexterity() +
                aMage.getIntelligence() + aMage.getStrength());

    }
}