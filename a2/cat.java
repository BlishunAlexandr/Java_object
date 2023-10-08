public class cat extends pet{
    public void Meow(){
        System.out.printf("Мяу! Меня зовут %s.", super.name);
    }

    @Override
    public void play(){
        System.out.println("cat");
    }

}
    
