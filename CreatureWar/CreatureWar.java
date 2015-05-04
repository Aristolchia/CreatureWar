import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class CreatureWar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreatureWar
{
    private ArrayList<Creature> sideOne;
    private ArrayList<Creature> sideTwo;
    public Random r = new Random();
    int i = r.nextInt(100)+50;
    /**
     * Constructor for objects of class CreatureWar
     */
    public CreatureWar()
    {
            sideOne = new ArrayList<Creature>();
            sideTwo = new ArrayList<Creature>();
            
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
   */
    public Creature addCreature()
    {
            Random r = new Random();
            int c1 = r.nextInt(4);
            if(c1 == 0)
            {
               return new Human(); 
            }
            if(c1 == 1)
            {
                return new Elf(); 
            }
            if(c1 == 2)
            {
                return new Balrog(); 
            }
            return new CyberDemon(); 
    }
 
   public void battle()
   {
       int j = 0;
       int h = 0;
       while(j < i && h < i)
       {
           sideOne.get(j).takeDamage(sideTwo.get(h).attack());
           System.out.println("Unit " + h + " From Army Two Deals " + sideTwo.get(h).attack() + " Damage to Unit " + j + " in Army One");
           sideTwo.get(h).takeDamage(sideOne.get(j).attack());
           System.out.println("Unit " + j + " From Army One Deals " + sideTwo.get(j).attack() + " Damage to Unit " + h + " in Army Two");
           if(sideOne.get(j).isAlive() != true)
           {   
               System.out.println("Unit " + j + " From Army One Has Died!");
               j++;
           }
           if(sideTwo.get(h).isAlive() != true)
           {   
               System.out.println("Unit " + h + " From Army Two Has Died!");
               h++;
           }
        }
        if(j<h)
        {
            System.out.println("Army Two Wins!");
        }
        else if(j>h)
        {
            System.out.println("Army One Wins!");
        }
        else
        {
            System.out.println("Its a Draw!");
        }
   }
   public void createArmy()
   {
        for(int k = 0; k < i; k++)
        {
            sideOne.add(addCreature());
            sideTwo.add(addCreature());
        }
   }
}
