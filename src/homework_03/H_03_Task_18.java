package homework_03;

public class H_03_Task_18 {

    public void run() {
        System.out.println(Main.taskDelimiter +
                "18. Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил начинать каждый\n" +
                "урок с того, чтобы задавать каждому ученику пример из таблицы умножения, но в классе 15 человек,\n" +
                "а примеры среди них не должны повторяться. В помощь учителю напишите программу, которая будет выводить на экран\n" +
                "15 случайных примеров из таблицы умножения (от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 —\n" +
                "слишком просты). При этом среди 15 примеров не должно быть повторяющихся (примеры 2*3 и 3*2 и им подобные пары\n" +
                "считать повторяющимися).\n");
        int rows = 2;
        int columns = 15;
        int[] pairOfRandomInt;
        int[] pairReversed;
        int[][] arr = new int[rows][columns];
        for (int i = 0; i<columns; i++) {
            do  {
                pairOfRandomInt = makePairOfRandomInt();
                pairReversed = makeReversedPair(pairOfRandomInt);
            } while (foundTheSameAndReversedPair(arr, pairOfRandomInt, pairReversed));
            arr[0][i] = pairOfRandomInt[0];
            arr[1][i] = pairOfRandomInt[1];
        }
        Main.showArray(arr);
    }

    private static int[] makePairOfRandomInt() {
        int [] pair = new int[2];
        pair[0] = (int)Math.round(2+Math.random()*(9-2));
        pair[1] = (int)Math.round(2+Math.random()*(9-2));
        return pair;
    }

    private static int[] makeReversedPair(int[] somePair) {
        int [] somePairReversed = new int[2];
        somePairReversed[0] = somePair[1];
        somePairReversed[1] = somePair[0];
        return somePairReversed;
    }

    private static boolean foundTheSameAndReversedPair(int[][] array, int[] pair1, int[] pair2) {
        boolean thePairFound = false;
        for (int i=0; i<array[0].length; i++) {
            if (
                    (array[0][i] == pair1[0] && array[1][i] == pair1[1]) ||
                    (array[0][i] == pair2[0] && array[1][i] == pair2[1])
            ) {
                thePairFound = true;
                break;
            }
        }

        return thePairFound;
    }

}