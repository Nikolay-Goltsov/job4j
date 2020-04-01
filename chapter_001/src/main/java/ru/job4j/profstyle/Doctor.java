package ru.job4j.profstyle;

/**
 * Класс наследник. Описывает профессию Доктор.
 *
 * @author Nikolay Goltsov
 */
public class Doctor extends Proffession {
    /**
     * Конструктор унаследованный от базового класса родителя
     *
     * @param name      Имя доктора
     * @param surname   Фамилия доктора
     * @param education Образование доктора
     * @param birthday  День рождения доктора
     */
    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void heal(Pacient pacient) {
    }

}
