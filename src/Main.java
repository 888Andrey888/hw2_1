public class Main {
    public static void main(String[] args) {
        Coords coords = new Coords(10, 20);
        Coords coords1 = new Coords(5, 10);

        Ship ship = new Ship(ColorEnum.BLACK, 2000, "Nomad", coords);
        System.out.println(ship.printInfo());
        ship.makeSignal();
        ship.makeSignal(2);

        Warship warship1 = new Warship(ColorEnum.BLUE, 2020, "Voryag", 100);
        System.out.println(warship1.printInfo());
        warship1.makeSignal();
        warship1.makeSignal(3);

        Warship warship2 = new Warship(ColorEnum.BLUE, 2020, "Voryag", coords1, 100);
        System.out.println(warship2.printInfo());
        warship2.makeSignal();
        warship2.makeSignal(4);
    }
}