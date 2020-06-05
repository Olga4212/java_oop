package Lesson1;

public class Treadmill implements CanDo {
    int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean do_(CanJumpAndRun somebody) {
        return somebody.jump(this.distance);
    }
}
