package com.cafe.service

import com.cafe.dto.PlanInsertDTO
import com.cafe.model.Plan

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
     * 根据id查询单个计划
     */
    Plan one(String id)

    /**
     * 新增计划
     */
    Plan insert(PlanInsertDTO dto)

    /**
     * 根据id修改计划
     */
    Plan update(Plan plan)

    /**
     * 根据id删除计划
     */
    void delete(String id)
}
