package com.chins.mall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 属性&属性分组关联
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsAttrAttrgroupRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 属性id
     */
    private Long attrId;

    /**
     * 属性分组id
     */
    private Long attrGroupId;

    /**
     * 属性组内排序
     */
    private Integer attrSort;


}
