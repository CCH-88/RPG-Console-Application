public class Main {
    public static void main(String[] args) {

        /*Weapon testWeapon = new Weapon();
        testWeapon.setName("Common Axe");
        testWeapon.setRequiredLvl(2);
        testWeapon.setSlot(Slot.BODY);
        testWeapon.setWeaponType(WeaponType.STAFF);
        testWeapon.calculateDamagePerSecond(4,2);

        Character aMage = new Mage();
        try {
            aMage.equipItem(Slot.WEAPON,testWeapon);
        } catch (InvalidWeaponException e) {
            throw new RuntimeException(e);
        } catch (InvalidArmorException e) {
            throw new RuntimeException(e);
        }*/

        //System.out.println(testWeapon.getCalculatedDPS());

        Armor testPlateBody = new Armor();
        testPlateBody.setName("Common Plate Body Armor");
        testPlateBody.setRequiredLvl(1);
        testPlateBody.setSlot(Slot.BODY);
        testPlateBody.setArmorType(ArmorType.CLOTH);
        testPlateBody.setAttributes(new PrimaryAttribute(1,0,0,2));

        Character warrior = new Warrior();
        try {
            warrior.equipItem(Slot.BODY,testPlateBody);
        } catch (InvalidArmorException e) {
            throw new RuntimeException(e);
        } catch (InvalidWeaponException e) {
            throw new RuntimeException(e);
        }

        System.out.println(testPlateBody.getArmorType());
    }




}
