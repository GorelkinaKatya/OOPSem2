public class Human extends Alive{
    public Human(String name, int runMax, int jumpMax, char losing) {
        super(name, runMax, jumpMax, losing);
        if (runMax > 60) {
            super.runMax = 60;
        }
        if (jumpMax > 2) {
            super.jumpMax = 2;
        }
    }
}
