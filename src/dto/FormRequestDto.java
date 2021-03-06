package dto;

public class FormRequestDto {

    String name;

    String age;

    String sex;

    String[] hobbies;

    public FormRequestDto(String name, String age, String sex, String[] hobbies) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String[] getHobbies() {
        return hobbies;
    }
}
