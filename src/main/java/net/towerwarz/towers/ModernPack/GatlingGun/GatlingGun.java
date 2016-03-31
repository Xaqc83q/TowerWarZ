package net.towerwarz.towers.ModernPack.GatlingGun;

/**
 * Created by xiurobert on 2/27/2015
 * Created with IntelliJ IDEA 14.0.3
 */

import net.towerwarz.enums.WeaponType;
import net.towerwarz.base.Weapon;

public class GatlingGun extends Weapon {
    public GatlingGun() {
        super(WeaponType.MODERN, "What do you expect? A nuke straight off the bat?", false);

        setDamage(1);
        setSplashRadius(0.01);
        setSpreadRadius(2);
        setReloadRate(0.02);
    }

    @Override
    public void levelUp() {
        increaseDamage(1.2f);
        increaseSplashRadius(1.2f);
        increaseSpreadRadius(1.2f);
        increaseReloadRate(0.9f);
    }
}