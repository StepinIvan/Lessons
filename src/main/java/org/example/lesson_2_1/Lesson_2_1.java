package org.example.lesson_2_1;

public class Lesson_2_1 {
    // Задание:
    // 1 Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти
    //классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в
    //консоль).
    //2 Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
    //должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
    //печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
    //3 Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
    //этот набор препятствий.
    //4 * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения
    //на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он
    //препятствий не идет.
    public static void main(String[] args) {
        Human human = new Human("Человек");
        Cat cat = new Cat("Кот");
        Bot bot = new Bot("Робот");
        Barriers treadmill1 = new Treadmill(10);
        Barriers wall1 = new Wall(1);
        Barriers treadmill2 = new Treadmill(100);
        Barriers wall2 = new Wall(5);

        Participants[] participants = {human, cat, bot};
        Barriers[] barriers = {treadmill1, wall1,treadmill2,wall2};
        for (int i = 0; i < participants.length; i++) {
            for (int j =0; j < barriers.length;j++) {
                if(participants[i].getSuccess()) {
                    if (barriers[j] instanceof Treadmill) {
                        participants[i].run(barriers[j]);
                    } else {
                        participants[i].jump(barriers[j]);
                    }
                }
            }
        }

    }
}
