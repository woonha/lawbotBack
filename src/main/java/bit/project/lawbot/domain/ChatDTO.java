package bit.project.lawbot.domain;

import lombok.Data;

import java.util.Date;

@Data
public class ChatDTO {
    private long chat_idx;
    private String ip;
    private long member_no;
    private String message;
    private Date date;
    private int islive;
}
