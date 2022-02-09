public class Cat extends Animal {
    private static  int id = 1;
    static int counterCat;


    public Cat(String name, int run, int swim, int maxRun, int maxSwim) {
        super(name, run, swim, maxRun, maxSwim);
        counterCat = id++;
        maxRun = 200;

    }



    @Override
    public void run() {
        if (getRun() <= getMaxRun()) {
            System.out.println("Кот " + getName() + " пробежал " + getRun() + " м");
        }
        else System.out.println("Кот " + getName() + " не может пробежать более 200 м");

        System.out.println();
    }

    @Override
    public void swim() {
    }

}
