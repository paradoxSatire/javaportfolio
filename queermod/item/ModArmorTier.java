package com.paradoxsatire.queermod.item;

import java.util.function.Supplier;

import com.paradoxsatire.queermod.QueerMod;
import com.paradoxsatire.queermod.init.item.ModItems;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public enum ModArmorTier implements IArmorMaterial{
	GAY("gay", 4096, new int[] {5,7,8,5}, 20, () -> {
        return Ingredient.of(ModItems.QUEER_JUICE.get());
    }, "entity.enderman.teleport", 2.0f, 0.2f),
	
	LESBIAN("lesbian", 4096, new int[] {5,7,8,5}, 20, () -> {
        return Ingredient.of(ModItems.QUEER_JUICE.get());
    }, "entity.enderman.teleport", 2.0f, 0.2f),
	
	BI("bi", 4096, new int[] {5,7,8,5}, 20, () -> {
        return Ingredient.of(ModItems.QUEER_JUICE.get());
    }, "entity.enderman.teleport", 2.0f, 0.2f),
	TRANS("trans", 4096, new int[] {5,7,8,5}, 20, () -> {
        return Ingredient.of(ModItems.QUEER_JUICE.get());
    }, "entity.enderman.teleport", 2.0f, 0.2f),
	ACE("ace", 4096, new int[] {5,7,8,5}, 20, () -> {
        return Ingredient.of(ModItems.QUEER_JUICE.get());
    }, "entity.enderman.teleport", 2.0f, 0.2f),
	NB("nb", 4096, new int[] {5,7,8,5}, 20, () -> {
        return Ingredient.of(ModItems.QUEER_JUICE.get());
    }, "entity.enderman.teleport", 2.0f, 0.2f),
	PAN("pan", 4096, new int[] {5,7,8,5}, 20, () -> {
        return Ingredient.of(ModItems.QUEER_JUICE.get());
    }, "entity.enderman.teleport", 2.0f, 0.2f);
	
	private static final int[] max_damage_array = new int[] {13,15,16,11};
	private String name, equipSound;
	private int durability, enchantability;
	private final LazyValue<Ingredient> repairMaterial;
	private int[] damageReductionAmount;
	private float toughness, knockbackR;
	
	
	private ModArmorTier(String name, int durability, int[] damageReductionAmount, int enchantability, Supplier<Ingredient> repairMaterial, String equipSound, float toughness, float knockbackR) {
		this.name = name;
		this.durability = durability;
		this.enchantability = enchantability;
		this.damageReductionAmount = damageReductionAmount;
		this.repairMaterial = new LazyValue<>(repairMaterial);
		this.toughness = toughness;
		this.equipSound = equipSound;
		this.knockbackR = knockbackR;
	}
	
	@Override
	public int getDefenseForSlot(EquipmentSlotType arg0) {
		// TODO Auto-generated method stub
		return this.damageReductionAmount[arg0.getIndex()];
	}

	@Override
	public int getDurabilityForSlot(EquipmentSlotType arg0) {
		// TODO Auto-generated method stub
		return max_damage_array[arg0.getIndex()] * this.durability;
	}

	@Override
	public int getEnchantmentValue() {
		// TODO Auto-generated method stub
		return this.enchantability;
	}

	@Override
	public SoundEvent getEquipSound() {
		// TODO Auto-generated method stub
		return new SoundEvent(new ResourceLocation(this.equipSound));
	}

	@Override
	public float getKnockbackResistance() {
		// TODO Auto-generated method stub
		return this.knockbackR;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return QueerMod.ID + ":" + this.name;
	}

	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return this.repairMaterial.get();
	}

	@Override
	public float getToughness() {
		// TODO Auto-generated method stub
		return this.toughness;
	}

}
