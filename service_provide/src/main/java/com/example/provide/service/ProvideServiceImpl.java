package com.example.provide.service;


import com.example.comon.Service.ProvideService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ProvideServiceImpl implements ProvideService {

    @Override
    public String testProvide() {
        return "this is ProvideService  Dubbo demo";
    }
}
