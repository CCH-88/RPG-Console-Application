public class Warrior extends Character{
    Warrior(Integer strength, Integer dexterity, Integer intelligence, Integer vitality) {
        super(strength, dexterity, intelligence, vitality);

        //The default attributes at level 1 for warrior
        super.setStrength(5);
        super.setDexterity(2);
        super.setIntelligence(1);
    }

    Warrior() {

        //The default attributes at level 1 for warrior
        super.setStrength(5);
        super.setDexterity(2);
        super.setIntelligence(1);

    }
    @Override
    public void levelUp() {
        super.levelUp();

        Integer strength = 3 + getStrength();
        Integer dexterity = 2 + getDexterity();
        Integer intelligence = 1 + getIntelligence();
        super.setBaseAttribtues(strength, dexterity, intelligence, getVitality());

    }
}
