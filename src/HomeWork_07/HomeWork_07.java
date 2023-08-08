package HomeWork_07;

import java.util.Random;

public class HomeWork_07 {
    public static void main(String[] args) {
        /*Реализовать с использованием switch Ваш ребенок принес оценку за контрольную
работу по математике. В школе 12 бальная система. Запишите в переменную случайное число от 0 до 12.
Вы разрешаете ребенку смотреть телевизор не более 60 минут в день.
На сегодня у него осталось 45 минут.(записать в переменную)
Если оценка от 10 до 12 баллов -> Скажите ему, как вы рады и добавьте к
оставшемуся на сегодня времени 1 час от 7 до 9 -> Слова похвалы на экран + ко времени 45 минут
от 4 до 6 -> Нейтральные слова + ко времени 15 минут 3 -> Огорчитесь.
Минус 30 минут ко времени оценка меньше -> Трагедия. Сегодня ТВ смотреть запрещено
Выведите на экран оставшееся на сегодня время для просмотра ТВ
         */

        Random random = new Random();

        int a = random.nextInt(13);
        int all = 60;
        int rest = 45;
        System.out.println(a);

        switch (a) {
            case 12:
            case 11:
            case 10:

                int respect = rest + 60;
                System.out.println("Respect: на сегодня осталось: " + respect + "min");
                rest += 60;
                break;

            case 9:
            case 8:
            case 7:{

                int good = rest + 45;
                System.out.println("Good: на сегодня осталось: " + good + "min");
                rest += 45;
                break;
            }
            case 6:
            case 5:
            case 4:{
                int neutral = rest + 15;
                System.out.println("Neutral: на сегодня осталось: " + neutral + "min");
                rest += 15;
                break;
            }
            case 3:{
                int bad = rest - 30;
                System.out.println("Bad: на сегодня осталось: " + bad + "min");
                rest -= 30;
                break;
            }
            case 2:
            case 1:
            case 0:{
                int tragedy = 0;
                System.out.println("Tragedy: на сегодня осталось: " + tragedy + "min");
                rest = 0;
                }











    }   }
}
