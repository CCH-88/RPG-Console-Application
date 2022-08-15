public abstract class Item {

    //private Integer setLevel;
    private String name;
    private Integer requiredLvl;
    private String slotType;

    Item(String name, Integer requiredLvl){

    }

    Item(PrimaryAttribute primaryAttribute){

    }

    public Item() {

    }

    public void equipItem(){

    }

    public void getItemsEquipped(){

    }

    public void setSlotType(){

    }

    public String getSlotType() {
        return slotType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRequiredLvl(Integer requiredLvl) {
        this.requiredLvl = requiredLvl;
    }

    public void setSlotType(String slotType) {
        this.slotType = slotType;
    }

    public String getName() {
        return name;
    }

    public Integer getRequiredLvl() {
        return requiredLvl;
    }
}
