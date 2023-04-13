package abstractfactory.implement;

import abstractfactory.EquipmentFactory;
import abstractfactory.equipment.Weapon;
import random.RandomWeaponType;

public class FireWeaponFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new Weapon( setWeaponType(), setElementType()  );
    }

    @Override
    public String setWeaponType(  ) {
        return RandomWeaponType.createWeaponType();
    }

    @Override
    public String setElementType() {
        return "Fire";
    }

}
