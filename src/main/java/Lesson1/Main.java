package Lesson1;

public class Main {
    public static void main(String[] args) {
        CanDo[] things = {
                new Treadmill(5),
                new Wall(3),
                new Treadmill(7),
                new Wall(5),
                new Treadmill(9),
                new Wall(7),
        };

        CanJumpAndRun[] persons = {
                new Cat("Cat1", 5, 5),
                new Cat("Cat2", 7, 7),
                new Cat("Cat3", 9, 9),
                new Human("Human1", 5, 5),
                new Human("Human2", 7, 7),
                new Human("Human3", 9, 9),
                new Robot("Robot1", 5, 5),
        };

        for (int persons_i = 0; persons_i < persons.length; persons_i++) {
            for (int things_i = 0; things_i < things.length; things_i++) {
                if (!things[things_i].do_(persons[persons_i])) {
                    break;
                }
            }
        }

    }
}
