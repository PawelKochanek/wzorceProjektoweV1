package pl.sda.creational.factory;

public class Warrior {
    private final String nickname;
    private int lvl;
    private Profession profession;
    private Weapon weapon;
    private WeaponFactory weaponFactory;

    public Warrior(String nickname, int lvl, Profession profession) {
        this.nickname = nickname;
        this.lvl = lvl;
        weaponFactory = new WeaponFactory();
        changeProfession(profession);
    }

    public void changeProfession(Profession newProfession) {
        profession = newProfession;
        weapon = weaponFactory.create(profession, 80);
    }
}
