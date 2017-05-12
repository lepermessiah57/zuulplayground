package com.carfax.dt;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.ProxyRequestHelper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.FORWARD_TO_KEY;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.SIMPLE_HOST_ROUTING_FILTER_ORDER;

public class RouteBarFilter extends ZuulFilter {

    @Autowired
    private ProxyRequestHelper helper;

    public static final int FILTER_ORDER = SIMPLE_HOST_ROUTING_FILTER_ORDER + 1;

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
        HttpServletResponse response = context.getResponse();
        if(response.getStatus() != 200){
            context.set(FORWARD_TO_KEY,"bar");
        }
        return null;
    }
}
