/*
 * 涅槃科技 and 风横
 * https://npyyds.top/
 * https://gitee.com/newNP/
 * 最终解释权归涅槃科技所有，涅槃科技版权所有。
 */
package nirvana.space;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "examplemod", version = "1.0")
public class ExampleMod
{
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println(api.hello);
    }
}
