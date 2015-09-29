package com.mycompany.DWVersionSample.service;

import com.mycompany.DWVersionSample.api.v1.serviceImpl.OrderServiceV1Impl;
import com.mycompany.DWVersionSample.api.v2.serviceImpl.OrderServiceV2Impl;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Hello world!
 *
 */
public class App extends Application<config>
{
    public static void main( String[] args ) throws Exception
    {
    	 new App().run(args);
    }
    
    @Override
    public void initialize(Bootstrap<config> arg0) {
        
       
    }
    
    @Override
    public void run(config config, Environment env)
            throws Exception {
                
        env.jersey().register(new OrderServiceV1Impl());
        env.jersey().register(new OrderServiceV2Impl());

     }
}
