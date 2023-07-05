package net.pixeldream.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pixeldream.Valor;

public class ItemRegistry {
    public static final Item FIRST_DUNGEON_KEY = registerItem("first_dungeon_key", new Item(new FabricItemSettings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Valor.MOD_ID, name), item);
    }

    public static void init() {
        Valor.LOGGER.info("Registering items for " + Valor.MOD_ID);
    }
}
