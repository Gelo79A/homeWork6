public abstract class Animal {
     String name;
    private int maxRun;
    private int maxSwim;
    private int run;
    private int swim;
    private static int idAnimal = 1;
    static int counterAnimal;


    public Animal(String name, int run, int swim, int maxRun, int maxSwim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        counterAnimal  = idAnimal++;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }

    public int getMaxRun() {
        return maxRun;
    }
    public int getMaxSwim() {
        return maxSwim;
    }

    public abstract void run();
    public abstract void swim();
}
