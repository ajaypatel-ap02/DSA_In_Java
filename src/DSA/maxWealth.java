package DSA;

public class maxWealth {
    public static void main(String[] args) {
        int[][] accounts = { {4,2,7,2},{1,4,2,3},{8,5,1,4,3,2,6}};
        System.out.println("The person having maximum wealth is person "+max(accounts));
    }
    static int max(int[][] accounts){
        int maxWealthPerson = 0;
        int[] sumOfWealth = new int[accounts.length];
        for (int person = 0; person < accounts.length; person++) {
            for (int account = 0; account < accounts[person].length; account++) {
                sumOfWealth[person] += accounts[person][account];
            }
            if (sumOfWealth[person] > maxWealthPerson) {
                maxWealthPerson = person;
            }
        }
        return maxWealthPerson;
    }
}
