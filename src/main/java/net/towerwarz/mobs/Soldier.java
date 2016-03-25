package net.towerwarz.mobs;


import net.towerwarz.MobStatus;
import net.towerwarz.Weapon;
import net.towerwarz.towers.GatlingGun.GatlingGun;

public class Soldier extends Fighter {
    private Weapon weapon;

    public Soldier() {
        super("Your Average Joe' combatant", 1, 10, 16);
        setWeapon(new GatlingGun());
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public MobStatus attack(Enemy other) {
        // Attack enemy
        return null;
    }
}
