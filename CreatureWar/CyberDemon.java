
/**
 * Write a description of class CyberDemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CyberDemon
     */
    public CyberDemon()
    {
        // initialise instance variables
        x = 0;
    }
    public int attack()
    {
        int tempAttackDamage;
        tempAttackDamage = super.attack();
        tempAttackDamage += 5;
        return tempAttackDamage;
    }
    
}
