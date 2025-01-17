package com.cafe.service.impl

import com.cafe.dto.PlanInsertDTO
import com.cafe.mapper.PlanMapper
import com.cafe.model.Plan
import com.cafe.service.PlanService
import org.bson.types.ObjectId
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

/**
 * @Project: note-boot-groovy
 * @Date: 2025/1/18 3:08
 * @Description: 计划业务层实现类
 */
@Service
class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanMapper planMapper

    @Override
    List<Plan> list() {
        planMapper.findAll(Sort.by(Sort.Order.asc("time")))
    }

    @Override
    Plan one(String id) {
        planMapper.findById(new ObjectId(id)).get()
    }

    @Override
    Plan insert(PlanInsertDTO dto) {
        planMapper.insert(new Plan(new ObjectId(), dto.title, dto.content, dto.icon, dto.color, dto.time))
    }

    @Override
    Plan update(Plan plan) {
        planMapper.save(plan)
    }

    @Override
    void delete(String id) {
        planMapper.deleteById(new ObjectId(id))
    }
}
