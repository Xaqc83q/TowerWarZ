package net.towerwarz.base;

/**
 * Created by Way Yan on 3/26/2016.
 */
public interface EnemyActions {
    public void damaged(Fighter other);
    public void attack(Fighter other);
    public void dodge(Fighter other);
    public void escape(Fighter other);
    public void die();
}
