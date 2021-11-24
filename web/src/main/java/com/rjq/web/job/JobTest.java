package com.rjq.web.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JobTest {

    public final static Logger logger = LoggerFactory.getLogger(JobTest.class);

    @XxlJob("jobTest")
    public ReturnT<String> jobTest(String param) {
        logger.info((new Date()).toString());
        return ReturnT.SUCCESS;
    }
}
