public class Rogue extends Character{

    Rogue(){

        //The default attributes at level 1 for Rogue
        super.setStrength(2);
        super.setDexterity(6);
        super.setIntelligence(1);

        //The main primary attribute of Rogue
        super.setMainPrimaryAttribute(getDexterity());
    }

    @Override
    public void levelUp() {
        super.levelUp();

        Integer strength = 1 + getStrength();
        Integer dexterity = 4 + getDexterity();
        Integer intelligence = 1 + getIntelligence();
        Integer rogueMainPrimaryAttribute = dexterity;
        super.setBaseAttribtues(strength, dexterity, intelligence, rogueMainPrimaryAttribute);

    }


    public boolean equipItem(SlotType aSlotType, Item anItem) throws InvalidWeaponException, InvalidArmorException {

        if (aSlotType == SlotType.WEAPON)
        {
            if (anItem.getWeaponType() == WeaponType.DAGGER || anItem.getWeaponType() == WeaponType.SWORD) {

                return super.checkEquipLvl(aSlotType, anItem);
            } else {
                throw new InvalidWeaponException("Rogues cannot equip this type of weapon. They can only equip daggers and swords");
            }
        }
        else{
            if (anItem.getArmorType() == ArmorType.LEATHER || anItem.getArmorType() == ArmorType.MAIL) {

                return super.checkEquipLvl(aSlotType, anItem);
            } else if (anItem.getArmorType() != ArmorType.LEATHER || anItem.getArmorType() != ArmorType.MAIL){
                throw new InvalidWeaponException("Rogues cannot equip this type of armor. They can only equip armors of type leather and mail");
            }
        }
        return true;

    }
}
