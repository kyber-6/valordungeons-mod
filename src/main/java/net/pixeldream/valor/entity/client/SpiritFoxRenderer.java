package net.pixeldream.valor.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.pixeldream.valor.Valor;
import net.pixeldream.valor.entity.SpiritFoxEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class SpiritFoxRenderer extends GeoEntityRenderer<SpiritFoxEntity> {
    public SpiritFoxRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new SpiritFoxModel());
    }

    @Override
    public Identifier getTextureLocation(SpiritFoxEntity animatable) {
        return new Identifier(Valor.MOD_ID, "textures/entity/spirit_fox.png");
    }
}
