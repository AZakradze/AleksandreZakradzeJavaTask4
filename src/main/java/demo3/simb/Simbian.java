package demo3.simb;

public class Simbian {

    protected String title;

    public Simbian(String title) {
        this.title = title;
    }

    public static <SIMBIAN extends Simbian> void printSimbian (SIMBIAN simbian) {
        System.out.println(simbian.toString());
    }

    public void keyboard() {
        System.out.println("Keyboard");
    }

    @Override
    public String toString() {
        return "Simbian{" +
                "title='" + title + '\'' +
                '}';
    }
}
