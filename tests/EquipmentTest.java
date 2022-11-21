import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipmentTest {

    @Test
    void equippingWeapon_triesToEquipTooHighLvlWeapon_invalidWeaponException(){
        //Assign
        Warrior warrior = new Warrior();
        Weapon testWeapon = new Weapon(7, 1.1);

        //Act
        testWeapon.setName("Common Axe");
        testWeapon.setRequiredLvl(2);
        testWeapon.setSlotType(SlotType.WEAPON);
        testWeapon.setWeaponType(WeaponType.AXE);

        //Assert
         Exception exception = assertThrows(InvalidWeaponException.class,() -> warrior.equipWeapon(SlotType.WEAPON,testWeapon));
         assertEquals("Weapon is too high high level for the warrior...",exception.getMessage());
    }

}