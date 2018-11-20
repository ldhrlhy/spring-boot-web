package com.xingchen.web.repository;

import com.xingchen.web.model.Message;

import java.util.List;

public interface MessageRepository {

    public List<Message> findAll();
    public Message save(Message message);
    public Message update(Message message);
    public Message updateText(Message message);

    public Message findMessage(Long id);

    public void deleteMessage(Long id);
}
