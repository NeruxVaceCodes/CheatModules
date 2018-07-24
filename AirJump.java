package net.ccbluex.LiquidBase.module.modules.movement;

import net.ccbluex.LiquidBase.event.EventTarget;
import net.ccbluex.LiquidBase.event.events.MotionUpdateEvent;
import net.ccbluex.LiquidBase.module.Module;
import net.ccbluex.LiquidBase.module.ModuleCategory;
import net.ccbluex.LiquidBase.module.ModuleInfo;

@ModuleInfo(moduleName = "AirJump", moduleDescription = "AirJump", moduleCateogry = ModuleCategory.MOVEMENT)
public class AirJump extends Module{

    @EventTarget
    public void onUpdate(MotionUpdateEvent e) {
        if (getState()){
            mc.thePlayer.onGround = true;
        }
    }


    @Override
    public void onDisable() {
        if (mc.thePlayer != null && mc.thePlayer != null) {
            mc.thePlayer.onGround = false;
        }

        }
    }




