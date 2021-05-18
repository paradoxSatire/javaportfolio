package com.paradoxsatire.queermod.init.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModGroup extends ItemGroup {


	private int Number2 = 0;

	public ModGroup(int Number, String lable) {
		super(lable);
		Number2 = Number;
	}

	@Override
	public ItemStack makeIcon() {
		if (this.Number2 == 0) {
			return ModItems.QUEER_JUICE.get().getDefaultInstance();
		}
		else if (this.Number2 == 1) {
			return ModItems.NONBYNGOT_AXE.get().getDefaultInstance();
		}
		else if (this.Number2 == 2) {
			return ModItems.LESBIANGOT_SWORD.get().getDefaultInstance();
		}
		else {
			return ModItems.QUEER_JUICE.get().getDefaultInstance();
		}
	}

}
