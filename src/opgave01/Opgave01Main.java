package opgave01;

import opgave01.models.Character;
import opgave01.storage.HogwartsStorage;

import java.util.ArrayList;

public class Opgave01Main {
    public static void main(String[] args) {
        HogwartsStorage storage = new HogwartsStorage();
        ArrayList<Character> gryffindors = storage.getHouseGryffindor();
        ArrayList<Character> slytherins = storage.getHouseSlytherin();

        ArrayList<Character> allstudents = flet(gryffindors,slytherins);
        System.out.println(allstudents);

     }

    public static ArrayList<Character> flet(ArrayList<Character> gryffindors, ArrayList<Character> slytherins) {
        ArrayList<Character> result = new ArrayList<Character>();
        int i1 = 0;
        int i2 = 0;
        while (i1 < gryffindors.size() && i2 < slytherins.size()) {
            if (gryffindors.get(i1).compareTo((slytherins.get(i2))) <= 0) {
                result.add(gryffindors.get(i1));
                i1++;
            }
            else {
                result.add(slytherins.get(i2));
                i2++;
            }
        }
        while (i1 < gryffindors.size()) {
            result.add(gryffindors.get(i1));
            i1++;
        }
        while (i2 < slytherins.size()) {
            result.add(slytherins.get(i2));
            i2++;
        }
        return result;
    }


}
