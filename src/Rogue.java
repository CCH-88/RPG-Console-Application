public class Rogue extends Character{
    Rogue(Integer strength, Integer dexterity, Integer intelligence, Integer vitality) {
        super(strength, dexterity, intelligence, vitality);

        //The default attributes at level 1 for Rogue
        super.setStrength(2);
        super.setDexterity(6);
        super.setIntelligence(1);
    }

    public void levelUp() {
        super.levelUp();

        Integer strength = 1 + getStrength();
        Integer dexterity = 4 + getDexterity();
        Integer intelligence = 1 + getIntelligence();
        super.setBaseAttribtues(strength, dexterity, intelligence, getVitality());

    }
}
