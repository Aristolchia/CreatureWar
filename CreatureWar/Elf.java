/**
 * Elf is a magic creature that has a 10% chance at doing double attack damage
 * 
 * @author Crosbie 
 * @version April 20, 2015
 */
public class Elf extends Creature 
{
  Elf() {
      super();
  }
  
  Elf(int str, int hp){
      super(hp, str);
  }
  
  public int attack(){
       //ask creature for my attack damage
       int tempAttackDamage;
       tempAttackDamage = super.attack();
       
       //roll the dice (use creature's rand)
       //if less than 10%, damage = damage * 2
       if (rand.nextInt(10) == 0) {
           tempAttackDamage *= 2;
           System.out.println("SHAZAM!!!!");
           //tempAttackDamage = tempAttackDamage * 2;
           //tempAttackDamage = tempAttackDamage + tempAttackDamage;
       }
       
       return tempAttackDamage;  
    }
  
}