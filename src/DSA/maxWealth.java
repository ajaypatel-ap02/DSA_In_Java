package DSA;

import java.util.ArrayList;
import java.util.List;

public class maxWealth {
    public static void main(String[] args) {
        int[][] accounts = { {1,2,3},{3,2,1},{2,1},{5,1}};
        System.out.println("The person having maximum wealth is person/persons are ");
        List<Integer> maxWealthPerson = max(accounts);
        for (Integer wealthPerson : maxWealthPerson) {
            System.out.print((wealthPerson + 1) + ", ");
        }
    }
    static ArrayList<Integer> max(int[][] accounts){
        ArrayList<Integer> maxWealthPerson = new ArrayList<>();
        int maxWealth = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sumOfWealth = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sumOfWealth += accounts[person][account];
            }
            if ( maxWealth == sumOfWealth) {
                maxWealthPerson.add(person);
            }
            if (sumOfWealth > maxWealth) {
                maxWealth = sumOfWealth;
                maxWealthPerson.add(person);
            }

        }
        return maxWealthPerson;
    }
}
