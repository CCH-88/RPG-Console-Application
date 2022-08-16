public class Main {
    public static void main(String[] args) {

        Weapon testWeapon = new Weapon();
        testWeapon.setName("Common Axe");
        testWeapon.setRequiredLvl(2);
        testWeapon.setSlot(Slot.WEAPON);
        testWeapon.setWeaponType(WeaponType.AXE);
        testWeapon.calculateDamagePerSecond(4,2);

        //System.out.println(testWeapon.getCalculatedDPS());

        /*Armor testPlateBody = new Armor();
        testPlateBody.setName("Common Plate Body Armor");
        testPlateBody.setRequiredLvl(1);
        testPlateBody.setSlot(Slot.BODY);
        testPlateBody.setArmorType(ArmorType.PLATE);
        testPlateBody.setAttributes(new PrimaryAttribute(1,0,0,2));*/

        Character aWarrior = new Warrior();
        aWarrior.equipItem(Slot.WEAPON,testWeapon);




    }
}