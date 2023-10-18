package net.pixeldream.valor;

import mod.azure.azurelib.AzureLib;
import net.fabricmc.api.ModInitializer;
import net.pixeldream.valor.registry.ItemGroupRegistry;
import net.pixeldream.valor.registry.ItemRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Valor implements ModInitializer {
    public static final String MOD_ID = "valor";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        AzureLib.initialize();
        ItemRegistry.initialize();
        ItemGroupRegistry.initialize();
    }
}