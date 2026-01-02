package gameengine;
import character.Character;
import evilspirits.*;
import heroes.*;
import java.util.Scanner;
import randomizer.RandomEnemy;
public class GameStats {
    public static Character mage = new Mage("Mage", 80, 100, 20, 10, 30, 40);
    public static Character archer = new Archer("Archer", 100, 100, 15, 8, 25, 30, 50, 60);
    public static Character warrior = new Warrior("Warrior", 120, 100, 12, 5, 35, 35);
    public static Character darkOverLord = new DarkOverlord("DarkOverLord", 200, 150, 25, 17, 40, 50);
    public static Character regionalWarLord = new RegionalWarlord("RegionalWarLord", 130, 110, 20, 10, 35, 30);
    public static Character corruptedMortal = new CorruptedMortal("CorruptedMortal", 90, 90, 18, 9, 20, 25);
    public static void main(String[] args) {

        try (Scanner myScanner = new Scanner(System.in)) {
            Character heroName = null;

            while(heroName == null) {
                System.out.println("Choose a character: \n 1. Mage \n 2. Archer \n 3. Warrior\n");
                String choice = myScanner.nextLine().trim();

                switch (choice) {
                    case "> 1", ">1" -> {
                        heroName = mage;
                        System.out.println("\nYou've chosen " + heroName.getName());
                    }
                    case "> 2", ">2" -> {
                        heroName = archer;
                        System.out.println("\nYou've chosen " + heroName.getName());
                    }
                    case "> 3", ">3" -> {
                        heroName = warrior;
                        System.out.println("\nYou've chosen " + heroName.getName());
                    }
                    default -> System.out.println("Invalid choice. Try again!");
                }
   }

   System.out.println("Enter your " + heroName.getName() + " name\n");
   String customName = myScanner.nextLine().trim();

   Character evilName = null;

   while(evilName == null) {
            System.out.println("Choose a villain to fight against: \n");
            System.out.println(" 1. Dark Overlord \n 2. Regional Warlord \n 3. CorruptedMortal\n");
            String evilChoice = myScanner.nextLine();
            
                switch (evilChoice) {
                    case "> 1", ">1" -> evilName = darkOverLord;
                    case "> 2", ">2" -> evilName = regionalWarLord;
                    case "> 3", ">3" -> evilName = corruptedMortal;
                    default -> System.out.println("Invalid choice. Try again!");
                }

            if(evilName != null) {
                System.out.println(customName + " the " + heroName.getName() + " enters the world of Aetherfall!");
                System.out.println(evilName.getName() + " rises to spread chaos!");
            }
   }

   System.out.println("\nBattle Start!\n");

   while(heroName.isAlive() && evilName.isAlive()) {
            String attackType = myScanner.nextLine().trim();
            switch(attackType) {
                
                case "> attack", ">attack", "> Attack", ">Attack" -> {
                    System.out.println(customName + " used Attack on " + evilName.getName());
                    System.out.println(customName + " caused " + heroName.getStdAttackDamage() + " damage");
                    System.out.println("\n------------Game Stats------------");
                    evilName.remainingHealthStd(heroName.getStdAttackDamage());
                    System.out.println(customName + " - Health: " + heroName.getHealth() + ", Power: " + heroName.getPower());
                    System.out.println(evilName.getName() + " - Health: " + evilName.getHealth() + ", Power: " + evilName.getPower());
                    break;
                    }

                case "> special", ">special", "> Special", ">Special" -> {
                        if (heroName.getName().equals("Archer")) {
                            System.out.println("Choose Special Move type: \n 1. QuickShot \n 2. MultiShot");
                            String specialMoveChoice = myScanner.nextLine().trim();
                            switch(specialMoveChoice){
                                case "> 1", ">1" -> {
                                    System.out.println(customName + " used QuickShot on " + evilName.getName());
                                    System.out.println(customName + " caused " + heroName.getSpecialEffect() + " damage");
                                    System.out.println("\n------------Game Stats------------");
                                    evilName.remainingHealthSpecial(heroName.getSpecialEffect());
                                    System.out.println(customName + " - Health: " + heroName.getHealth() + ", Power: " + heroName.getPower());
                                    System.out.println(evilName.getName() + " - Health: " + evilName.getHealth() + ", Power: " + evilName.getPower());
                                    break;
                                }
                                case "> 2", ">2" -> {
                                    System.out.println(customName + " used MultiShot on " + evilName.getName());
                                    System.out.println(customName + " caused " + heroName.getSpecialEffectDamagePro() + " damage");
                                    System.out.println("\n------------Game Stats------------");
                                    evilName.remainingHealthSpecial(heroName.getSpecialEffectDamagePro());
                                    System.out.println(customName + " - Health: " + heroName.getHealth() + ", Power: " + heroName.getPower());
                                    System.out.println(evilName.getName() + " - Health: " + evilName.getHealth() + ", Power: " + evilName.getPower());
                                    break;
                                }
                            }
                        } else {
                            System.out.println(customName + " used Special on " + evilName.getName());
                            System.out.println(customName + " caused " + heroName.getSpecialEffect() + " damage");
                            System.out.println("\n------------Game Stats------------");
                            evilName.remainingHealthSpecial(heroName.getSpecialEffect());
                            System.out.println(customName + " - Health: " + heroName.getHealth() + ", Power: " + heroName.getPower());
                            System.out.println(evilName.getName() + " - Health: " + evilName.getHealth() + ", Power: " + evilName.getPower());
                        }
                }
            }

            RandomEnemy.evilInvade(heroName, evilName, customName);    
   }
   
   System.out.println("------------Results------------\n");

   if(!heroName.isAlive()){
            System.out.println(evilName.getName() + " wins the battle!\n");
            System.out.println(customName + " the " + heroName.getName() + " has been defeated!\n");
   } else if(!evilName.isAlive()){
            System.out.println(customName + " the " + heroName.getName() + " wins the battle!\n");
            System.out.println(evilName.getName() + " has been defeated!\n");
   }
        }
}
}
