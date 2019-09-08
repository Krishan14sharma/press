package me.saket.compose.shared.home

data class HomeUiModel(val notes: List<Note>) {

  data class Note(
    val adapterId: Long,
    val content: String
  )
}