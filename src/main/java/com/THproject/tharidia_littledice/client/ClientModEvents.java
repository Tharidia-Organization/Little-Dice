package com.THproject.tharidia_littledice.client;

import com.THproject.tharidia_littledice.TharidiaLittleDice;
import com.THproject.tharidia_littledice.entity.ModEntities;
import com.THproject.tharidia_littledice.client.renderer.DiceEntityRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

/**
 * Client-side mod event handlers - Dice only
 */
@EventBusSubscriber(modid = TharidiaLittleDice.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
    
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.DICE.get(), DiceEntityRenderer::new);
    }
}
