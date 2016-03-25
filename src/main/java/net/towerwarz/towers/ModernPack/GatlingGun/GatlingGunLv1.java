package net.towerwarz.towers.ModernPack.GatlingGun;

/**
 * Created by xiurobert on 2/27/2015
 * Created with IntelliJ IDEA 14.0.3
 */

/*
Remember your Semicolons!
Remember to capitalise!
 */

import java.util.Random;

public class GatlingGunLv1 {
    public String def = "What do you expect? A nuke straight off the bat?";

    public int GatlingGunLv1TotalCost = 100;

    public int GatlingGunLv1Cost = 100;


    int max = 5;
    int min = 1;

    Random rand = new Random();
    int randomnum = rand.nextInt((max - min) + 1) + min;  // Note that we are deprecating this soon

    public int GatlingGunLv1Dmg = randomnum;


    public double GatlingGunLv1SplashRadius = 0.01;

    public double GatlingGunLv1ReloadRate = 0.05;
    public boolean canDetectCamo = false;

    public int GatlingGunLv1SpreadRadius = 18;
}
