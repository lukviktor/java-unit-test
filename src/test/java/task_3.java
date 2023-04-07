import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class) // Напиши аннотацию для параметризованных тестов
public class task_3 {

    private final int age;
    private final boolean result;

    public task_3(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    /*
    Допиши параметризованный тест checkIsAdultWhenAgeThenResult,
    который проверит возраст из каждого класса эквивалентности.
    Учти, что код приложения пишут люди из разных стран, и в некоторых совершеннолетие наступает в 21 год.
    В тест будет передаваться два аргумента: возраст и ожидаемый результат проверки.
    Реализуй это требование с помощью двумерного массива аргументов.
     */

    @Parameterized.Parameters // Пометь метод аннотацией для параметров
    public static Object[][] getTextData() {
        return new Object[][] {
                // Заполни массив тестовыми данными и ожидаемым результатом
                {21, true},
                {17, false},
                {18, true},
                {22, true}
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        // Передай сюда возраст пользователя

        boolean isAdult = program.checkIsAdult(age);
        // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
        assertEquals("Должно вернуться true, так как пользователь совершеннолетний", result, isAdult);
    }
}