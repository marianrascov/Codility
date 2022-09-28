public class CyclicRotation {
    public static int[] solution(int[] A, int K) {
        int[] array = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int newIndex = (i + K) % A.length;
            array[newIndex] = A[i];
        }
        return array;
    }

    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        int[] rotatedArray = solution(A, K);
        for (int i = 0; i < rotatedArray.length; i++) {
            System.out.print(rotatedArray[i] + ", ");
        }
    }
}
