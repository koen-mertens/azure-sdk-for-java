// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.openai.implementation.accesshelpers;

import com.azure.ai.openai.models.ChatCompletionStreamOptions;
import com.azure.ai.openai.models.ChatCompletionsOptions;

/**
 * Class containing helper methods for accessing private members of {@link ChatCompletionsOptions}.
 */
public final class ChatCompletionsOptionsAccessHelper {
    private static ChatCompletionsOptionsAccessor accessor;

    /**
     * Type defining the methods to set the non-public properties of an {@link ChatCompletionsOptions} instance.
     */
    public interface ChatCompletionsOptionsAccessor {
        /**
         * Sets the stream property of the {@link ChatCompletionsOptions}.
         *
         * @param options The {@link ChatCompletionsOptions} instance
         * @param stream The boolean value to set private stream property
         */
        void setStream(ChatCompletionsOptions options, boolean stream);

        /**
         * Set the streamOptions property of the {@link ChatCompletionsOptions}.
         *
         * @param options The {@link ChatCompletionsOptions} instance
         * @param streamOptions the streamOptions value to set.
         */
        void setStreamOptions(ChatCompletionsOptions options, ChatCompletionStreamOptions streamOptions);
    }

    /**
     * The method called from {@link ChatCompletionsOptions} to set it's accessor.
     *
     * @param chatCompletionsOptionsAccessor The accessor.
     */
    public static void setAccessor(final ChatCompletionsOptionsAccessor chatCompletionsOptionsAccessor) {
        accessor = chatCompletionsOptionsAccessor;
    }

    /**
     * Sets the stream property of the {@link ChatCompletionsOptions}.
     *
     * @param options The {@link ChatCompletionsOptions} instance
     * @param stream The boolean value to set private stream property
     */
    public static void setStream(ChatCompletionsOptions options, boolean stream) {
        accessor.setStream(options, stream);
    }

    /**
     * Set the streamOptions property of the {@link ChatCompletionsOptions}.
     *
     * @param options The {@link ChatCompletionsOptions} instance
     * @param streamOptions the streamOptions value to set.
     */
    public static void setStreamOptions(ChatCompletionsOptions options, ChatCompletionStreamOptions streamOptions) {
        accessor.setStreamOptions(options, streamOptions);
    }

    private ChatCompletionsOptionsAccessHelper() {
    }
}
