package net.pixeldream.valor;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.pixeldream.valor.entity.client.SpiritFoxRenderer;
import net.pixeldream.valor.registry.EntityRegistry;

public class ValorClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(EntityRegistry.SPIRIT_FOX, SpiritFoxRenderer::new);
    }
}
