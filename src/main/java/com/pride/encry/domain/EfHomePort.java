package com.pride.encry.domain;

import lombok.Data;

@Data
public class EfHomePort {
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String code;
    private String parentId;
    private String parentCode;
    private String mapName;
}
