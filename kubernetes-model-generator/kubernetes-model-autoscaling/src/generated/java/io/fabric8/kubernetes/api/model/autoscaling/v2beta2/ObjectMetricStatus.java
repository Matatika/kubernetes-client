
package io.fabric8.kubernetes.api.model.autoscaling.v2beta2;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "metadata",
    "current",
    "describedObject",
    "metric"
})
@ToString
@EqualsAndHashCode
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
public class ObjectMetricStatus implements KubernetesResource
{

    @JsonProperty("current")
    private MetricValueStatus current;
    @JsonProperty("describedObject")
    private CrossVersionObjectReference describedObject;
    @JsonProperty("metric")
    private MetricIdentifier metric;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ObjectMetricStatus() {
    }

    /**
     * 
     * @param describedObject
     * @param current
     * @param metric
     */
    public ObjectMetricStatus(MetricValueStatus current, CrossVersionObjectReference describedObject, MetricIdentifier metric) {
        super();
        this.current = current;
        this.describedObject = describedObject;
        this.metric = metric;
    }

    @JsonProperty("current")
    public MetricValueStatus getCurrent() {
        return current;
    }

    @JsonProperty("current")
    public void setCurrent(MetricValueStatus current) {
        this.current = current;
    }

    @JsonProperty("describedObject")
    public CrossVersionObjectReference getDescribedObject() {
        return describedObject;
    }

    @JsonProperty("describedObject")
    public void setDescribedObject(CrossVersionObjectReference describedObject) {
        this.describedObject = describedObject;
    }

    @JsonProperty("metric")
    public MetricIdentifier getMetric() {
        return metric;
    }

    @JsonProperty("metric")
    public void setMetric(MetricIdentifier metric) {
        this.metric = metric;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}