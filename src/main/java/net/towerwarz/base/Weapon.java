package net.towerwarz.base;

<<<<<<< HEAD:src/main/java/net/towerwarz/base/Weapon.java
import net.towerwarz.enums.WeaponType;
=======
>>>>>>> master:src/main/java/net/towerwarz/Weapon.java

/**
 * Created by Way Yan on 3/25/2016.
 */
public abstract class Weapon {
    private WeaponType type;
    private String def;

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

<<<<<<< HEAD:src/main/java/net/towerwarz/base/Weapon.java
    public double getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
=======
>>>>>>> master:src/main/java/net/towerwarz/Weapon.java

    public double getDamage() {
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
     * @param splashRadius How much splash damage will be dealt (factorised) (max: 4)
     */

    public void setSplashRadius(double splashRadius) {
        if (splashRadius < 4.00 && splashRadius > 0.00) {
            this.splashRadius = splashRadius;
        }
    }

    public double getSpreadRadius() {
        return spreadRadius;
    }

<<<<<<< HEAD:src/main/java/net/towerwarz/base/Weapon.java
    public void setSpreadRadius(double spreadRadius) {
        this.spreadRadius = spreadRadius;
=======
    /**
     * Sets a radius for spreading of projectiles/bullets
     *
     * @param spreadRadius How much spread you want (from 0.00 to 1.00)
     */

    public void setSpreadRadius(double spreadRadius) {
        if (spreadRadius < 1.00 && spreadRadius > 0.00) {
            this.spreadRadius = spreadRadius;
        }
>>>>>>> master:src/main/java/net/towerwarz/Weapon.java
    }

    /**
     * Gets the reload rate
     * @return Rate of reloading
     *
     */
    public double getReloadRate() {
        return reloadRate;
    }

    /**
     * Sets the reload rate
     * @param reloadRate a double between 0.01 and 30.00
     */

    public void setReloadRate(double reloadRate) {
        if (reloadRate > 0.01 && reloadRate < 30.00) {
            this.reloadRate = reloadRate;
        }

    }

    public boolean isCanDetectCamo() {
        return canDetectCamo;
    }

    /**
     * Allow camo detection
     * @param canDetectCamo true/false
     */

    public void setCanDetectCamo(boolean canDetectCamo) {
        this.canDetectCamo = canDetectCamo;
    }

    public abstract void levelUp();
}
