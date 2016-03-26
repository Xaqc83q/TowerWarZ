package net.towerwarz.mobs.Fighters;



import net.towerwarz.base.Enemy;
import net.towerwarz.base.Fighter;
import net.towerwarz.base.Weapon;
import net.towerwarz.towers.GatlingGun.GatlingGun;


public class Soldier extends Fighter {
    private Weapon weapon;

    public Soldier() {
        super("Your Average Joe' combatant", 1, 10, 16, new GatlingGun());
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
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
