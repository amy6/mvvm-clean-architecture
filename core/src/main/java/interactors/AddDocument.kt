package interactors

import data.DocumentRepository
import domain.Document

class AddDocument(private val documentRepository: DocumentRepository) {

    suspend operator fun invoke(document: Document) = documentRepository.addDocument(document)

}