public abstract class Item {


    //private Integer setLevel;
    private String name;
    private Integer requiredLvl;
    WeaponType weaponType;

    ArmorType armorType;

    Slot aSlot;



    Item(String name, Integer requiredLvl){

    }

    Item(PrimaryAttribute primaryAttribute){

    }

    public Item() {

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

    public void setSlot(Slot aSlot) {
        this.aSlot = aSlot;
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

}
