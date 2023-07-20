package net.aarohan.mccourse.block;

import net.aarohan.mccourse.MCCourseMod;
import net.aarohan.mccourse.block.custom.CobaltBlasterBlock;
import net.aarohan.mccourse.block.custom.CobaltLampBlock;
import net.aarohan.mccourse.block.custom.SpeedyBlock;
import net.aarohan.mccourse.block.custom.TurnipCropBlock;
import net.aarohan.mccourse.item.ModCreativeModeTab;
import net.aarohan.mccourse.item.ModItems;
import net.aarohan.mccourse.sound.ModSounds;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, MCCourseMod.MOD_ID);

//normal
    public static final RegistryObject<Block> COBALT_BLOCK = registerBlock("cobalt_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);
    //oreblock
    public static final RegistryObject<Block> COBALT_ORE = registerBlock("cobalt_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> DEEPSLATE_COBALT_ORE = registerBlock("deepslate_cobalt_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> RAW_COBALT_BLOCK = registerBlock("raw_cobalt_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);
//effect
    public static final RegistryObject<Block> SPEEDY_BLOCK = registerBlock("speedy_block", () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB, "tooltip.block.speedy_block");
//almost a block
    public static final RegistryObject<Block> COBALT_STAIRS = registerBlock("cobalt_stairs", () -> new StairBlock(() -> ModBlocks.COBALT_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.METAL).strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> COBALT_SLAB = registerBlock("cobalt_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL).strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);
//redstoney
    public static final RegistryObject<Block> COBALT_BUTTON = registerBlock("cobalt_button", () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> COBALT_PRESSURE_PLATE = registerBlock("cobalt_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);
//protection on the floor
    public static final RegistryObject<Block> COBALT_FENCE = registerBlock("cobalt_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> COBALT_FENCE_GATE = registerBlock("cobalt_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> COBALT_WALL = registerBlock("cobalt_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.COURSE_TAB);
//door
    public static final RegistryObject<Block> CHERRY_BLOSSOM_DOOR = registerBlock("cherry_blossom_door", () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.COURSE_TAB);
//trap
    public static final RegistryObject<Block> CHERRY_BLOSSOM_TRAPDOOR = registerBlock("cherry_blossom_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.COURSE_TAB);
//light
    public static final RegistryObject<Block> COBALT_LAMP = registerBlock("cobalt_lamp", () -> new CobaltLampBlock(BlockBehaviour.Properties.of(Material.METAL).strength(2f).requiresCorrectToolForDrops().sound(ModSounds.COBALT_LAMP_SOUNDS).lightLevel((state) -> state.getValue(CobaltLampBlock.CLICKED) ? 15 : 0)), ModCreativeModeTab.COURSE_TAB);
//crop
    public static final RegistryObject<Block> TURNIP_CROP = BLOCKS.register("turnip_crop", () -> new TurnipCropBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS)   .noCollission().noOcclusion()));
//flower
    public static final RegistryObject<Block> PINK_ROSE = registerBlock("pink_rose", () -> new FlowerBlock(MobEffects.BLINDNESS, 4,BlockBehaviour.Properties.copy(Blocks.DANDELION)), ModCreativeModeTab.COURSE_TAB);

    public static final RegistryObject<Block> POTTED_PINK_ROSE = BLOCKS.register( "potted_pink_rose", () -> new FlowerPotBlock(null, ModBlocks.PINK_ROSE,BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));
//not helpful but blockbench; helpful stuff is the json files
    public static final RegistryObject<Block> COBALT_BLASTER = registerBlock("cobalt_blaster", () -> new CobaltBlasterBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), ModCreativeModeTab.COURSE_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, String tooltipKey) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)){
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(Component.translatable(tooltipKey));
            }
        });
    }


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
