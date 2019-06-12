package cn.itcast.utils;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("cn.itcast")
@Import(Config2.class)
public class Config {

}
