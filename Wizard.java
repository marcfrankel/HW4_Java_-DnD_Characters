public class Wizard extends Character {
    public Wizard(String name, int level,
                     int strength, int dexterity,
                     int intelligence, int wisdom) {
        super(name, level, strength, dexterity, intelligence, wisdom);
    }

    public Wizard(String name, int seed) {
        super(name, seed);
    }

    public void levelUp() {
        setLevel(getLevel() + 1);
        setHealth(getLevel() * 5);
        setStrength(getStrength() + 1);
        setDexterity(getDexterity() + 1);
        setIntelligence(getIntelligence() + 2);
        setWisdom(getWisdom() + 1);
    }

    public String toString() {
        return String.format("Level %s wizard named %s with %s strength, " +
         "%s dexterity, %s intelligence, and %s wisdom.", getLevel(), getName(),
         getStrength(), getDexterity(), getIntelligence(), getWisdom());
    }

    public void multiAttack(Character ... c) {
        for (Character target: c) {
            if (target.getIsDead()) {
                System.out.println("Cannot attack a dead character");
            } else {
                target.setHealth(target.getHealth() - (2 + getIntelligence()));
            }
        }
    }

    public void attack(Character c) {
        if (c.getIsDead()) {
            System.out.println("Cannot attack a dead character");
        } else {
            c.setHealth(c.getHealth() - (4 + getIntelligence()));
        }
    }
}