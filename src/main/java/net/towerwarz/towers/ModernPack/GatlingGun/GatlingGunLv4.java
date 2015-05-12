package net.towerwarz.towers.ModernPack.GatlingGun;

import java.util.Random; //Fixed


public class GatlingGunLv4 {
    public String def = "InfraRed";
    int maxDmg = 8;
    int minDmg = 4;
    Random rand = new Random();
    public int GatlingGunLv4Dmg = rand.nextInt((maxDmg - minDmg) + 1) + minDmg;
    public double GatlingGunLv4SplashRadius = 0.01;
    public double GatlingGunLv4ReloadRate = 0.01;
    public boolean canDetectCamo = true

    int spreadRadius=18;
    
}
