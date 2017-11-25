package com.xu.test;

import org.springframework.cache.annotation.CachePut;

public  abstract class RedisLoaderService {
    Integer pagesize = 0;
    Integer pageCurrent1=0;
    Integer pageCurrent2=0;
    String pageSql = "";
    boolean hasnext = true;
    public  void pageNation(){
        //1。计算总页数
        if(pagesize == 0){
            //这里面算
        }
        //接下来进行页数加减
        {

        }
        pagesize = 5;
        pageCurrent1 = 0;
        pageCurrent2 =1;
        //更新循环条件
        if(pageCurrent2 >= pagesize) {
            hasnext = false;
        }
    }

    public void init(){
        this.hasnext = true;
         pagesize = 0;
         pageCurrent1=0;
         pageCurrent2=0;
        pageNation();
    }
    public abstract void doLoad();

    public void setPageSql(String x){
        this.pageSql =x;
    }
}
