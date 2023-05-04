public abstract class SeaTransport {
    private ColorEnum colorEnum;
    private int yearOfIssue;

    public SeaTransport(ColorEnum colorEnum, int yearOfIssue) {
        this.colorEnum = colorEnum;
        this.yearOfIssue = yearOfIssue;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }
}
