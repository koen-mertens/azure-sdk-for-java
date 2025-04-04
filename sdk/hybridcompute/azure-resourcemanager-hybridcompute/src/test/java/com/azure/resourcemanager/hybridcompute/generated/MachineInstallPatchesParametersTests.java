// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.LinuxParameters;
import com.azure.resourcemanager.hybridcompute.models.MachineInstallPatchesParameters;
import com.azure.resourcemanager.hybridcompute.models.VMGuestPatchClassificationLinux;
import com.azure.resourcemanager.hybridcompute.models.VMGuestPatchClassificationWindows;
import com.azure.resourcemanager.hybridcompute.models.VMGuestPatchRebootSetting;
import com.azure.resourcemanager.hybridcompute.models.WindowsParameters;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MachineInstallPatchesParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MachineInstallPatchesParameters model = BinaryData.fromString(
            "{\"maximumDuration\":\"PT63H45M39S\",\"rebootSetting\":\"IfRequired\",\"windowsParameters\":{\"classificationsToInclude\":[\"Critical\",\"Updates\"],\"kbNumbersToInclude\":[\"yngudivk\"],\"kbNumbersToExclude\":[\"wbxqzvszjfau\",\"j\"],\"excludeKbsRequiringReboot\":false,\"maxPatchPublishDate\":\"2021-03-31T08:08:53Z\"},\"linuxParameters\":{\"classificationsToInclude\":[\"Critical\"],\"packageNameMasksToInclude\":[\"qaqtdoqmcbxvwvxy\",\"lqbhsf\",\"obl\"],\"packageNameMasksToExclude\":[\"blmpewww\"]}}")
            .toObject(MachineInstallPatchesParameters.class);
        Assertions.assertEquals(Duration.parse("PT63H45M39S"), model.maximumDuration());
        Assertions.assertEquals(VMGuestPatchRebootSetting.IF_REQUIRED, model.rebootSetting());
        Assertions.assertEquals(VMGuestPatchClassificationWindows.CRITICAL,
            model.windowsParameters().classificationsToInclude().get(0));
        Assertions.assertEquals("yngudivk", model.windowsParameters().kbNumbersToInclude().get(0));
        Assertions.assertEquals("wbxqzvszjfau", model.windowsParameters().kbNumbersToExclude().get(0));
        Assertions.assertEquals(false, model.windowsParameters().excludeKbsRequiringReboot());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-31T08:08:53Z"),
            model.windowsParameters().maxPatchPublishDate());
        Assertions.assertEquals(VMGuestPatchClassificationLinux.CRITICAL,
            model.linuxParameters().classificationsToInclude().get(0));
        Assertions.assertEquals("qaqtdoqmcbxvwvxy", model.linuxParameters().packageNameMasksToInclude().get(0));
        Assertions.assertEquals("blmpewww", model.linuxParameters().packageNameMasksToExclude().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MachineInstallPatchesParameters model
            = new MachineInstallPatchesParameters().withMaximumDuration(Duration.parse("PT63H45M39S"))
                .withRebootSetting(VMGuestPatchRebootSetting.IF_REQUIRED)
                .withWindowsParameters(new WindowsParameters()
                    .withClassificationsToInclude(Arrays.asList(VMGuestPatchClassificationWindows.CRITICAL,
                        VMGuestPatchClassificationWindows.UPDATES))
                    .withKbNumbersToInclude(Arrays.asList("yngudivk"))
                    .withKbNumbersToExclude(Arrays.asList("wbxqzvszjfau", "j"))
                    .withExcludeKbsRequiringReboot(false)
                    .withMaxPatchPublishDate(OffsetDateTime.parse("2021-03-31T08:08:53Z")))
                .withLinuxParameters(new LinuxParameters()
                    .withClassificationsToInclude(Arrays.asList(VMGuestPatchClassificationLinux.CRITICAL))
                    .withPackageNameMasksToInclude(Arrays.asList("qaqtdoqmcbxvwvxy", "lqbhsf", "obl"))
                    .withPackageNameMasksToExclude(Arrays.asList("blmpewww")));
        model = BinaryData.fromObject(model).toObject(MachineInstallPatchesParameters.class);
        Assertions.assertEquals(Duration.parse("PT63H45M39S"), model.maximumDuration());
        Assertions.assertEquals(VMGuestPatchRebootSetting.IF_REQUIRED, model.rebootSetting());
        Assertions.assertEquals(VMGuestPatchClassificationWindows.CRITICAL,
            model.windowsParameters().classificationsToInclude().get(0));
        Assertions.assertEquals("yngudivk", model.windowsParameters().kbNumbersToInclude().get(0));
        Assertions.assertEquals("wbxqzvszjfau", model.windowsParameters().kbNumbersToExclude().get(0));
        Assertions.assertEquals(false, model.windowsParameters().excludeKbsRequiringReboot());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-31T08:08:53Z"),
            model.windowsParameters().maxPatchPublishDate());
        Assertions.assertEquals(VMGuestPatchClassificationLinux.CRITICAL,
            model.linuxParameters().classificationsToInclude().get(0));
        Assertions.assertEquals("qaqtdoqmcbxvwvxy", model.linuxParameters().packageNameMasksToInclude().get(0));
        Assertions.assertEquals("blmpewww", model.linuxParameters().packageNameMasksToExclude().get(0));
    }
}
