/**
 * Class representing the sub class of a Rogue character in the game
 * @author mfrankel8
 * @version 1
 */
public class Rogue extends Character {

    /**
     * Main contructor for Rogue type
     * @param  name         Name of Rogue
     * @param  level        Level to set Rogue
     * @param  strength     Strength of Rogue
     * @param  dexterity    Dexterity of Rogue
     * @param  intelligence Intelligence of Rogue
     * @param  wisdom       Wisom of Rogue
     *
     */
    public Rogue(String name, int level,
                     int strength, int dexterity,
                     int intelligence, int wisdom) {
        super(name, level, strength, dexterity, intelligence, wisdom);
    }

    /**
     * Second Rogue contructor
     * @param  name Name of rogue
     * @param  seed Random seed
     *
     */
    public Rogue(String name, int seed) {
        super(name, seed);
    }

    /**
     * Level up function
     */
    public void levelUp() {
        setLevel(getLevel() + 1);
        setHealth(getLevel() * 5);
        setStrength(getStrength() + 2);
        setDexterity(getDexterity() + 3);
        setIntelligence(getIntelligence() + 2);
        setWisdom(getWisdom() + 2);
    }

    /**
     * toString function for Rogue
     * @return string representation
     */
    public String toString() {
        return String.format("Level %s rogue named %s with %s strength, "
            + "%s dexterity, %s intelligence, and %s wisdom.", getLevel(),
            getName(), getStrength(), getDexterity(), getIntelligence(),
            getWisdom());
    }

    /**
     * Rouge Attack function
     * @param c character to attack
     */
    public void attack(Character c) {
        if (c.getIsDead()) {
            System.out.println("Cannot attack a dead character");
        } else {
            c.setHealth(c.getHealth() - (6 + getDexterity()));
        }
    }
}