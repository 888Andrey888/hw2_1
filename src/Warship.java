public final class Warship extends Ship{
    private int countOfRockets;
    public Warship(ColorEnum colorEnum, int yearOfIssue, String name, int countOfRockets) {
        super(colorEnum, yearOfIssue, name);
        this.countOfRockets = countOfRockets;
    }
    public Warship(ColorEnum colorEnum, int yearOfIssue, String name, Coords coords, int countOfRockets) {
        super(colorEnum, yearOfIssue, name, coords);
        this.countOfRockets = countOfRockets;
    }

    public int getCountOfRockets() {
        return countOfRockets;
    }

    @Override
    public void makeSignal() {
        System.out.println("ТРУУУ ТРУУУ");
    }

    @Override
    public String printInfo() {
        return super.printInfo() +
                "\nCount of rockets: " + this.countOfRockets;
    }
}
