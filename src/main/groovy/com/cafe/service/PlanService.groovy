package com.cafe.service

import com.cafe.model.dto.PlanInsertDTO
import com.cafe.model.entity.Plan

/**
 * @Project: note-boot-groovy
 * @Date: 2025/1/18 3:07
 * @Description: 计划业务层接口
 */
interface PlanService {

    /**
     * 查询计划列表
     */
    List<Plan> list()

    /**
     * 根据id查询计划
     */
    Plan one(String id)

    /**
     * 新增计划
     */
    Plan insert(PlanInsertDTO dto)

    /**
     * 批量新增计划
     */
    List<Plan> insertBatch(List<PlanInsertDTO> dtoList)

    /**
     * 修改计划
     */
    Plan update(Plan plan)

    /**
     * 批量修改计划
     */
    List<Plan> updateBatch(List<Plan> planList)

    /**
     * 删除计划
     */
    void delete(String id)

    /**
     * 批量删除计划
     */
    void deleteBatch(List<String> idList)
}
