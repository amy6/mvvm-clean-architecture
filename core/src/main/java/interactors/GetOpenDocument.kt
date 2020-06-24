package interactors

import data.DocumentRepository

class GetOpenDocument(private val documentRepository: DocumentRepository) {

    operator fun invoke() = documentRepository.getOpenDocument()

}