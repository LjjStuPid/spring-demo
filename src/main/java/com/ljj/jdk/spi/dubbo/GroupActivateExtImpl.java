package com.ljj.jdk.spi.dubbo;

import com.alibaba.dubbo.common.extension.Activate;

@Activate(group = {"group1","group2"})
public class GroupActivateExtImpl implements ActivateExt1 {
    @Override
    public String echo(String msg) {
        return msg;
    }
}
