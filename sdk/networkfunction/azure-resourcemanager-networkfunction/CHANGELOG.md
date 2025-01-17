# Release History

## 1.0.0-beta.4 (Unreleased)

### Features Added

### Breaking Changes

### Bugs Fixed

### Other Changes

## 1.0.0-beta.3 (2024-10-14)

- Azure Resource Manager AzureTrafficCollector client library for Java. This package contains Microsoft Azure SDK for AzureTrafficCollector Management SDK. Azure Traffic Collector service. Package tag package-2022-11-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.EmissionPolicyDestination` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CollectorPolicyListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureTrafficCollectorListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResourceReference` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IngestionSourcesPropertiesFormat` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EmissionPoliciesPropertiesFormat` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.IngestionPolicyPropertiesFormat` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationDisplay` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.TagsObject` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

## 1.0.0-beta.2 (2022-11-24)

- Azure Resource Manager AzureTrafficCollector client library for Java. This package contains Microsoft Azure SDK for AzureTrafficCollector Management SDK. Azure Traffic Collector service. Package tag package-2022-11-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.CollectorPolicy$Update` was modified

* `withIngestionPolicy(models.IngestionPolicyPropertiesFormat)` was removed
* `withEmissionPolicies(java.util.List)` was removed

#### `models.AzureTrafficCollector$Definition` was modified

* `withCollectorPolicies(java.util.List)` was removed

### Features Added

#### `models.CollectorPolicy` was modified

* `region()` was added
* `regionName()` was added
* `location()` was added
* `tags()` was added

#### `models.CollectorPolicy$Update` was modified

* `withTags(java.util.Map)` was added

#### `models.CollectorPolicy$Definition` was modified

* `withRegion(java.lang.String)` was added
* `withRegion(com.azure.core.management.Region)` was added
* `withTags(java.util.Map)` was added

## 1.0.0-beta.1 (2022-07-08)

- Azure Resource Manager AzureTrafficCollector client library for Java. This package contains Microsoft Azure SDK for AzureTrafficCollector Management SDK. Azure Traffic Collector service. Package tag package-2022-05-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
