public class Pet implements Runing, Eating{
    String name;
    int weight=3;
    String adress= "Belarus";
    String color= "gray";
    int age = 5;
    Pet() {}
    Pet(String name) {
        this.name = name;    }
    Pet(String name, int age){
        this.name = name;
        this.age = age;    }
    Pet(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;    }

    void say () {
        System.out.println( "Tis is a " +this.name+ " " + age +" years old, his weight  " + weight+ " kg, his color is " + this.color + " , and live from " + this.adress);
        }@Override
    public void Eating() {
        System.out.println("вылечить людей");
    }
    @Override
    public void Runing() {
        System.out.println("проплыть 100м");
    }}

