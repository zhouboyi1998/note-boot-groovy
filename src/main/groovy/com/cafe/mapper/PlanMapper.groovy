package com.cafe.mapper

import com.cafe.model.entity.Plan
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * @Project: note-boot-groovy
 * @Date: 2025/1/18 3:04
 * @Description: 计划持久层接口
 */
interface PlanMapper extends MongoRepository<Plan, ObjectId> {

}
