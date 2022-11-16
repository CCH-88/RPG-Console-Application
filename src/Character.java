import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Character extends PrimaryAttribute {

    private String name;
    private Integer level;

    private HashMap<SlotType, Item> slotItemHashMap;

    Character(Integer strength, Integer dexterity, Integer intelligence) {
        super(strength, dexterity, intelligence);

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
            {
                return true;
            }


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
    /*public double calculateCharacterDPS(Weapon aWeapon, Character aCharacter){
        double characterDPS = aWeapon.getCalculatedDPS() * (1+aCharacter.getTotalMainPrimaryAttribute()/100);

        return characterDPS;
    }*/

    public int totalAttribute(){

        int totalAttribute = getTotalBaseAttributes() + getAllArmorAttributes();

        return totalAttribute;
    }


    public int getAllArmorAttributes() {

        Map<SlotType, Item> armorMap = getSlotItemHashMap()
                .entrySet()
                .stream()
                .filter(x-> x.getKey().equals(SlotType.BODY)
                        || x.getKey().equals(SlotType.HEAD)
                        || x.getKey().equals(SlotType.LEGS))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        int totalArmorAttributes = armorMap
                .values()
                .stream()
                .mapToInt(anItem -> anItem.getTotalArmorAttribute())
                .sum();

        return totalArmorAttributes;
    }
}
