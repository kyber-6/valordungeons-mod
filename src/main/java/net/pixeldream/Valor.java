package net.pixeldream;

import net.fabricmc.api.ModInitializer;
import net.pixeldream.registry.ItemGroupRegistry;
import net.pixeldream.registry.ItemRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Valor implements ModInitializer {
    public static final String MOD_ID = "valor";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ItemRegistry.init();
        ItemGroupRegistry.init();
    }
}