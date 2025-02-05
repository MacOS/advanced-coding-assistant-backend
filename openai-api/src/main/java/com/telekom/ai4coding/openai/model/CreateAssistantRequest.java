package com.telekom.ai4coding.openai.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * CreateAssistantRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CreateAssistantRequest {

  private String model;

  private JsonNullable<@Size(max = 256) String> name = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 512) String> description = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 32768) String> instructions = JsonNullable.<String>undefined();

  @Valid
  private List<@Valid AssistantObjectToolsInner> tools = new ArrayList<>();

  @Valid
  private List<String> fileIds = new ArrayList<>();

  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public CreateAssistantRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateAssistantRequest(String model) {
    this.model = model;
  }

  public CreateAssistantRequest model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
  */
  @NotNull 
  @Schema(name = "model", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CreateAssistantRequest name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * The name of the assistant. The maximum length is 256 characters. 
   * @return name
  */
  @Size(max = 256) 
  @Schema(name = "name", description = "The name of the assistant. The maximum length is 256 characters. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public JsonNullable<@Size(max = 256) String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public CreateAssistantRequest description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * The description of the assistant. The maximum length is 512 characters. 
   * @return description
  */
  @Size(max = 512) 
  @Schema(name = "description", description = "The description of the assistant. The maximum length is 512 characters. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public JsonNullable<@Size(max = 512) String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public CreateAssistantRequest instructions(String instructions) {
    this.instructions = JsonNullable.of(instructions);
    return this;
  }

  /**
   * The system instructions that the assistant uses. The maximum length is 32768 characters. 
   * @return instructions
  */
  @Size(max = 32768) 
  @Schema(name = "instructions", description = "The system instructions that the assistant uses. The maximum length is 32768 characters. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instructions")
  public JsonNullable<@Size(max = 32768) String> getInstructions() {
    return instructions;
  }

  public void setInstructions(JsonNullable<String> instructions) {
    this.instructions = instructions;
  }

  public CreateAssistantRequest tools(List<@Valid AssistantObjectToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  public CreateAssistantRequest addToolsItem(AssistantObjectToolsInner toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }

  /**
   * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
   * @return tools
  */
  @Valid @Size(max = 128) 
  @Schema(name = "tools", description = "A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tools")
  public List<@Valid AssistantObjectToolsInner> getTools() {
    return tools;
  }

  public void setTools(List<@Valid AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

  public CreateAssistantRequest fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public CreateAssistantRequest addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<>();
    }
    this.fileIds.add(fileIdsItem);
    return this;
  }

  /**
   * A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
   * @return fileIds
  */
  @Size(max = 20) 
  @Schema(name = "file_ids", description = "A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_ids")
  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public CreateAssistantRequest metadata(Object metadata) {
    this.metadata = JsonNullable.of(metadata);
    return this;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
   * @return metadata
  */
  
  @Schema(name = "metadata", description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public JsonNullable<Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(JsonNullable<Object> metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAssistantRequest createAssistantRequest = (CreateAssistantRequest) o;
    return Objects.equals(this.model, createAssistantRequest.model) &&
        equalsNullable(this.name, createAssistantRequest.name) &&
        equalsNullable(this.description, createAssistantRequest.description) &&
        equalsNullable(this.instructions, createAssistantRequest.instructions) &&
        Objects.equals(this.tools, createAssistantRequest.tools) &&
        Objects.equals(this.fileIds, createAssistantRequest.fileIds) &&
        equalsNullable(this.metadata, createAssistantRequest.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, hashCodeNullable(name), hashCodeNullable(description), hashCodeNullable(instructions), tools, fileIds, hashCodeNullable(metadata));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssistantRequest {\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}