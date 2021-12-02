public class Application {

    public static void main(String[] args) {
        Sportsman ivan = new Sportsman("Иван", 4);
        Sportsman anya = new Sportsman("Аня", 6);
        Sportsman anton = new Sportsman("Антон", 8);
        Sportsman artur = new Sportsman("Артур", 2);
        Sportsman sveta = new Sportsman("Света", 1);
        Sportsman olya = new Sportsman("Оля", 10);
        Sportsman zahar = new Sportsman("Захар", 9);
        Sportsman ilya = new Sportsman("Илья", 7);
        Sportsman mark = new Sportsman("Марк", 7);
        Sportsman kolya = new Sportsman("Коля", 2);

        Stick stick = new Stick();

        ivan.takeStick(stick);
        ivan.runStick();
        ivan.transference(anya);
        anya.runStick();
        anya.transference(anton);
        anton.runStick();
        anton.transference(artur);
        artur.runStick();
        artur.transference(sveta);
        sveta.runStick();
        sveta.transference(olya);
        olya.runStick();
        olya.transference(zahar);
        zahar.runStick();
        zahar.transference(ilya);
        ilya.runStick();
        ilya.transference(mark);
        mark.runStick();
        mark.transference(kolya);
        kolya.runStick();
    }
}
