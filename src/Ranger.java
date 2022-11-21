public class Ranger extends Character{

    public Ranger() {

        //The default attributes at level 1 for Ranger
        super.setStrength(1);
        super.setDexterity(7);
        super.setIntelligence(1);

        //The main primary attribute of Ranger
        super.setMainPrimaryAttribute(getDexterity());

    }

    @Override
    public void levelUp() {
        super.levelUp();

        Integer strength = 1 + getStrength();
        Integer dexterity = 5 + getDexterity();
        Integer intelligence = 1 + getIntelligence();
        Integer rangerMainPrimaryAttribute = dexterity;

        super.setBaseAttribtues(strength, dexterity, intelligence, rangerMainPrimaryAttribute);

    }

    public boolean equipWeapon(SlotType aSlotType, Item anItem) throws InvalidWeaponException{

        if(aSlotType == SlotType.WEAPON)
        {
            if (super.checkEquipLvl(aSlotType, anItem))
            {
                if (anItem.getWeaponType() == WeaponType.BOW) {

                    System.out.println(anItem.getWeaponType() + " equiped in slot " + aSlotType.name() + "\n");
                    super.setItem(aSlotType,anItem);
                    return true;

                } else {
                    throw new InvalidWeaponException("Rangers cannot equip the weapon type " + anItem.getWeaponType() + ". They can only equip bows");
                }
            }
            else{
                throw new InvalidWeaponException("Weapon is too high high level for the Ranger...");
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
                    throw new InvalidArmorException("Rangers cannot equip the armour type " + anItem.getArmorType() + ". They can only equip leather and mail");
                }
            }
            else{
                throw new InvalidArmorException("Armor is too high level for the Ranger....");
            }

        }
        else
        {
            System.out.println("Invalid slot type...." + "\n");
            return false;
        }

    }
}
