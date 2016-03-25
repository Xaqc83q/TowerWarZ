package net.towerwarz.base;

import net.towerwarz.enums.WeaponType;

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

    public void setType(WeaponType type) {
        this.type = type;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getSplashRadius() {
        return splashRadius;
    }

    public void setSplashRadius(double splashRadius) {
        this.splashRadius = splashRadius;
    }

    public double getSpreadRadius() {
        return spreadRadius;
    }

    public void setSpreadRadius(double spreadRadius) {
        this.spreadRadius = spreadRadius;
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
