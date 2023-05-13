package com.pride.encry.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 船籍港映射关系表
 * </p>
 *
 * @author liuyang
 * @since 2021-10-10
 */
@Data
public class EfHomePortDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String code;
    private String parentId;
    private String parentCode;
    private String mapName;

}
