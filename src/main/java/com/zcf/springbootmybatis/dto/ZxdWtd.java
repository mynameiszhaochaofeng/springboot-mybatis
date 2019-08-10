package com.zcf.springbootmybatis.dto;

import com.zcf.springbootmybatis.pojo.TWtd;
import com.zcf.springbootmybatis.pojo.TZxd;

public class ZxdWtd {

    private TZxd zxd;
    private TWtd wtd;

    public TZxd getZxd() {
        return zxd;
    }

    public void setZxd(TZxd zxd) {
        this.zxd = zxd;
    }

    public TWtd getWtd() {
        return wtd;
    }

    public void setWtd(TWtd wtd) {
        this.wtd = wtd;
    }

    public ZxdWtd(TZxd zxd, TWtd wtd) {
        this.zxd = zxd;
        this.wtd = wtd;
    }

    public ZxdWtd() {
    }
}
