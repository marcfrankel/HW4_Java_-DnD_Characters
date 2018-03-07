/**
 * Class representing the sub class of a fighting character in the game
 * @author mfrankel8
 * @version 1
 */
public class Fighter extends Character {

    /**
     * Fighter contructor that takes full params
     * @param  name         Name of fighter
     * @param  level        Level of fighter
     * @param  strength     strenth of fighter
     * @param  dexterity    dexterity of fighter
     * @param  intelligence intelligence of fighter
     * @param  wisdom       wisdom of fighter
     *
     */
    public Fighter(String name, int level,
                     int strength, int dexterity,
                     int intelligence, int wisdom) {
        super(name, level, strength, dexterity, intelligence, wisdom);
    }

    /**
     * Fighter constructor for min params
     * @param  name Name of fighter
     * @param  seed seed to generate other levels
     *
     */
    public Fighter(String name, int seed) {
        super(name, seed);
    }

    /**
     * level up function for the fighter class
     */
    public void levelUp() {
        setLevel(getLevel() + 1);
        setHealth(getLevel() * 5);
        setStrength(getStrength() + 2);
        setDexterity(getDexterity() + 1);
        setIntelligence(getIntelligence() + 1);
        setWisdom(getWisdom() + 1);
    }

    /**
     * toString function for a fighter object
     * @return String representation
     */
    public String toString() {
        return String.format("Level %s fighter named %s with %s strength, "
            + "%s dexterity, %s intelligence, and %s wisdom.", getLevel(),
            getName(), getStrength(), getDexterity(), getIntelligence(),
            getWisdom());
    }

    /**
     * Attach function of fighter
     * @param c character to attack
     */
    public void attack(Character c) {
        if (c.getIsDead()) {
            System.out.println("Cannot attack a dead character");
        } else {
            c.setHealth(c.getHealth() - (10 + getStrength()));
        }
    }
}