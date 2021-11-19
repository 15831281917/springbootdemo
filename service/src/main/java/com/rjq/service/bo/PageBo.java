package com.rjq.service.bo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 分页基类（需要手写 mapper，并有分页需求的Bo继承此类）
 */
@Data
@Accessors(chain = true)
public class PageBo implements Serializable {

    /**
     * 当前页
     */
    private long current;
    /**
     * 每页大小
     */
    private long size;

    public PageBo(long page, long size) {
        super();
        this.current = page;
        this.size = size;
    }

    public PageBo() {
        super();
    }

    public Long getStart() {
        if (needPage()) {
            return (current - 1L) * size;
        } else {
            return 0L;
        }
    }

    public boolean validatePageParam() {
        if (current >= 0 && size >= 0) {
            return true;
        }
        return false;
    }

    public boolean needPage() {
        return current >= 1L && size >= 1L;
    }

    public static long getCurrent(PageBo bo) {
        return bo == null ? 0L : bo.getCurrent();
    }

    public static long getSize(PageBo bo) {
        return bo == null ? 0L : bo.getSize();
    }
}
