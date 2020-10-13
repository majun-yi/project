package com.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @Description 修改学生
 * @Date 2020/10/13 12:52
 */
@Data
@ApiModel("修改参数")
public class UpdateStuDTO extends AddStuDTO {
    /**
     * 数据主键
     */
    @ApiModelProperty("数据主键")
    @NotEmpty
    private String id;
}
