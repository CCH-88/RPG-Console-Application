public class Mage extends Character{


    Mage(Integer strength, Integer dexterity, Integer intelligence, Integer vitality) {
        super(strength, dexterity, intelligence, vitality);

        //The default attributes at level 1 for mage
        super.setStrength(1);
        super.setDexterity(1);
        super.setIntelligence(8);
    }

    Mage(){

        //The default attributes at level 1 for mage
        super.setStrength(1);
        super.setDexterity(1);
        super.setIntelligence(8);

    }

    @Override
    public void levelUp() {
        super.levelUp();

        Integer strength = 1 + getStrength();
        Integer dexterity = 1 + getDexterity();
        Integer intelligence = 5 + getIntelligence();

        super.setBaseAttribtues(strength, dexterity, intelligence, getVitality());

    }
}
