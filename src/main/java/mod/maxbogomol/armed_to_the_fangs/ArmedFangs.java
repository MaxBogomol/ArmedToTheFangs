package mod.maxbogomol.armed_to_the_fangs;

import mod.maxbogomol.armed_to_the_fangs.registry.common.item.ArmedFangsCreativeTabs;
import mod.maxbogomol.armed_to_the_fangs.registry.common.item.ArmedFangsItems;
import mod.maxbogomol.fluffy_fur.common.proxy.ClientProxy;
import mod.maxbogomol.fluffy_fur.common.proxy.ISidedProxy;
import mod.maxbogomol.fluffy_fur.common.proxy.ServerProxy;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("armed_to_the_fangs")
public class ArmedFangs {
    public static final String MOD_ID = "armed_to_the_fangs";
    public static final String NAME = "Armed to the Fangs";
    public static final String VERSION = "0.1";
    public static final int VERSION_NUMBER = 1;

    public static final ISidedProxy proxy = DistExecutor.unsafeRunForDist(() -> ClientProxy::new, () -> ServerProxy::new);
    public static final Logger LOGGER = LogManager.getLogger();

    public ArmedFangs() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ArmedFangsItems.register(eventBus);

        DistExecutor.unsafeCallWhenOn(Dist.CLIENT, () -> () -> {
            ArmedFangsClient.ClientOnly.clientInit();
            return new Object();
        });

        eventBus.addListener(this::setup);
        eventBus.addListener(ArmedFangsClient::clientSetup);

        ArmedFangsCreativeTabs.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        hi();
        ArmedFangsCreativeTabs.init();
    }

    public static void hi() {

    }
}