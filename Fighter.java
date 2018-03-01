public class Fighter extends Character {

    public Fighter(String name, int level,
                     int strength, int dexterity,
                     int intelligence, int wisdom) {
        super(name, level, strength, dexterity, intelligence, wisdom);
    }

    public Fighter(String name, int seed) {
        super(name, seed);
    }

    public void levelUp() {
        setLevel(getLevel() + 1);
        setHealth(getLevel() * 5);
        setStrength(getStrength() + 2);
        setDexterity(getDexterity() + 1);
        setIntelligence(getIntelligence() + 1);
        setWisdom(getWisdom() + 1);
    }

    public String toString() {
        return String.format("Level %s fighter named %s with %s strength, "
            + "%s dexterity, %s intelligence, and %s wisdom.", getLevel(),
            getName(), getStrength(), getDexterity(), getIntelligence(),
            getWisdom());
    }

    public void attack(Character c) {
        if (c.getIsDead()) {
            System.out.println("Cannot attack a dead character");
        } else {
            c.setHealth(c.getHealth() - (10 + getStrength()));
        }
    }
}