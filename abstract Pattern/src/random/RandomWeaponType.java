package random;

public class RandomWeaponType {

    public static String createWeaponType() {
        int randomNumber = ( int ) Math.ceil( Math.random() * 5 ) + 1;

        switch ( randomNumber ) {
            case 1:
                return "sword";
            case 2:
                return "spear";
            case 3:
                return "bow";
            case 4:
                return "gun";
            case 5:
                return "axe";
            default:
                return "mace";
        }
    }

}
