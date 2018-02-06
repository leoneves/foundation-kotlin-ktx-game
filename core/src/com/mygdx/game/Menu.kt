package com.mygdx.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.Touchable.enabled
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
import ktx.actors.onClick
import ktx.app.KtxScreen
import ktx.scene2d.label
import ktx.scene2d.table

class Menu(val stage: Stage, val application: MyGdxGame) : KtxScreen {
    val backgroundImage = Texture("menu.jpg")
    val view = table {
        setFillParent(true)
        background = TextureRegionDrawable(TextureRegion(backgroundImage, 0, 0, 600, 600))
        touchable = enabled

        label(text = "click to move", style = "decorative").cell(padLeft = 320f, row = true, padBottom = 5f)
        label(text = "point to aim", style = "decorative").cell(padLeft = 335f, row = true, padBottom = 10f)
        label(text = "QWER to cast", style = "decorative").cell(padLeft = 290f, row = true, padBottom = 240f)
        table {
            label(text = "Click to ", style = "decorative")
            label(text = "play", style = "decorative") {
                color = Color.PURPLE
            }
        }.cell(padBottom = 50f)
    }

    override fun show() {
        stage.addActor(view)
        Gdx.input.inputProcessor = stage
    }

    override fun render(delta: Float) {
        stage.act(delta)
        stage.draw()
    }

    override fun hide() {
        view.remove()
    }
}
