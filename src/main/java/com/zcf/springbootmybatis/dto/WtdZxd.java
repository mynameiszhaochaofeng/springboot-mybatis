package com.zcf.springbootmybatis.dto;

import com.zcf.springbootmybatis.pojo.TWtd;
import com.zcf.springbootmybatis.pojo.TZxd;

import java.util.List;

public class WtdZxd {

    private TWtd wtd;
    private List<TZxd> zxd;

    public TWtd getWtd() {
        return wtd;
    }

    public void setWtd(TWtd wtd) {
        this.wtd = wtd;
    }

    public List<TZxd> getZxd() {
        return zxd;
    }

    public void setZxd(List<TZxd> zxd) {
        this.zxd = zxd;
    }

    public WtdZxd() {
    }

    public WtdZxd(TWtd wtd, List<TZxd> zxd) {
        this.wtd = wtd;
        this.zxd = zxd;
    }
}
