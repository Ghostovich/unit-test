//
//Задание 1. Создайте программу на Python или Java, которая принимает два списка чисел и выполняет следующие действия:
//a. Рассчитывает среднее значение каждого списка.
//b. Сравнивает эти средние значения и выводит соответствующее сообщение:
//        - ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
//        - ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
//        - ""Средние значения равны"", если средние значения списков равны.
//


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ListComparatorTest {
    ListComparator comparator = new ListComparator();


    @Test
    public void testCompareListsFirstGreater() {
        int[] list1 = new int[]{1, 2, 3, 4, 5};
        int[] list2 = new int[]{1, 2, 3};
        Assertions.assertEquals("Первый список имеет большее среднее значение", this.comparator.compareLists(list1, list2));
    }

    @Test
    public void testCompareListsSecondGreater() {
        int[] list1 = new int[]{1, 2, 3};
        int[] list2 = new int[]{1, 2, 3, 4, 5};
        Assertions.assertEquals("Второй список имеет большее среднее значение", this.comparator.compareLists(list1, list2));
    }

    @Test
    public void testCompareListsEqual() {
        int[] list1 = new int[]{1, 2, 3, 4, 5};
        int[] list2 = new int[]{5, 4, 3, 2, 1};
        Assertions.assertEquals("Средние значения равны", this.comparator.compareLists(list1, list2));
    }
}