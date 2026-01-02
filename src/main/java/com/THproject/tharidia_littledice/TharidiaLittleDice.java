package com.THproject.tharidia_littledice;

import com.THproject.tharidia_littledice.entity.ModEntities;
import com.THproject.tharidia_littledice.item.DiceItem;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

@Mod("tharidia_littledice")
public class TharidiaLittleDice {
    public static final String MODID = "tharidia_littledice";
    public static final Logger LOGGER = LogUtils.getLogger();
    
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, MODID);

    // Dice item
    public static final DeferredItem<Item> DICE = ITEMS.register("dice",
            () -> new DiceItem(new Item.Properties().stacksTo(16)));

    // Creative tab
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> THARIDIA_TAB = CREATIVE_MODE_TABS
            .register("tharidia_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + MODID))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> DICE.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(DICE.get());
                    }).build());

    public TharidiaLittleDice(IEventBus modEventBus, ModContainer modContainer) {
        // Register items
        ITEMS.register(modEventBus);
        
        // Register entities
        ModEntities.ENTITIES.register(modEventBus);
        
        // Register creative tab
        CREATIVE_MODE_TABS.register(modEventBus);
        
        LOGGER.info("Tharidia Little Dice Mod Loaded");
    }
}
