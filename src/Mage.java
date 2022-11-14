public class Mage extends Character{


    Mage(Integer strength, Integer dexterity, Integer intelligence, Integer vitality) {
        super(strength, dexterity, intelligence, vitality);

        //The default attributes at level 1 for mage
        super.setStrength(1);
        super.setDexterity(1);
        super.setIntelligence(8);

        //The main primary attribute of Mage
        super.setMainPrimaryAttribute(getIntelligence());
    }

    Mage(){

        //The default attributes at level 1 for mage
        super.setStrength(1);
        super.setDexterity(1);
        super.setIntelligence(8);

        //The main primary attribute of Mage
        super.setMainPrimaryAttribute(getIntelligence());

    }

    @Override
    public void levelUp() {
        super.levelUp();

        Integer strength = 3 + getStrength();
        Integer dexterity = 2 + getDexterity();
        Integer intelligence = 1 + getIntelligence();
        Integer mageMainPrimaryAttribute = intelligence;
        super.setBaseAttribtues(strength, dexterity, intelligence, getVitality(),mageMainPrimaryAttribute);

    }


    public boolean equipItem(SlotType aSlotType, Item anItem) throws InvalidWeaponException, InvalidArmorException {

        if (aSlotType == SlotType.WEAPON)
        {
            if (anItem.getWeaponType() == WeaponType.STAFF || anItem.getWeaponType() == WeaponType.WAND) {

                return super.checkEquipLvl(aSlotType, anItem);
            } else {
                throw new InvalidWeaponException("Mage cannot equip this type of weapon. Choose either a staff or wand");
            }
        }
        else if (aSlotType != SlotType.WEAPON){
            if (anItem.getArmorType() == ArmorType.CLOTH) {

                return super.checkEquipLvl(aSlotType, anItem);

            } else if (anItem.getArmorType() != ArmorType.CLOTH){
                throw new InvalidWeaponException("Mage cannot equip this type of armor. Mages can only equip armors of type cloth");
            }
        }

        return true;
    }
}
