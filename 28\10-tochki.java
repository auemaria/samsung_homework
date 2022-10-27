import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person drob1 = new Person();
        Person drob2 = new Person();
        Person drob3 = new Person();
        Person drob4 = new Person();
        drob1.setAge(in.nextInt());
        drob1.setName(in.nextInt());
        drob2.setAge(in.nextInt());
        drob2.setName(in.nextInt());
        System.out.println("Точки");
        drob3 = drob1.del(drob2);
        drob3.displayInfo();


    }
}
class Person{

    int name;    // имя
    double u;
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
        product.u = Math.sqrt(Math.pow((age-secondMultiplayer.age), 2) +Math.pow((name-secondMultiplayer.name), 2));

        product.lol = "Расстояние между точками: ";
        return product;
    };

    void displayInfo(){
        System.out.printf("%s = %.2f", lol, u);
        System.out.println();
    }
}
