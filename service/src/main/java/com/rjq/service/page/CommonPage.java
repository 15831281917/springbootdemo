package com.rjq.service.page;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * 分页
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CommonPage<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前页
     */
    long current;

    /**
     * 每页多少条
     */
    long size;

    /**
     * 一共多少页
     */
    long pages;

    /**
     * 一共多少条
     */
    long total;

    /**
     * 结果集明细
     */
    List<T> records;

}
