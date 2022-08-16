public abstract class Item {


    //private Integer setLevel;
    private String name;
    private Integer requiredLvl;

    Slot aSlot;



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
}
