package net.towerwarz.towers.FireGunner;

import net.towerwarz.base.Weapon;
import net.towerwarz.enums.WeaponType;

/**
 * TowerWarZ
 * Created by xiurobert on 2/14/2016.
 */

public class FireGunner extends Weapon {
    public FireGunner() {
        super(WeaponType.MODERN, "Man's greatest invention just got a whole lot more dangerous.", false);

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
