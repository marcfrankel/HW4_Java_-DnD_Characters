/**
 * Class representing the sub class of a Wizard character in the game
 * @author mfrankel8
 * @version 1
 */
public class Wizard extends Character {

    /**
     * Main wizard constructor
     * @param  name         Name of Wizard
     * @param  level        Level of wizard
     * @param  strength     Stength of wizard
     * @param  dexterity    Dexterity of wizard
     * @param  intelligence Intelligence of wizard
     * @param  wisdom       Wisdom of wizard
     *
     */
    public Wizard(String name, int level,
                     int strength, int dexterity,
                     int intelligence, int wisdom) {
        super(name, level, strength, dexterity, intelligence, wisdom);
    }

    /**
     * Second Wizard constructor
     * @param  name Name of wizard
     * @param  seed Random seed for wizard
     *
     */
    public Wizard(String name, int seed) {
        super(name, seed);
    }

    /**
     * Level up function for Wizard
     */
    public void levelUp() {
        setLevel(getLevel() + 1);
        setHealth(getLevel() * 5);
        setStrength(getStrength() + 1);
        setDexterity(getDexterity() + 1);
        setIntelligence(getIntelligence() + 2);
        setWisdom(getWisdom() + 1);
    }

    /**
     * toString function for Rogue
     * @return string representation
     */
    public String toString() {
        return String.format("Level %s wizard named %s with %s strength, "
            + "%s dexterity, %s intelligence, and %s wisdom.", getLevel(),
            getName(), getStrength(), getDexterity(), getIntelligence(),
            getWisdom());
    }

    /**
     * MultiAttack function for rogue
     * @param c chars to attack
     */
    public void multiAttack(Character ... c) {
        for (Character target: c) {
            if (target.getIsDead()) {
                System.out.println("Cannot attack a dead character");
            } else {
                target.setHealth(target.getHealth() - (2 + getIntelligence()));
            }
        }
    }

    /**
     * Attack function for Wizard
     * @param c char to attack
     */
    public void attack(Character c) {
        if (c.getIsDead()) {
            System.out.println("Cannot attack a dead character");
        } else {
            c.setHealth(c.getHealth() - (4 + getIntelligence()));
        }
    }
}