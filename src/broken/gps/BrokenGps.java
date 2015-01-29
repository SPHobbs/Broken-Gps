
package broken.gps;
import java.util.*;
import java.text.DecimalFormat;
/**
 *
 * @author Sean
 */
public class BrokenGps 
{
    public static DecimalFormat decimal = new DecimalFormat("0");
    public static void main(String[] args) 
    {
        //double randNum =0;
        String direction;
        int x=0,y=0;
        for(int i=0; i<12; i++)
        {
            if(randomInteger(1,4)==1) 
            {
                direction = "NORTH";
                y+=5;
                System.out.println(direction);
            } 
            else if(randomInteger(1,4)==2)
            {
                direction = "SOUTH";
                y-=5;
                System.out.println(direction);
            }
            else if(randomInteger(1,4)==3)
            {
                direction = "EAST";
                x+=5;
                System.out.println(direction);
            }
            else if(randomInteger(1,4)==4)
            {
                direction = "WEST";
                x-=5;
                System.out.println(direction);
            }
        }
        double distance = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        System.out.println("The distance traveled is "+decimal.format(distance)+" miles.");
        
    }
    public static int randomInteger(int min, int max) 
    {
        Random rand = new Random();
        int randomNum = min + (int)(Math.random() * ((max - min) + 1));
        return randomNum;
    }
    
}
