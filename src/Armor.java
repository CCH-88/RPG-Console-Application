public class Armor extends Item{


    PrimaryAttribute armorAttributes;
    ArmorType armorType;
    Armor(String name, Integer requiredLvl) {
        super(name, requiredLvl);
    }

    public Armor() {
    armorAttributes = new PrimaryAttribute();
    }

    /*public void setArmorType(ArmorType armorType) {
        this.armorType = armorType;
    }*/

    public void setAttributes(PrimaryAttribute armorAttributes) {
        this.armorAttributes.setBaseAttribtues(armorAttributes.getStrength(),armorAttributes.getDexterity(), armorAttributes.getIntelligence(),armorAttributes.getVitality(), );



    }

}
