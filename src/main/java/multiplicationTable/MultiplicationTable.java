package multiplicationTable;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int numberLeft = 1; numberLeft <= 10; numberLeft++) {
            System.out.println("\n");
            for (int numberUp = 2; numberUp <= 10; numberUp++) {
                System.out.printf("%5d", (numberUp + 1) * (numberLeft + 1));
            }
        }
    }
}