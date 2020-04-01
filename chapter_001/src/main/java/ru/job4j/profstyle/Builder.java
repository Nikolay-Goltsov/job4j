package ru.job4j.profstyle;

public class Builder extends Engeneer {
    private String timeCoding; // Отображает среднее время кодирования

    public Builder(String name, String surname, String education, String birthday, String timeCoding) {
        super(name, surname, education, birthday);
        this.timeCoding = timeCoding;
    }

    @Override
    public String getName() {
        return super.getName();
    }


}
