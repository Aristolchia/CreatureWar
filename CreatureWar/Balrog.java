
/**
 * Write a description of class Balrog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balrog extends Demon
{

    public int attack(){
       //ask creature for my attack damage
       int tempAttackDamage;
       tempAttackDamage = super.attack();
       tempAttackDamage += super.attack();
       
       return tempAttackDamage;  
    }
}
