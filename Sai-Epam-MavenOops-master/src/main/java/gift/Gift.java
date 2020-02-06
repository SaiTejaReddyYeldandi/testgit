package gift;

import sweets.Sweet;

import java.util.ArrayList;
import java.util.Collections;

public class Gift {
    ArrayList<Sweet> gifts = new ArrayList<Sweet>();

    public void printNetWeight(){
        int w = 0;
        for(int i=0;i<gifts.size();i++){
            w += gifts.get(i).getWeight();
        }
        System.out.println(w);
    }
    public void add(Sweet sweet){
        gifts.add(sweet);
    }
    public void sort(){
        Collections.sort(gifts);
    }


    public void listGifts() {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<this.gifts.size();i++){
            System.out.println(gifts.get(i).getName());
        }
    }
}
