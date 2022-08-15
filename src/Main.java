public class Main {
    public static void main(String[] args) {

        Weapon testWeapon = new Weapon();
        //testWeapon.setName("Common Axe");
        //testWeapon.setRequiredLvl(1);
        //testWeapon.setWeaponType(Weapons.WeaponType.AXE);
        testWeapon.calculateDamagePerSecond(4,2);

        System.out.println(testWeapon.getAttacksPerSecond());



    }
}