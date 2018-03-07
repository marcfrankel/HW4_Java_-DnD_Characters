import java.util.Random;


/**
 * Class representing the base character in the game
 * @author mfrankel8
 * @version 1
 */
public abstract class Character {
    private String name;
    private int level;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int health;
    private boolean isDead = false;


    /**
     * Character contructor that only takes two params
     * @param  name Name of character
     * @param  seed random seed to generate the character
     *
     */
    public Character(String name, int seed) {
        Random generator = new Random(seed);
        this.name = name;
        this.level = 1;
        this.strength = generator.nextInt(6) + 1;
        this.dexterity = generator.nextInt(6) + 1;
        this.intelligence = generator.nextInt(6) + 1;
        this.wisdom = generator.nextInt(6) + 1;
    }

    /**
     * Character contructor that takes takes 6 params
     * @param  name         Name of character
     * @param  level        what level to make the character
     * @param  strength     what strength should they have
     * @param  dexterity    what dexterity should they have
     * @param  intelligence what level of intelligence should they have
     * @param  wisdom       What level of wisdom should the character have
     *
     */
    public Character(String name, int level,
                     int strength, int dexterity,
                     int intelligence, int wisdom) {
        this.name = name;
        this.level = level;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        setHealth(level * 5);

    }

    /**
     * Getter for character's name
     * @return char's name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for char's level
     * @return char's level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Setter for char's leverl
     * @param level what new level the char should be set too
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Getter for strength atrribute
     * @return char's stregnth
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Setter for char's strength
     * @param strength new level to set char's strength to
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Getter for dexterity
     * @return Char's dexterity
     */
    public int getDexterity() {
        return dexterity;
    }

    /**
     * Setter for char's dexterity
     * @param dexterity new level of dexterity
     */
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    /**
     * Getter for intelligence
     * @return Char's intelligence
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * Setter for char's intelligence
     * @param intelligence new level of intelligence
     */
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    /**
     * Getter for wisdom
     * @return Char's wisdom
     */
    public int getWisdom() {
        return wisdom;
    }

    /**
     * Setter for char's wisdom
     * @param wisdom new level of wisdom
     */
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    /**
     * Getter for char's health
     * @return returns char's health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Setter for char's health
     * @param health new amount for char's health
     */
    public void setHealth(int health) {
        if (health > level * 5) {
            this.health = level * 5;
        } else if (health < 0) {
            this.health = 0;
            setIsDead(true);
        } else {
            this.health = health;
        }
    }

    /**
     * Getter for isDead
     * @return returns current state of isDead
     */
    public boolean getIsDead() {
        return isDead;
    }

    /**
     * Setter for isDead
     * @param isDead true/false is char dead
     */
    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }

    /**
     * Abstract function to level char up
     */
    public abstract void levelUp();

    /**
     * Abstract function to attack another char
     * @param c other char
     */
    public abstract void attack(Character c);

    /**
     * Override for toString method
     * @return String to print
     */
    public abstract String toString();

}
