package demo3.smart;

import demo3.simb.Simbian;

public class SmartPhone {

    protected String title;

    public SmartPhone(String title) {
        this.title = title;
    }

    public static <SMART extends SmartPhone> void printSmartPhone (SMART smart) {
        System.out.println(smart.toString());
    }

    public void touchScreen() {
        System.out.println("Touch Screen");
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "title='" + title + '\'' +
                '}';
    }
}
