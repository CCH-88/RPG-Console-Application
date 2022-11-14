import java.util.HashMap;

public class Character extends PrimaryAttribute {

    private String name;
    private Integer level;

    private HashMap<SlotType, Item> slotItemHashMap;

    Character(Integer strength, Integer dexterity, Integer intelligence, Integer vitality) {
        super(strength, dexterity, intelligence, vitality);

        //All characters start at level 1
        setLevel(1);
    }

    Character(){

        //All characters start at level 1
        setLevel(1);
        slotItemHashMap = new HashMap<SlotType, Item>();
        setSlotItemHashMap(slotItemHashMap);

    }

    public boolean checkEquipLvl(SlotType aSlotType, Item anItem){

            if (anItem.getRequiredLvl() > getLevel())
            {
                if (aSlotType == SlotType.WEAPON)
                {
                    //System.out.println("Weapon is too high level");
                    return false;
                }
                else
                {
                    //System.out.println("Armor is too high level");
                    return false;
                }

            }else
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

    public HashMap<SlotType, Item> getSlotItemHashMap() {
        return slotItemHashMap;
    }

    public void setSlotItemHashMap(HashMap<SlotType, Item> slotItem) {
        this.slotItemHashMap = slotItem;
    }

    public void setItem(SlotType aSlotType, Item anItem){

        slotItemHashMap.put(aSlotType, anItem);

    }

    public Item getItem(SlotType aSlotType, Item anItem){

        return slotItemHashMap.get(aSlotType);

    }

    //Did not finish in time
    public void calculateTotalAttributes(int base, int attributesFromAllEquippedArmor){
        int totalAttributes = base + attributesFromAllEquippedArmor;
    }

    //Did not finish in time
    /*public double calculateCharacterDPS(Weapon aWeapon, Character aCharacter){
        double characterDPS = aWeapon.getCalculatedDPS() * (1+aCharacter.getTotalMainPrimaryAttribute()/100);

        return characterDPS;
    }*/

    //Did not finish in time
    public int getAllArmorAttributes() {


        int sum = 0;
        for (Item anItem: getSlotItemHashMap().values()) {
            if(anItem.getArmorType() == ArmorType.CLOTH || anItem.getArmorType() == ArmorType.LEATHER ||
                    anItem.getArmorType() == ArmorType.MAIL || anItem.getArmorType() == ArmorType.PLATE && anItem != null) {

                sum += anItem.getTotalArmorAttribute();

                return sum;
            }

        }

        return sum;
    }
}
