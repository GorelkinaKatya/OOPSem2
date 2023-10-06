public class Alive extends Parent{
    public Alive(String name, int runMax, int jumpMax, char losing) {
        super(name, runMax, jumpMax, losing);
    }

    @Override
    void running(int runDistance) {
        if (losing == '0') {
            if (runDistance < runMax) {
                System.out.println(name + " успешно пробежал " + runDistance + " км");
            } else {
                System.out.println(name + " не смог пробежать " + runDistance + " км и выбыл");
                losing = '1';
            }
        }
    }

    @Override
    void jumping(int jumpDistance) {
        if (losing == '0') {
            if (jumpDistance < jumpMax) {
                System.out.println(name + " успешно перепрыгнул " + jumpDistance + " км");
            } else {
                System.out.println(name + " не смог перепрыгнуть " + jumpDistance + " км и выбыл");
                losing = '1';
            }
        }
    }
}
