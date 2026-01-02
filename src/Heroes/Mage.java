package heroes;
import character.Character;
public class Mage extends Character{

    public Mage(String name, int health, int power, int stdAttackDamage, int stdAttackPowerCost, int specialMovePowerCost, int specialEffectDamage){
       super(name, health, power, stdAttackDamage, stdAttackPowerCost, specialMovePowerCost, specialEffectDamage);
    }

    @Override
    public void setSpecialMove(String spMove){
        super.setSpecialMove(spMove);
    }
    
}