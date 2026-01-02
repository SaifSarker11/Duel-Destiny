package character;
public class Character {
    protected String name;
    protected int health;
    protected int power;
    protected int stdAttackDamage;
    protected int stdAttackPowerCost;
    protected int specialMovePowerCost;
    protected int specialEffectDamage;
    public String specialMoveName = "specialmove";
    protected int specialMovePowerCostPro;
    protected int specialEffectDamagePro;
    
    public Character(String name, int health, int power, int stdAttackDamage, int stdAttackPowerCost, int specialMovePowerCost, int specialEffectDamage) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.stdAttackDamage = stdAttackDamage;
        this.stdAttackPowerCost = stdAttackPowerCost;
        this.specialMovePowerCost = specialMovePowerCost;
        this.specialEffectDamage = specialEffectDamage;
    }

    public Character(String name, int health, int power, int stdAttackDamage, int stdAttackPowerCost, int specialMovePowerCost, int specialEffectDamage, int specialMovePowerCostPro, int specialEffectDamagePro) {
        this(name, health, power, stdAttackDamage, stdAttackPowerCost, specialMovePowerCost, specialEffectDamage);
        this.specialMovePowerCostPro = specialMovePowerCostPro;
        this.specialEffectDamagePro = specialEffectDamagePro;
    }
    
    public int remainingHealthStd(int stdAttackDamage) {
        return health -= stdAttackDamage;
    }

    public int remainingHealthSpecial(int specialEffectDamage) {
        return health -= specialEffectDamage;
    }

    public int remainingPowerStd() {
        return power -= stdAttackPowerCost;
    }

    public int remainingPowerSpecial() {
        return power -= specialMovePowerCost;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void setSpecialMove(String specialMoveName) {
        this.specialMoveName = specialMoveName;
        System.out.printf("%s Used %s %n", this.getName(), specialMoveName);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStdAttackDamage() {
        return this.stdAttackDamage;
    }

    public void setStdAttackDamage(int stdAttackDamage) {
        this.stdAttackDamage = stdAttackDamage;
    }

    public int getStdAttackPowerCost() {
        return this.stdAttackPowerCost;
    }

    public void setStdAttackPowerCost(int stdAttackPowerCost) {
        this.stdAttackPowerCost = stdAttackPowerCost;
    }

    public int getSpecialMovePowerCost() {
        return this.specialMovePowerCost;
    }

    public void setSpecialMovePowerCost(int specialMovePowerCost) {
        this.specialMovePowerCost = specialMovePowerCost;
    }

    public int getSpecialEffect() {
        return this.specialEffectDamage;
    }

    public void setSpecialEffect(int specialEffectDamage) {
        this.specialEffectDamage = specialEffectDamage;
    }

    public int getSpecialMovePowerCostPro() {
        return this.specialMovePowerCostPro;
    }

    public void setSpecialMovePowerCostPro(int specialMovePowerCostPro) {
        this.specialMovePowerCostPro = specialMovePowerCostPro;
    }

    public int getSpecialEffectDamagePro() {
        return this.specialEffectDamagePro;
    }

    public void setSpecialEffectDamagePro(int specialEffectDamagePro) {
        this.specialEffectDamagePro = specialEffectDamagePro;
    }

    public int getHealth() {
        return this.health;
    }

    public int getPower() {
        return this.power;
    }
}
