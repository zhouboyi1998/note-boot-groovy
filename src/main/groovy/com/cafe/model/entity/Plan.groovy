package com.cafe.model.entity

import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer
import groovy.transform.TupleConstructor
import io.swagger.v3.oas.annotations.media.Schema
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * @Project: note-boot-groovy
 * @Date: 2025/1/18 2:52
 * @Description: 计划
 */
@Schema(description = "计划")
@Document(value = "note_plan")
@TupleConstructor
class Plan {

    @Schema(description = "ID")
    @Id
    @JsonSerialize(using = ToStringSerializer)
    ObjectId id

    @Schema(description = "标题")
    String title

    @Schema(description = "内容")
    List<String> content

    @Schema(description = "图标")
    String icon

    @Schema(description = "颜色")
    String color

    @Schema(description = "时间")
    String time
}
