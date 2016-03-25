package net.towerwarz;


/**
 * Created by Way Yan on 3/25/2016.
 */
public abstract class Weapon {
    private WeaponType type;
    private String def;
    private int level;
    private int damage;

    private double splashRadius;
    private double spreadRadius;
    private double reloadRate;
    private boolean canDetectCamo;

    public Weapon() {

    }

    public Weapon(WeaponType type, String def, boolean canDetectCamo) {
        this.type = type;
        this.def = def;
        this.level = 1;
        this.canDetectCamo = false;
    }


    public WeaponType getType() {
        return type;
    }

    /**
     * Sets the weapon type
     *
     * @param type A type of Weapon defined in WeaponType(Enum)
     */

    public void setType(WeaponType type) {
        this.type = type;
    }

    public String getDef() {
        return def;
    }

    /**
     * Sets the description of a weapon/mob
     *
     * @param def String of what to make the definition
     */

    public void setDef(String def) {
        this.def = def;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDamage() {
        return damage;
    }

    /**
     * Sets the damage value of a weapon in Damage per second
     *
     * @param damage Integer, Damage per second
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }


    public double getSplashRadius() {
        return splashRadius;
    }

    /**
     * Set a radius for splash damage to occur
     *
     *
     * @param splashRadius How much splash damage will be dealt (factorised)
     */

    public void setSplashRadius(double splashRadius) {
        this.splashRadius = splashRadius;
    }

    public double getSpreadRadius() {
        return spreadRadius;
    }

    /**
     * Sets a radius for spreading of projectiles/bullets
     *
     * @param spreadRadius How much spread you want (from 0.00 to 1.00)
     */

    public void setSpreadRadius(double spreadRadius) {
        if (spreadRadius < 1.00 && spreadRadius > 0.00) {
            this.spreadRadius = spreadRadius;
        }
    }

    public double getReloadRate() {
        return reloadRate;
    }

    public void setReloadRate(double reloadRate) {
        this.reloadRate = reloadRate;
    }

    public boolean isCanDetectCamo() {
        return canDetectCamo;
    }

    public void setCanDetectCamo(boolean canDetectCamo) {
        this.canDetectCamo = canDetectCamo;
    }

    public abstract void levelUp();
}
