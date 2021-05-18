package com.paradoxsatire.queermod.init.item;

import com.paradoxsatire.queermod.QueerMod;
import com.paradoxsatire.queermod.init.Registration;
import com.paradoxsatire.queermod.item.ModArmorTier;
import com.paradoxsatire.queermod.item.ModItemTier;
import com.paradoxsatire.queermod.item.SpecialItem;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.AxeItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
	
	public static final RegistryObject<SpecialItem> QUEER_JUICE = Registration.ITEMS.register("queer_juice", () ->
	new SpecialItem(new Item.Properties().tab(QueerMod.QUEER_ITEMS).food(new Food.Builder()
			.effect(() -> new EffectInstance(Effects.DAMAGE_RESISTANCE, 2000, 4), 1.0f).nutrition(4)
			.saturationMod(0.5f).alwaysEat().build()))); 
	
	
	public static final RegistryObject<Item> GAY_INGOT = Registration.ITEMS.register("gayngot", () ->
	new Item(new Item.Properties().tab(QueerMod.QUEER_ITEMS))); 
	public static final RegistryObject<Item> LESBIAN_INGOT = Registration.ITEMS.register("lesbiangot", () ->
	new Item(new Item.Properties().tab(QueerMod.QUEER_ITEMS))); 
	public static final RegistryObject<Item> BI_INGOT = Registration.ITEMS.register("bingot", () ->
	new Item(new Item.Properties().tab(QueerMod.QUEER_ITEMS))); 
	public static final RegistryObject<Item> TRANS_INGOT = Registration.ITEMS.register("trangot", () ->
	new Item(new Item.Properties().tab(QueerMod.QUEER_ITEMS))); 
	public static final RegistryObject<Item> ACE_INGOT = Registration.ITEMS.register("acengot", () ->
	new Item(new Item.Properties().tab(QueerMod.QUEER_ITEMS))); 
	public static final RegistryObject<Item> NB_INGOT = Registration.ITEMS.register("nonbyngot", () ->
	new Item(new Item.Properties().tab(QueerMod.QUEER_ITEMS))); 
	public static final RegistryObject<Item> PAN_INGOT = Registration.ITEMS.register("pangot", () ->
	new Item(new Item.Properties().tab(QueerMod.QUEER_ITEMS))); 
	
	public static final RegistryObject<AxeItem> GAYNGOT_AXE = Registration.ITEMS.register("gayngot_axe", () ->
	new AxeItem(ModItemTier.GAYNGOT, 1.0f, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS)));
	public static final RegistryObject<AxeItem> LESBIANGOT_AXE = Registration.ITEMS.register("lesbiangot_axe", () ->
	new AxeItem(ModItemTier.GAYNGOT, 1.0f, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS))); 
	public static final RegistryObject<AxeItem> BINGOT_AXE = Registration.ITEMS.register("bingot_axe", () ->
	new AxeItem(ModItemTier.GAYNGOT, 1.0f, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS))); 
	public static final RegistryObject<AxeItem> TRANGOT_AXE = Registration.ITEMS.register("trangot_axe", () ->
	new AxeItem(ModItemTier.GAYNGOT, 1.0f, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS)));  
	public static final RegistryObject<AxeItem> ACENGOT_AXE = Registration.ITEMS.register("acengot_axe", () ->
	new AxeItem(ModItemTier.GAYNGOT, 1.0f, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS))); 
	public static final RegistryObject<AxeItem> NONBYNGOT_AXE = Registration.ITEMS.register("nonbyngot_axe", () ->
	new AxeItem(ModItemTier.GAYNGOT, 1.0f, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS))); 
	public static final RegistryObject<AxeItem> PANGOT_AXE = Registration.ITEMS.register("pangot_axe", () ->
	new AxeItem(ModItemTier.GAYNGOT, 1.0f, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS)));
	
	public static final RegistryObject<PickaxeItem> GAYNGOT_PICK = Registration.ITEMS.register("gayngot_pick", () ->
	new PickaxeItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS)));
	public static final RegistryObject<PickaxeItem> LESBIANGOT_PICK = Registration.ITEMS.register("lesbiangot_pick", () ->
	new PickaxeItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS))); 
	public static final RegistryObject<PickaxeItem> BINGOT_PICK = Registration.ITEMS.register("bingot_pick", () ->
	new PickaxeItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS))); 
	public static final RegistryObject<PickaxeItem> TRANGOT_PICK = Registration.ITEMS.register("trangot_pick", () ->
	new PickaxeItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS)));  
	public static final RegistryObject<PickaxeItem> ACENGOT_PICK = Registration.ITEMS.register("acengot_pick", () ->
	new PickaxeItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS))); 
	public static final RegistryObject<PickaxeItem> NONBYNGOT_PICK = Registration.ITEMS.register("nonbyngot_pick", () ->
	new PickaxeItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS))); 
	public static final RegistryObject<PickaxeItem> PANGOT_PICK = Registration.ITEMS.register("pangot_pick", () ->
	new PickaxeItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS))); 
	

	public static final RegistryObject<HoeItem> GAYNGOT_HOE = Registration.ITEMS.register("gayngot_hoe", () ->
	new HoeItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS)));
	public static final RegistryObject<HoeItem> LESBIANGOT_HOE = Registration.ITEMS.register("lesbiangot_hoe", () ->
	new HoeItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS))); 
	public static final RegistryObject<HoeItem> BINGOT_HOE = Registration.ITEMS.register("bingot_hoe", () ->
	new HoeItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS))); 
	public static final RegistryObject<HoeItem> TRANGOT_HOE = Registration.ITEMS.register("trangot_hoe", () ->
	new HoeItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS)));  
	public static final RegistryObject<HoeItem> ACENGOT_HOE = Registration.ITEMS.register("acengot_hoe", () ->
	new HoeItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS))); 
	public static final RegistryObject<HoeItem> NONBYNGOT_HOE = Registration.ITEMS.register("nonbyngot_hoe", () ->
	new HoeItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS))); 
	public static final RegistryObject<HoeItem> PANGOT_HOE = Registration.ITEMS.register("pangot_hoe", () ->
	new HoeItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS))); 
	
	
	public static final RegistryObject<ShovelItem> GAYNGOT_SHOVEL = Registration.ITEMS.register("gayngot_shovel", () ->
	new ShovelItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS)));
	public static final RegistryObject<ShovelItem> LESBIANGOT_SHOVEL = Registration.ITEMS.register("lesbiangot_shovel", () ->
	new ShovelItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS))); 
	public static final RegistryObject<ShovelItem> BINGOT_SHOVEL = Registration.ITEMS.register("bingot_shovel", () ->
	new ShovelItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS))); 
	public static final RegistryObject<ShovelItem> TRANGOT_SHOVEL = Registration.ITEMS.register("trangot_shovel", () ->
	new ShovelItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS)));  
	public static final RegistryObject<ShovelItem> ACENGOT_SHOVEL = Registration.ITEMS.register("acengot_shovel", () ->
	new ShovelItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS))); 
	public static final RegistryObject<ShovelItem> NONBYNGOT_SHOVEL = Registration.ITEMS.register("nonbyngot_shovel", () ->
	new ShovelItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS))); 
	public static final RegistryObject<ShovelItem> PANGOT_SHOVEL = Registration.ITEMS.register("pangot_shovel", () ->
	new ShovelItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_TOOLS)));
	

	public static final RegistryObject<SwordItem> GAYNGOT_SWORD = Registration.ITEMS.register("gayngot_sword", () ->
	new SwordItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<SwordItem> LESBIANGOT_SWORD = Registration.ITEMS.register("lesbiangot_sword", () ->
	new SwordItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_COMBAT))); 
	public static final RegistryObject<SwordItem> BINGOT_SWORD = Registration.ITEMS.register("bingot_sword", () ->
	new SwordItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_COMBAT))); 
	public static final RegistryObject<SwordItem> TRANGOT_SWORD = Registration.ITEMS.register("trangot_sword", () ->
	new SwordItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));  
	public static final RegistryObject<SwordItem> ACENGOT_SWORD = Registration.ITEMS.register("acengot_sword", () ->
	new SwordItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_COMBAT))); 
	public static final RegistryObject<SwordItem> NONBYNGOT_SWORD = Registration.ITEMS.register("nonbyngot_sword", () ->
	new SwordItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_COMBAT))); 
	public static final RegistryObject<SwordItem> PANGOT_SWORD = Registration.ITEMS.register("pangot_sword", () ->
	new SwordItem(ModItemTier.GAYNGOT, 1, 2.0f, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	
	
	public static final RegistryObject<ArmorItem> GAY_HELMET = Registration.ITEMS.register("gay_helmet", () -> 
	new ArmorItem(ModArmorTier.GAY, EquipmentSlotType.HEAD, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> GAY_CHESTPLATE = Registration.ITEMS.register("gay_chestplate", () -> 
	new ArmorItem(ModArmorTier.GAY, EquipmentSlotType.CHEST, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> GAY_LEGGINGS= Registration.ITEMS.register("gay_leggings", () -> 
	new ArmorItem(ModArmorTier.GAY, EquipmentSlotType.LEGS, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> GAY_BOOTS = Registration.ITEMS.register("gay_boots", () -> 
	new ArmorItem(ModArmorTier.GAY, EquipmentSlotType.FEET, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));

	public static final RegistryObject<ArmorItem> LESBIAN_HELMET = Registration.ITEMS.register("lesbian_helmet", () -> 
	new ArmorItem(ModArmorTier.LESBIAN, EquipmentSlotType.HEAD, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> LESBIAN_CHESTPLATE = Registration.ITEMS.register("lesbian_chestplate", () -> 
	new ArmorItem(ModArmorTier.LESBIAN, EquipmentSlotType.CHEST, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> LESBIAN_LEGGINGS= Registration.ITEMS.register("lesbian_leggings", () -> 
	new ArmorItem(ModArmorTier.LESBIAN, EquipmentSlotType.LEGS, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> LESBIAN_BOOTS = Registration.ITEMS.register("lesbian_boots", () -> 
	new ArmorItem(ModArmorTier.LESBIAN, EquipmentSlotType.FEET, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));

	public static final RegistryObject<ArmorItem> BI_HELMET = Registration.ITEMS.register("bi_helmet", () -> 
	new ArmorItem(ModArmorTier.BI, EquipmentSlotType.HEAD, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> BI_CHESTPLATE = Registration.ITEMS.register("bi_chestplate", () -> 
	new ArmorItem(ModArmorTier.BI, EquipmentSlotType.CHEST, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> BI_LEGGINGS= Registration.ITEMS.register("bi_leggings", () -> 
	new ArmorItem(ModArmorTier.BI, EquipmentSlotType.LEGS, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> BI_BOOTS = Registration.ITEMS.register("bi_boots", () -> 
	new ArmorItem(ModArmorTier.BI, EquipmentSlotType.FEET, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));

	public static final RegistryObject<ArmorItem> TRANS_HELMET = Registration.ITEMS.register("trans_helmet", () -> 
	new ArmorItem(ModArmorTier.TRANS, EquipmentSlotType.HEAD, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> TRANS_CHESTPLATE = Registration.ITEMS.register("trans_chestplate", () -> 
	new ArmorItem(ModArmorTier.TRANS, EquipmentSlotType.CHEST, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> TRANS_LEGGINGS= Registration.ITEMS.register("trans_leggings", () -> 
	new ArmorItem(ModArmorTier.TRANS, EquipmentSlotType.LEGS, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> TRANS_BOOTS = Registration.ITEMS.register("trans_boots", () -> 
	new ArmorItem(ModArmorTier.TRANS, EquipmentSlotType.FEET, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));

	public static final RegistryObject<ArmorItem> ACE_HELMET = Registration.ITEMS.register("ace_helmet", () -> 
	new ArmorItem(ModArmorTier.ACE, EquipmentSlotType.HEAD, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> ACE_CHESTPLATE = Registration.ITEMS.register("ace_chestplate", () -> 
	new ArmorItem(ModArmorTier.ACE, EquipmentSlotType.CHEST, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> ACE_LEGGINGS= Registration.ITEMS.register("ace_leggings", () -> 
	new ArmorItem(ModArmorTier.ACE, EquipmentSlotType.LEGS, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> ACE_BOOTS = Registration.ITEMS.register("ace_boots", () -> 
	new ArmorItem(ModArmorTier.ACE, EquipmentSlotType.FEET, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));

	public static final RegistryObject<ArmorItem> NB_HELMET = Registration.ITEMS.register("nb_helmet", () -> 
	new ArmorItem(ModArmorTier.NB, EquipmentSlotType.HEAD, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> NB_CHESTPLATE = Registration.ITEMS.register("nb_chestplate", () -> 
	new ArmorItem(ModArmorTier.NB, EquipmentSlotType.CHEST, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> NB_LEGGINGS= Registration.ITEMS.register("nb_leggings", () -> 
	new ArmorItem(ModArmorTier.NB, EquipmentSlotType.LEGS, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> NB_BOOTS = Registration.ITEMS.register("nb_boots", () -> 
	new ArmorItem(ModArmorTier.NB, EquipmentSlotType.FEET, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));

	public static final RegistryObject<ArmorItem> PAN_HELMET = Registration.ITEMS.register("pan_helmet", () -> 
	new ArmorItem(ModArmorTier.PAN, EquipmentSlotType.HEAD, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> PAN_CHESTPLATE = Registration.ITEMS.register("pan_chestplate", () -> 
	new ArmorItem(ModArmorTier.PAN, EquipmentSlotType.CHEST, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> PAN_LEGGINGS= Registration.ITEMS.register("pan_leggings", () -> 
	new ArmorItem(ModArmorTier.PAN, EquipmentSlotType.LEGS, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	public static final RegistryObject<ArmorItem> PAN_BOOTS = Registration.ITEMS.register("pan_boots", () -> 
	new ArmorItem(ModArmorTier.PAN, EquipmentSlotType.FEET, new Item.Properties().tab(QueerMod.QUEER_COMBAT)));
	
	public static void initRegister() {}
}
