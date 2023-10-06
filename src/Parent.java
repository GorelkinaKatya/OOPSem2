abstract class Parent {
    String name;
    int runMax;
    int jumpMax;
    char losing;

    public Parent(String name, int runMax, int jumpMax, char losing) {
        this.name = name;
        this.runMax = runMax;
        this.jumpMax = jumpMax;
        this.losing = losing;
    }

    abstract void running(int runDistance);
    abstract void jumping(int jumpDistance);
}
