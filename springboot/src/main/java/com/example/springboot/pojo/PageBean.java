package com.example.springboot.pojo;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * * *  GOOK LUCK  * *
 *
 * @Author by   wukainian,
 * @Date on     2018/11/22.
 * 分页模型
 */
public class PageBean<T> {

    /**
     * 当前第几页
     */
    private Integer pageNo;

    /**
     * 每页显示多少条
     */
    private Integer pageSize;

    /**
     * 排序属性
     */
    private String sort;

    /**
     * 总页数
     */
    private Long totalsaize;

    /**
     * 数据信息
     */
    private List<T> list;

    public PageBean() {
    }

    public PageBean(Integer pageNo, Integer pageSize, String sort, Long totalsaize, List<T> list) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.sort = sort;
        this.totalsaize = totalsaize;
        this.list = list;
    }

    public PageBean(Integer pageNo, Integer pageSize, String sort, Long totalsaize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.sort = sort;
        this.totalsaize = totalsaize;
    }

    public PageBean(Integer pageNo, Integer pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Long getTotalsaize() {
        return totalsaize;
    }

    public void setTotalsaize(Long totalsaize) {
        this.totalsaize = totalsaize;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
