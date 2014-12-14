package org.lolhens.minechanics.client.config.gui.element

import net.minecraftforge.fml.client.config.{GuiConfig, GuiConfigEntries, IConfigElement}
import net.minecraft.client.renderer.Tessellator
import net.minecraft.util.EnumChatFormatting

class ConfigEntryLabel(owningScreen: GuiConfig, owningEntryList: GuiConfigEntries, configElement: IConfigElement) extends ListEntryBase(owningScreen, owningEntryList, configElement) {


  override def drawEntry(slotIndex: Int, x: Int, y: Int, listWidth: Int, slotHeight: Int, mouseX: Int, mouseY: Int, isSelected: Boolean): Unit = {
    if (!drawLabel) return
    val label = EnumChatFormatting.WHITE.toString + name
    val drawX = owningScreen.entryList.labelX + (owningEntryList.scrollBarX - mc.fontRendererObj.getStringWidth(label)) / 2
    val drawY = y + (slotHeight - mc.fontRendererObj.FONT_HEIGHT) / 2
    mc.fontRendererObj.drawString(label, drawX, drawY, 16777215)
  }

  override def keyTyped(c: Char, i: Int) = {}

  override def updateCursorCounter() = {}

  override def mouseClicked(i: Int, j: Int, k: Int) = {}

  override def isDefault = true

  override def setToDefault() = {}

  override def isChanged = false

  override def undoChanges() = {}

  override def saveConfigElement = false

  override def getCurrentValues = null

  override def getCurrentValue2 = null
}