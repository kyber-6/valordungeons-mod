package net.pixeldream.valor;

import net.fabricmc.api.ModInitializer;
import net.pixeldream.valor.registry.EntityRegistry;
import net.pixeldream.valor.registry.ItemGroupRegistry;
import net.pixeldream.valor.registry.ItemRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class Valor implements ModInitializer {
    public static final String MOD_ID = "valor";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        GeckoLib.initialize();
        ItemRegistry.initialize();
        ItemGroupRegistry.initialize();
        EntityRegistry.initialize();
    }
}