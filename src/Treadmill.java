public class Treadmill extends Exercises{

    int lenght;

    public Treadmill(int lenght) {
        this.lenght = lenght;
    }

    @Override
    void overcome(Parent parent) {
        parent.running(lenght);
    }
}
