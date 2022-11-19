public class Main {
    public static void main(String[] args) {
       int[] array = {123, 32, 4356, 562, 3524, 62, 347};
        int team = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    team = array[i];
                    array[i] = array[j];
                    array[j] = team;

                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }}}
