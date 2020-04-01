package ru.job4j.profstyle;
/*

4. Добавьте новые поля в наследниках и так же методы. Это поля и методы, должны отображать особенность класса.

Примеры методов:

Метод public Diagnose heal(Pacient pacient) {} из класса Doctor возвращает диагноз.

Важно внутри методы ничего не должны делать.  Оставь эти методы пустые!

Список доп. литературы:
1. Head First Java (Кэти Сьерра Изучаем Java), глава 7. Страница 198.
2. Хорстманн К., Корнелл Г. - Java. Библиотека профессионала. Том 1. Основы. 10-е издание. Глава 5. Страница 193.
 */

/**
 * Класс описывает профессии. Общий.
 *
 * @author Nikolay Goltsov
 */
public class Proffession {
    /**
     * Приватные поля
     */
    private String name;
    private String surname;
    private String education;
    private String birthday;

    /**
     * Конструктор класса
     *
     * @param name      Имя сотрудника
     * @param surname   Фамилия сотрудника
     * @param education Образование сотрудника
     * @param birthday  День рождение сотрудника
     */
    public Proffession(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    /**
     * Метод возвращает имя сотрудника
     *
     * @return
     */
    public String getName() {
        return name;
    }
}
