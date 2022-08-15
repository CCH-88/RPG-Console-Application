public class Ranger extends Character{
    Ranger(Integer strength, Integer dexterity, Integer intelligence, Integer vitality) {
        super(strength, dexterity, intelligence, vitality);

        //The default attributes at level 1 for Ranger
        super.setStrength(1);
        super.setDexterity(7);
        super.setIntelligence(1);
    }

    public Ranger() {

        //The default attributes at level 1 for mage
        super.setStrength(1);
        super.setDexterity(7);
        super.setIntelligence(1);

    }

    public void levelUp() {
        super.levelUp();

        Integer strength = 1 + getStrength();
        Integer dexterity = 5 + getDexterity();
        Integer intelligence = 1 + getIntelligence();
        super.setBaseAttribtues(strength, dexterity, intelligence, getVitality());

    }
}
