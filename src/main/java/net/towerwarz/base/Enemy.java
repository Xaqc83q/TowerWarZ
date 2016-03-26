package net.towerwarz.base;

/**
 * Created by Way Yan on 3/25/2016.
 */
public abstract class Enemy implements EnemyActions {
    private String def;
    private int mobDataId;
    private int hp;
    private int moveSpeed;
    private Weapon weapon;

    public Enemy() {

    }

    public Enemy(String def, int mobDataId, int hp, int moveSpeed, Weapon weapon) {
        this.def = def;
        this.mobDataId = mobDataId;
        this.hp = hp;
        this.moveSpeed = moveSpeed;
        this.weapon = weapon;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    public int getMobDataId() {
        return mobDataId;
    }

    public void setMobDataId(int mobDataId) {
        this.mobDataId = mobDataId;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void decreaseHp(int amount) {
        this.hp -= amount;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void damaged(Fighter other) {
        decreaseHp(other.getWeapon().getDamage());
    }

    @Override
    public void attack(Fighter other) {
        other.decreaseHp(weapon.getDamage());
    }
}
