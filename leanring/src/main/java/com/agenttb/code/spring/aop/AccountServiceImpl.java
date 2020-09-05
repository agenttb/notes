package com.agenttb.code.spring.aop;

import com.agenttb.code.spring.annotation.BusinessScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class AccountServiceImpl implements AccountService {
    private final static Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);


    @Override
    @BusinessScope
    public int query() {
        logger.debug("查询账户余额*********");
        return 0;
    }

    @Override
    @BusinessScope
    public void freeze() {
        logger.debug("冻结费用*************");
    }

    @Override
    @BusinessScope
    public void unFreeze() {
        logger.debug("解冻费用*************");
    }
}
