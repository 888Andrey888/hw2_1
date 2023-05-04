public class Ship extends SeaTransport {
    private String name;
    private Coords coords = new Coords(0, 0);

    public Ship(ColorEnum colorEnum, int yearOfIssue, String name) {
        super(colorEnum, yearOfIssue);
        this.name = name;
    }

    public Ship(ColorEnum colorEnum, int yearOfIssue, String name, Coords coords) {
        super(colorEnum, yearOfIssue);
        this.name = name;
        this.coords = coords;
    }

    public String getName() {
        return name;
    }

    public Coords getCoords() {
        return coords;
    }

    public void makeSignal() {
        System.out.println("ТУУУУ");
    }

    public void makeSignal(int numbers) {
        for (int i = 0; i < numbers; i++) {
            System.out.print("ТУУУУ ");
        }
        System.out.println();
    }

    public String printInfo() {
        return "Name: " + this.name +
                "\nColor: " + super.getColorEnum() +
                "\nYear of issue: " + super.getYearOfIssue() +
                "\nCoordinate x: " + this.coords.getX() +
                "\nCoordinate y: " + this.coords.getY();
    }
}
