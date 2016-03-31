package net.towerwarz.towers.MachineGun;

import net.towerwarz.base.Weapon;
import net.towerwarz.enums.WeaponType;

/**
 * Created by RosoAnna on 20/06/2015.
 */
public class MachineGun extends Weapon {
    public MachineGun() {
        super(WeaponType.MODERN, "Non stop splitting", false);

        setDamage(23);
        setSplashRadius(0);
        setSpreadRadius(0.8);
        setReloadRate(14);
    }

    @Override
    public void levelUp() {
        increaseDamage(1.75f);
        increaseSplashRadius(1.75f);
        increaseSpreadRadius(1.75f);
        increaseReloadRate(0.5f);
        increaseLevel();
    }
}
