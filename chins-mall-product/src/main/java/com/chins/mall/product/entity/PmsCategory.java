package com.chins.mall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品三级分类
 * </p>
 *
 * @author chins
 * @since 2020-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsCategory implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 分类id
   */
  @TableId(value = "cat_id", type = IdType.AUTO)
  private Long catId;

  /**
   * 分类名称
   */
  private String name;

  /**
   * 父分类id
   */
  private Long parentCid;

  /**
   * 层级
   */
  private Integer catLevel;

  /**
   * 是否显示[0-不显示，1显示]
   */
  private Integer showStatus;

  /**
   * 排序
   */
  private Integer sort;

  /**
   * 图标地址
   */
  private String icon;

  /**
   * 计量单位
   */
  private String productUnit;

  /**
   * 商品数量
   */
  private Integer productCount;


}
