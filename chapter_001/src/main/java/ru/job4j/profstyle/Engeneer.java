package ru.job4j.profstyle;

/**
 * Класс наследник. Описывает профессию Инженера
 *
 * @author Nikolay Goltsov
 */
public class Engeneer extends Proffession {
    /**
     * Конструктор класса унаследованный от класса родителя
     *
     * @param name      Имя инженера
     * @param surname   Фамилия Инженера
     * @param education Образование инженера
     * @param birthday  День рождения инженера
     */
    public Engeneer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    /**
     * Перегруженный метод унаследованный от класса родителя
     *
     * @return возвращает имя инженера.
     */
    @Override
    public String getName() {
        return super.getName();
    }
}
