package by.it.academia;

public class SingleArr {
    public static void main(String[] args) {
        SingleArr sArr = new SingleArr();

        sArr.setArr(5);
    }

    public int[][] setArr(int razmernost) {
        int n = razmernost;
        int[][] mass = new int[n][n];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = 30;
            }
        }
        return mass;
    }
}
