package com.carfax.dt;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;

public class PreFilter extends ZuulFilter {

    private static Logger logger = org.slf4j.LoggerFactory.getLogger(PreFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1000;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        logger.info(context.getRequest().getRequestURI());
        return null;
    }
}
