package uk.gaz492.ladderapi;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.metadata.ModMetadata;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class LadderAPI implements ModInitializer {

    public static final Tag<Block> CLIMBABLE = TagRegistry.block(new Identifier("ladderapi", "climbable"));

    @Override
    public void onInitialize() {
        ModMetadata metadata = FabricLoader.getInstance().getModContainer("ladderapi").get().getMetadata();
        System.out.println("Initiated Ladder API("+ metadata.getVersion() +")!");
    }
}
