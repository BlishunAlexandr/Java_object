public abstract class pet implements constants{
    protected String name;
    private Integer age = constants.age;

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    void play(){
    }
}
