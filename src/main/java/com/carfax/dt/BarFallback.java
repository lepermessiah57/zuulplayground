package com.carfax.dt;

import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.client.ClientHttpResponse;

public class BarFallback implements ZuulFallbackProvider {
    @Override
    public String getRoute() {
        return "foo";
    }

    @Override
    public ClientHttpResponse fallbackResponse() {
        RequestContext context = RequestContext.getCurrentContext();
        System.out.println(context);
        return null;
    }
}
