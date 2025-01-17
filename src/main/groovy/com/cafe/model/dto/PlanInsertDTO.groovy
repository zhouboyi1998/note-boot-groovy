package com.cafe.model.dto

import io.swagger.v3.oas.annotations.media.Schema

/**
 * @Project: note-boot-groovy
 * @Date: 2025/1/18 3:01
 * @Description: 计划插入数据传输对象
 */
@Schema(description = "计划插入数据传输对象")
class PlanInsertDTO {

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
