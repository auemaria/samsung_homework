import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person drob1 = new Person();
        Person drob2 = new Person();
        Person drob3 = new Person();
        Person drob4 = new Person();
        Person drob5 = new Person();
        drob1.setAge(in.nextInt());
        drob1.setName(in.nextInt());
        drob2.setAge(in.nextInt());
        drob2.setName(in.nextInt());
        drob3 = drob1.del(drob2);
        drob3.displayInfo();
        drob4 = drob1.slosh(drob2);
        drob4.displayInfo();
        drob5 = drob1.min(drob2);
        drob5.displayInfo();
    }
}
class Person{

    int name;    // имя
    int age;        // возраст
    String lol;
    void setAge(int NewAge){
        age = NewAge;
    };
    void setName(int NewName){
        name = NewName;
    };

    Person del(Person secondMultiplayer){
        Person product = new Person();
        product.age = age* secondMultiplayer.name;
        product.name = name* secondMultiplayer.age;
        product.lol = "Деление: ";
        return product;
    };
    Person slosh(Person secondMultiplayer){
        Person product1 = new Person();
        product1.name = name* secondMultiplayer.name;
        product1.age = age* secondMultiplayer.name + secondMultiplayer.age * name;
        product1.lol = "Сложение: ";
        return product1;
    };
    Person min(Person secondMultiplayer){
        Person product2 = new Person();
        product2.name = name* secondMultiplayer.name;
        product2.age = age* secondMultiplayer.name - secondMultiplayer.age * name;
        product2.lol = "Вычитание: ";
        return product2;
    };
    void displayInfo(){
        System.out.printf("%s  %d / %d = %.2f", lol, age, name, (float)((float)age/(float)name));
        System.out.println();
    }
}
