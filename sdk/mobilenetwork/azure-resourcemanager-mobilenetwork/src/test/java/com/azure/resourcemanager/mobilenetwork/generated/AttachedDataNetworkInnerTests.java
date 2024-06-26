// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.AttachedDataNetworkInner;
import com.azure.resourcemanager.mobilenetwork.models.InterfaceProperties;
import com.azure.resourcemanager.mobilenetwork.models.NaptConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.NaptEnabled;
import com.azure.resourcemanager.mobilenetwork.models.PinholeTimeouts;
import com.azure.resourcemanager.mobilenetwork.models.PortRange;
import com.azure.resourcemanager.mobilenetwork.models.PortReuseHoldTimes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AttachedDataNetworkInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AttachedDataNetworkInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Canceled\",\"userPlaneDataInterface\":{\"name\":\"quvgjxpybczme\",\"ipv4Address\":\"tzopbsphrupidgsy\",\"ipv4Subnet\":\"ejhphoyc\",\"ipv4Gateway\":\"xaobhdxbmtqioqjz\",\"vlanId\":1801213143,\"ipv4AddressList\":[\"ufpo\"],\"bfdIpv4Endpoints\":[\"izhwlrxy\"]},\"dnsAddresses\":[\"soqijg\",\"dmbpazlobcufpdz\",\"rbt\"],\"naptConfiguration\":{\"enabled\":\"Disabled\",\"portRange\":{\"minPort\":1110459096,\"maxPort\":1499509907},\"portReuseHoldTime\":{\"tcp\":1049703732,\"udp\":1127644012},\"pinholeLimits\":342241824,\"pinholeTimeouts\":{\"tcp\":744579051,\"udp\":1080301009,\"icmp\":673031799}},\"userEquipmentAddressPoolPrefix\":[\"saagdf\",\"glzlhjxrifkwmrv\"],\"userEquipmentStaticAddressPoolPrefix\":[\"izntocipao\",\"ajpsquc\"]},\"location\":\"o\",\"tags\":{\"knygjofjddeq\":\"kfo\"},\"id\":\"rd\",\"name\":\"upewnwreitjzy\",\"type\":\"lusarh\"}")
            .toObject(AttachedDataNetworkInner.class);
        Assertions.assertEquals("o", model.location());
        Assertions.assertEquals("kfo", model.tags().get("knygjofjddeq"));
        Assertions.assertEquals("quvgjxpybczme", model.userPlaneDataInterface().name());
        Assertions.assertEquals("tzopbsphrupidgsy", model.userPlaneDataInterface().ipv4Address());
        Assertions.assertEquals("ejhphoyc", model.userPlaneDataInterface().ipv4Subnet());
        Assertions.assertEquals("xaobhdxbmtqioqjz", model.userPlaneDataInterface().ipv4Gateway());
        Assertions.assertEquals(1801213143, model.userPlaneDataInterface().vlanId());
        Assertions.assertEquals("ufpo", model.userPlaneDataInterface().ipv4AddressList().get(0));
        Assertions.assertEquals("izhwlrxy", model.userPlaneDataInterface().bfdIpv4Endpoints().get(0));
        Assertions.assertEquals("soqijg", model.dnsAddresses().get(0));
        Assertions.assertEquals(NaptEnabled.DISABLED, model.naptConfiguration().enabled());
        Assertions.assertEquals(1110459096, model.naptConfiguration().portRange().minPort());
        Assertions.assertEquals(1499509907, model.naptConfiguration().portRange().maxPort());
        Assertions.assertEquals(1049703732, model.naptConfiguration().portReuseHoldTime().tcp());
        Assertions.assertEquals(1127644012, model.naptConfiguration().portReuseHoldTime().udp());
        Assertions.assertEquals(342241824, model.naptConfiguration().pinholeLimits());
        Assertions.assertEquals(744579051, model.naptConfiguration().pinholeTimeouts().tcp());
        Assertions.assertEquals(1080301009, model.naptConfiguration().pinholeTimeouts().udp());
        Assertions.assertEquals(673031799, model.naptConfiguration().pinholeTimeouts().icmp());
        Assertions.assertEquals("saagdf", model.userEquipmentAddressPoolPrefix().get(0));
        Assertions.assertEquals("izntocipao", model.userEquipmentStaticAddressPoolPrefix().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AttachedDataNetworkInner model = new AttachedDataNetworkInner().withLocation("o")
            .withTags(mapOf("knygjofjddeq", "kfo"))
            .withUserPlaneDataInterface(new InterfaceProperties().withName("quvgjxpybczme")
                .withIpv4Address("tzopbsphrupidgsy")
                .withIpv4Subnet("ejhphoyc")
                .withIpv4Gateway("xaobhdxbmtqioqjz")
                .withVlanId(1801213143)
                .withIpv4AddressList(Arrays.asList("ufpo"))
                .withBfdIpv4Endpoints(Arrays.asList("izhwlrxy")))
            .withDnsAddresses(Arrays.asList("soqijg", "dmbpazlobcufpdz", "rbt"))
            .withNaptConfiguration(new NaptConfiguration().withEnabled(NaptEnabled.DISABLED)
                .withPortRange(new PortRange().withMinPort(1110459096).withMaxPort(1499509907))
                .withPortReuseHoldTime(new PortReuseHoldTimes().withTcp(1049703732).withUdp(1127644012))
                .withPinholeLimits(342241824)
                .withPinholeTimeouts(new PinholeTimeouts().withTcp(744579051).withUdp(1080301009).withIcmp(673031799)))
            .withUserEquipmentAddressPoolPrefix(Arrays.asList("saagdf", "glzlhjxrifkwmrv"))
            .withUserEquipmentStaticAddressPoolPrefix(Arrays.asList("izntocipao", "ajpsquc"));
        model = BinaryData.fromObject(model).toObject(AttachedDataNetworkInner.class);
        Assertions.assertEquals("o", model.location());
        Assertions.assertEquals("kfo", model.tags().get("knygjofjddeq"));
        Assertions.assertEquals("quvgjxpybczme", model.userPlaneDataInterface().name());
        Assertions.assertEquals("tzopbsphrupidgsy", model.userPlaneDataInterface().ipv4Address());
        Assertions.assertEquals("ejhphoyc", model.userPlaneDataInterface().ipv4Subnet());
        Assertions.assertEquals("xaobhdxbmtqioqjz", model.userPlaneDataInterface().ipv4Gateway());
        Assertions.assertEquals(1801213143, model.userPlaneDataInterface().vlanId());
        Assertions.assertEquals("ufpo", model.userPlaneDataInterface().ipv4AddressList().get(0));
        Assertions.assertEquals("izhwlrxy", model.userPlaneDataInterface().bfdIpv4Endpoints().get(0));
        Assertions.assertEquals("soqijg", model.dnsAddresses().get(0));
        Assertions.assertEquals(NaptEnabled.DISABLED, model.naptConfiguration().enabled());
        Assertions.assertEquals(1110459096, model.naptConfiguration().portRange().minPort());
        Assertions.assertEquals(1499509907, model.naptConfiguration().portRange().maxPort());
        Assertions.assertEquals(1049703732, model.naptConfiguration().portReuseHoldTime().tcp());
        Assertions.assertEquals(1127644012, model.naptConfiguration().portReuseHoldTime().udp());
        Assertions.assertEquals(342241824, model.naptConfiguration().pinholeLimits());
        Assertions.assertEquals(744579051, model.naptConfiguration().pinholeTimeouts().tcp());
        Assertions.assertEquals(1080301009, model.naptConfiguration().pinholeTimeouts().udp());
        Assertions.assertEquals(673031799, model.naptConfiguration().pinholeTimeouts().icmp());
        Assertions.assertEquals("saagdf", model.userEquipmentAddressPoolPrefix().get(0));
        Assertions.assertEquals("izntocipao", model.userEquipmentStaticAddressPoolPrefix().get(0));
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
