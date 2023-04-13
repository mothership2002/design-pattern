package abstractfactory;

import abstractfactory.implement.FireWeaponFactory;
import abstractfactory.implement.IceWeaponFactory;
import abstractfactory.implement.ThunderWeaponFactory;

public class WeaponMaker {

    public static void main( String[] args ) {
        EquipmentFactory fireWeaponFactory = new FireWeaponFactory();
        EquipmentFactory iceWeaponFactory = new IceWeaponFactory();
        EquipmentFactory thunderWeaponFactory = new ThunderWeaponFactory();

        System.out.println(fireWeaponFactory.createWeapon().toString());
        System.out.println(iceWeaponFactory.createWeapon().toString());
        System.out.println(thunderWeaponFactory.createWeapon().toString());
    }

}
