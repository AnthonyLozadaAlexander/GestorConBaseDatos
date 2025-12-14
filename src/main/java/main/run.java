package main;

import com.formdev.flatlaf.FlatLightLaf;
import IGU.FrmEmpleado;

public class run {
    public static void main(String[] args) {
        FlatLightLaf.setup();
        FrmEmpleado window = new FrmEmpleado();
        window.setVisible(true);
    }

}
