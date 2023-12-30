public class ListComparator {

    public static void CompareList( int[] list1,  int[] list2) {
    if(midNumber(list1)>midNumber(list2)){
        System.out.println("Первый список имеет большее среднее значение");
    }
        if(midNumber(list1)<midNumber(list2)){
            System.out.println("Второй список имеет большее среднее значение");
        }
       else {
            System.out.println("Средние значения равны");
        }
    }



    public static void midNumber(int[] list){
        double average = 0;
        if (list.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum += numbers[j];
            }
            average = sum / numbers.length;
            return average;
        }
    }
}