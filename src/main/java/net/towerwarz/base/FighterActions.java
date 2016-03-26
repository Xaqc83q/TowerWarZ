package net.towerwarz.base;

/**
 * Created by Way Yan on 3/26/2016.
 */
public interface FighterActions {
    public void damaged(Enemy other);
    public void attack(Enemy other);
    public void dodge(Enemy other);
    public void escape(Enemy other);
    public void die();
}
