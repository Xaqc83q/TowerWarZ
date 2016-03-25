package net.towerwarz.mobs;



import net.towerwarz.base.Enemy;
import net.towerwarz.base.Fighter;
import net.towerwarz.base.Weapon;
import net.towerwarz.towers.GatlingGun.GatlingGun;

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
    public void attack(Enemy other) {
        // Attack enemy
    }

    @Override
    public void dodge(Enemy other) {
        // Dodge enemy
    }

    @Override
    public void escape(Enemy other) {
        // Escape enemy
    }

    @Override
    public void die() {
        // What happens when fighter dies (Drops stuff, explodes etc.)
    }
}
