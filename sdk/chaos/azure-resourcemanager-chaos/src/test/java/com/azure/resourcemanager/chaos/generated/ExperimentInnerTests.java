// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.fluent.models.ExperimentInner;
import com.azure.resourcemanager.chaos.models.ChaosExperimentAction;
import com.azure.resourcemanager.chaos.models.ChaosExperimentBranch;
import com.azure.resourcemanager.chaos.models.ChaosExperimentStep;
import com.azure.resourcemanager.chaos.models.ChaosTargetFilter;
import com.azure.resourcemanager.chaos.models.ChaosTargetSelector;
import com.azure.resourcemanager.chaos.models.ResourceIdentity;
import com.azure.resourcemanager.chaos.models.ResourceIdentityType;
import com.azure.resourcemanager.chaos.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ExperimentInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExperimentInner model = BinaryData.fromString(
            "{\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"hagalpbuxwgipwh\":{\"principalId\":\"8d1c83f6-bb6f-4afb-b698-ff6156fab49d\",\"clientId\":\"c4646ac2-ff91-4f5e-bb01-4bd0a0d8b768\"}},\"principalId\":\"ow\",\"tenantId\":\"shwankixzbinje\"},\"properties\":{\"provisioningState\":\"Succeeded\",\"steps\":[{\"name\":\"mryw\",\"branches\":[{\"name\":\"zoqftiyqzrnkcqvy\",\"actions\":[{\"type\":\"ChaosExperimentAction\",\"name\":\"whzlsicohoq\"}]},{\"name\":\"nwvlryavwhheunmm\",\"actions\":[{\"type\":\"ChaosExperimentAction\",\"name\":\"gyxzk\"},{\"type\":\"ChaosExperimentAction\",\"name\":\"noc\"},{\"type\":\"ChaosExperimentAction\",\"name\":\"koklya\"}]}]},{\"name\":\"uconuqszfkbey\",\"branches\":[{\"name\":\"wrmjmwvvjektc\",\"actions\":[{\"type\":\"ChaosExperimentAction\",\"name\":\"enhwlrs\"},{\"type\":\"ChaosExperimentAction\",\"name\":\"frzpwvlqdqgb\"}]},{\"name\":\"qylihkaetckt\",\"actions\":[{\"type\":\"ChaosExperimentAction\",\"name\":\"civfsnkymuctq\"},{\"type\":\"ChaosExperimentAction\",\"name\":\"jf\"},{\"type\":\"ChaosExperimentAction\",\"name\":\"ebrjcxe\"}]},{\"name\":\"fuwutttxf\",\"actions\":[{\"type\":\"ChaosExperimentAction\",\"name\":\"rbirphxe\"},{\"type\":\"ChaosExperimentAction\",\"name\":\"c\"},{\"type\":\"ChaosExperimentAction\",\"name\":\"vahfn\"},{\"type\":\"ChaosExperimentAction\",\"name\":\"jky\"}]},{\"name\":\"xjvuujqgidokg\",\"actions\":[{\"type\":\"ChaosExperimentAction\",\"name\":\"jyoxgvclt\"},{\"type\":\"ChaosExperimentAction\",\"name\":\"gsncghkjeszz\"},{\"type\":\"ChaosExperimentAction\",\"name\":\"bijhtxfvgxbf\"}]}]}],\"selectors\":[{\"type\":\"ChaosTargetSelector\",\"id\":\"xnehmpvec\",\"filter\":{\"type\":\"ChaosTargetFilter\"},\"\":{\"ukgri\":\"dataebfqkkrbm\",\"fbxzpuzycisp\":\"dataflz\",\"y\":\"dataqzahmgkbrp\",\"rgvtqag\":\"datahibnuqqkpika\"}},{\"type\":\"ChaosTargetSelector\",\"id\":\"buynhijggm\",\"filter\":{\"type\":\"ChaosTargetFilter\"},\"\":{\"zmhjrunmp\":\"dataiarbutrcvpna\",\"nkxmyskpbhenbtk\":\"datattdbhrbnl\",\"yxczfclh\":\"dataxywnytnrsynlqidy\"}}]},\"location\":\"axdbabph\",\"tags\":{\"cocmnyyaztt\":\"qlfktsths\",\"edckzywbiexzfey\":\"twwrqp\",\"ujwb\":\"eaxib\",\"zjancuxr\":\"qwalmuzyoxaepd\"},\"id\":\"d\",\"name\":\"bavxbniwdjswzt\",\"type\":\"dbpgnxytxhp\"}")
            .toObject(ExperimentInner.class);
        Assertions.assertEquals("axdbabph", model.location());
        Assertions.assertEquals("qlfktsths", model.tags().get("cocmnyyaztt"));
        Assertions.assertEquals(ResourceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("mryw", model.steps().get(0).name());
        Assertions.assertEquals("zoqftiyqzrnkcqvy", model.steps().get(0).branches().get(0).name());
        Assertions.assertEquals("whzlsicohoq", model.steps().get(0).branches().get(0).actions().get(0).name());
        Assertions.assertEquals("xnehmpvec", model.selectors().get(0).id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExperimentInner model = new ExperimentInner().withLocation("axdbabph")
            .withTags(mapOf("cocmnyyaztt", "qlfktsths", "edckzywbiexzfey", "twwrqp", "ujwb", "eaxib", "zjancuxr",
                "qwalmuzyoxaepd"))
            .withIdentity(new ResourceIdentity().withType(ResourceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf("hagalpbuxwgipwh", new UserAssignedIdentity())))
            .withSteps(Arrays.asList(
                new ChaosExperimentStep().withName("mryw")
                    .withBranches(Arrays
                        .asList(new ChaosExperimentBranch().withName("zoqftiyqzrnkcqvy")
                            .withActions(Arrays.asList(new ChaosExperimentAction().withName("whzlsicohoq"))),
                            new ChaosExperimentBranch().withName("nwvlryavwhheunmm")
                                .withActions(Arrays.asList(new ChaosExperimentAction().withName("gyxzk"),
                                    new ChaosExperimentAction().withName("noc"),
                                    new ChaosExperimentAction().withName("koklya"))))),
                new ChaosExperimentStep().withName("uconuqszfkbey")
                    .withBranches(Arrays.asList(
                        new ChaosExperimentBranch().withName("wrmjmwvvjektc")
                            .withActions(Arrays.asList(new ChaosExperimentAction().withName("enhwlrs"),
                                new ChaosExperimentAction().withName("frzpwvlqdqgb"))),
                        new ChaosExperimentBranch().withName("qylihkaetckt")
                            .withActions(Arrays.asList(new ChaosExperimentAction().withName("civfsnkymuctq"),
                                new ChaosExperimentAction().withName("jf"),
                                new ChaosExperimentAction().withName("ebrjcxe"))),
                        new ChaosExperimentBranch().withName("fuwutttxf")
                            .withActions(Arrays.asList(new ChaosExperimentAction().withName("rbirphxe"),
                                new ChaosExperimentAction().withName("c"),
                                new ChaosExperimentAction().withName("vahfn"),
                                new ChaosExperimentAction().withName("jky"))),
                        new ChaosExperimentBranch().withName("xjvuujqgidokg")
                            .withActions(Arrays.asList(new ChaosExperimentAction().withName("jyoxgvclt"),
                                new ChaosExperimentAction().withName("gsncghkjeszz"),
                                new ChaosExperimentAction().withName("bijhtxfvgxbf")))))))
            .withSelectors(Arrays.asList(
                new ChaosTargetSelector().withId("xnehmpvec")
                    .withFilter(new ChaosTargetFilter())
                    .withAdditionalProperties(mapOf("type", "ChaosTargetSelector")),
                new ChaosTargetSelector().withId("buynhijggm")
                    .withFilter(new ChaosTargetFilter())
                    .withAdditionalProperties(mapOf("type", "ChaosTargetSelector"))));
        model = BinaryData.fromObject(model).toObject(ExperimentInner.class);
        Assertions.assertEquals("axdbabph", model.location());
        Assertions.assertEquals("qlfktsths", model.tags().get("cocmnyyaztt"));
        Assertions.assertEquals(ResourceIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("mryw", model.steps().get(0).name());
        Assertions.assertEquals("zoqftiyqzrnkcqvy", model.steps().get(0).branches().get(0).name());
        Assertions.assertEquals("whzlsicohoq", model.steps().get(0).branches().get(0).actions().get(0).name());
        Assertions.assertEquals("xnehmpvec", model.selectors().get(0).id());
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
