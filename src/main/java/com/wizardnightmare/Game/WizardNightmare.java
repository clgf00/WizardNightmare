package com.wizardnightmare.Game;

import com.wizardnightmare.Interactive;
import com.wizardnightmare.demiurge.Demiurge;

import java.io.Console;

public class WizardNightmare {
    public static void main(String[] args) {
        Demiurge demiurge = new Demiurge();
        Interactive console = new Console(demiurge);
        console.configure();
        console.start();
    }
}
