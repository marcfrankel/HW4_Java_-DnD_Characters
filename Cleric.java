/**
 * Class representing the sub class of a Cleric character in the game
 * @author mfrankel8
 * @version 1
 */
public class Cleric extends Character {

    /**
     * Main cleric contructor
     * @param  name         Name of cleric
     * @param  level        level of cleric
     * @param  strength     strength of cleric
     * @param  dexterity    dexterity of cleric
     * @param  intelligence intelligence of cleric
     * @param  wisdom       wisdom of cleric
     *
     */
    public Cleric(String name, int level,
                     int strength, int dexterity,
                     int intelligence, int wisdom) {
        super(name, level, strength, dexterity, intelligence, wisdom);
    }

    /**
     * Second cleric contsructor
     * @param  name Name of cleric
     * @param  seed Seed of cleric
     *
     */
    public Cleric(String name, int seed) {
        super(name, seed);
    }

    /**
     * Level up function for cleric
     */
    public void levelUp() {
        setLevel(getLevel() + 1);
        setHealth(getLevel() * 5);
        setStrength(getStrength() + 1);
        setDexterity(getDexterity() + 1);
        setIntelligence(getIntelligence() + 1);
        setWisdom(getWisdom() + 2);
    }

    /**
     * toString function for cleric
     * @return string representation
     */
    public String toString() {
        return String.format("Level %s cleric named %s with %s strength, "
            + "%s dexterity, %s intelligence, and %s wisdom.", getLevel(),
            getName(), getStrength(), getDexterity(), getIntelligence(),
            getWisdom());
    }

    /**
     * Attack function for cleric
     * @param c char to attack
     */
    public void attack(Character c) {
        if (c.getIsDead()) {
            System.out.println("Cannot attack a dead character");
        } else {
            c.setHealth(c.getHealth() - (6 + getWisdom()));
        }
    }

    /**
     * Heal function for cleric
     * @param c char to hear
     */
    public void heal(Character c) {
        if (c.getIsDead()) {
            System.out.println("Cannot heal a dead character");
        } else {
            c.setHealth(c.getHealth() + (6 + getWisdom()));
        }
    }

}