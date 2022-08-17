public class Armor extends Item{

    private Integer armorStrength;

    private Integer armorDexterity;

    private Integer armorIntelligence;

    private Integer armorVitality;


    PrimaryAttribute armorAttributes;


    Armor(String name, Integer requiredLvl) {
        super(name, requiredLvl);
    }

    public Armor() {
    armorAttributes = new PrimaryAttribute();
    }

    public void setArmorAttributes(PrimaryAttribute armorAttributes) {
        this.armorAttributes.setBaseAttribtues(armorAttributes.getStrength(),armorAttributes.getDexterity(), armorAttributes.getIntelligence(),armorAttributes.getVitality(), armorAttributes.getMainPrimaryAttribute());

        setArmorStrength(armorAttributes.getStrength());
        setArmorDexterity(armorAttributes.getDexterity());
        setArmorIntelligence(armorAttributes.getIntelligence());

    }


    public Integer getTotalArmorAttribute() {
       Integer totalArmorAttribute = getArmorStrength() + getArmorDexterity() + getArmorIntelligence();
       return totalArmorAttribute;
    }

    public Integer getArmorStrength() {
        return armorStrength;
    }

    public void setArmorStrength(Integer armorStrength) {
        this.armorStrength = armorStrength;
    }

    public Integer getArmorDexterity() {
        return armorDexterity;
    }

    public void setArmorDexterity(Integer armorDexterity) {
        this.armorDexterity = armorDexterity;
    }

    public Integer getArmorIntelligence() {
        return armorIntelligence;
    }

    public void setArmorIntelligence(Integer armorIntelligence) {
        this.armorIntelligence = armorIntelligence;
    }

    public Integer getArmorVitality() {
        return armorVitality;
    }

    public void setArmorVitality(Integer armorVitality) {
        this.armorVitality = armorVitality;
    }
}
