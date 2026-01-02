package heroes;
import character.Character;
public class Warrior extends Character{

    public Warrior(String name, int health, int power, int stdAttackDamage, int stdAttackPowerCost, int specialMovePowerCost, int specialEffect){
       super(name, health, power, stdAttackDamage, stdAttackPowerCost, specialMovePowerCost, specialEffect);
    }

    @Override
    public void setSpecialMove(String spMove){
        super.setSpecialMove(spMove);
    }
}