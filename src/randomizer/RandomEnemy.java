package randomizer;
import character.Character;
import evilspirits.*;
import java.util.Random;
public class RandomEnemy{
    public static Character darkOverLord = new DarkOverlord("DarkOverLord", 200, 150, 25, 17, 40, 50);
    public static Character regionalWarLord = new RegionalWarlord("RegionalWarLord", 130, 110, 20, 10, 35, 30);
    public static Character corruptedMortal = new CorruptedMortal("CorruptedMortal", 90, 90, 18, 9, 20, 25);
    
    static Random random = new Random();

    public static void evilInvade(Character hero, Character enemy, String customName) {
        boolean useDSpecial = random.nextBoolean();
        if(useDSpecial) {
            System.out.println("\n");
            if(enemy instanceof DarkOverlord) {
                System.out.println(enemy.getName() + " used Special on " + hero.getName());
                System.out.println(enemy.getName() + " caused " + enemy.getSpecialEffect() + " damage");
                hero.remainingHealthSpecial(enemy.getSpecialEffect());
                hero.setSpecialEffect(hero.getSpecialEffect() / 2);
                hero.setStdAttackDamage(hero.getStdAttackDamage() / 2);
                System.out.println("\n------------Game Stats------------");
                System.out.println(enemy.getName() + " - Health: " + enemy.getHealth() + ", Power: " + enemy.getPower());
                System.out.println(customName + " - Health: " + hero.getHealth() + ", Power: " + hero.getPower());
            } else if(enemy instanceof RegionalWarlord) {
                System.out.println(enemy.getName() + " used Special on " + hero.getName());
                System.out.println(enemy.getName() + " freezes " + hero.getName() + " for 20 seconds");
                System.out.println(enemy.getName() + " caused " + enemy.getSpecialEffect() + " damage");
                hero.remainingHealthStd(enemy.getSpecialEffect());
                System.out.println("\n------------Game Stats------------");
                System.out.println(enemy.getName() + " - Health: " + enemy.getHealth() + ", Power: " + enemy.getPower());
                System.out.println(customName + " - Health: " + hero.getHealth() + ", Power: " + hero.getPower());
            } else {
                System.out.println(enemy.getName() + " used Special on " + hero.getName());
                System.out.println(enemy.getName() + " caused " + enemy.getSpecialEffect() + " damage");
                hero.remainingHealthSpecial(enemy.getSpecialEffect());
                System.out.println("\n------------Game Stats------------");
                System.out.println(enemy.getName() + " - Health: " + enemy.getHealth() + ", Power: " + enemy.getPower());
                System.out.println(customName + " - Health: " + hero.getHealth() + ", Power: " + hero.getPower());
            }
        }

        else {
            System.out.println("\n");
            System.out.println(enemy.getName() + " used Attack on " + hero.getName());
            hero.remainingHealthStd(enemy.getStdAttackDamage());
            System.out.println("\n------------Game Stats------------");
            System.out.println(enemy.getName() + " - Health: " + enemy.getHealth() + ", Power: " + enemy.getPower());
            System.out.println(customName + " - Health: " + hero.getHealth() + ", Power: " + hero.getPower());
        }
    }
}
