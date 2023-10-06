public class Wall extends Exercises{

    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    void overcome(Parent parent) {
        parent.jumping(height);
    }
}
