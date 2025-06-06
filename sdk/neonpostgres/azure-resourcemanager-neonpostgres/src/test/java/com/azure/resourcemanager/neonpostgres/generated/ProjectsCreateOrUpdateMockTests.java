// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.neonpostgres.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.neonpostgres.NeonPostgresManager;
import com.azure.resourcemanager.neonpostgres.models.Attributes;
import com.azure.resourcemanager.neonpostgres.models.BranchProperties;
import com.azure.resourcemanager.neonpostgres.models.DefaultEndpointSettings;
import com.azure.resourcemanager.neonpostgres.models.EndpointProperties;
import com.azure.resourcemanager.neonpostgres.models.EndpointType;
import com.azure.resourcemanager.neonpostgres.models.NeonDatabaseProperties;
import com.azure.resourcemanager.neonpostgres.models.NeonRoleProperties;
import com.azure.resourcemanager.neonpostgres.models.Project;
import com.azure.resourcemanager.neonpostgres.models.ProjectProperties;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ProjectsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"entityId\":\"xfabl\",\"entityName\":\"pwbmwhria\",\"createdAt\":\"wrycgnwpl\",\"provisioningState\":\"Succeeded\",\"attributes\":[{\"name\":\"ctsbbibt\",\"value\":\"cu\"},{\"name\":\"qvumspbfsfeqbbe\",\"value\":\"f\"},{\"name\":\"uqfpyyxmzrmtm\",\"value\":\"wi\"}],\"regionId\":\"we\",\"storage\":8294959969159846095,\"pgVersion\":1563265954,\"historyRetention\":2080803737,\"defaultEndpointSettings\":{\"autoscalingLimitMinCu\":55.359310157197186,\"autoscalingLimitMaxCu\":54.85246943768806},\"branch\":{\"entityId\":\"prcmvouujxdiik\",\"entityName\":\"xrezsvavlrxi\",\"createdAt\":\"moywlu\",\"provisioningState\":\"Failed\",\"attributes\":[{\"name\":\"wybsz\",\"value\":\"ncnpat\"},{\"name\":\"ftsaebwfwh\",\"value\":\"orpwaltzwugexojf\"},{\"name\":\"cylht\",\"value\":\"hthvazjpwex\"},{\"name\":\"dr\",\"value\":\"probzzxezmnrkjgp\"}],\"projectId\":\"uxsphlokfpm\",\"parentId\":\"pd\",\"roleName\":\"vfbhwb\",\"databaseName\":\"ufvcgnrgl\",\"roles\":[{\"entityId\":\"yambhb\",\"entityName\":\"ebzx\",\"createdAt\":\"jqut\",\"provisioningState\":\"Succeeded\",\"attributes\":[{\"name\":\"nntrvrkps\",\"value\":\"bduxvzmlghnys\"},{\"name\":\"lpyeu\",\"value\":\"kppdi\"},{\"name\":\"qb\",\"value\":\"lxvhhyqqegatxgrz\"},{\"name\":\"mg\",\"value\":\"nmtsdixc\"}],\"branchId\":\"kibmgjymn\",\"permissions\":[\"agairwcqzoofjnqj\"],\"isSuperUser\":true},{\"entityId\":\"fbhtleberp\",\"entityName\":\"jeknfqnw\",\"createdAt\":\"qxowkdn\",\"provisioningState\":\"Succeeded\",\"attributes\":[{\"name\":\"rhw\",\"value\":\"ehycpn\"},{\"name\":\"wawonoehrguql\",\"value\":\"fwafbjz\"}],\"branchId\":\"yrguyfazbk\",\"permissions\":[\"ygvthrmxkbcjw\",\"dxomrawppk\",\"boozflyacagaed\"],\"isSuperUser\":false},{\"entityId\":\"clmgdtw\",\"entityName\":\"bd\",\"createdAt\":\"kuz\",\"provisioningState\":\"Canceled\",\"attributes\":[{\"name\":\"ooyvhtuqbpeln\",\"value\":\"ibncgagdvcd\"},{\"name\":\"hftzbpyfao\",\"value\":\"df\"},{\"name\":\"htncwmhjobzrfp\",\"value\":\"iz\"}],\"branchId\":\"qhy\",\"permissions\":[\"vb\",\"wgwhgkg\",\"o\",\"uoorssatfybipufd\"],\"isSuperUser\":false},{\"entityId\":\"bd\",\"entityName\":\"as\",\"createdAt\":\"uxvzfqayopbtsi\",\"provisioningState\":\"Failed\",\"attributes\":[{\"name\":\"hx\",\"value\":\"ndztgsq\"},{\"name\":\"ayqmarxneibpgbrh\",\"value\":\"jdqknhqn\"},{\"name\":\"otpu\",\"value\":\"nnohmmzngo\"},{\"name\":\"fr\",\"value\":\"uypwyiulaynos\"}],\"branchId\":\"kfhaxttpfsmwgsgh\",\"permissions\":[\"umlddauqmllfe\"],\"isSuperUser\":false}],\"databases\":[{\"entityId\":\"rigrjdljlkq\",\"entityName\":\"krbzkuas\",\"createdAt\":\"xk\",\"provisioningState\":\"Succeeded\",\"attributes\":[{\"name\":\"l\",\"value\":\"gltoizwxvscksgf\"},{\"name\":\"yskye\",\"value\":\"gafxczvf\"},{\"name\":\"ckwrtw\",\"value\":\"ety\"}],\"branchId\":\"szrtlhpdhwynct\",\"ownerName\":\"zcnjfmbbfnvjxit\"},{\"entityId\":\"vnk\",\"entityName\":\"iklsmni\",\"createdAt\":\"lcoqksyiib\",\"provisioningState\":\"Canceled\",\"attributes\":[{\"name\":\"gbudav\",\"value\":\"d\"},{\"name\":\"rbccqcdht\",\"value\":\"ojvlirknucosaw\"}],\"branchId\":\"tnagzlgpya\",\"ownerName\":\"ihzqjjtsmuy\"}],\"endpoints\":[{\"entityId\":\"tkacybdueurgmcd\",\"entityName\":\"kshloje\",\"createdAt\":\"hzic\",\"provisioningState\":\"Failed\",\"attributes\":[{\"name\":\"hyaaknyukibxiglh\",\"value\":\"hzwxq\"},{\"name\":\"ejp\",\"value\":\"ilhvtozyagjj\"},{\"name\":\"xkbylhyyxgffklv\",\"value\":\"z\"}],\"projectId\":\"trdgscnvqeons\",\"branchId\":\"wxlwme\",\"endpointType\":\"read_only\"},{\"entityId\":\"xpthceopvkvt\",\"entityName\":\"vesob\",\"createdAt\":\"okh\",\"provisioningState\":\"Failed\",\"attributes\":[{\"name\":\"yarnggcjfwblqhxk\",\"value\":\"smcolmugpy\"},{\"name\":\"aosd\",\"value\":\"l\"},{\"name\":\"wzxeygzvtyevjhu\",\"value\":\"nobguqisqsqkpdmi\"},{\"name\":\"y\",\"value\":\"pnml\"}],\"projectId\":\"qcpszp\",\"branchId\":\"vqdvrdmvxyrxdhg\",\"endpointType\":\"read_only\"},{\"entityId\":\"bxaot\",\"entityName\":\"bzxmbtplefoio\",\"createdAt\":\"doxzn\",\"provisioningState\":\"Canceled\",\"attributes\":[{\"name\":\"muuv\",\"value\":\"awsxmrszbknimxlp\"},{\"name\":\"erxrzutylcurza\",\"value\":\"mnb\"},{\"name\":\"qaeht\",\"value\":\"bjmbnvynfaooeac\"}],\"projectId\":\"dcglskakddid\",\"branchId\":\"zl\",\"endpointType\":\"read_write\"}]},\"roles\":[{\"entityId\":\"pbyxroiduyqy\",\"entityName\":\"fmnoiicsudy\",\"createdAt\":\"rjjtalxrdsjrho\",\"provisioningState\":\"Canceled\",\"attributes\":[{\"name\":\"usxxhdodpjwybl\",\"value\":\"tbdmvsbyidae\"},{\"name\":\"q\",\"value\":\"vekmkwjfbotloggd\"},{\"name\":\"s\",\"value\":\"ursuivuxcjk\"}],\"branchId\":\"qwczsyiq\",\"permissions\":[\"fwihvaan\"],\"isSuperUser\":true},{\"entityId\":\"hjrfdmfdvbbaex\",\"entityName\":\"fwtgdfkkauigvmua\",\"createdAt\":\"czfedyuep\",\"provisioningState\":\"Canceled\",\"attributes\":[{\"name\":\"ida\",\"value\":\"jvyweo\"},{\"name\":\"fkumcfjxoky\",\"value\":\"lsyasv\"},{\"name\":\"nkwmygjj\",\"value\":\"krknf\"},{\"name\":\"rugjqyckgtx\",\"value\":\"rdtulcrcjdklotcs\"}],\"branchId\":\"mzoonsvobchkxfpw\",\"permissions\":[\"sl\"],\"isSuperUser\":true},{\"entityId\":\"lmnnk\",\"entityName\":\"ayqshwyqxridttbs\",\"createdAt\":\"jmkgxqwqueuuylzt\",\"provisioningState\":\"Failed\",\"attributes\":[{\"name\":\"evjykofvezefkhkq\",\"value\":\"wqlepjj\"},{\"name\":\"kca\",\"value\":\"fwzcntogffjwaj\"},{\"name\":\"rtwzvaqkifmxa\",\"value\":\"ostfzknh\"}],\"branchId\":\"m\",\"permissions\":[\"cfvdscnhemvwfnqq\"],\"isSuperUser\":false}],\"databases\":[{\"entityId\":\"r\",\"entityName\":\"godtggrs\",\"createdAt\":\"wjfkainjmuym\",\"provisioningState\":\"Canceled\",\"attributes\":[{\"name\":\"tscbgmusai\",\"value\":\"tdscnkzzohnrdd\"},{\"name\":\"lze\",\"value\":\"ozrehlbzqixbnjrq\"},{\"name\":\"zyuexozony\",\"value\":\"pam\"},{\"name\":\"udpabcreuwzos\",\"value\":\"yjxvc\"}],\"branchId\":\"sormrex\",\"ownerName\":\"dubewgzy\"}],\"endpoints\":[{\"entityId\":\"uvecovsd\",\"entityName\":\"zrtdbakr\",\"createdAt\":\"mz\",\"provisioningState\":\"Failed\",\"attributes\":[{\"name\":\"eqsifjmclngygnhr\",\"value\":\"ombcdtajdopggo\"}],\"projectId\":\"jo\",\"branchId\":\"rotpvclpof\",\"endpointType\":\"read_write\"}]},\"id\":\"wkpts\",\"name\":\"wxjgvhxccbmkak\",\"type\":\"kookbputmgvmuyak\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NeonPostgresManager manager = NeonPostgresManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        Project response = manager.projects()
            .define("i")
            .withExistingOrganization("shjvpzaptuoskaoi", "jixwfgc")
            .withProperties(new ProjectProperties().withEntityName("nujvqynvavi")
                .withAttributes(Arrays.asList(new Attributes().withName("uddrwjc").withValue("jbrhlhpvzadbw"),
                    new Attributes().withName("nnin").withValue("fhxrzfr"),
                    new Attributes().withName("vztiucwviqllukh").withValue("rcqxgcbvzarmqc")))
                .withRegionId("okstsinvagovjyh")
                .withStorage(3047175540235079611L)
                .withPgVersion(1624969770)
                .withHistoryRetention(1174803854)
                .withDefaultEndpointSettings(new DefaultEndpointSettings().withAutoscalingLimitMinCu(99.70891949032664)
                    .withAutoscalingLimitMaxCu(98.64417809464288))
                .withBranch(new BranchProperties().withEntityName("vorbalkjnbk")
                    .withAttributes(Arrays.asList(new Attributes().withName("tqkqsygxiynecov").withValue("gzkheubanl"),
                        new Attributes().withName("u").withValue("pqcckqiawzlz"),
                        new Attributes().withName("laslgacizux").withValue("r")))
                    .withProjectId("wp")
                    .withParentId("saudoejtighsx")
                    .withRoleName("ytnkqb")
                    .withDatabaseName("ahovuuw")
                    .withRoles(Arrays
                        .asList(
                            new NeonRoleProperties().withEntityName("fbbcngkegxcypxbb")
                                .withAttributes(Arrays.asList(new Attributes().withName("r").withValue("lqownkiua"),
                                    new Attributes().withName("ewnahwkxjjmzt").withValue("lmsoodtmve")))
                                .withBranchId("hdyswcrptveajc")
                                .withPermissions(Arrays.asList("lgsrgkrfizrpywlp", "yuqh", "lmcskyk"))
                                .withIsSuperUser(false),
                            new NeonRoleProperties().withEntityName("pawmpjprdp")
                                .withAttributes(Arrays.asList(new Attributes().withName("z").withValue("wk"),
                                    new Attributes().withName("yep").withValue("yamnnidmdiawp")))
                                .withBranchId("kzrn")
                                .withPermissions(Arrays.asList("ctdhuosgwq"))
                                .withIsSuperUser(true),
                            new NeonRoleProperties().withEntityName("gcnbhcbmjk")
                                .withAttributes(Arrays.asList(new Attributes().withName("eftvhkmoog").withValue("rh")))
                                .withBranchId("bwgmjgrul")
                                .withPermissions(Arrays.asList("gxhcxnwjtpfdzxco", "z"))
                                .withIsSuperUser(true)))
                    .withDatabases(Arrays.asList(new NeonDatabaseProperties().withEntityName("zkdtzxsoed")
                        .withAttributes(Arrays.asList(new Attributes().withName("snio").withValue("etbzdrdpuenxkgtl"),
                            new Attributes().withName("lmtrlxcznnhz").withValue("bnbmxlxm"),
                            new Attributes().withName("tygeqzus").withValue("toqcahfsgbjm"),
                            new Attributes().withName("reesrfwsszvl").withValue("wliso")))
                        .withBranchId("tfx")
                        .withOwnerName("rqmipfjwf"),
                        new NeonDatabaseProperties().withEntityName("vgs")
                            .withAttributes(Arrays.asList(new Attributes().withName("hxqqmqip").withValue("y"),
                                new Attributes().withName("hfnzocx").withValue("tfshksnyzm"),
                                new Attributes().withName("pamwbw").withValue("bnl"),
                                new Attributes().withName("lcefiqdktw").withValue("kvi")))
                            .withBranchId("pfliwo")
                            .withOwnerName("guuzh"),
                        new NeonDatabaseProperties().withEntityName("ybkekym")
                            .withAttributes(Arrays.asList(new Attributes().withName("hfym").withValue("ouihy")))
                            .withBranchId("euugcigzho")
                            .withOwnerName("mgbvmtdwrqbe")))
                    .withEndpoints(Arrays.asList(new EndpointProperties().withEntityName("fg")
                        .withAttributes(Arrays.asList(new Attributes().withName("aczmuh").withValue("cakznhokhoitwhrj"),
                            new Attributes().withName("dmmazdnc").withValue("idb")))
                        .withProjectId("glhzqp")
                        .withBranchId("bawkikcdg")
                        .withEndpointType(EndpointType.READ_WRITE),
                        new EndpointProperties().withEntityName("ey")
                            .withAttributes(
                                Arrays.asList(new Attributes().withName("agxsurej").withValue("rshzzbgullcxiqqz"),
                                    new Attributes().withName("koxdupnamgl").withValue("ouigdmfivjqte")))
                            .withProjectId("qq")
                            .withBranchId("dydkghpcvrwqir")
                            .withEndpointType(EndpointType.READ_WRITE))))
                .withRoles(Arrays.asList(
                    new NeonRoleProperties().withEntityName("rw")
                        .withAttributes(Arrays.asList(new Attributes().withName("bwlyvxc").withValue("pqvctsfaeuhwwsk"),
                            new Attributes().withName("stvzuzhasupml").withValue("pdpg")))
                        .withBranchId("zqazvb")
                        .withPermissions(Arrays.asList("kptgongruat", "yiysjqheni", "beqngubabyjde", "ysc"))
                        .withIsSuperUser(true),
                    new NeonRoleProperties().withEntityName("rxl")
                        .withAttributes(Arrays.asList(new Attributes().withName("aeqjzmhkd").withValue("lacro"),
                            new Attributes().withName("zfmunerkelux").withValue("shxzezb"),
                            new Attributes().withName("uzudlevzskejcg").withValue("fsgqkstyecupyuij"),
                            new Attributes().withName("ard").withValue("vs")))
                        .withBranchId("fmazpzdqwu")
                        .withPermissions(Arrays.asList("mcokxizeku", "frjwucaon", "vajbvbnkrdemdid"))
                        .withIsSuperUser(true)))
                .withDatabases(Arrays.asList(
                    new NeonDatabaseProperties().withEntityName("ztdivykpxkq")
                        .withAttributes(Arrays.asList(new Attributes().withName("toiboancdr").withValue("o"),
                            new Attributes().withName("nvxuldxonckb").withValue("lblfxlupibaqzizx"),
                            new Attributes().withName("pzweghlwwbo").withValue("vgfklqiyndveqe"),
                            new Attributes().withName("sbfvdstrkzxsgtzn").withValue("vlrdsmovpi")))
                        .withBranchId("ndnoxaxnrqaq")
                        .withOwnerName("nndx"),
                    new NeonDatabaseProperties().withEntityName("dvrgptqmawzjdrp")
                        .withAttributes(Arrays.asList(new Attributes().withName("sd").withValue("tqgkujd"),
                            new Attributes().withName("ooxrqwoeurb").withValue("igapdy")))
                        .withBranchId("ikeej")
                        .withOwnerName("dfhtwmmkfqbriqul"),
                    new NeonDatabaseProperties().withEntityName("qkvyhzokpoyuohu")
                        .withAttributes(Arrays.asList(new Attributes().withName("nglpwsada").withValue("jsumxpezcoio"),
                            new Attributes().withName("jrmfqzwqd").withValue("xkeedcnwmy"),
                            new Attributes().withName("xfqzkvemyzd").withValue("czaqpqifdbmpt")))
                        .withBranchId("txzuisamonatnize")
                        .withOwnerName("oqsqjghr")))
                .withEndpoints(Arrays.asList(
                    new EndpointProperties().withEntityName("iceovxgzw")
                        .withAttributes(Arrays.asList(new Attributes().withName("ik").withValue("ohzixyqhfnkvycqq"),
                            new Attributes().withName("dseipnquwzxhrp").withValue("yodlhkfktltddsob")))
                        .withProjectId("pnouhbqezkqx")
                        .withBranchId("lu")
                        .withEndpointType(EndpointType.READ_WRITE),
                    new EndpointProperties().withEntityName("gsjs")
                        .withAttributes(Arrays.asList(new Attributes().withName("hyqmrejparnpv").withValue("rsz"),
                            new Attributes().withName("bwtdr").withValue("wgzwllxzlhhfi")))
                        .withProjectId("cfculzj")
                        .withBranchId("hp")
                        .withEndpointType(EndpointType.READ_WRITE),
                    new EndpointProperties().withEntityName("unjlzkdrocq")
                        .withAttributes(Arrays.asList(new Attributes().withName("vn").withValue("eylajamcajyhft"),
                            new Attributes().withName("zcrryklleynqa").withValue("hkigglclwalhvub"),
                            new Attributes().withName("gzphetxd").withValue("cmyc"),
                            new Attributes().withName("ajqzj").withValue("alec")))
                        .withProjectId("ibiwksdegyxsb")
                        .withBranchId("zvoikvntwczf")
                        .withEndpointType(EndpointType.READ_WRITE),
                    new EndpointProperties().withEntityName("zpfkis")
                        .withAttributes(Arrays.asList(new Attributes().withName("ia").withValue("cnlrt"),
                            new Attributes().withName("fijzz").withValue("aoijolb")))
                        .withProjectId("uktwieopexelxqdw")
                        .withBranchId("wyil")
                        .withEndpointType(EndpointType.READ_WRITE))))
            .create();

        Assertions.assertEquals("pwbmwhria", response.properties().entityName());
        Assertions.assertEquals("ctsbbibt", response.properties().attributes().get(0).name());
        Assertions.assertEquals("cu", response.properties().attributes().get(0).value());
        Assertions.assertEquals("we", response.properties().regionId());
        Assertions.assertEquals(8294959969159846095L, response.properties().storage());
        Assertions.assertEquals(1563265954, response.properties().pgVersion());
        Assertions.assertEquals(2080803737, response.properties().historyRetention());
        Assertions.assertEquals(55.359310157197186,
            response.properties().defaultEndpointSettings().autoscalingLimitMinCu());
        Assertions.assertEquals(54.85246943768806,
            response.properties().defaultEndpointSettings().autoscalingLimitMaxCu());
        Assertions.assertEquals("xrezsvavlrxi", response.properties().branch().entityName());
        Assertions.assertEquals("wybsz", response.properties().branch().attributes().get(0).name());
        Assertions.assertEquals("ncnpat", response.properties().branch().attributes().get(0).value());
        Assertions.assertEquals("uxsphlokfpm", response.properties().branch().projectId());
        Assertions.assertEquals("pd", response.properties().branch().parentId());
        Assertions.assertEquals("vfbhwb", response.properties().branch().roleName());
        Assertions.assertEquals("ufvcgnrgl", response.properties().branch().databaseName());
        Assertions.assertEquals("ebzx", response.properties().branch().roles().get(0).entityName());
        Assertions.assertEquals("nntrvrkps", response.properties().branch().roles().get(0).attributes().get(0).name());
        Assertions.assertEquals("bduxvzmlghnys",
            response.properties().branch().roles().get(0).attributes().get(0).value());
        Assertions.assertEquals("kibmgjymn", response.properties().branch().roles().get(0).branchId());
        Assertions.assertEquals("agairwcqzoofjnqj", response.properties().branch().roles().get(0).permissions().get(0));
        Assertions.assertTrue(response.properties().branch().roles().get(0).isSuperUser());
        Assertions.assertEquals("krbzkuas", response.properties().branch().databases().get(0).entityName());
        Assertions.assertEquals("l", response.properties().branch().databases().get(0).attributes().get(0).name());
        Assertions.assertEquals("gltoizwxvscksgf",
            response.properties().branch().databases().get(0).attributes().get(0).value());
        Assertions.assertEquals("szrtlhpdhwynct", response.properties().branch().databases().get(0).branchId());
        Assertions.assertEquals("zcnjfmbbfnvjxit", response.properties().branch().databases().get(0).ownerName());
        Assertions.assertEquals("kshloje", response.properties().branch().endpoints().get(0).entityName());
        Assertions.assertEquals("hyaaknyukibxiglh",
            response.properties().branch().endpoints().get(0).attributes().get(0).name());
        Assertions.assertEquals("hzwxq", response.properties().branch().endpoints().get(0).attributes().get(0).value());
        Assertions.assertEquals("trdgscnvqeons", response.properties().branch().endpoints().get(0).projectId());
        Assertions.assertEquals("wxlwme", response.properties().branch().endpoints().get(0).branchId());
        Assertions.assertEquals(EndpointType.READ_ONLY,
            response.properties().branch().endpoints().get(0).endpointType());
        Assertions.assertEquals("fmnoiicsudy", response.properties().roles().get(0).entityName());
        Assertions.assertEquals("usxxhdodpjwybl", response.properties().roles().get(0).attributes().get(0).name());
        Assertions.assertEquals("tbdmvsbyidae", response.properties().roles().get(0).attributes().get(0).value());
        Assertions.assertEquals("qwczsyiq", response.properties().roles().get(0).branchId());
        Assertions.assertEquals("fwihvaan", response.properties().roles().get(0).permissions().get(0));
        Assertions.assertTrue(response.properties().roles().get(0).isSuperUser());
        Assertions.assertEquals("godtggrs", response.properties().databases().get(0).entityName());
        Assertions.assertEquals("tscbgmusai", response.properties().databases().get(0).attributes().get(0).name());
        Assertions.assertEquals("tdscnkzzohnrdd", response.properties().databases().get(0).attributes().get(0).value());
        Assertions.assertEquals("sormrex", response.properties().databases().get(0).branchId());
        Assertions.assertEquals("dubewgzy", response.properties().databases().get(0).ownerName());
        Assertions.assertEquals("zrtdbakr", response.properties().endpoints().get(0).entityName());
        Assertions.assertEquals("eqsifjmclngygnhr",
            response.properties().endpoints().get(0).attributes().get(0).name());
        Assertions.assertEquals("ombcdtajdopggo", response.properties().endpoints().get(0).attributes().get(0).value());
        Assertions.assertEquals("jo", response.properties().endpoints().get(0).projectId());
        Assertions.assertEquals("rotpvclpof", response.properties().endpoints().get(0).branchId());
        Assertions.assertEquals(EndpointType.READ_WRITE, response.properties().endpoints().get(0).endpointType());
    }
}
