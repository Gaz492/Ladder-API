package uk.gaz492.ladderapi;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class LadderAPI implements ModInitializer {

    public static final Tag<Block> CLIMBABLE = TagRegistry.block(new Identifier("ladderapi", "climbable"));

    @Override
    public void onInitialize() {
        System.out.println("Initiated Ladder API!");
    }
}
