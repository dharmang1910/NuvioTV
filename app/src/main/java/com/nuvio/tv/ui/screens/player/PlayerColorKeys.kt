package com.nuvio.tv.ui.screens.player

import android.view.KeyEvent

/**
 * Remote colour buttons (Red / Green / Yellow / Blue) used as player shortcuts.
 *
 * Short press:
 *  - Red    -> Sources panel
 *  - Green  -> Playback speed dialog
 *  - Yellow -> Audio track panel
 *  - Blue   -> Episodes panel (series only; ignored for movies)
 *
 * Long press (hold ~500 ms, the system key-repeat timeout):
 *  - Red    -> Open Sources panel and force-reload sources
 *  - Green  -> Reset playback speed to 1.0x
 *  - Yellow -> Media / stream info overlay
 *  - Blue   -> Play next episode (only when the next episode has aired)
 */
internal enum class PlayerColorKey { RED, GREEN, YELLOW, BLUE }

internal fun playerColorKeyOf(keyCode: Int): PlayerColorKey? = when (keyCode) {
    KeyEvent.KEYCODE_PROG_RED -> PlayerColorKey.RED
    KeyEvent.KEYCODE_PROG_GREEN -> PlayerColorKey.GREEN
    KeyEvent.KEYCODE_PROG_YELLOW -> PlayerColorKey.YELLOW
    KeyEvent.KEYCODE_PROG_BLUE -> PlayerColorKey.BLUE
    else -> null
}
