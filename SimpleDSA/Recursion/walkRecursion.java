package SimpleDSA.Recursion;

public class walkRecursion {
    public static void main(String[] args) {

        walk(5);
        walkrecursion(5);
    }

    // ⁡⁣⁢⁣ iterative method⁡⁡

    public static void walk(int steps) {
        for (int i = 0; i < steps; i++) {
            System.out.println("You take a step!");
        }
    }

    // ⁡⁢⁣⁡⁢⁣⁢recursive method

    // a method calles itself
    // some times the recursive mehthod is slower⁡⁡⁡
    // ⁡⁢⁣⁢uses mre memory⁡

    public static void walkrecursion(int steps) {
        if (steps == 0) {
            return;
        } else {
            System.out.println("walking");
            walkrecursion(steps - 1);
        }
    }
}
