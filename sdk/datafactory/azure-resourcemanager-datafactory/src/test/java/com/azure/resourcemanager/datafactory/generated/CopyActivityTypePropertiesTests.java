// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.CopyActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.CopyActivityLogSettings;
import com.azure.resourcemanager.datafactory.models.CopySink;
import com.azure.resourcemanager.datafactory.models.CopySource;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.LogLocationSettings;
import com.azure.resourcemanager.datafactory.models.LogSettings;
import com.azure.resourcemanager.datafactory.models.LogStorageSettings;
import com.azure.resourcemanager.datafactory.models.RedirectIncompatibleRowSettings;
import com.azure.resourcemanager.datafactory.models.SkipErrorFile;
import com.azure.resourcemanager.datafactory.models.StagingSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CopyActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CopyActivityTypeProperties model = BinaryData.fromString(
            "{\"source\":{\"type\":\"CopySource\",\"sourceRetryCount\":\"datagylo\",\"sourceRetryWait\":\"dataxwlql\",\"maxConcurrentConnections\":\"datanbudjypliotg\",\"disableMetricsCollection\":\"dataansykvlxsycq\",\"\":{\"wx\":\"dataxooxuaufqoo\",\"veqvpedwmhqcjr\":\"datat\",\"zqnupsipclxvaov\":\"datarypjbyqxe\",\"vqqvicqdbmzwlej\":\"datasib\"}},\"sink\":{\"type\":\"CopySink\",\"writeBatchSize\":\"datayoonbualri\",\"writeBatchTimeout\":\"datadbnt\",\"sinkRetryCount\":\"datababndwcfmz\",\"sinkRetryWait\":\"datamgdlgsxkyboysquy\",\"maxConcurrentConnections\":\"datakh\",\"disableMetricsCollection\":\"datatwcyigrhfevxypqu\",\"\":{\"xhhvoo\":\"dataj\",\"wyiq\":\"datartcsucot\",\"bhzukrpfbhihddi\":\"datajnxzvjnmpvsblud\",\"yfku\":\"datauexy\"}},\"translator\":\"datalq\",\"enableStaging\":\"dataa\",\"stagingSettings\":{\"linkedServiceName\":{\"referenceName\":\"pwrmlv\",\"parameters\":{\"xnyock\":\"datakkqspzw\"}},\"path\":\"datassusdrgzmmrzwm\",\"enableCompression\":\"datatkcvolaxnuk\",\"\":{\"oxyxiyhmjwsn\":\"dataoumndc\"}},\"parallelCopies\":\"dataezgvaeqiygbou\",\"dataIntegrationUnits\":\"datajodidgudar\",\"enableSkipIncompatibleRow\":\"dataajbenf\",\"redirectIncompatibleRowSettings\":{\"linkedServiceName\":\"dataufvojikffczw\",\"path\":\"datawpilsuhsghdovcpb\",\"\":{\"hsixzcdaukh\":\"dataapgag\"}},\"logStorageSettings\":{\"linkedServiceName\":{\"referenceName\":\"h\",\"parameters\":{\"ojker\":\"databomf\",\"togbkdctsg\":\"dataujfnbzamroad\",\"cnecl\":\"dataalh\",\"nsl\":\"datahmjsqcubyj\"}},\"path\":\"datateena\",\"logLevel\":\"dataecsft\",\"enableReliableLogging\":\"dataubzfuhj\",\"\":{\"qgvt\":\"datacyrbzyj\",\"vdvkeyqxjchdnlx\":\"datadxtwyxpkwwdkkvd\",\"xqpsqpfxjwt\":\"datailuexvml\",\"xrjjdjikiqtzub\":\"datalbqkguchd\"}},\"logSettings\":{\"enableCopyActivityLog\":\"datakujv\",\"copyActivityLogSettings\":{\"logLevel\":\"datauq\",\"enableReliableLogging\":\"datalwnxryyqtjcrpax\"},\"logLocationSettings\":{\"linkedServiceName\":{\"referenceName\":\"xlfxsetvdz\",\"parameters\":{\"zhdciuxotb\":\"datadmxfqftywbba\",\"hop\":\"dataflgkkiu\",\"rtaevq\":\"datafobpyeo\",\"owsmrvdtqhr\":\"datafdhpkiiunyrobcke\"}},\"path\":\"dataqs\"}},\"preserveRules\":[\"datanupskit\",\"datakphamefzzgwjoau\"],\"preserve\":[\"datadpn\",\"dataouylfcfgqinaokx\",\"datauknzhmza\"],\"validateDataConsistency\":\"datarsqzuknbtxtdm\",\"skipErrorFile\":{\"fileMissing\":\"datarrqqajhklttl\",\"dataInconsistency\":\"datawdrt\"}}")
            .toObject(CopyActivityTypeProperties.class);
        Assertions.assertEquals("pwrmlv", model.stagingSettings().linkedServiceName().referenceName());
        Assertions.assertEquals("h", model.logStorageSettings().linkedServiceName().referenceName());
        Assertions.assertEquals("xlfxsetvdz",
            model.logSettings().logLocationSettings().linkedServiceName().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CopyActivityTypeProperties model = new CopyActivityTypeProperties()
            .withSource(new CopySource().withSourceRetryCount("datagylo")
                .withSourceRetryWait("dataxwlql")
                .withMaxConcurrentConnections("datanbudjypliotg")
                .withDisableMetricsCollection("dataansykvlxsycq")
                .withAdditionalProperties(mapOf("type", "CopySource")))
            .withSink(new CopySink().withWriteBatchSize("datayoonbualri")
                .withWriteBatchTimeout("datadbnt")
                .withSinkRetryCount("datababndwcfmz")
                .withSinkRetryWait("datamgdlgsxkyboysquy")
                .withMaxConcurrentConnections("datakh")
                .withDisableMetricsCollection("datatwcyigrhfevxypqu")
                .withAdditionalProperties(mapOf("type", "CopySink")))
            .withTranslator("datalq")
            .withEnableStaging("dataa")
            .withStagingSettings(new StagingSettings()
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("pwrmlv")
                    .withParameters(mapOf("xnyock", "datakkqspzw")))
                .withPath("datassusdrgzmmrzwm")
                .withEnableCompression("datatkcvolaxnuk")
                .withAdditionalProperties(mapOf()))
            .withParallelCopies("dataezgvaeqiygbou")
            .withDataIntegrationUnits("datajodidgudar")
            .withEnableSkipIncompatibleRow("dataajbenf")
            .withRedirectIncompatibleRowSettings(
                new RedirectIncompatibleRowSettings()
                    .withLinkedServiceName("dataufvojikffczw")
                    .withPath("datawpilsuhsghdovcpb")
                    .withAdditionalProperties(mapOf()))
            .withLogStorageSettings(new LogStorageSettings()
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("h")
                    .withParameters(mapOf("ojker", "databomf", "togbkdctsg", "dataujfnbzamroad", "cnecl", "dataalh",
                        "nsl", "datahmjsqcubyj")))
                .withPath("datateena")
                .withLogLevel("dataecsft")
                .withEnableReliableLogging("dataubzfuhj")
                .withAdditionalProperties(mapOf()))
            .withLogSettings(new LogSettings().withEnableCopyActivityLog("datakujv")
                .withCopyActivityLogSettings(new CopyActivityLogSettings().withLogLevel("datauq")
                    .withEnableReliableLogging("datalwnxryyqtjcrpax"))
                .withLogLocationSettings(new LogLocationSettings()
                    .withLinkedServiceName(new LinkedServiceReference().withReferenceName("xlfxsetvdz")
                        .withParameters(mapOf("zhdciuxotb", "datadmxfqftywbba", "hop", "dataflgkkiu", "rtaevq",
                            "datafobpyeo", "owsmrvdtqhr", "datafdhpkiiunyrobcke")))
                    .withPath("dataqs")))
            .withPreserveRules(Arrays.asList("datanupskit", "datakphamefzzgwjoau"))
            .withPreserve(Arrays.asList("datadpn", "dataouylfcfgqinaokx", "datauknzhmza"))
            .withValidateDataConsistency("datarsqzuknbtxtdm")
            .withSkipErrorFile(
                new SkipErrorFile().withFileMissing("datarrqqajhklttl").withDataInconsistency("datawdrt"));
        model = BinaryData.fromObject(model).toObject(CopyActivityTypeProperties.class);
        Assertions.assertEquals("pwrmlv", model.stagingSettings().linkedServiceName().referenceName());
        Assertions.assertEquals("h", model.logStorageSettings().linkedServiceName().referenceName());
        Assertions.assertEquals("xlfxsetvdz",
            model.logSettings().logLocationSettings().linkedServiceName().referenceName());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
