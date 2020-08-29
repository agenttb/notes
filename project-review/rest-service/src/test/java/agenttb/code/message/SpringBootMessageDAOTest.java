package agenttb.code.message;

import agenttb.code.message.common.MessageState;
import agenttb.code.message.common.MsgType;
import agenttb.code.message.common.SendType;
import agenttb.code.message.dao.*;
import agenttb.code.message.domain.Message;
import agenttb.code.message.domain.MessageRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Date;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@EnableTransactionManagement
public class SpringBootMessageDAOTest {

    @Autowired
    MessageDAO messageDAO;

    @Autowired
    MessageChannelDAO messageChannelDAO;

    @Autowired
    MessageRuleDAO messageRuleDAO;

    @Autowired
    MessageTemplateDAO messageTemplateDAO;

    @Autowired
    MessageUserDAO messageUserDAO;

    public void testInsertMessage() {
        Message message = new Message();
        message.setComment("Send error: sensitive word");
        message.setContent("hello world");
        message.setCreateTime(new Date());
        message.setMsgTemplateId(1000001);
        message.setMsgType(MsgType.SMS.getCode());
        message.setSenderId(UUID.randomUUID().toString());
        message.setReceivers("tianbin");
        message.setSendType(SendType.SINGLE_SEND.getCode());
        message.setState(MessageState.INITIALIZATION.getCode());
       // message.setId();
    }
}
