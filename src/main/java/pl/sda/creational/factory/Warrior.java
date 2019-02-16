package pl.sda.creational.factory;

public class Warrior {
    private final String nickname;
    private int lvl;
    private Profession profession;
    private Weapon weapon;

    public Warrior(String nickname, int lvl, Profession profession) {
        this.nickname = nickname;
        this.lvl = lvl;
        this.profession = profession;
    }

    public void changeProfession(Profession newProfession) {
    }
}
