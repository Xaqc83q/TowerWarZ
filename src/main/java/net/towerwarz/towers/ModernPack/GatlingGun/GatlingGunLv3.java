package net.towerwarz.towers.ModernPack.GatlingGun;

/**
 * Created by xiurobert on 2/27/2015.
 */

import java.util.Random;

public class GatlingGunLv3 {
    public String def = "MoreBarrels";
    int maxDmg = 8;
    int minDmg = 4;
    Random rand = new Random();
    public int GatlingGunLv3Dmg = rand.nextInt((maxDmg - minDmg) + 1) + minDmg;
    public double GatlingGunLv3SplashRadius = 0.01;
    public double GatlingGunLv3ReloadRate = 0.01;
    public boolean canDetectCamo = false;

    int spreadRadius=18;
}
