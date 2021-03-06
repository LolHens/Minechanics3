package org.lolhens.minechanics

//import com.dafttech.classfile.URLClassLocation
//import com.dafttech.nio.file.PathUtil

import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent, FMLServerStartingEvent}
import net.minecraftforge.fml.common.{Mod, SidedProxy}
import org.lolhens.minechanics.common.Proxy
import org.lolhens.minechanics.common.config.Configurator

@Mod(modid = Minechanics.Id, name = Minechanics.Name, version = Minechanics.Version, modLanguage = "scala", canBeDeactivated = false, guiFactory = "org.lolhens.minechanics.client.config.gui.ConfigGuiFactory")
object Minechanics {
  final val Id = "minechanics"
  final val Name = "Minechanics3"
  final val Version = "@VERSION@"
  final val McVersion = "1.7.10"
  final val AccessTransformer = "minechanics_at.cfg"
  //val location = PathUtil.get(URLClassLocation.getClassSourceURL(getClass))

  @SidedProxy(clientSide = "org.lolhens.minechanics.client.ClientProxy", serverSide = "org.lolhens.minechanics.server.ServerProxy")
  var proxy: Proxy = null

  var configurator: Configurator[_] = null

  @EventHandler
  def preInit(event: FMLPreInitializationEvent) = proxy.preInit(event)

  @EventHandler
  def init(event: FMLInitializationEvent) = proxy.init(event)

  @EventHandler
  def postInit(event: FMLPostInitializationEvent) = proxy.postInit(event)

  @EventHandler
  def serverStart(event: FMLServerStartingEvent) = proxy.serverStart(event)
}