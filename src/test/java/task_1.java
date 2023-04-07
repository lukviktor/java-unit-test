import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class task_1 {
    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {

        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);

        /*
        Метод checkIsAdult класса Program принимает в качестве аргумента возраст и возвращает true,
        если пользователю 18 лет или больше, и false, если пользователь младше 18 лет.
         */

        assertEquals("Person's age is equal to or more than 18", true, isAdult);
    }
}
