package net.vovagava.tutormod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.vovagava.tutormod.ExampleMod;
import net.vovagava.tutormod.block.ModBlocks;
import net.vovagava.tutormod.item.ModFoodProperties;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ALEXANDRITE_ITEMS_TAB = CREATIVE_MODE_TABS.register("alexandrite_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItem.ALEXANDRITE.get()))
                    .title(Component.translatable("creativetab.tutormod.alexandrite_items"))
                    .displayItems((itemDisplayParameters, output) ->{
                        output.accept(ModItem.ALEXANDRITE.get());
                        output.accept(ModItem.RAW_ALEXANDRITE.get());
                        output.accept(ModItem.CHISEL.get());
                        output.accept(ModItem.KOHLRABI.get());
                        output.accept(ModItem.AURORA_ASHES.get());

                    }).build());
    public static final RegistryObject<CreativeModeTab> ALEXANDRITE_BlOCKS_TAB = CREATIVE_MODE_TABS.register("alexandrite_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ALEXANDRITE_BLOCK.get()))
                    .withTabsBefore(ALEXANDRITE_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.tutormod.alexandrite_blocks"))
                    .displayItems((itemDisplayParameters, output) ->{

                        output.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());

                        output.accept(ModBlocks.ALEXANDRITE_ORE.get());
                        output.accept(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE.get());

                        output.accept(ModBlocks.MAGIC_BLOCK.get());

                    }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
