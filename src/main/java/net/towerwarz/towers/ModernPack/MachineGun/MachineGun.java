package net.towerwarz.towers.ModernPack.MachineGun;

import net.towerwarz.base.Weapon;
import net.towerwarz.enums.WeaponType;

/**
 * Created by RosoAnna on 20/06/2015.
 */
public class MachineGun extends Weapon {
    public MachineGun() {
        super(WeaponType.MODERN, "insert good description", false);

        setDamage(23);
        setSplashRadius(0);
        setSpreadRadius(0.8);
        setReloadRate(14);
    }

    @Override
    public void levelUp() {
        // Changing the necessary fields
    }
}
