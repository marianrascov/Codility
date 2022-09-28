public class FrogJmp {
    public static int solution(int X, int Y, int D) {
        int distance = Y - X;

        if (distance == 0) {
            return 0;
        }
        return (distance % D == 0) ? (distance / D) : ((distance / D) + 1);
    }

    public static void main(String[] args) {
        int X = 10;
        int Y = 85;
        int D = 30;

        int frogJmp = solution(X, Y, D);
        System.out.println(frogJmp);
    }
}
