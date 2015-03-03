package net.towerwarz.guns;

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
    public String def = "";

    public int GatlingGunLv1TotalCost = 10;

    public int GatlingGunLv1Cost = 10;

    //Set max and min
    int max = 5;
    int min = 1;
    //Gen random number between 1 and 5
    Random rand  = new Random();
    int randomnum = rand.nextInt((max - min) + 1) + min;
    // create Damage
    public int GatlingGunLv1Dmg = randomnum;
    /*do you got a range for this? 
     * Yup (Reply)
     * look at the max - min (Thats the range)
     */

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
     */
    public double GatlingGunLv1ReloadRate = 0.05;


    /*
    Error: GatlingMissRate: Please convert to percentage!!! It is simpler!!
     */

    //I'm just converting it to %

    //0.1 is 10%
    //0.2 is 20%
    // Note we ommit the % sign

    //Gen randomnumber
    Random GatlingLv1Miss = new Random();
    int Lv1Miss = GatlingLv1Miss.nextInt((20 - 10) + 1) + 10;

    public int GatlingGunLv1MissRate = Lv1Miss;
}
