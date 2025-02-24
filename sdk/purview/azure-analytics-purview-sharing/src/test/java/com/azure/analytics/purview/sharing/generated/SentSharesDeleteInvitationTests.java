// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.SyncPoller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class SentSharesDeleteInvitationTests extends PurviewShareClientTestBase {
    @Test
    @Disabled
    public void testSentSharesDeleteInvitationTests() {
        RequestOptions requestOptions = new RequestOptions();
        SyncPoller<BinaryData, Void> response
            = setPlaybackSyncPollerPollInterval(sentSharesClient.beginDeleteSentShareInvitation(
                "FF4A2AAE-8755-47BB-9C00-A774B5A7006E", "9F154FA4-93D1-426B-A908-A9CAC7192B21", requestOptions));
        Assertions.assertEquals(LongRunningOperationStatus.SUCCESSFULLY_COMPLETED,
            response.waitForCompletion().getStatus());
    }
}
