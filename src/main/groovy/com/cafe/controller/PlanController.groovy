package com.cafe.controller

import com.cafe.model.dto.PlanInsertDTO
import com.cafe.model.entity.Plan
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
@RequestMapping(value = ["/plan"])
class PlanController {

    @Autowired
    private PlanService planService

    @Operation(summary = "查询计划列表")
    @GetMapping(value = [""])
    List<Plan> list() {
        planService.list()
    }

    @Operation(summary = "根据id查询计划")
    @Parameter(description = "计划id", name = "id", schema = @Schema(type = "String"), required = true)
    @GetMapping(value = ["/{id}"])
    Plan one(@PathVariable(value = "id") String id) {
        planService.one(id)
    }

    @Operation(summary = "新增计划")
    @Parameter(description = "计划插入数据DTO", name = "dto", schema = @Schema(type = "PlanInsertDTO"), required = true)
    @PostMapping(value = [""])
    Plan insert(@RequestBody PlanInsertDTO dto) {
        planService.insert(dto)
    }

    @Operation(summary = "批量新增计划")
    @Parameter(description = "计划插入数据DTO列表", name = "dtoList", schema = @Schema(type = "List<PlanInsertDTO>"), required = true)
    @PostMapping(value = ["/batch"])
    List<Plan> insertBatch(@RequestBody List<PlanInsertDTO> dtoList) {
        planService.insertBatch(dtoList)
    }

    @Operation(summary = "修改计划")
    @Parameter(description = "计划Model", name = "plan", schema = @Schema(type = "Plan"), required = true)
    @PutMapping(value = [""])
    Plan update(@RequestBody Plan plan) {
        planService.update(plan)
    }

    @Operation(summary = "批量修改计划")
    @Parameter(description = "计划Model列表", name = "planList", schema = @Schema(type = "List<Plan>"), required = true)
    @PutMapping(value = ["/batch"])
    List<Plan> updateBatch(@RequestBody List<Plan> planList) {
        planService.updateBatch(planList)
    }

    @Operation(summary = "删除计划")
    @Parameter(description = "计划id", name = "id", schema = @Schema(type = "String"), required = true)
    @DeleteMapping(value = ["/{id}"])
    void delete(@PathVariable(value = "id") String id) {
        planService.delete(id)
    }

    @Operation(summary = "批量删除计划")
    @Parameter(description = "计划id列表", name = "idList", schema = @Schema(type = "List<String>"), required = true)
    @DeleteMapping(value = ["/batch"])
    void deleteBatch(@RequestBody List<String> idList) {
        planService.deleteBatch(idList)
    }
}
