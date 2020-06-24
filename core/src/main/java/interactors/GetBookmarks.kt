package interactors

import data.BookmarkRepository
import domain.Document

class GetBookmarks(private val bookmarkRepository: BookmarkRepository) {

    suspend operator fun invoke(document: Document) = bookmarkRepository.getBookmarks(document)

}