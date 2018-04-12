package com.wyj.ssm.util;

import com.wyj.ssm.pojo.Air_quality_index;

import java.util.ArrayList;
import java.util.List;

public class Page {
    private int pageNo = 1;
    private int pageSize = 3;
    private int pages;
    private int pageCount;
    private List<Air_quality_index> air_quality_indexs = new ArrayList<Air_quality_index>();

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
        this.pages = this.pageCount % this.pageSize == 0 ?
                this.pageCount / this.pageSize :
                this.pageCount / this.pageSize + 1;
    }

    public List<Air_quality_index> getAir_quality_indexs() {
        return air_quality_indexs;
    }

    public void setAir_quality_indexs(List<Air_quality_index> air_quality_indexs) {
        this.air_quality_indexs = air_quality_indexs;
    }
}
