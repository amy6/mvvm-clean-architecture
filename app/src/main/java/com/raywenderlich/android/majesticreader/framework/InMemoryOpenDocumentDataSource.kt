package com.raywenderlich.android.majesticreader.framework

import data.OpenDocumentDataSource
import domain.Document

class InMemoryOpenDocumentDataSource : OpenDocumentDataSource {

    private var openDocument: Document = Document.EMPTY

    override fun setOpenDocument(document: Document) {
        openDocument = document
    }

    override fun getOpenDocument(): Document = openDocument

}