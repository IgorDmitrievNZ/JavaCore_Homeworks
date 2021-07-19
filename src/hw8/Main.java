package hw8;

public class Main {

    public static void main(String[] args) {

        JumpRunnable[] jumprunnables = {
                new Human(),
                new Robot(),
                new Cat(),
                new Human(),
                new Robot(),
                new Cat(),
                new Human(),
                new Robot(),
                new Cat(),

        };

        Barrierable[] barrierables = {
                new Treadmill(),
                new Wall(),
                new Treadmill(),
                new Wall(),

        };

        for (int i = 0; i < jumprunnables.length; i++) {
            for (int j = 0; j < barrierables.length; j++) {
                if (!barrierables[j].action(jumprunnables[i])) {
                    break;
                }
            }

        }

    }

}
