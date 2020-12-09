package demo3;

import demo3.simb.Nokia;
import demo3.simb.Panasonic;
import demo3.simb.Simbian;
import demo3.smart.IphoneX;
import demo3.smart.SamsungNote;
import demo3.smart.SmartPhone;

public class Main {

    public static void main(String[] args) {
        SmartPhone iphoneX = new IphoneX("Iphone X");
        iphoneX.touchScreen();
        SmartPhone samsungNote = new SamsungNote("Samsung Note");
        samsungNote.touchScreen();

        Simbian nokia = new Nokia("Nokia");
        nokia.keyboard();
        Simbian panasonic = new Panasonic("Panasonic");
        panasonic.keyboard();

        SmartPhone.printSmartPhone(iphoneX);
        SmartPhone.printSmartPhone(samsungNote);

        Simbian.printSimbian(nokia);
        Simbian.printSimbian(panasonic);

    }

}
