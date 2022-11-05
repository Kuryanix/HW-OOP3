import Animals.*;
import Transport.Bus;
import Transport.Train;

// Задание 1 и 2
public class Main {


    public static void main(String[] args) {



        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия","", 301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия","", 270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        lastochka.getInfoTransport();
        leningrad.getInfoTransport();
        lastochka.refill();

        Bus sovet = new Bus("Советский", "СС-201", 1985, "Россия", "синий", 90);
        Bus vaz = new Bus("ВАЗ", "Е-112", 2003, "Россия", "серый", 115);
        Bus hightech = new Bus("Хайтэк", "ХОВ-01", 2021, "Россия", "желтый", 145);

        sovet.getInfoTransport();
        vaz.getInfoTransport();
        hightech.getInfoTransport();
        sovet.refill();

        System.out.println();

        // Задание 3

        Herbivores gazelle = new Herbivores("Газель", 7, "сафари", 30, "трава");
        Herbivores giraffe = new Herbivores("Жираф", 4, "сафари", 17, "трава");
        Herbivores horse = new Herbivores("Лошадь", 6, "поле", 26, "трава");

        Predators hyena = new Predators("Гиена", 4, "сафари", 21, "мясо");
        Predators tiger = new Predators("Тигр", 5, "лес", 28, "мясо");
        Predators bear = new Predators("Медведь", 8, "лес", 24, "мясо");

        Amphibians frog = new Amphibians("Лягушка", 1, "болото");
        Amphibians waterSnake = new Amphibians("Уж пресноводный", 2, "болото");

        Flightless peacock = new Flightless("Павлин", 11, "лес", "");
        Flightless penguin = new Flightless("Пингвин", 4, "север", "по земле");
        Flightless dodo = new Flightless("Птица додо", 3, "джунгли", "по земле");

        Flying gull = new Flying("Чайка", 2, "морское побережье", "по воздуху");
        Flying albatross = new Flying("Альбатрос", 9, "морское побережье", "по воздуху");
        Flying falcon = new Flying("Сокол", 8, "лес", "по воздуху");


        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(waterSnake);
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodo);
        System.out.println(gull);
        System.out.println(albatross);
        System.out.println(falcon);
    }
}