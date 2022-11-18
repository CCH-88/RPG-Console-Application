import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Character extends PrimaryAttribute {

    private String name;
    private Integer level;
    private HashMap<SlotType, Item> slotItemHashMap;

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
                    return false;
                }
                else
                {
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

    public double calculatedCharacterDPS(){

        double weaponDPS = 0.0;
        double firstCalc = 0.0;
        double characterDPS = 0.0;

        if (getEquippedWeapon() == null) {

            firstCalc = 1+this.getMainPrimaryAttribute()/100;
            return firstCalc;

        }else{
            weaponDPS = getEquippedWeapon().getCalculatedWeaponDPS();
            firstCalc = 1+((this.getMainPrimaryAttribute() + getAllArmorAttributes())/100);

            return characterDPS = weaponDPS * firstCalc;

        }

    }

    public double getCharacterDPS(){
        return this.calculatedCharacterDPS();
    }

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

    public Weapon getEquippedWeapon(){

        Map<SlotType, Item> weaponMap = getSlotItemHashMap()
                .entrySet()
                .stream()
                .filter(x-> x.getKey().equals(SlotType.WEAPON))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        return (Weapon) weaponMap.get(SlotType.WEAPON);
    }

    public StringBuilder getCharacterSheet(){

        StringBuilder characterSheet = new StringBuilder();
        characterSheet.append("\n" + "------Character Sheet-------");
        characterSheet.append("\n Name: " + this.getName());
        characterSheet.append("\n Level: " + this.getLevel());
        characterSheet.append("\n Strength: " + this.getStrength());
        characterSheet.append("\n Dexterity: " + this.getDexterity());
        characterSheet.append("\n Intelligence: " + this.getIntelligence());
        characterSheet.append("\n CharacterDPS: " + this.getCharacterDPS() + "\n");

        return characterSheet;
    }
}
