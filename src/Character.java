import java.util.HashMap;

public class Character extends PrimaryAttribute {

    private String name;
    private Integer level;

    private HashMap<Slot, Item> slotItemHashMap;

    private Weapon aWeapon;

    Character(Integer strength, Integer dexterity, Integer intelligence, Integer vitality) {
        super(strength, dexterity, intelligence, vitality);

        //All characters start at level 1
        setLevel(1);
    }

    Character(){

        //All characters start at level 1
        setLevel(1);
        slotItemHashMap = new HashMap<Slot, Item>();
        setSlotItemHashMap(slotItemHashMap);

        //aWeapon = new Weapon();
    }

    public boolean equipItem(Slot aBodyPart, Item anItem){

        if (anItem.getRequiredLvl() > getLevel())
        {
            System.out.println("Weapon is too high level for the character");
            return false;
        }else
            slotItemHashMap.put(aBodyPart, anItem);
            return true;

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

    public HashMap<Slot, Item> getSlotItemHashMap() {
        return slotItemHashMap;
    }

    public void setSlotItemHashMap(HashMap<Slot, Item> slotItem) {
        this.slotItemHashMap = slotItem;
    }
}
