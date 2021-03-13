package ru.geekbrains.hworks.hw13;

/* Task 1: Все участники должны стартовать одновременно, несмотря на разное время  подготовки. В тоннель не может
           одновременно заехать больше половины участников (условность).
   Task 2: Попробуйте все это синхронизировать.
   Task 3: Первый участник, пересекший финишную черту, объявляется победителем (в момент пересечения этой самой черты).
   Task 4: Победитель должен быть только один (ситуация с 0 или 2+ победителями недопустима).
   Task 5: Когда все завершат гонку, нужно выдать объявление об окончании. */

public class HomeWork_13 {
    public static final int CARS_COUNT = 5;

    public static void main(String[] args) {

        Stage[] stages = {
                new Road(60),
                new Tunnel(CARS_COUNT / 2),
                new Road(40)
        };

        Race race = new Race(stages, CARS_COUNT);
        race.start();
    }
}