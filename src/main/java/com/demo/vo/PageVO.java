package com.demo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description 分页返回值
 * @Date 2020/10/13 12:55
 */
@Data
@ApiModel("分页返回值")
@NoArgsConstructor
@AllArgsConstructor
public class PageVO<T> {
    @ApiModelProperty("数据")
    private List<T> list;
    @ApiModelProperty("总数量")
    private Long total;
}
