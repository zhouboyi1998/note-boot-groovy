package com.cafe.controller

import com.cafe.dto.PlanInsertDTO
import com.cafe.model.Plan
import com.cafe.service.PlanService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @Project: note-boot-groovy
 * @Date: 2025/1/18 3:18
 * @Description: 计划接口
 */
@Tag(name = "计划接口")
@RestController
@RequestMapping(value = ["/note/plan"])
class PlanController {

    @Autowired
    private PlanService planService

    @Operation(summary = "查询计划列表")
    @GetMapping(value = ["/list"])
    List<Plan> list() {
        planService.list()
    }

    @Operation(summary = "根据id查询单个计划")
    @Parameter(description = "计划id", name = "id", schema = @Schema(type = "String"), required = true)
    @GetMapping(value = ["/one/{id}"])
    Plan one(@PathVariable(value = "id") String id) {
        planService.one(id)
    }

    @Operation(summary = "新增计划")
    @Parameter(description = "计划新增DTO", name = "dto", schema = @Schema(type = "PlanInsertDTO"), required = true)
    @PostMapping(value = ["/insert"])
    Plan insert(@RequestBody PlanInsertDTO dto) {
        planService.insert(dto)
    }

    @Operation(summary = "根据id修改计划")
    @Parameter(description = "计划Model", name = "plan", schema = @Schema(type = "Plan"), required = true)
    @PutMapping(value = ["/update"])
    Plan update(@RequestBody Plan plan) {
        planService.update(plan)
    }

    @Operation(summary = "根据id删除计划")
    @Parameter(description = "计划id", name = "id", schema = @Schema(type = "String"), required = true)
    @DeleteMapping(value = ["/delete/{id}"])
    void delete(@PathVariable(value = "id") String id) {
        planService.delete(id)
    }
}
