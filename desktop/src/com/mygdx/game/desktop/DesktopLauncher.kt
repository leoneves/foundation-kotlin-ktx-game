@file:JvmName("DesktopLauncher")

package com.mygdx.game.desktop

import com.badlogic.gdx.Files.FileType
import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.mygdx.game.MyGdxGame
import com.mygdx.game.screenHeight
import com.mygdx.game.screenWidth

fun main(args: Array<String>) {
    LwjglApplication(MyGdxGame(), LwjglApplicationConfiguration().apply {
        title = "Yu Yu hakusho"
        width = screenWidth
        height = screenHeight
        resizable = false
        intArrayOf(128, 64, 32, 16).forEach {
            addIcon("badlogic.jpg", FileType.Internal)
        }
    })
}
