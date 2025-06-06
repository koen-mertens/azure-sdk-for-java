// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.v2.core.test;

import com.azure.v2.core.test.annotation.DoNotRecord;
import com.azure.v2.core.test.annotation.RecordWithoutRequestBody;

import java.lang.reflect.Method;
import java.nio.file.Path;

/**
 * This class handles managing context about a test, such as custom testing annotations and verifying whether the test
 * is capable of running.
 */
public class TestContextManager {
    private final String testName;
    private final String className;
    private final TestMode testMode;
    private final boolean doNotRecord;
    private final boolean testRan;

    private Integer testIteration;
    private final boolean skipRecordingRequestBody;
    private final Path testClassPath;
    private final String trackerTestName;

    /**
     * Constructs a {@link TestContextManager} based on the test method.
     *
     * @param testMethod Test method being ran.
     * @param testMode The {@link TestMode} the test is running in.
     * @param recordWithoutRequestBodyClassAnnotation flag indicating if {@code RecordWithoutRequestBody} annotation
     * present on test class.
     * @param testClassPath the test class path
     */
    public TestContextManager(Method testMethod, TestMode testMode, boolean recordWithoutRequestBodyClassAnnotation,
        Path testClassPath) {
        this(testMethod, testMode, recordWithoutRequestBodyClassAnnotation, testClassPath, testMethod.getName());
    }

    /**
     * Constructs a {@link TestContextManager} based on the test method.
     *
     * @param testMethod Test method being ran.
     * @param testMode The {@link TestMode} the test is running in.
     * @param recordWithoutRequestBodyClassAnnotation flag indicating if {@code RecordWithoutRequestBody} annotation
     * present on test class.
     * @param testClassPath the test class path
     * @param trackerTestName The formatted test name used in logging and tracking its progress.
     */
    @SuppressWarnings("deprecation")
    public TestContextManager(Method testMethod, TestMode testMode, boolean recordWithoutRequestBodyClassAnnotation,
        Path testClassPath, String trackerTestName) {
        this.testName = testMethod.getName();
        this.className = testMethod.getDeclaringClass().getSimpleName();
        this.testMode = testMode;

        RecordWithoutRequestBody recordWithoutRequestBody = testMethod.getAnnotation(RecordWithoutRequestBody.class);
        this.skipRecordingRequestBody = recordWithoutRequestBody != null || recordWithoutRequestBodyClassAnnotation;

        DoNotRecord doNotRecordAnnotation = testMethod.getAnnotation(DoNotRecord.class);
        this.doNotRecord = doNotRecordAnnotation != null;

        this.testClassPath = testClassPath;
        this.testRan = true;
        this.trackerTestName = trackerTestName;
    }

    /**
     * Returns the name of the test being ran.
     *
     * @return The test name.
     */
    public String getTestName() {
        return testName;
    }

    /**
     * Returns the path of the class to which the test belongs.
     *
     * @return The file path of the test class.
     */
    Path getTestClassPath() {
        return testClassPath;
    }

    /**
     * Returns the name of the playback record for the test being ran.
     *
     * @return The playback record name.
     */
    public String getTestPlaybackRecordingName() {
        StringBuilder builder = new StringBuilder(className).append(".").append(testName);

        if (testIteration != null) {
            builder.append("[").append(testIteration).append("]");
        }

        return builder.toString();
    }

    /**
     * Returns the mode being used to run tests.
     *
     * @return The {@link TestMode} being used to run tests.
     */
    public TestMode getTestMode() {
        return testMode;
    }

    /**
     * Returns whether the test should have its network calls recorded during a {@link TestMode#RECORD record} test
     * run.
     *
     * @return Flag indicating whether to record test network calls.
     */
    public boolean doNotRecordTest() {
        return doNotRecord;
    }

    /**
     * Returns whether the test is recording request body when run {@link TestMode#RECORD record} mode.
     *
     * @return Flag indicating whether test should record request bodies.
     */
    public boolean skipRecordingRequestBody() {
        return skipRecordingRequestBody;
    }

    /**
     * Returns whether the current test was ran.
     *
     * @return Flag indicating whether the current test was ran.
     */
    public boolean didTestRun() {
        return testRan;
    }

    /**
     * Sets the test iteration for parameterized tests.
     *
     * @param testIteration Test iteration.
     */
    public void setTestIteration(Integer testIteration) {
        this.testIteration = testIteration;
    }

    /**
     * Gets the formatted name of the test used to log and track its progress.
     *
     * @return The formatted test name.
     */
    public String getTrackerTestName() {
        return trackerTestName;
    }
}
