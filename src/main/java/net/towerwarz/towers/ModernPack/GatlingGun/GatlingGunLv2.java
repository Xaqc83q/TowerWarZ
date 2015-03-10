package net.towerwarz.towers.GatlingGun;

/**
 * Created by xiurobert on 2/27/2015.
 */

import java.util.Random;

public class GatlingGunLv2 {
    public String def = "Refined Barrel Machine Gun";
    public int GatlingGunLv2TotalCost = 40;
    public int GatlingGunLv2UpgradeCost = 30;

    //Dang you -> Random
    //Set max and min
    int maxDmg = 10;
    int minDmg = 4;
    //Create Random
    Random rand = new Random();
    public int GatlingGunLv2Dmg = rand.nextInt((maxDmg - minDmg) + 1) + minDmg;
    public double GatlingGunLv2SplashRadius = 0.01;
    public double GatlingGunLv2ReloadRate = 0.05;

   public int GatlingGunlv2SpreadRadius=18

}
