import java.util.Random;

public abstract class Character {
    private String name;
    private int level;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int health;
    private boolean isDead = false;

    public Character(String name, int seed) {
        Random generator = new Random(seed);
        this.name = name;
        this.level = 1;
        this.strength = generator.nextInt(6) + 1;
        this.dexterity = generator.nextInt(6) + 1;
        this.intelligence = generator.nextInt(6) + 1;
        this.wisdom = generator.nextInt(6) + 1;
    }

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

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health > level * 5) {
            this.health = level * 5;
        } else {
            this.health = health;
        }
    }

    public boolean getIsDead() {
        return isDead;
    }

    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }

    public abstract void levelUp();

    public abstract void attack(Character c);

    public abstract String toString();

}
