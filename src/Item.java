public abstract class Item {

    private Integer armorStrength;

    private Integer armorDexterity;

    private Integer armorIntelligence;

    private Integer armorVitality;

    private String name;
    private Integer requiredLvl;

    private PrimaryAttribute armorAttributes;

    WeaponType weaponType;

    ArmorType armorType;

    SlotType aSlotType;


    Item(String name, Integer requiredLvl){

    }

    Item(PrimaryAttribute primaryAttribute){

    }

    public Item() {
        armorAttributes = new PrimaryAttribute();

    }

    public void setArmorAttributes(PrimaryAttribute armorAttributes) {
        this.armorAttributes.setBaseAttribtues(armorAttributes.getStrength(),armorAttributes.getDexterity(), armorAttributes.getIntelligence(),armorAttributes.getVitality(), armorAttributes.getMainPrimaryAttribute());

        setArmorStrength(armorAttributes.getStrength());
        setArmorDexterity(armorAttributes.getDexterity());
        setArmorIntelligence(armorAttributes.getIntelligence());

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setRequiredLvl(Integer requiredLvl) {
        this.requiredLvl = requiredLvl;
    }

    public String getName() {
        return name;
    }

    public Integer getRequiredLvl() {
        return requiredLvl;
    }

    public void setSlot(SlotType aSlotType) {
        this.aSlotType = aSlotType;
    }

    public void setWeaponType(WeaponType weaponType){

        this.weaponType = weaponType;

    }

    public WeaponType getWeaponType(){

        return this.weaponType;
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    public void setArmorType(ArmorType armorType){

        this.armorType = armorType;

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

    public int getTotalArmorAttribute() {
        int totalArmorAttribute = getArmorStrength() + getArmorDexterity() + getArmorIntelligence();
        return totalArmorAttribute;
    }
}
