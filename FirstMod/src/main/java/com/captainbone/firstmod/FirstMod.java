package com.captainbone.firstmod;

import com.captainbone.firstmod.registry.ModBlocks;
import com.captainbone.firstmod.registry.Moditems;
import net.fabricmc.api.ModInitializer;

public class FirstMod implements ModInitializer {

    public static final String MOD_ID = "fm";

    @Override
    public void onInitialize() {
        Moditems.registerItems();
        ModBlocks.registerBlocks();


    }
}
