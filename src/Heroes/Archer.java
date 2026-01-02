package heroes;
import character.Character;
public class Archer extends Character{

    public Archer(String name, int health, int power, int stdAttackDamage, int stdAttackPowerCost, int specialMovePowerCost, int specialEffect, int specialEffectDamagePro, int specialMovePowerCostPro){
       super(name, health, power, stdAttackDamage, stdAttackPowerCost, specialMovePowerCost, specialEffect, specialEffectDamagePro, specialMovePowerCostPro);
    }

    @Override
    public void setSpecialMove(String spMove){
        super.setSpecialMove(spMove);
    }
}