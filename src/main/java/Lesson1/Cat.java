package Lesson1;

public class Cat implements CanJumpAndRun {
    String name;
    int JumpMax;
    int RunMax;

    public Cat(String name, int JumpMax, int RunMax) {
        this.name = name;
        this.JumpMax = JumpMax;
        this.RunMax = RunMax;
    }

    @Override
    public boolean jump(int height) {
        if (height <= this.JumpMax) {
            System.out.println("Кот " + name +" прыгнул на " + height);
            return true;
        } else {
            System.out.println("Кот " + name +" не смог прыгнуть на " + height);
            return false;
        }
    }
    @Override
    public boolean run(int length) {
        if (length <= this.RunMax) {
            System.out.println("Кот " + name +" пробежал на " + length);
            return true;
        } else {
            System.out.println("Кот " + name +" не смог пробежать на " + length);
            return false;
        }
    }
}
