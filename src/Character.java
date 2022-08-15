import java.util.HashMap;

public class Character extends PrimaryAttribute implements Slots{

    private String name;
    private Integer level;

    private HashMap<Slots.SlotType,Item> slotItemHashMap;

    Character(Integer strength, Integer dexterity, Integer intelligence, Integer vitality) {
        super(strength, dexterity, intelligence, vitality);

        //All characters start at level 1
        setLevel(1);
    }

    Character(){

        //All characters start at level 1
        setLevel(1);
        slotItemHashMap = new HashMap<Slots.SlotType,Item>();
    }

    public void equipItem(){

        HashMap<Slots.SlotType,Item> slotItemHashMap;

    }
    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return level;
    }

    //Josi made the damage method here....
    public void doDamage(){

    }

    public void levelUp(){

        Integer level = 1 + getLevel();
        setLevel(level);
    }

    public HashMap<Slots.SlotType, Item> getSlotItemHashMap() {
        return slotItemHashMap;
    }

    public void setSlotItemHashMap(HashMap<Slots.SlotType, Item> slotItem) {
        this.slotItemHashMap = slotItem;
    }
}
