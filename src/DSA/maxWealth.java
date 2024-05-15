package DSA;

public class maxWealth {
    public static void main(String[] args) {

    }
    static int max(int[][] accounts){
        int max = 0;
        int[] sumOfWealth = new int[accounts.length];
        for (int person = 0; person < accounts.length; person++) {
            for (int account = 0; account < accounts[person].length; account++) {
                sumOfWealth[person] += accounts[person][account];
            }
            if (sumOfWealth[person] > max) {
                max = sumOfWealth[person];
            }
        }
        return max;
    }
}
