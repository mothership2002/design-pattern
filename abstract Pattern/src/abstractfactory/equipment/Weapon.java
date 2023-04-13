package abstractfactory.equipment;

public class Weapon {

    private final String weaponType;
    private final String element;

    public Weapon( String name, String element ) {
        this.weaponType = name;
        this.element = element;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public String getElement() {
        return element;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append( getElement() )
                .append( " " )
                .append( getWeaponType() )
                .append( "!!!" ).toString();
    }

}
