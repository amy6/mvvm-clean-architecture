package com.raywenderlich.android.majesticreader.framework

import interactors.*

data class Interactors(
        val addBookmark: AddBookmark,
        val getBookmarks: GetBookmarks,
        val deleteBookmark: RemoveBookmark,
        val addDocument: AddDocument,
        val getDocuments: GetDocuments,
        val removeDocument: RemoveDocument,
        val getOpenDocument: GetOpenDocument,
        val setOpenDocument: SetOpenDocument
)