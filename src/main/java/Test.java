public class Test {
    public static void main(String[] args) {
       Cat cat1 = new Cat("Barsik", 150, 50, 200,0);
       cat1.run();
       cat1.swim();

       Cat  cat2 = new Cat("Murzik", 300, 0, 200, 0);
       cat2.run();
       cat2.swim();

        Cat cat3 = new Cat("Дымок", 200, 0, 200, 0);
        cat3.run();
        cat3.swim();

        Dog dog1 = new Dog("Bobik", 100, 15, 500, 10);
        dog1.run();
        dog1.swim();

        Dog dog2 = new Dog("Шарик", 600, 5, 500, 5);
        dog2.run();
        dog2.swim();

       System.out.println("Количество имеющихся котов " + Cat.counterCat);
        System.out.println("Количество имеющихся собак " + Dog.counterDog);
        System.out.println("Количество имеющихся животных " + Animal.counterAnimal);
    }
}
