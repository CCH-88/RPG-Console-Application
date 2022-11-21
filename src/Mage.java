public class Mage extends Character{


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

        Integer strength = 1 + getStrength();
        Integer dexterity = 1 + getDexterity();
        Integer intelligence = 5 + getIntelligence();
        Integer mageMainPrimaryAttribute = intelligence;
        super.setBaseAttribtues(strength, dexterity, intelligence, mageMainPrimaryAttribute);

    }

    public boolean equipWeapon(SlotType aSlotType, Item anItem) throws InvalidWeaponException{

        if(aSlotType == SlotType.WEAPON)
        {
            if (super.checkEquipLvl(aSlotType, anItem))
            {
                if (anItem.getWeaponType() == WeaponType.STAFF || anItem.getWeaponType() == WeaponType.WAND) {

                    System.out.println(anItem.getWeaponType() + " equiped in slot " + aSlotType.name() + "\n");
                    super.setItem(aSlotType,anItem);
                    return true;

                } else {
                    throw new InvalidWeaponException("Mages cannot equip the weapon type " + anItem.getWeaponType() + ". They can only equip staffs and wands");
                }
            }
            else{
                throw new InvalidWeaponException("Weapon is too high high level for the Mage...");
            }
        }
        else
        {
            System.out.println("Invalid slot type...." + "\n");
            return false;
        }
    }

    public boolean equipArmor(SlotType aSlotType, Item anItem) throws InvalidArmorException {

        if(aSlotType == SlotType.HEAD || aSlotType == SlotType.BODY || aSlotType == SlotType.LEGS)
        {
            if (super.checkEquipLvl(aSlotType, anItem) == true)
            {
                if (anItem.getArmorType() == ArmorType.CLOTH)
                {
                    System.out.println(anItem.getName() + " equiped in slot " + aSlotType.name() + "\n");
                    super.setItem(aSlotType,anItem);
                    return true;

                }
                else
                {
                    throw new InvalidArmorException("Mages cannot equip the armour type " + anItem.getArmorType() + ". They can only cloth");
                }
            }
            else{
                throw new InvalidArmorException("Armor is too high level for the Mage....");
            }

        }
        else
        {
            System.out.println("Invalid slot type...." + "\n");
            return false;
        }

    }
}
