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

    //Set max and min
    int max = 5;
    int min = 1;
    //Gen random number between 1 and 5
    Random rand  = new Random();
    int randomnum = rand.nextInt((max - min) + 1) + min;  // Note that we are deprecating this soon
    // create Damage
    public int GatlingGunLv1Dmg = randomnum;

    //Note: Double is an floating-point number
    public double GatlingGunLv1SplashRadius=0.01;
    /*
    Besides double, there is also float.
    However, use double because it is more accurate
    double something = 20.23;
    when print(something);
    you get 20.23

    However, float somethingelse = 20.23;
    when print(somethingelse);
    you get 20.25
    because it will round off


    Actually, why am I teaching you java????
     */
    public double GatlingGunLv1ReloadRate = 0.05;
    public boolean canDetectCamo = false;


    /*
    Error: GatlingMissRate: Please convert to percentage!!! It is simpler!!
     */

    //I'm just converting it to %

    //0.1 is 10%
    //0.2 is 20%
    // Note we ommit the % sign

    //Gen randomnumber
    public int GatlingGunLv1SpreadRadius=18;
}
