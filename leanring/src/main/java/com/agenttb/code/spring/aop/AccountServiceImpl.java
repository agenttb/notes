package com.agenttb.code.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountServiceImpl implements AccountService {
    private final static Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);
    @Override
    public int query() {
        logger.debug("查询账户余额*********");
        return 0;
    }

    @Override
    public void freeze() {
        logger.debug("冻结费用*************");
    }

    @Override
    public void unFreeze() {
        logger.debug("解冻费用*************");
    }
}
