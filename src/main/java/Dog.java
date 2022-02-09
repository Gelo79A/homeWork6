public class Dog extends Animal{

    private  int id = 1;
    static int counterDog;

    public Dog(String name, int run, int swim, int maxRun, int maxSwim) {
        super(name, run, swim, maxRun, maxSwim);
        counterDog = id++;
    }

    @Override
    public void run() {
        if (getRun() < getMaxRun()) {
            System.out.println("Собака " + getName() + " пробежал " + getRun() + " м");
        }
        else System.out.println("Собака " + getName() + " не может пробежать " + getRun() + " м");
    }

    @Override
    public void swim() {
        if (getSwim() < getMaxSwim()) {
            System.out.println("Собака " + getName() + " проплыла " + getSwim() + " м");
        }
        else System.out.println("Собака " + getName() + " не может проплыть больше " + getMaxSwim() + " м");

        System.out.println();
    }


}
