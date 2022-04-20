import java.util.*;
public class Average
{
    public static void main(String args[]) {
        int sum =0,avg;
        ArrayList<Integer> list = new ArrayList<Integer>();

        //ADDING VALUES

        list.add(44);
        list.add(36);
        list.add(56);
        list.add(66);

        // for loop

        for(int i=0;i<list.size();i++)
        sum = sum + list.get(i);
        avg = sum / list.size();
        System.out.println("Average of this values;" +avg);
        
    }
}
