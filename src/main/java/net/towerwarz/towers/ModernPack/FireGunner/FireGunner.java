package net.towerwarz.towers.ModernPack.FireGunner;

import net.towerwarz.base.Weapon;
import net.towerwarz.enums.WeaponType;

/**
 * TowerWarZ
 * Created by xiurobert on 2/14/2016.
 */

public class FireGunner extends Weapon {
    public FireGunner() {
        //TODO change fields accordingly
        super(WeaponType.MODERN, "What do you expect? A nuke straight off the bat?", false);

        setDamage(34);
        setSplashRadius(0.7);
        setSpreadRadius(0.46);
        setReloadRate(0.2);
    }

    @Override
    public void levelUp() {
        // Changing the necessary fields
    }
}
