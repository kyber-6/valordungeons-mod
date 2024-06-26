package net.pixeldreamstudios.valordungeons;

import net.fabricmc.api.ModInitializer;
import net.pixeldreamstudios.valordungeons.registry.ItemGroupRegistry;
import net.pixeldreamstudios.valordungeons.registry.ItemRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValorDungeons implements ModInitializer {
    public static final String MOD_ID = "valordungeons";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ItemRegistry.initialize();
        ItemGroupRegistry.initialize();
    }
}