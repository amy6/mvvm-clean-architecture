package interactors

import data.BookmarkRepository
import domain.Bookmark
import domain.Document

class AddBookmark(private val bookmarkRepository: BookmarkRepository) {

    suspend operator fun invoke(document: Document, bookmark: Bookmark) = bookmarkRepository.addBookmark(document, bookmark)
}