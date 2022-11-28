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

    public boolean equipWeapon(SlotType aSlotType, Item anItem) throws InvalidWeaponException {

        if(aSlotType == SlotType.WEAPON)
        {
            if (super.checkEquipLvl(aSlotType, anItem))
            {
                if (anItem.getWeaponType() == WeaponType.SWORD || anItem.getWeaponType() == WeaponType.DAGGER) {

                    System.out.println(anItem.getWeaponType() + " equiped in slot " + aSlotType.name() + "\n");
                    super.setItem(aSlotType,anItem);
                    return true;

                } else {
                    throw new InvalidWeaponException("Rogues cannot equip the weapon type " + anItem.getWeaponType() + ". They can only equip daggers and swords");
                }
            }
            else{
                throw new InvalidWeaponException("Weapon is too high high level for the Rogue...");
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
                if (anItem.getArmorType() == ArmorType.LEATHER || anItem.getArmorType() == ArmorType.MAIL)
                {
                    System.out.println(anItem.getName() + " equiped in slot " + aSlotType.name() + "\n");
                    super.setItem(aSlotType,anItem);
                    return true;

                }
                else
                {
                    throw new InvalidArmorException("Rogues cannot equip the armour type " + anItem.getArmorType() + ". They can only equip leather and mail");
                }
            }
            else{
                throw new InvalidArmorException("Armor is too high level for the Rogue....");
            }

        }
        else
        {
            System.out.println("Invalid slot type...." + "\n");
            return false;
        }

    }
}
