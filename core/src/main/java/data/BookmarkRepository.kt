package data

import domain.Bookmark
import domain.Document

class BookmarkRepository(private val bookmarkDataSource: BookmarkDataSource) {

    suspend fun addBookmark(document: Document, bookmark: Bookmark) = bookmarkDataSource.add(document, bookmark)

    suspend fun getBookmarks(document: Document) = bookmarkDataSource.read(document)

    suspend fun removeBookmark(document: Document, bookmark: Bookmark) = bookmarkDataSource.remove(document, bookmark)

}