package evilspirits;
import character.Character;
public class CorruptedMortal extends Character{

    public CorruptedMortal(String name, int health, int power, int stdAttackDamage, int stdAttackPowerCost, int specialMovePowerCost, int specialEffect){
       super(name, health, power, stdAttackDamage, stdAttackPowerCost, specialMovePowerCost, specialEffect);
    }

    @Override
    public void setSpecialMove(String spMove){
        super.setSpecialMove(spMove);
    }
}