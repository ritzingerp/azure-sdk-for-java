# Release History

## 1.0.0-beta.3 (Unreleased)

### Features Added

### Breaking Changes

### Bugs Fixed

### Other Changes

## 1.0.0-beta.2 (2024-10-23)

- Added support for the Large Face List and Large Person Group:
  - Added client `LargeFaceListClient` and `LargePersonGroupClient`.
  - Added operations `FindSimilarFromLargeFaceList`, `IdentifyFromLargePersonGroup` and `VerifyFromLargePersonGroup` to `FaceClient`.
  - Added models for supporting Large Face List and Large Person Group.
- Added support for latest Detect Liveness Session API:
  - Added operations `GetSessionImage` and `DetectFromSessionImage` to `FaceSessionClient`.
  - Added properties `EnableSessionImage ` and `LivenessSingleModalModel` to model `CreateLivenessSessionContent`.
  - Added model `CreateLivenessWithVerifySessionContent`.

### Breaking Changes

- Changed the parameter of `CreateLivenessWithVerifySession` from model `CreateLivenessSessionContent` to `CreateLivenessWithVerifySessionContent`.

### Other Changes

- Change the default service API version to `v1.2-preview.1`.

## 1.0.0-beta.1 (2024-05-28)

Version 1.0.0-beta.1 is a preview of our efforts in creating a client library for Azure AI Vision Face Service that is developer-friendly
and idiomatic to the Java ecosystem. The principles that guide
our efforts can be found in the [Azure SDK Design Guidelines for Java](https://azure.github.io/azure-sdk/java_introduction.html). For more information about this, and preview releases of other Azure SDK libraries, please visit
https://azure.github.io/azure-sdk/releases/latest/java.html.

- It uses the Azure AI Vision Face service `v1.1-preview.1` API.
- Three client design:
    - `FaceClient` provides functionality for face detection and recognition, including 'detect', 'verify', 'findsimilar' and 'group'
    - `FaceSessionClient` to orchestrate with mobile client application to perform liveness check and verification
- Authentication with API key supported using `AzureKeyCredential("<api_key>")` from `com.azure.core.credential`
- Authentication with AAD using `DefaultAzureCredentialBuilder()` from `com.azure.identity`
