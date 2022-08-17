import java.util.HashMap;

public class Character extends PrimaryAttribute {

    private String name;
    private Integer level;

    private HashMap<Slot, Item> slotItemHashMap;

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


    }

    public boolean equipItem(Slot aSlot, Item anItem) throws InvalidWeaponException, InvalidArmorException {


            if (anItem.getRequiredLvl() > getLevel())
            {
                if (aSlot == Slot.WEAPON)
                    throw new InvalidWeaponException("Weapon is too high level for the character");

                else
                    throw new InvalidArmorException("Armor is too high level for the character");

            }else
                setItem(aSlot, anItem);
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

    public void setItem(Slot aSlot, Item anItem){

        slotItemHashMap.put(aSlot, anItem);

    }

    //Specify the slot and it returns the item in that slot.
    public Item getItem(Slot aSlot, Item anItem){

        return slotItemHashMap.get(aSlot);

    }

    public void calculateTotalAttributes(int base, int attributesFromAllEquippedArmor){
        int totalAttributes = base + attributesFromAllEquippedArmor;
    }

    /*public double calculateCharacterDPS(Weapon aWeapon, Character aCharacter){
        double characterDPS = aWeapon.getCalculatedDPS() * (1+aCharacter.getTotalMainPrimaryAttribute()/100);

        return characterDPS;
    }*/

    public int getAllArmorAttributes() {


        int sum = 0;
        for (Item anItem: getSlotItemHashMap().values()) {
            if(anItem.getArmorType() == ArmorType.CLOTH || anItem.getArmorType() == ArmorType.LEATHER ||
                    anItem.getArmorType() == ArmorType.MAIL || anItem.getArmorType() == ArmorType.PLATE) {

                for (int a : anItem.) {
                    sum += a;
                }
                return sum;
            }

        }

    }
}
