package CounterStriker.src.CounterStriker.models.players;

import CounterStriker.src.CounterStriker.common.DataValidator;
import CounterStriker.src.CounterStriker.models.guns.Gun;

import static CounterStriker.src.CounterStriker.common.ExceptionMessages.*;

public class PlayerImpl implements Player{

    private String username;
    private int health;
    private int armor;
    private boolean isAlive;
    private Gun gun;

    private static final int ZERO_HEALTH = 0;

    protected PlayerImpl(String username, int health, int armor, Gun gun) {
        this.setUsername(username);
        this.setHealth(health);
        this.setArmor(armor);
        this.setGun(gun);
    }

    private void setGun(Gun gun) {
        DataValidator.validateGun(gun, INVALID_GUN);
        this.gun = gun;
    }

    private void setArmor(int armor) {
        DataValidator.validateInt(armor, INVALID_PLAYER_ARMOR);
        this.armor = armor;
    }

    private void setHealth(int health) {
        DataValidator.validateInt(health, INVALID_PLAYER_HEALTH);
        this.health = health;
    }

    private void setUsername(String username) {
        DataValidator.validateString(username,INVALID_PLAYER_NAME);
        this.username = username;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public int getArmor() {
        return this.armor;
    }

    @Override
    public Gun getGun() {
        return this.gun;
    }

    @Override
    public boolean isAlive() {
        this.isAlive = health > ZERO_HEALTH;
        return isAlive;
    }

    @Override
    public void takeDamage(int points) {
        int damage = points;

        if (damage >= this.getArmor()) {
            damage -= this.getArmor();
            this.armor = ZERO_HEALTH;
            this.health -= damage;
        } else {
            this.armor -= damage;
        }

        if (this.health < ZERO_HEALTH) {
            this.health = ZERO_HEALTH;
        }
    }
}
