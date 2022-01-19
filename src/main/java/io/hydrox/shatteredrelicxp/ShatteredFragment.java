/*
 * Copyright (c) 2022 Hydrox6 <ikada@protonmail.ch>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package io.hydrox.shatteredrelicxp;

import net.runelite.api.Client;

public enum ShatteredFragment
{
	UNHOLY_WARRIOR,
	TACTICAL_DUELIST,
	UNHOLY_RANGER,
	BOTTOMLESS_QUIVER,
	UNHOLY_WIZARD,
	ARCANE_CONDUIT,
	THRALL_DAMAGE,
	LIVIN_ON_A_PRAYER,
	DIVINE_RESTORATION,
	PRAYING_RESPECTS,
	LARGER_RECHARGER,
	SPECIAL_DISCOUNT,
	VENOMASTER,
	SLAY_ALL_DAY,
	SUPERIOR_TRACKING,
	SLAY_N_PAY,
	BANDOSIAN_MIGHT,
	ARMADYLEAN_DECREE,
	ZAMORAKIAN_SIGHT,
	SARADOMINIST_DEFENCE,
	CHEFS_CATCH,
	CATCH_OF_THE_DAY,
	SMOOTH_CRIMINAL,
	DEEPER_POCKETS,
	SLASH_AND_BURN,
	HOMEWRECKER,
	HOT_ON_THE_TRAIL,
	PLANK_STRETCHER,
	ROCK_SOLID,
	MOLTEN_MINER,
	SMITHING_DOUBLE,
	RUMPLE_BOW_STRING,
	DRAGON_ON_A_BIT,
	IMCANDOS_APPRENTICE,
	ENCHANTED_JEWELER,
	ALCHEMANIAC,
	PROFLECTHIONAL,
	PRO_TIPS,
	CHINCHONKERS,
	DINE_AND_DASH,
	CERTIFIED_FARMER,
	SEEDY_BUSINESS,
	MIXOLOGIST,
	JUST_DRUID,
	GOLDEN_BRICK_ROAD,
	GRAVE_ROBBER,
	ROOTY_TOOTY_2X_RUNEYS,
	RUNE_ESCAPE,
	CLUED_IN,
	MESSAGE_IN_A_BOTTLE,
	BARBARIAN_PEST_WARS,
	ROGUES_CHOMPY_FARM,
	MOTHERS_MAGIC_FOSSILS;

	static final int VARBIT_BASE = 13403;

	int getVarb()
	{
		return VARBIT_BASE + ordinal();
	}

	int getXp(Client client)
	{
		return client.getVarbitValue(getVarb());
	}

	static ShatteredFragment byOrdinal(int value)
	{
		return values()[value - 1];
	}

	static int getUpperBound(int xp)
	{
		return xp >= 2000 ? 8000 : 2000;
	}

	static int getLowerBound(int xp)
	{
		return xp < 2000 ? 0 : 2000;
	}
}