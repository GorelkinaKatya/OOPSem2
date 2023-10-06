public class Cat extends Alive{
    public Cat(String name, int runMax, int jumpMax, char losing) {
        super(name, runMax, jumpMax, losing);
        if (runMax > 5) {
            super.runMax = 5;
        }
        if (jumpMax > 3) {
            super.jumpMax = 3;
        }
    }
}
