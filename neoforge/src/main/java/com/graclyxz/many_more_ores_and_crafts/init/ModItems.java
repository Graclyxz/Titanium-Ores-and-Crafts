package com.graclyxz.many_more_ores_and_crafts.init;

import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.List;

import static com.graclyxz.many_more_ores_and_crafts.init.ModMaterials.Armor;
import static com.graclyxz.many_more_ores_and_crafts.init.ModMaterials.Tool;
import static com.graclyxz.many_more_ores_and_crafts.init.ModRegisters.BLOCKS;
import static com.graclyxz.many_more_ores_and_crafts.init.ModRegisters.ITEMS;
import static com.graclyxz.many_more_ores_and_crafts.init.ModRegisters.*;


public class ModItems {

    /*-*-*-*-*-*-*-*-* Item and Blocks creation *-*-*-*-*-*-*-*-*/

    /* **** Items Register ****/
    /* 1. Items Name 
       2. Items ToolMaterial 
       3. Items ArmorMaterial 
       4. Tools attributes float[]: sword, pickaxe, axe, hoe, shovel 
       5. Item propeties */

    /* **** Blocks Register ****/
    /* 1. Blocks Name 
       2. Strength ore ottribute 
       3. Ore Sound
       4. BlockBehaviour prpeties
       5. Item propeties */


    public static final List<DeferredItem<Item>> TITANIUM_ITEMS =  registerAllItems("titanium", Tool.TITANIUM, Armor.TITANIUM,
            new float[]{8f, -2.6f}, new float[]{4f, -2.8f}, new float[]{8f, -3f}, new float[]{1, -2f}, new float[]{5.5f, -3f},
            new Item.Properties().rarity(Rarity.EPIC));
    public static final List<DeferredBlock<Block>> TITANIUM_BLOCKS =  registerAllBlocks("titanium",  new float[]{10f, 14f}, SoundType.DEEPSLATE,
            BlockBehaviour.Properties.of(),
            new Item.Properties().rarity(Rarity.EPIC));

    public static void init(IEventBus bus) {
        ITEMS.register(bus);
        BLOCKS.register(bus);
    }
}