package com.wizardnightmare.console;

import com.wizardnightmare.Game.loaderManual.DungeonLoaderManual;
import com.wizardnightmare.Interactive;

public class Console implements Interactive {

    void configure() {

        demiurge.loadEnvironment(new DungeonLoaderManual());

        containerManager = new ConsoleContainerManager(sn, demiurge.getContainerManager());
        homeManager = new ConsoleHomeManager(sn, demiurge.getHomeManager(), containerManager);
        dungeonManager = new ConsoleDungeonManager(sn, demiurge.getDungeonManager(), containerManager);
    }

    void start() {

        while (true) {
            try {
                if (atHome)
                    homeManager.home();
                else
                    dungeonManager.dungeon();
            }
        }
    }
}
