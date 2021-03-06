package me.saket.press.shared.localization

import me.saket.press.shared.localization.Strings.Common
import me.saket.press.shared.localization.Strings.Editor
import me.saket.press.shared.localization.Strings.Home
import me.saket.press.shared.localization.Strings.Sync

// todo: rename all to underscore case.
data class Strings(
  val common: Common,
  val home: Home,
  val editor: Editor,
  val sync: Sync
) {
  data class Common(
    val closeNavIconDescription: String,
    val genericError: String,
    val retry: String
  )

  data class Home(
    val preferences: String
  )

  data class Editor(
    val newNoteHints: List<String>,
    val openUrl: String,
    val editUrl: String
  )

  data class Sync(
    val title: String,
    val confirmSelectionMessage: String,
    val confirmSelectionConfirmButton: String,
    val confirmSelectionCancelButton: String,
    val setup_sync_with_host: String,
    val sync_disabled_message: String
  )
}

val ENGLISH_STRINGS = Strings(
    common = Common(
        closeNavIconDescription = "Go back",
        genericError = "Something went wrong, try again?",
        retry = "Retry"
    ),
    home = Home(
        preferences = "Preferences"
    ),
    editor = Editor(
        newNoteHints = listOf(
            "A wonderful note",
            "It begins with a word",
            "This is the beginning",
            "Once upon a time",
            "Unleash those wild ideas",
            "Untitled composition",
            "Here we go",
            "Type your heart out"
        ),
        openUrl = "Open",
        editUrl = "Edit"
    ),
    sync = Sync(
        title = "Sync",
        confirmSelectionMessage = "Are you sure you want to give Press access to <b>%s</b>?",
        confirmSelectionConfirmButton = "Let's go",
        confirmSelectionCancelButton = "Wait no",
        sync_disabled_message = "Press can sync notes between your devices through a git repository.",
        setup_sync_with_host = "Sync with %s"
    )
)
