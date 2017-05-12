package com.carfax.dt;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;

public class RouteFooFilter extends ZuulFilter{

    public static final int FILTER_ORDER = 1;

    @Override
    public String filterType() {
        return "route";
    }

    @Override
    public int filterOrder() {
        return FILTER_ORDER;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        return null;
    }
}
