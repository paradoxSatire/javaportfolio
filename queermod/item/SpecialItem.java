package com.paradoxsatire.queermod.item;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class SpecialItem extends Item{

	public SpecialItem(Properties properties) {
		super(properties);
	}
	
	@Override
	public void appendHoverText(ItemStack p_77624_1_, World p_77624_2_, List<ITextComponent> tooltip,
			ITooltipFlag p_77624_4_) {
		super.appendHoverText(p_77624_1_, p_77624_2_, tooltip, p_77624_4_);
		tooltip.add(new StringTextComponent("\u00A7dWarning: Eating will involve nawing down on a glass bottle!"));
	}

}
