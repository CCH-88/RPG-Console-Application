import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Character extends PrimaryAttribute {

    private String name;
    private Integer level;
    private HashMap<SlotType, Item> slotItemHashMap;

    private Map<SlotType, Item> armorMap;

    private double characterDPS = 0.0;

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

    public void calculatedCharacterDPS(){

        double weaponDPS = 0.0;
        double firstCalc = 0.0;


        if (getEquippedWeapon() == null) {

            firstCalc = 1+this.getMainPrimaryAttribute()/100;
            setCharacterDPS(firstCalc);

        }else{
            weaponDPS = getEquippedWeapon().getCalculatedWeaponDPS();
            firstCalc = 1+((this.getMainPrimaryAttribute() + getSumOfEquipedArmorAttributes())/100);

            setCharacterDPS(weaponDPS * firstCalc);
        }

    }

    public double getCharacterDPS(){
        return this.characterDPS;
    }

    public int getSumOfEquipedArmorAttributes() {

        armorMap = getAllEquipedArmor();

        int totalArmorAttributes = armorMap
                .values()
                .stream()
                .mapToInt(anItem -> anItem.getTotalArmorAttribute())
                .sum();

        return totalArmorAttributes;
    }

    public Map<SlotType, Item> getAllEquipedArmor(){

        //An armors attributes should be added to the total attributes... (not base attributes...)

        armorMap = getSlotItemHashMap()
                .entrySet()
                .stream()
                .filter(x-> x.getKey().equals(SlotType.BODY)
                        || x.getKey().equals(SlotType.HEAD)
                        || x.getKey().equals(SlotType.LEGS))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


        return armorMap;
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
        characterSheet.append("\n" + "------Base attributes...-------");
        characterSheet.append("\n Strength: " + this.getStrength());
        characterSheet.append("\n Dexterity: " + this.getDexterity());
        characterSheet.append("\n Intelligence: " + this.getIntelligence());
        characterSheet.append("\n" + "------Total attributes...-------");
        characterSheet.append("\n Strength: " + this.getTotalStrength());
        characterSheet.append("\n Dexterity: " + this.getTotalDexterity());
        characterSheet.append("\n Intelligence: " + this.getTotalIntelligence());
        characterSheet.append("\n" + "------The DPS of the character is... -------");
        characterSheet.append("\n CharacterDPS: " + this.getCharacterDPS() + "\n");

        return characterSheet;
    }

    public Map<SlotType, Item> getArmorMap() {
        return armorMap;
    }

    public void setArmorMap(Map<SlotType, Item> armorMap) {
        this.armorMap = armorMap;
    }

    public void calculateTotalAttributes(){

        setArmorMap(getAllEquipedArmor());

        if(getArmorMap().isEmpty()){

            System.out.println("No armor equipped. Cannot calculate total attributes...");

        }
        else{

            if (getArmorMap().containsKey(SlotType.BODY)) {

                //System.out.println("Body armor equipped. Calculates the total attributes of the body armor...");

                setTotalStrength(getArmorMap().get(SlotType.BODY).getArmorStrength() + getAllAttributes().get("Strength"));
                setTotalDexterity(getArmorMap().get(SlotType.BODY).getArmorDexterity() + getAllAttributes().get("Dexterity"));
                setTotalIntelligence(getArmorMap().get(SlotType.BODY).getArmorIntelligence() + getAllAttributes().get("Intelligence"));
            }

            if (getArmorMap().containsKey(SlotType.LEGS)){

                //System.out.println("Leg armor equipped. Calculates the total attributes of the Leg armor...");

                setTotalStrength(getArmorMap().get(SlotType.LEGS).getArmorStrength() + getAllAttributes().get("Strength"));
                setTotalDexterity(getArmorMap().get(SlotType.LEGS).getArmorDexterity() + getAllAttributes().get("Dexterity"));
                setTotalIntelligence(getArmorMap().get(SlotType.LEGS).getArmorIntelligence() + getAllAttributes().get("Intelligence"));

            }

            if (getArmorMap().containsKey(SlotType.HEAD)){

                //System.out.println("Head armor equipped. Calculates the total attributes of the Head armor...");

                setTotalStrength(getArmorMap().get(SlotType.HEAD).getArmorStrength() + getAllAttributes().get("Strength"));
                setTotalDexterity(getArmorMap().get(SlotType.HEAD).getArmorDexterity() + getAllAttributes().get("Dexterity"));
                setTotalIntelligence(getArmorMap().get(SlotType.HEAD).getArmorIntelligence() + getAllAttributes().get("Intelligence"));

            }
        }

    }

    public void setCharacterDPS(double characterDPS) {
        this.characterDPS = characterDPS;

    }
}
