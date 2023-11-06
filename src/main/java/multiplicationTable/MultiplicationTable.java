package multiplicationTable;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int numberLeft = 0; numberLeft < 10; numberLeft++) {
            for (int numberUp = 0; numberUp < 10; numberUp++) {
                System.out.printf("%5d", (numberUp + 1) * (numberLeft + 1));
            }
            System.out.println("\n");
        }
    }
}