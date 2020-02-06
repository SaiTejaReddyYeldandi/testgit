package Shivam;
import sweets.*;
import gift.*;
public class App 
{
    public static void main( String[] args )
    {
        Sweet a = new Chocolate("Milkybar Choo",100,80,"Milkybar");
        Sweet b = new Chocolate("Bubbly",200,90,"Cadbury Silk");
        Sweet c = new Candy("Toffee",1001,88,"Kala Jaadu");

        Gift gifts = new Gift();
        gifts.add(a);
        gifts.add(b);
        gifts.add(c);

        gifts.printNetWeight();
        gifts.listGifts();
    }
}
