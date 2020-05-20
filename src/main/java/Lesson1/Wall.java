package Lesson1;

public class Wall implements CanDo {
    int height;
    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean do_(CanJumpAndRun somebody) {
        return somebody.jump(this.height);
    }
}
