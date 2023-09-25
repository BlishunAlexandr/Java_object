package a1;

public class cat {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void greet(){
        System.out.printf("Мяу! Меня зовут %s. Мне %d года(лет).", this.name, this.age);
    }
}
