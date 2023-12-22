package seminars.fourth.book;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

//Задание 1. Ответьте письменно на вопросы:
//
//        1)  Почему использование тестовых заглушек
//может быть полезным при написании модульных тестов?

//Поскольку тестируются отдельные модули,
//необходимо их максимально изолировать,
//чтобы избежать получения неверных результатов из-за случайного внешнего воздействия.
//
//        2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить,
//что метод был вызван с определенными аргументами?

//Моки
//
//        3) Какой тип тестовой заглушки следует использовать,
//если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?
//
//stubs и fake//

//        4) Какой тип тестовой заглушки вы бы использовали
//для имитации  взаимодействия с внешним API или базой данных?
//
//fake

//Задание 2.
//
//У вас есть класс BookService,
//который использует интерфейс BookRepository
//для получения информации о книгах из базы данных.
//Ваша задача написать unit-тесты для BookService,
//используя Mockito для создания мок-объекта BookRepository.



class BookServiceTest {
    @Test
    void testBookService(){
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        string id = 1;
        string expectedBookName = 'abc';
        when(bookRepository.findById(id).thenReturn(new Book(id, expectedBookName));
        string bookName = bookService.findById(id);
        assertEquals(expectedBookName, bookName);
        verify(bookRepository, times(1)).findById(bookName);
    }

}