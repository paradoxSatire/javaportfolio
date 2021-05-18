package com.paradoxsatire.queermod.init;

import com.paradoxsatire.queermod.QueerMod;
import com.paradoxsatire.queermod.init.item.ModItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, QueerMod.ID);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, QueerMod.ID);
	
	public static void initRegister() { 
		//get eventBus
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		//Register items and blocks.
		
		ITEMS.register(bus);
		BLOCKS.register(bus);
		
		//Register ModItems & ModBlocks
		ModItems.initRegister();
		
	}
	
}
