package net.aarohan.mccourse.event;
/*
import net.aarohan.mccourse.MCCourseMod;
import net.aarohan.mccourse.command.ReturnHomeCommand;
import net.aarohan.mccourse.command.SetHomeCommand;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;

@Mod.EventBusSubscriber(modid = MCCourseMod.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void onCommandsRegister(RegisterCommandsEvent event) {
        new SetHomeCommand(event.getDispatcher());
        new ReturnHomeCommand(event.getDispatcher());

        ConfigCommand.register(event.getDispatcher());
    }

    @@SubscribeEvent
    public static void onPlayerCloneEvent(PlayerEvent.Clone event) {
        if(!event.getOriginal().getLevel().isClientSide()) {
           // event.getPlayer().getPersistentData().putIntArray(MCCourseMod.MOD_ID + "homepos",
                    event.getOriginal().getPersistentData().getIntArray(MCCourseMod.MOD_ID + "homepos"));
        }
    }
}
 */