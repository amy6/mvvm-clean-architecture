package interactors

import data.BookmarkRepository
import domain.Bookmark
import domain.Document

class RemoveBookmark(private val bookmarkRepository: BookmarkRepository) {

    suspend operator fun invoke(document: Document, bookmark: Bookmark) = bookmarkRepository.removeBookmark(document, bookmark)

}