package homework_03;

public class H_03_Task_04 {

    public void run() {
        System.out.println(Main.taskDelimiter+
                "4. Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.\n" +
                "Замените каждый элемент с нечётным индексом на ноль. Снова выведите массив на экран на отдельной строке.\n");
        int[] arrA = Main.createArrayOfRandomInt(8, 1, 10);

        Main.showArray(arrA,"in one line");
        Main.showArray(replaceOddElementsWithZeroes(arrA),"in one line");
    }

    public int [] replaceOddElementsWithZeroes(int [] arr) {
        int [] resultArr = new int [arr.length];
        for (int i=0; i<=arr.length-1; i++){
            if (i % 2 == 1) {
                resultArr[i]=0;
            } else {
                resultArr[i]=arr[i];
            }
        }
        return resultArr;
    }

}