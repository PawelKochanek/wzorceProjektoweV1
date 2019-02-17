package pl.sda.creational.factory;

public class WeaponFactory {
    public static Weapon create(Profession newProfession, int demage){

        switch(newProfession){

            case ARCHER:
                return new Bow(demage);

            case WIZARD:
                return new Wand(demage);

            case SWORDSMAN:
                return new Sword(demage);

            default:
                throw new IllegalArgumentException("Worrior not exists");
        }
    }
}
