package abstractfactory;

import abstractfactory.equipment.Weapon;

public interface EquipmentFactory {

    Weapon createWeapon();
    String setWeaponType();
    String setElementType();
}
