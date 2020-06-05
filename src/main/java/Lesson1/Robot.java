package Lesson1;

public class Robot implements CanJumpAndRun {
    String name;
    int JumpMax;
    int RunMax;

    public Robot(String name, int JumpMax, int RunMax) {
        this.name = name;
        this.JumpMax = JumpMax;
        this.RunMax = RunMax;
    }

    @Override
    public boolean jump(int height) {
        if (height <= this.JumpMax) {
            System.out.println("Robot " + name + " прыгнул на " + height);
            return true;
        } else {
            System.out.println("Robot " + name + " не смог прыгнуть на " + height);
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if (length <= this.RunMax) {
            System.out.println("Robot " + name + " пробежал на " + length);
            return true;
        } else {
            System.out.println("Robot " + name + " не смог пробежать на " + length);
            return false;
        }
    }
}
