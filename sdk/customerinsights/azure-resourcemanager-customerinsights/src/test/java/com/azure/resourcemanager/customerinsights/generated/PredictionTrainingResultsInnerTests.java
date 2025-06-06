// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.customerinsights.fluent.models.PredictionTrainingResultsInner;

public final class PredictionTrainingResultsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PredictionTrainingResultsInner model = BinaryData.fromString(
            "{\"tenantId\":\"dmvxadq\",\"scoreName\":\"frgnawbabgfbktyj\",\"predictionDistribution\":{\"totalPositives\":7660045297533828027,\"totalNegatives\":4740938932046682285,\"distributions\":[{\"scoreThreshold\":988633110,\"positives\":6400375842524794558,\"negatives\":5095364480002913105,\"positivesAboveThreshold\":4550721956062252261,\"negativesAboveThreshold\":1603449802786867145},{\"scoreThreshold\":677920743,\"positives\":2932623699150569939,\"negatives\":7579007436124595165,\"positivesAboveThreshold\":4645901906687798811,\"negativesAboveThreshold\":6653227888268805782},{\"scoreThreshold\":219417114,\"positives\":583976656188902941,\"negatives\":7083118087762941248,\"positivesAboveThreshold\":6890557510564214609,\"negativesAboveThreshold\":2897453941359814933},{\"scoreThreshold\":1892891154,\"positives\":5176157736054480092,\"negatives\":808505606481731214,\"positivesAboveThreshold\":1090765326929631563,\"negativesAboveThreshold\":6625571913357714852}]},\"canonicalProfiles\":[{\"canonicalProfileId\":359360578,\"properties\":[{\"profileName\":\"ubyzn\",\"profilePropertyName\":\"k\",\"rank\":1441657669,\"type\":\"Categorical\",\"value\":\"vop\"},{\"profileName\":\"tuoqujlyegqavni\",\"profilePropertyName\":\"lqqbtnyjpylxdbfv\",\"rank\":2132700338,\"type\":\"DerivedNumeric\",\"value\":\"xbaevwjcnkot\"},{\"profileName\":\"wuhvaj\",\"profilePropertyName\":\"ilfemjj\",\"rank\":395395965,\"type\":\"DerivedCategorical\",\"value\":\"iqullqxbdmvr\"}]},{\"canonicalProfileId\":1725625204,\"properties\":[{\"profileName\":\"ndb\",\"profilePropertyName\":\"yeofltfnnxrkad\",\"rank\":230862775,\"type\":\"DerivedCategorical\",\"value\":\"muii\"},{\"profileName\":\"ipfohykfkx\",\"profilePropertyName\":\"cbrwjiutgnjizbe\",\"rank\":2019909965,\"type\":\"Categorical\",\"value\":\"rvzb\"},{\"profileName\":\"yrsrziuctixgb\",\"profilePropertyName\":\"uifr\",\"rank\":1812101895,\"type\":\"DerivedNumeric\",\"value\":\"ezkiswqjmdghsypa\"},{\"profileName\":\"bjufptbjczjnciu\",\"profilePropertyName\":\"qvldaswvppisqqzl\",\"rank\":1213183821,\"type\":\"DerivedNumeric\",\"value\":\"xrrfcfsrhkh\"}]},{\"canonicalProfileId\":678517721,\"properties\":[{\"profileName\":\"wkpphefsb\",\"profilePropertyName\":\"lbzxomeikjc\",\"rank\":853415880,\"type\":\"DerivedCategorical\",\"value\":\"mwpfs\"}]}],\"primaryProfileInstanceCount\":315295752450491762}")
            .toObject(PredictionTrainingResultsInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PredictionTrainingResultsInner model = new PredictionTrainingResultsInner();
        model = BinaryData.fromObject(model).toObject(PredictionTrainingResultsInner.class);
    }
}
