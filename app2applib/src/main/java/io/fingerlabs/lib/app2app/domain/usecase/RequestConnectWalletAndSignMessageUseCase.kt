package io.fingerlabs.lib.app2app.domain.usecase

import io.fingerlabs.lib.app2app.data.repository.App2AppRepository
import io.fingerlabs.lib.app2app.data.source.remote.model.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

internal class RequestConnectWalletAndSignMessageUseCase constructor(
    private val app2AppRepository: App2AppRepository = App2AppRepository()
) {

    suspend operator fun invoke(
        request: App2AppConnectWalletAndSignMessageRequest
    ): App2AppRequestResponse = withContext(Dispatchers.IO) {
        app2AppRepository.requestConnectWalletSignMessage(request)
    }

}