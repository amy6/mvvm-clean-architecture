package interactors

import data.DocumentRepository
import domain.Document

class RemoveDocument(private val documentRepository: DocumentRepository) {

    suspend operator fun invoke(document: Document) = documentRepository.removeDocument(document)

}