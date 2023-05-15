package basics;

public class While1 {
    public static void main(String[] args) {

        int[] numberList = new int[] {3, 5, 7, 9, 11};
        int ind = 0;

        while (ind < numberList.length) {
            System.out.println("Number " + numberList[ind]);
            ind++;
        }
    }
}
