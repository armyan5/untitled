package HomeWork_17;

public class Dog {
    /*
    Повторить код класса Dog на уроке.
    Создать массив из 10 препятствий.
    Попросить объект класса собака перепрыгнуть все препятствия в массиве
    Посчитать сколько препятствий из массива собака смогла преодолеть.
     */



    String name;
    int jumpHeight;



    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
    }
    void whoAmI() {
        System.out.println("Я собака " + name + ", и я умею прыгать на " + jumpHeight + " см");
    }

    void jump(int height) {
        System.out.println("Я перепрыгиваю барьер " + height + " см");
    }

    void getBarrier(int barrierHeight) {
        if (jumpHeight < barrierHeight) {
            System.out.println("mne nujno potrenerovatsa");
            training();

        }
        if (jumpHeight >= barrierHeight) {
            jump(barrierHeight);

        } else {
            System.out.println("Я не могу перепрыгнуть барьер высотой: " + barrierHeight);
        }

        System.out.println("End get barrier. Текущий прыжок " + jumpHeight);

    }

        void training() {
            System.out.println("start training");
                jumpHeight += 10;
                System.out.println("Я потренировался!") ;
                whoAmI();
            }
        }


